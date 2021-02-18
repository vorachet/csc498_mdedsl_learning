package csc498.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import csc498.dsl2.Game
import csc498.dsl2.Up
import csc498.dsl2.Down
import csc498.dsl2.Right
import csc498.dsl2.Left
import csc498.dsl2.Command
import org.eclipse.emf.common.util.EList

class Dsl2Generator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(csc498.dsl2.Game)) {
			fsa.generateFile(e.name + ".html", e.compile)
		}
	}
	
	protected def compile(Game p) '''
	<html>
	<head>
	<meta charset="UTF-8">
	</head>
	<body>
	<h1>Follow the steps</h1>

	<hr>

	<h2>Answer</h2>
	<div style="border: 1px dotted #000;height: 100px;">
	<h3 id="solution" style="visibility: hidden;">
	«FOR c : p.commands»«c.print»«ENDFOR»
	</h3>
	<button onclick="toggleSolution()">On/Off Answer</button>
	</div>
	<hr>
	<h2>Chosen Steps</h2>
	<div style="border: 1px dotted #000;height: 100px;">
	<h3 id="logger">
	</h3>
	</div>
	<h1>
		 Score: <span id="score"></span>
	</h1>
	<h1>
		 Steps Remaining: <span id="remain_steps"></span>
	</h1>
		
	<button onclick="process('⬆️')">Up</button>
	<button onclick="process('⬇️')">Down</button>
	<button onclick="process('➡️')">Right</button>
	<button onclick="process('⬅️')">Left</button>
	<hr>
	<button onclick="reset()">Reset game</button>
	<script>
		  const gameData = «p.commands.gameData»;
		  const max_steps = «p.commands.totalSteps»;
		  var remain_steps = max_steps;
		  var playable = true;
		  var count = 0;
		  var score = 0;
		  var show = false;
		  document.getElementById("remain_steps").innerHTML = remain_steps;
		  document.getElementById("score").innerHTML = score;
		  function process(direction) {
		  	if (playable) {
		  		const data = gameData[count];
		  		remain_steps--;
		  		count++;
		  		if (direction === data.direction) score++;
		  		document.getElementById("remain_steps").innerHTML = remain_steps;
		  		document.getElementById("score").innerHTML = score;
		  		document.getElementById("logger").append(direction);
		  		if (remain_steps == 0) {
		  	        playable = false;
		  	        document.getElementById("remain_steps").innerHTML = "DONE";
		  	        show = false;
		  	        toggleSolution();
		  		} 
		  	}
		  }
		  
		  function reset() {
		  	remain_steps = max_steps;
		  	score = 0;
		  	count = 0;
		  	playable = true;
		  	show = false;
		  	document.getElementById("remain_steps").innerHTML = remain_steps;
		  	document.getElementById("score").innerHTML  = "";
		  	document.getElementById("logger").innerHTML = "";
		  }
		  
		  function toggleSolution() {
		  	show = !show;
		  	console.log(show);
		  	if (show)
		  		document.getElementById("solution").style.visibility = "visible";
		  	else 
		  		document.getElementById("solution").style.visibility = "hidden";
		  }
	</script>
	</body>
	</html>
	'''
	
	protected def totalSteps(EList<Command> clist) {
		var max = 0;
		for(c : clist) {
			max += c.value;
		}
		return max;
	}
	
	protected def gameData(EList<Command> clist) {
		var js = "[\n";
		for(c : clist) {
			for(var i=0; i<c.value; i++) {
				if (c instanceof Up) js += "{direction: \"⬆️\"},\n";
				if (c instanceof Down) js += "{direction: \"⬇️\"},\n";
				if (c instanceof Right) js += "{direction: \"➡️\"},\n";
				if (c instanceof Left) js += "{direction: \"⬅️\"},\n";
			}
		}
		js += "\n]";
		return js;
	}

	protected def print(Command c) {
		var t = "";
		for(var i=0; i< c.value; i++) {
			if (c instanceof Up) t += "⬆️";
			if (c instanceof Down) t += "⬇️";
			if (c instanceof Right) t += "➡️";
			if (c instanceof Left) t += "⬅️";
		}
		return t;
	}
	
	
	
}
