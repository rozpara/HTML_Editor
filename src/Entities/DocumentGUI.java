package Entities;

import javax.swing.*;

import Commands.CutCommand;
import Commands.IndentCommand;
import Commands.InsertCommand;
import Commands.PasteCommand;
import Commands.SaveAsCommand;
import Commands.SaveCommand;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DocumentGUI extends JPanel{
	
	private Document thisDoc;
	private DocumentMenu docMenu;
	
	private JPanel menuPanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JPanel statePanel = new JPanel();
	private JButton saveBtn = new JButton("Save");
	private JButton saveAsBtn = new JButton("Save As");
	private JButton copyBtn = new JButton("Copy");
	private JButton cutBtn = new JButton("Cut");
	private JButton pasteBtn = new JButton("Paste");
	private JButton insertBoldBtn = new JButton("Insert Bold");
	private JButton insertItalicsBtn = new JButton("Insert Italics");
	private JButton insertHeaderBtn = new JButton("Insert Header");
	private JButton insertListBtn = new JButton("Insert List");
	private JButton insertTableBtn = new JButton("Insert Table");
	private JPanel wordWrapPanel = new JPanel(new GridLayout(1, 3));
	private JPanel indentPanel = new JPanel(new GridLayout(1, 3));
	private JRadioButton wordWrapOn = new JRadioButton("On", true);
	private JRadioButton wordWrapOff = new JRadioButton("Off");
	private JLabel wordWrapLabel = new JLabel("Word-Wrap:      ");
	private JRadioButton indentOn = new JRadioButton("On", true);
	private JRadioButton indentOff = new JRadioButton("Off");
	private JLabel indentLabel = new JLabel("Auto-Indent:      ");
	
	
	public DocumentGUI(Document docParam) {		
		thisDoc = docParam;
		docMenu = createDocumentMenu(thisDoc);
		
		DocumentMenuListener docMenuListener = new DocumentMenuListener();
		
		//Add Listeners
		saveBtn.addActionListener(docMenuListener);
		saveAsBtn.addActionListener(docMenuListener);
		copyBtn.addActionListener(docMenuListener);
		cutBtn.addActionListener(docMenuListener);
		pasteBtn.addActionListener(docMenuListener);
		indentOn.addActionListener(docMenuListener);
		indentOff.addActionListener(docMenuListener);
		wordWrapOn.addActionListener(docMenuListener);
		wordWrapOff.addActionListener(docMenuListener);

		buttonPanel.setLayout(new GridLayout(2, 5));
		buttonPanel.add(saveBtn);
		buttonPanel.add(saveAsBtn);
		buttonPanel.add(copyBtn);
		buttonPanel.add(cutBtn);
		buttonPanel.add(pasteBtn);
		buttonPanel.add(insertBoldBtn);
		buttonPanel.add(insertItalicsBtn);
		buttonPanel.add(insertHeaderBtn);
		buttonPanel.add(insertListBtn);
		buttonPanel.add(insertTableBtn);
		
		ButtonGroup wordWrapGroup = new ButtonGroup();
		wordWrapGroup.add(wordWrapOn);
		wordWrapGroup.add(wordWrapOff);
		wordWrapPanel.add(wordWrapLabel);
		wordWrapPanel.add(wordWrapOn);
		wordWrapPanel.add(wordWrapOff);
		statePanel.add(wordWrapPanel);
		
		ButtonGroup indentGroup = new ButtonGroup();
		indentGroup.add(indentOn);
		indentGroup.add(indentOff);
		indentPanel.add(indentLabel);
		indentPanel.add(indentOn);
		indentPanel.add(indentOff);
		statePanel.add(indentPanel);
		
		menuPanel.setLayout(new GridLayout(2, 1));
		menuPanel.add(buttonPanel);
		menuPanel.add(statePanel);
		
		add(menuPanel);
		setVisible(true);
	}
	
	private DocumentMenu createDocumentMenu(Document document){
		CutCommand cut = new CutCommand(document);
		PasteCommand paste = new PasteCommand(document);
		InsertCommand insert = new InsertCommand(document);
		IndentCommand indent = new IndentCommand(document);
		SaveCommand save = new SaveCommand(document);
		SaveAsCommand saveAs = new SaveAsCommand(document);
		DocumentMenu docMenu = new DocumentMenu(cut,paste,insert,indent,save,saveAs);
		return docMenu;
	}
	
	private class DocumentMenuListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			if(action == "Save"){
				
			} else if(action == "SaveAs"){
				
			} else if(action == "Copy"){
				
			} else if(action == "Cut"){
				
			} else if(action == "Paste"){
				
			}
		}		
	}
	
	
}
