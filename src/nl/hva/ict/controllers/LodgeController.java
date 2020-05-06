package nl.hva.ict.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import nl.hva.ict.MainApplication;
import nl.hva.ict.models.Lodge;
import nl.hva.ict.views.LodgeView;
import nl.hva.ict.views.View;

public class LodgeController extends Controller {

    private LodgeView lodgeView;
    private ObservableList<Lodge> lodges;

    public LodgeController() {
        lodgeView = new LodgeView();
        lodgeView.getLodgeViewListView().getSelectionModel().selectedItemProperty()
                .addListener(e -> getItemsInFields());
        lodgeView.getBtSave().setOnAction(e-> save());
        lodgeView.getBtUpdateData().setOnAction(e-> refreshData());
        lodgeView.getBtNew().setOnAction(e-> insert());
        lodgeView.getBtDelete().setOnAction(e-> delete());
        loadData();
    }

    private void loadData(){
        //haal de waardes op uit de database
       lodges = FXCollections.observableArrayList(MainApplication.getMySQLLodge().getAll());
        lodgeView.getLodgeViewListView().setItems(lodges);
    }


    private void refreshData(){
       // MainApplication.getMySQLReiziger().reload();
    }

    private void save(){
        // bewaar (update) record
    }

    private void delete(){
        // delete dit record
    }

    private void insert(){
        //Voeg toe
    }
    private void getItemsInFields(){
        Lodge currentLodge = lodgeView.getLodgeViewListView().getSelectionModel().getSelectedItem();
        lodgeView.getTxtPrijsPerWeek().setText(currentLodge.getAccommodatie_accomodatiecode());
        lodgeView.getCheckAutohuur().setText(currentLodge.getAccommodatie_accomodatiecode());

    }

    @Override
    public View getView() {
        return null;
    }
}
