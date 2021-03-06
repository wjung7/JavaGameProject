package com.wjung.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Input implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener{
	private GameContainer gc;
	
	private final int NUM_KEYS = 256;
	private boolean[] keys = new boolean[NUM_KEYS];
	private boolean[] keysLast = new boolean[NUM_KEYS];
	
	private final int NUM_BUTTONS = 5;
	private boolean[] buttons = new boolean[NUM_BUTTONS];
	private boolean[] buttonsLast = new boolean[NUM_BUTTONS];
	
	private int mouseX, mouseY;
	private int scroll;

	
	public Input(GameContainer gc) {
		this.gc = gc;
		mouseX = 0;
		mouseY = 0;
		scroll = 0;
		
		gc.getWindow().getCanvas().addKeyListener(this);
		gc.getWindow().getCanvas().addMouseMotionListener(this);
		gc.getWindow().getCanvas().addMouseListener(this);
		gc.getWindow().getCanvas().addMouseWheelListener(this);
	}
	
	public void update() {
		for(int i = 0; i < NUM_KEYS; i++) {
			keysLast[i] = keys[i];
		}
		
		for(int i = 0; i < NUM_BUTTONS; i++) {
			buttonsLast[i] = buttons[i];
		}
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		scroll = e.getWheelRotation();
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = (int) (e.getX() / gc.getScale());
		mouseY = (int) (e.getY() / gc.getScale());
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = (int) (e.getX() / gc.getScale());
		mouseY = (int) (e.getY() / gc.getScale());
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		buttons[e.getButton()] = true;
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		buttons[e.getButton()] = false;
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		keys[e.getKeyCode()] = true;
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		keys[e.getKeyCode()] = false;
	}

}
