package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chk;
import defpackage.clb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Header {
    private final List<Action> mEndHeaderActions;
    private final Action mStartHeaderAction;
    private final CarText mTitle;

    private Header() {
        this.mTitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mEndHeaderActions, this.mStartHeaderAction);
    }

    public String toString() {
        CarText carText = this.mTitle;
        java.util.Objects.toString(carText);
        return "Header: ".concat(String.valueOf(carText));
    }

    public Header(chk chkVar) {
        this.mTitle = chkVar.c;
        this.mStartHeaderAction = chkVar.b;
        this.mEndHeaderActions = clb.b(chkVar.a);
    }
}
