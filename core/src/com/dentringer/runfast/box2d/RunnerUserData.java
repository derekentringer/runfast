package com.dentringer.runfast.box2d;

import com.badlogic.gdx.math.Vector2;
import com.dentringer.runfast.enums.UserDataType;
import com.dentringer.runfast.utils.Constants;

public class RunnerUserData extends UserData 
{
	private final Vector2 runningPosition = new Vector2(Constants.RUNNER_X, Constants.RUNNER_Y);
	private final Vector2 dodgePosition = new Vector2(Constants.RUNNER_DODGE_X, Constants.RUNNER_DODGE_Y);
	private Vector2 jumpingLinearImpulse;
	
	public RunnerUserData()
	{
		super();
		jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
		userDataType = UserDataType.RUNNER;
	}
	
	public RunnerUserData(float width, float height)
	{
		super(width, height);
		jumpingLinearImpulse = Constants.RUNNER_JUMPING_LINEAR_IMPULSE;
		userDataType = UserDataType.RUNNER;
	}
	
	public Vector2 getJumpingLinearImpulse()
	{
		return jumpingLinearImpulse;
	}
	
	public void setJumpingLinearImpulse(Vector2 jumpingLinearImpulse)
	{
		this.jumpingLinearImpulse = jumpingLinearImpulse;
	}
	
	public float getDodgeAngle()
	{
		//radians
		return (float) (-90*(Math.PI/180f));
	}
	
	public Vector2 getRunningPosition()
	{
		return runningPosition;
	}
	
	public Vector2 getDodgePosition()
	{
		return dodgePosition;
	}
	
	public float getHitAngularImpulse()
	{
		return Constants.RUNNER_HIT_ANGULAR_IMPULSE;
	}
}