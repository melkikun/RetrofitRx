package com.example.it01.retrofitrx.presenter;

import com.example.it01.retrofitrx.entities.MasterDrawing;
import com.example.it01.retrofitrx.service.MdService;
import com.example.it01.retrofitrx.service.impl.MdServiceImpl;

import java.util.List;

/**
 * Created by IT01 on 3/10/2017.
 */

public class MdPresenterImpl implements MdPresenter{
    private MdService mdService;

    public MdPresenterImpl() {
        mdService = new MdServiceImpl(this);
    }

    public void print(){
        mdService.listDrawing();
    }

    @Override
    public void printList(List<MasterDrawing> masterDrawings) {

    }

    @Override
    public void detailDrawing(MasterDrawing masterDrawing) {

    }
}
