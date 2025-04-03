package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cha;
import defpackage.chc;
import defpackage.clb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Alert {
    public static final int DURATION_SHOW_INDEFINITELY = Integer.MAX_VALUE;
    private static final int MAX_ACTION_COUNT = 2;
    private final List<Action> mActions;
    private final chc mCallbackDelegate;
    private final long mDuration;
    private final CarIcon mIcon;
    private final int mId;
    private final CarText mSubtitle;
    private final CarText mTitle;

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public chc getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + "]";
    }

    Alert(cha chaVar) {
        int i = chaVar.a;
        this.mId = 0;
        CarText carText = chaVar.b;
        this.mTitle = null;
        CarText carText2 = chaVar.c;
        this.mSubtitle = null;
        CarIcon carIcon = chaVar.d;
        this.mIcon = null;
        List list = chaVar.e;
        this.mActions = clb.b(null);
        long j = chaVar.f;
        this.mDuration = 0L;
        chc chcVar = chaVar.g;
        this.mCallbackDelegate = null;
    }
}
