package androidx.compose.foundation.layout;

import defpackage.ecc;
import defpackage.ffkj;
import defpackage.hus;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends ivp<ecc> {
    private final hus a;

    public VerticalAlignElement(hus husVar) {
        this.a = husVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ecc(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((ecc) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return ffkj.e(this.a, verticalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
