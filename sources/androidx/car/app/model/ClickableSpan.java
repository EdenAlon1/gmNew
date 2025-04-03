package androidx.car.app.model;

import defpackage.cfs;
import defpackage.cia;
import defpackage.cic;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class ClickableSpan extends CarSpan {
    private final cia mOnClickDelegate;

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }

    public static ClickableSpan create(cic cicVar) {
        cicVar.getClass();
        return new ClickableSpan(cicVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public cia getOnClickDelegate() {
        cia ciaVar = this.mOnClickDelegate;
        ciaVar.getClass();
        return ciaVar;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan(cic cicVar) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(cicVar);
    }
}
