public Rectangle union(Rectangle rect){
	int x = Math.min(this.x, rect.x);
	int y = Math.min(this.y, rect.y);
	int width = Math.max(this.x + this.width, rect.x + rect.width);
	int height = Math.max(this.y + this.height, rect.y + rect.heigth);

	return new Rectangle(x, y, width - x, height - y);
}
