

class AppletJava
{
	
	AppletJava()
	{
		System.out.println("Initialized");
	}

	public void start()
	{
		System.out.println("Starting applet");
	}
	
	public void stop()
	{
		System.out.println("Stopping applet");
	}
	public void destroy()
	{
		System.out.println("Destroyed");
	}



		public static void main(String[] args) {
			AppletJava obj = new AppletJava();

				
				obj.start();
				obj.stop();
				obj.destroy();
		}
}