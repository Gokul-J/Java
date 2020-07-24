import java.util.*;
class Hello {
    String interact(int x,int y,int x1,int y1,int x2,int y2){
        if(x==0||y==0){
            if(((x>=x1&&x<=x2)&&(y>=y1&&x<=y2))||((x>=x2&&x<=x1)&&(y>=y2&&y<=y1))){
                return "yes";
            }
        }
        else{
            if(((x>x1&&x<x2)&&(y>y1&&x<y2))||((x>x2&&x<x1)&&(y>y2&&y<y1))){
                return "yes";
            }
        }
        return "no";
    }

    public static void main(String[] args) {
		//Your Code Here
		Hello n=new Hello();
		Scanner sc=new Scanner(System.in);
		int ax=sc.nextInt();
		int ay=sc.nextInt();
		int bx=sc.nextInt();
		int by=sc.nextInt();
		int cx=sc.nextInt();
		int cy=sc.nextInt();
		int dx=sc.nextInt();
		int dy=sc.nextInt();
		ArrayList<String> r=new ArrayList<String>();
		r.add(n.interact(ax,ay,bx,by,dx,dy));
		r.add(n.interact(cx,cy,bx,by,dx,dy));
		r.add(n.interact(bx,by,ax,ay,cx,cy));
		r.add(n.interact(dx,dy,ax,ay,cx,cy));
		if(r.contains("yes")){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}