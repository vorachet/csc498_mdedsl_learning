package csc498.generator;

import com.google.common.collect.Iterables;
import csc498.dsl2.Command;
import csc498.dsl2.Down;
import csc498.dsl2.Game;
import csc498.dsl2.Left;
import csc498.dsl2.Right;
import csc498.dsl2.Up;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Dsl2Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Game> _filter = Iterables.<Game>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Game.class);
    for (final Game e : _filter) {
      String _name = e.getName();
      String _plus = (_name + ".html");
      fsa.generateFile(_plus, this.compile(e));
    }
  }
  
  protected CharSequence compile(final Game p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<h1>Follow the steps</h1>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<h2>Answer</h2>");
    _builder.newLine();
    _builder.append("<div style=\"border: 1px dotted #000;height: 100px;\">");
    _builder.newLine();
    _builder.append("<h3 id=\"solution\" style=\"visibility: hidden;\">");
    _builder.newLine();
    {
      EList<Command> _commands = p.getCommands();
      for(final Command c : _commands) {
        String _print = this.print(c);
        _builder.append(_print);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</h3>");
    _builder.newLine();
    _builder.append("<button onclick=\"toggleSolution()\">On/Off Answer</button>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("<h2>Chosen Steps</h2>");
    _builder.newLine();
    _builder.append("<div style=\"border: 1px dotted #000;height: 100px;\">");
    _builder.newLine();
    _builder.append("<h3 id=\"logger\">");
    _builder.newLine();
    _builder.append("</h3>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<h1>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("Score: <span id=\"score\"></span>");
    _builder.newLine();
    _builder.append("</h1>");
    _builder.newLine();
    _builder.append("<h1>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("Steps Remaining: <span id=\"remain_steps\"></span>");
    _builder.newLine();
    _builder.append("</h1>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("<button onclick=\"process(\'⬆️\')\">Up</button>");
    _builder.newLine();
    _builder.append("<button onclick=\"process(\'⬇️\')\">Down</button>");
    _builder.newLine();
    _builder.append("<button onclick=\"process(\'➡️\')\">Right</button>");
    _builder.newLine();
    _builder.append("<button onclick=\"process(\'⬅️\')\">Left</button>");
    _builder.newLine();
    _builder.append("<hr>");
    _builder.newLine();
    _builder.append("<button onclick=\"reset()\">Reset game</button>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("const gameData = ");
    String _gameData = this.gameData(p.getCommands());
    _builder.append(_gameData, "\t  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("const max_steps = ");
    int _talSteps = this.totalSteps(p.getCommands());
    _builder.append(_talSteps, "\t  ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  ");
    _builder.append("var remain_steps = max_steps;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("var playable = true;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("var count = 0;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("var score = 0;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("var show = false;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("document.getElementById(\"remain_steps\").innerHTML = remain_steps;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("document.getElementById(\"score\").innerHTML = score;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("function process(direction) {");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("if (playable) {");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("const data = gameData[count];");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("remain_steps--;");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("count++;");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("if (direction === data.direction) score++;");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("document.getElementById(\"remain_steps\").innerHTML = remain_steps;");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("document.getElementById(\"score\").innerHTML = score;");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("document.getElementById(\"logger\").append(direction);");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("if (remain_steps == 0) {");
    _builder.newLine();
    _builder.append("\t  \t        ");
    _builder.append("playable = false;");
    _builder.newLine();
    _builder.append("\t  \t        ");
    _builder.append("document.getElementById(\"remain_steps\").innerHTML = \"DONE\";");
    _builder.newLine();
    _builder.append("\t  \t        ");
    _builder.append("show = false;");
    _builder.newLine();
    _builder.append("\t  \t        ");
    _builder.append("toggleSolution();");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("function reset() {");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("remain_steps = max_steps;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("score = 0;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("count = 0;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("playable = true;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("show = false;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("document.getElementById(\"remain_steps\").innerHTML = remain_steps;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("document.getElementById(\"score\").innerHTML  = \"\";");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("document.getElementById(\"logger\").innerHTML = \"\";");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("function toggleSolution() {");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("show = !show;");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("console.log(show);");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("if (show)");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("document.getElementById(\"solution\").style.visibility = \"visible\";");
    _builder.newLine();
    _builder.append("\t  \t");
    _builder.append("else ");
    _builder.newLine();
    _builder.append("\t  \t\t");
    _builder.append("document.getElementById(\"solution\").style.visibility = \"hidden\";");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  protected int totalSteps(final EList<Command> clist) {
    int max = 0;
    for (final Command c : clist) {
      int _max = max;
      int _value = c.getValue();
      max = (_max + _value);
    }
    return max;
  }
  
  protected String gameData(final EList<Command> clist) {
    String js = "[\n";
    for (final Command c : clist) {
      for (int i = 0; (i < c.getValue()); i++) {
        {
          if ((c instanceof Up)) {
            String _js = js;
            js = (_js + "{direction: \"⬆️\"},\n");
          }
          if ((c instanceof Down)) {
            String _js_1 = js;
            js = (_js_1 + "{direction: \"⬇️\"},\n");
          }
          if ((c instanceof Right)) {
            String _js_2 = js;
            js = (_js_2 + "{direction: \"➡️\"},\n");
          }
          if ((c instanceof Left)) {
            String _js_3 = js;
            js = (_js_3 + "{direction: \"⬅️\"},\n");
          }
        }
      }
    }
    String _js = js;
    js = (_js + "\n]");
    return js;
  }
  
  protected String print(final Command c) {
    String t = "";
    for (int i = 0; (i < c.getValue()); i++) {
      {
        if ((c instanceof Up)) {
          String _t = t;
          t = (_t + "⬆️");
        }
        if ((c instanceof Down)) {
          String _t_1 = t;
          t = (_t_1 + "⬇️");
        }
        if ((c instanceof Right)) {
          String _t_2 = t;
          t = (_t_2 + "➡️");
        }
        if ((c instanceof Left)) {
          String _t_3 = t;
          t = (_t_3 + "⬅️");
        }
      }
    }
    return t;
  }
}
