package mainWindow;

import views.ratingView.RatingView;
import views.searchView.SearchView;
import views.storageView.StorageView;

import javax.swing.*;

public class ContainerWindow{
	private JFrame windowFrame;
	private JPanel containerPanel;
	private JTabbedPane containerTabbedPane;
	private StorageView storageViewTab;
	private JPanel StorageTab;
	private SearchView searchViewTab;
	private JPanel SearchTab;
	private RatingView ratingViewTab;
	private JPanel RatingTab;

	public ContainerWindow() {
		windowFrame = new JFrame("TV Series Info Repo");
		windowFrame.setContentPane(containerPanel);
		windowFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		windowFrame.pack();
		windowFrame.setLocationRelativeTo(null);
		windowFrame.setVisible(true);
	}

	public SearchView getSearchViewTab() {
		return searchViewTab;
	}
	public StorageView getStorageViewTab() {
		return storageViewTab;
	}
	public RatingView getRatingViewTab() {
		return ratingViewTab;
	}
	public JTabbedPane getContainerTabbedPane() {
		return containerTabbedPane;
	}
}
