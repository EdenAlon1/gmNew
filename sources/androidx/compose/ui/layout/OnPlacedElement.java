package androidx.compose.ui.layout;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.iqb;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnPlacedElement extends ivp<iqb> {
    private final ffji a;

    public OnPlacedElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new iqb(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((iqb) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && this.a == ((OnPlacedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
