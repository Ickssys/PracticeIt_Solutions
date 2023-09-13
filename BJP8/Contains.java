public boolean contains(Rectangle rect){
	return (rect.getX() > this.getX() && rect.getY() > this.getY()) && (rect.getWidth() < this.getWidth() && rect.getHeight() < this.getHeight());
}
