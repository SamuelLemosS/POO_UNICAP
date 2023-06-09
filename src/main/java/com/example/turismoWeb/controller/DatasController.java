package com.example.turismoWeb.controller;

import com.example.turismoWeb.exception.NotFoundEntityException;
import com.example.turismoWeb.model.DatasModel;
import com.example.turismoWeb.service.DatasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datas")
public class DatasController {
    @Autowired
    private DatasService datasService;

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public ResponseEntity<DatasModel> createDatas
            (@RequestBody DatasModel data) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.createDatas((DatasModel) data));
    }
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ResponseEntity<List<DatasModel>> readData() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(datasService.getAllDatas());
    }

    @RequestMapping(value="/delete/{datasId}", method=RequestMethod.DELETE)
    public ResponseEntity<DatasModel> deleteDatas(
            @PathVariable(value = "datasId") Long id) throws NotFoundEntityException {
        datasService.deleteDatas(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

}