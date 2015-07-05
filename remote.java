/*
 * Meo remote to control MeoBox
 *
 * @author      Paulo Gil
 * @email       paulogil93@gmail.com
 * @version      1.0
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class meoRemote {
  static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("192.168.1.64", 8082);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      String x = "E";

      //boolean to fix unreachable statement error
      boolean bool = true;

      while(bool) {

        if(x.equals("E")) {
          x = menu();
            if(x.equals("E") || x.equals("e")) System.exit(0);
        }

        else if(x.equals("1")) {
          x = basic();

          //
          if(x.equals("1")) {
            out.println("key=233");
            x = "1";
          }
          else if(x.equals("2")) {
            out.println("key=173");
            x = "1";
          }
          else if(x.equals("3")) {
            out.println("key=33");
            x = "1";
          }
          else if(x.equals("4")) {
            out.println("key=34");
            x = "1";
          }
          else if(x.equals("5")) {
            out.println("key=175");
            x = "1";
          }
          else if(x.equals("6")) {
            out.println("key=174");
            x = "1";
          }
          else if(x.equals("7")) {
            out.println("key=36");
            x = "1";
          }
          else if(x.equals("8")) {
            out.println("key=13");
            x = "1";
          }
          else if(x.equals("9")) {
            out.println("key=8");
            x = "1";
          }
          else if(x.equals("10")) {
            out.println("key=38");
            x = "1";
          }
          else if(x.equals("11")) {
            out.println("key=40");
            x = "1";
          }
          else if(x.equals("12")) {
            out.println("key=37");
            x = "1";
          }
          else if(x.equals("13")) {
            out.println("key=39");
            x = "1";
          }
          else if(x.equals("B") || x.equals("b")) {
            x = "E";
          }
          else if(x.equals("E") || x.equals("e")) {
            System.exit(0);
          }

        }
        else if(x.equals("2")) {
          x = numeric();
          if(x.equals("0")) {
            out.println("key=48");
            x = "2";
          }
          else if(x.equals("1")) {
            out.println("key=49");
            x = "2";
          }
          else if(x.equals("2")) {
            out.println("key=50");
            x = "2";
          }
          else if(x.equals("3")) {
            out.println("key=51");
            x = "2";
          }
          else if(x.equals("4")) {
            out.println("key=52");
            x = "2";
          }
          else if(x.equals("5")) {
            out.println("key=53");
            x = "2";
          }
          else if(x.equals("6")) {
            out.println("key=54");
            x = "2";
          }
          else if(x.equals("7")) {
            out.println("key=55");
            x = "2";
          }
          else if(x.equals("8")) {
            out.println("key=56");
            x = "2";
          }
          else if(x.equals("9")) {
            out.println("key=57");
            x = "2";
          }
          else if(x.equals("B") || x.equals("b")) {
            x = "E";
          }
          else if(x.equals("E") || x.equals("e")) {
            System.exit(0);
          }
        }
        else if(x.equals("3")) {
          x = advanced();

          if(x.equals("1")) {
            out.println("key=159");
            x = "3";
          }
          else if(x.equals("2")) {
            out.println("key=156");
            x = "3";
          }
          else if(x.equals("3")) {
            out.println("key=112");
            x = "3";
          }
          else if(x.equals("4")) {
            out.println("key=114");
            x = "3";
          }
          else if(x.equals("5")) {
            out.println("key=111");
            x = "3";
          }
          else if(x.equals("6")) {
            out.println("key=115");
            x = "3";
          }
          else if(x.equals("7")) {
            out.println("key=116");
            x = "3";
          }
          else if(x.equals("8")) {
            out.println("key=225");
            x = "3";
          }
          else if(x.equals("9")) {
            out.println("key=117");
            x = "3";
          }
          else if(x.equals("10")) {
            out.println("key=122");
            x = "3";
          }
          else if(x.equals("11")) {
            out.println("key=118");
            x = "3";
          }
          else if(x.equals("12")) {
            out.println("key=121");
            x = "3";
          }
          else if(x.equals("13")) {
            out.println("key=119");
            x = "3";
          }
          else if(x.equals("14")) {
            out.println("key=123");
            x = "3";
          }
          else if(x.equals("15")) {
            out.println("key=140");
            x = "3";
          }
          else if(x.equals("16")) {
            out.println("key=141");
            x = "3";
          }
          else if(x.equals("17")) {
            out.println("key=142");
            x = "3";
          }
          else if(x.equals("18")) {
            out.println("key=143");
            x = "3";
          }
          else if(x.equals("B") || x.equals("b")) {
            x = "E";
          }
          else if(x.equals("E") || x.equals("e")) {
            System.exit(0);
          }
        }
      }

      in.close();
      out.close();
      socket.close();
    } catch (UnknownHostException e) {
      System.err.println("Host não disponível");
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println("Can't read/write to socket");
      System.err.println(e.getMessage());
    }
  }

  public static String menu() {
    String x;

    System.out.print("\033[2J\033[1;1H");
    System.out.print("\n--------------");
    System.out.print("\n  MEO REMOTE  ");
    System.out.print("\n--------------");
    System.out.print("\n1. Basic");
    System.out.print("\n2. Numeric");
    System.out.print("\n3. Advanced");
    System.out.print("\n--------------");
    System.out.print("\nE. Exit");
    System.out.print("\n--------------");
    System.out.print("\nOption: ");
    x = kb.next();

    return x;
  }

  public static String basic() {
    String x;

    System.out.print("\033[2J\033[1;1H");
    System.out.print("\n--------------");
    System.out.print("\n  MEO REMOTE  ");
    System.out.print("\n--------------");
    System.out.print("\n1. Power");
    System.out.print("\n2. Mute");
    System.out.print("\n3. Channel+");
    System.out.print("\n4. Channel-");
    System.out.print("\n5. Volume+");
    System.out.print("\n6. Volume-");
    System.out.print("\n7. Menu");
    System.out.print("\n8. Enter");
    System.out.print("\n9. Back");
    System.out.print("\n10. Up");
    System.out.print("\n11. Down");
    System.out.print("\n12. Left");
    System.out.print("\n13. Right");
    System.out.print("\n--------------");
    System.out.print("\nB. Back");
    System.out.print("\nE. Exit");
    System.out.print("\n--------------");
    System.out.print("\nOption: ");
    x = kb.next();

    return x;
  }

  public static String numeric() {
    String x;

    System.out.print("\033[2J\033[1;1H");
    System.out.print("\n--------------");
    System.out.print("\n  MEO REMOTE  ");
    System.out.print("\n--------------");
    System.out.print("\n0. Key 0");
    System.out.print("\n1. Key 1");
    System.out.print("\n2. Key 2");
    System.out.print("\n3. Key 3");
    System.out.print("\n4. Key 4");
    System.out.print("\n5. Key 5");
    System.out.print("\n6. Key 6");
    System.out.print("\n7. Key 7");
    System.out.print("\n8. Key 8");
    System.out.print("\n9. Key 9");
    System.out.print("\n--------------");
    System.out.print("\nB. Back");
    System.out.print("\nE. Exit");
    System.out.print("\n--------------");
    System.out.print("\nOption: ");
    x = kb.next();

    return x;
  }

  public static String advanced() {
    String x;

    System.out.print("\033[2J\033[1;1H");
    System.out.print("\n--------------");
    System.out.print("\n  MEO REMOTE  ");
    System.out.print("\n--------------");
    System.out.print("\n1. Info");
    System.out.print("\n2. Switch");
    System.out.print("\n3. Guia TV");
    System.out.print("\n4. VideoClube");
    System.out.print("\n5. Options");
    System.out.print("\n6. Gravações");
    System.out.print("\n7. Teletexto");
    System.out.print("\n8. Record");
    System.out.print("\n9. Prev");
    System.out.print("\n10. Next");
    System.out.print("\n11. Rewind");
    System.out.print("\n12. Forward");
    System.out.print("\n13. Play/Pause");
    System.out.print("\n14. Stop");
    System.out.print("\n15. Red Key");
    System.out.print("\n16. Green Key");
    System.out.print("\n17. Yellow Key");
    System.out.print("\n18. Blue Key");
    System.out.print("\n--------------");
    System.out.print("\nB. Back");
    System.out.print("\nE. Exit");
    System.out.print("\n--------------");
    System.out.print("\nOption: ");
    x = kb.next();

    return x;
  }
}
