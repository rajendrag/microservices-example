package controllers;

import models.bo.UnitEntity;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.Set;

/**
 * Created by RP on 12/15/15.
 */
public class UnitSetup extends Controller {
    /**
     * This result directly redirect to application home.
     */
    public Result GO_HOME = ok(
            views.html.main.render()
    );

    public Result index() {
        return GO_HOME;
    }

    /**
     * Returns list of units.
     */
    @Transactional
    public Result list() {
        Set<UnitEntity> units = UnitEntity.findAll(UnitEntity.class);
        return ok(Json.toJson(units));
    }
}
