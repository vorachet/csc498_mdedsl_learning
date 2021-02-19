# MDE/DSL learning material for CS@SIT

This repo gives project examples in practicing several open-source MDE/DSL tools and hopefully motivates CS students at SIT to understand why model-driven engineering is important and able to perform the following basic MDE/DSL tasks.

* Design a textual DSL and code generator using Xtext (Workshop Done - 19 FEB 2021)
* Modeling tasks (upon request workshop/tutorial)
  * Design metamodel using EMF ECore/Emfactic language
  * Create models based on EMF ECore using Flexmi
  * Create EMF/UML/SysML models using Eclipse Papyrus 
  * Access EMG/UML/SysML models using Eclipse Epsilon 
  * Model transformation using Eclipse Epsilon
  * Model validation using Eclipse Epsilon

# Textual DSL using XText

## Resources
- Installing Eclipse XText plugin https://www.eclipse.org/Xtext/download.html
- Official XText documentation https://www.eclipse.org/Xtext/documentation/index.html
- XTend documentation https://www.eclipse.org/xtend/documentation/

## Workshop material   

```
├── xtext_dsl_projects (DSL projects created by [1])
│   ├── dsl1
│   ├── dsl2
│   └── dsl3
└── xtext_projects.  (Xtext projects [1])
    ├── aspect1.png
    ├── csc498.dsl1
    ├── csc498.dsl1.ide
    ├── csc498.dsl1.ui
    ├── csc498.dsl2
    ├── csc498.dsl2.ide
    ├── csc498.dsl2.ui
    ├── csc498.dsl3
    ├── csc498.dsl3.ide
    ├── csc498.dsl3.tests
    ├── csc498.dsl3.ui
    ├── csc498.dsl3.ui.tests
    └── csc498.readme
```
### DSL1 Document generation

Abstract Syntax

```
grammar csc498.Dsl1 with org.eclipse.xtext.common.Terminals

generate dsl1 "http://www.Dsl1.csc498"

Model:
	contacts+=Contact*
	rsvps+=RSVP*
	emails+=Email*
;
	
Contact:
	'Contact' name=ID 'email' email=STRING
;

RSVP:
	'RSVP' name=ID
	'message' message=STRING
;

Email:
	'Email' name=ID
	'to' '{' contacts+=[Contact]+ '}'
	'message' message=STRING
;
```

Concrete Syntax

```
Contact fullname1 email "fullname1@org.com"
Contact fullname2 email "fullname2@org.com"
Contact fullname3 email "fullname3@org.com"
Contact fullname4 email "fullname4@org.com"

RSVP Wedding   
    message    
"
RSVP MESSAGE
CS@SIT
"
    
Email OnboardingNewTeamMember 
    to { fullname1 fullname2 } 
    message 
"
EMAIL TEMPLATE
CS@SIT
"
```


### DSL2 Web-based game - Follow the steps

Abtract Syntax

```
grammar csc498.Dsl2 with org.eclipse.xtext.common.Terminals

generate dsl2 "http://www.Dsl2.csc498"

Model:
	games+=Game*
	;

Game: 
  'Game' name=ID '{'
     commands+=Command*
  '}'
  ;

Command: Up | Down | Right | Left ;

Up:
	'up' '(' value=INT')' 
;

Down:
	'down' '(' value=INT')' 
;

Right:
	'right' '(' value=INT')' 
;

Left:
	'left' '(' value=INT')' 
;
```

Concrete Syntax

```
Game SimpleGame {  
    down(1)       
    up(1)            
    right(1)                          
    left(1)     
}   

Game StandardGame {  
    right(2)    
    down(1)       
    up(2)            
    right(1)                          
    left(3)     
}   

Game ComplicatedGame {  
    up(1) 
    right(4)
    down(3)   
    left(4)     
    up(1)            
    right(1)                          
    left(1)     
    up(2)  
}   
                       
```

### DSL3 Application of Statemachine 

```
grammar csc498.Dsl3 with org.eclipse.xtext.common.Terminals

generate dsl3 "http://www.Dsl3.csc498"

Statemachine :
	{Statemachine}
	('events'
		events+=Event+
	'end')?
	('resetEvents'
		resetEvents+=[Event]+
	'end')?
	('commands'
		commands+=Command+
	'end')?
	states+=State*
;

Event:
	name=ID
;

Command:
	name=ID
;

State:
	'state' name=ID
		('entry_commands' '{' actions+=[Command]+ '}')?
		transitions+=Transition*
	'end'
;

Transition:
	event=[Event] '=>' state=[State]
;
```

Concrete Syntax
```
events
  on 
  off 
  task1
  task2
  task3
  reset
end

commands
  clearMachineStates
  notifyMachineOn
  notifyMachineOff
  prepareResourcesForTask1
  prepareResourcesForTask2
  prepareResourcesForTask3
  processTask1
  processTask2
  processTask3 
end

state OFF
  entry_commands {notifyMachineOff clearMachineStates}
  on => READY
end

state READY
  entry_commands {notifyMachineOn prepareResourcesForTask1}   
  task1 => TASK1_PERFORMED
  off => OFF
end

state TASK1_PERFORMED
  entry_commands {processTask1 prepareResourcesForTask2}   
  task2 => TASK2_PERFORMED
  reset => READY
  off => OFF
end

state TASK2_PERFORMED
  entry_commands {processTask2 prepareResourcesForTask3}  
  task3 => TASK3_PERFORMED
  reset => READY
  off => OFF
end

state TASK3_PERFORMED
  entry_commands {processTask3}  
  reset => READY
  off => OFF
end

```
