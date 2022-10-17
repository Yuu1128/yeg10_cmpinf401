
public class MyRectangle {
	private int width;
	private int height;
	private int startX;
	private int startY;


	public MyRectangle(){
		this.width = 0;
		this.height = 0;
		this.startX = 0;
		this.startY = 0;
	}

	public MyRectangle(int x, int y, int w, int h){
		startX = x;
		startY = y;
		width = w;
		height = h;
	}

	public int area(){
		int area = width*height;
		return area;
	}

	public String toString(){
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y){
		if (x >= startX && x <= (width + startX) &&  y >= startY && y <= (height + startY)) {
			return true;
		}else{
			return false;
		}
	}

	public void setSize(int newWidth, int newHeight){
		this.width = newWidth;
		this.height = newHeight;
	}

	public void setPosition(int newX, int newY){
		this.startX = newX;
		this.startY = newY;
	}


}

