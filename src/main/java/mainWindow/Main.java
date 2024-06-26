package mainWindow;

import models.searcherModel.SearcherModel;
import models.storerModel.StorerModel;
import presenters.ratingPresenter.RatingPresenter;
import presenters.searchPresenter.SearchPresenter;
import presenters.storagePresenter.StoragePresenter;
import utils.DataBase;
import utils.wiki.WikiAPIConsummer;
import views.ratingView.RatingView;
import views.searchView.SearchView;
import views.storageView.StorageView;

public class Main {

	public static void main(String[] args) {
		ContainerWindow containerWindow = new ContainerWindow();
		DataBase.loadDatabase();


		SearcherModel searchModel = new SearcherModel(new WikiAPIConsummer());
		StorerModel storageModel = new StorerModel();

		SearchView searchView = containerWindow.getSearchViewTab();
		StorageView storageView = containerWindow.getStorageViewTab();
		RatingView ratingView = containerWindow.getRatingViewTab();

		SearchPresenter searchPresenter = new SearchPresenter(searchModel, storageModel, searchView, containerWindow);
		searchPresenter.start();
		StoragePresenter storagePresenter = new StoragePresenter(storageModel, storageView);
		storagePresenter.start();
		RatingPresenter ratingPresenter = new RatingPresenter(ratingView, searchModel, storageModel);
		ratingPresenter.start();

		searchView.start();
		storageView.start();
		ratingView.start();


	}

}
