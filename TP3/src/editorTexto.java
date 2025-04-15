import java.util.Stack;

public class editorTexto {

      Stack<String> pilaDeshacer = new Stack<>();
      Stack<String> pilaRehacer = new Stack<>();
      String texto = "";

      public void ingresarTexto(String nuevoTexto) {
         pilaDeshacer.push(texto);
         this.texto += (" " +nuevoTexto);
         pilaRehacer.clear();
      }

      public void deshacerTexto() {
          if(!pilaDeshacer.isEmpty()) {
              pilaRehacer.push(texto);

              texto =  pilaDeshacer.pop();
          }
          else {
              System.out.println("No hay texto");
          }
      }
      public void rehacerTexto() {
          if(!pilaRehacer.isEmpty()) {
              pilaDeshacer.push(texto);
              texto = pilaRehacer.pop();
          }
      }

      public void print() {
          System.out.println(texto);
      }

 }
