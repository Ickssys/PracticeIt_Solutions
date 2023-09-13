public Rectangle intersection(Rectangle rect){
	int x = Math.max(this.getX(), rect.getX());
	int y = Math.max(this.getY(), rect.getY());

	int width = Math.min(this.getX() + this.getWidth(), rect.getX() + rect.getWidth()) - x;
	int height = Math.min(this.getY() + this.getHeight(), rect.getY() + rect.getHeight()) - y;

	return new Rectangle(x, y, width, height);
	
}
