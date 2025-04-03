package androidx.car.app.model;

import defpackage.cfs;
import defpackage.chk;
import defpackage.chw;
import defpackage.cjg;
import defpackage.clb;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class MessageTemplate implements cjg {
    private final List<Action> mActionList;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final CarText mDebugMessage;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final CarIcon mIcon;
    private final boolean mIsLoading;
    private final CarText mMessage;

    @Deprecated
    private final CarText mTitle;

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip) && Objects.equals(this.mHeader, messageTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return clb.a(this.mActionList);
    }

    public CarText getDebugMessage() {
        return this.mDebugMessage;
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

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarText getMessage() {
        CarText carText = this.mMessage;
        carText.getClass();
        return carText;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "MessageTemplate";
    }

    MessageTemplate(chw chwVar) {
        boolean z = chwVar.a;
        this.mIsLoading = false;
        CarText carText = chwVar.b;
        this.mTitle = null;
        CarText carText2 = chwVar.c;
        this.mMessage = null;
        CarText carText3 = chwVar.d;
        this.mDebugMessage = null;
        CarIcon carIcon = chwVar.e;
        this.mIcon = null;
        Action action = chwVar.f;
        this.mHeaderAction = null;
        ActionStrip actionStrip = chwVar.g;
        this.mActionStrip = null;
        List list = chwVar.h;
        this.mActionList = clb.b(null);
        Header header = chwVar.i;
        this.mHeader = null;
    }
}
