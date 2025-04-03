package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chk;
import defpackage.cil;
import defpackage.cjg;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class PaneTemplate implements cjg {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        chk chkVar = new chk();
        CarText carText = this.mTitle;
        if (carText != null) {
            chkVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            chkVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                chkVar.b(it.next());
            }
        }
        return chkVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        pane.getClass();
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader);
    }

    public String toString() {
        return "PaneTemplate";
    }

    PaneTemplate(cil cilVar) {
        CarText carText = cilVar.a;
        this.mTitle = null;
        Pane pane = cilVar.b;
        this.mPane = null;
        Action action = cilVar.c;
        this.mHeaderAction = null;
        ActionStrip actionStrip = cilVar.d;
        this.mActionStrip = null;
        Header header = cilVar.e;
        this.mHeader = null;
    }
}
