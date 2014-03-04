package udg.useDefAnalysis.environments;


public class AssignmentEnvironment extends EmitDefEnvironment {

	@Override
	public boolean isUse()
	{
		if(childNum == 0){
			
			String operatorCode = astProvider.getOperatorCode();
			if(operatorCode != null && !operatorCode.equals("="))
				return true;
			else
				return false;
		}
		
		return true;
	}

	@Override
	public boolean isDef()
	{
		if(childNum == 0)
			return true;
		
		return false;
	}
	
}
