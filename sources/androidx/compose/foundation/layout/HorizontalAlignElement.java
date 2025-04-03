package androidx.compose.foundation.layout;

import defpackage.eah;
import defpackage.ffkj;
import defpackage.hun;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends ivp<eah> {
    private final hun a;

    public HorizontalAlignElement(hun hunVar) {
        this.a = hunVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eah(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((eah) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return ffkj.e(this.a, horizontalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
