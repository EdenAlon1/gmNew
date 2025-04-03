package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chv;
import defpackage.cjg;
import defpackage.clb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class LongMessageTemplate implements cjg {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final CarText mMessage;
    private final CarText mTitle;

    private LongMessageTemplate() {
        this.mTitle = null;
        this.mMessage = null;
        this.mActionStrip = null;
        this.mHeaderAction = null;
        this.mActionList = Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongMessageTemplate)) {
            return false;
        }
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
        return Objects.equals(this.mTitle, longMessageTemplate.mTitle) && Objects.equals(this.mMessage, longMessageTemplate.mMessage) && Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && Objects.equals(this.mActionList, longMessageTemplate.mActionList) && Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return clb.a(this.mActionList);
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        carText.getClass();
        return carText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mMessage, this.mHeaderAction, this.mActionList, this.mActionStrip);
    }

    public String toString() {
        return "LongMessageTemplate";
    }

    LongMessageTemplate(chv chvVar) {
        CarText carText = chvVar.a;
        this.mTitle = null;
        CarText carText2 = chvVar.b;
        this.mMessage = null;
        ActionStrip actionStrip = chvVar.c;
        this.mActionStrip = null;
        Action action = chvVar.d;
        this.mHeaderAction = null;
        List list = chvVar.e;
        this.mActionList = clb.b(null);
    }
}
