package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import defpackage.cfs;
import defpackage.cjg;
import defpackage.cka;
import defpackage.ckb;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class MapWithContentTemplate implements cjg {
    private final ActionStrip mActionStrip;
    private final cjg mContentTemplate;
    private final MapController mMapController;

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new cka();
        this.mActionStrip = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public cjg getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    MapWithContentTemplate(ckb ckbVar) {
        MapController mapController = ckbVar.a;
        this.mMapController = null;
        cjg cjgVar = ckbVar.b;
        this.mContentTemplate = null;
        ActionStrip actionStrip = ckbVar.c;
        this.mActionStrip = null;
    }
}
