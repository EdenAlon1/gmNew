package androidx.compose.ui.layout;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.iqe;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnSizeChangedModifier extends ivp<iqe> {
    private final ffji a;

    public OnSizeChangedModifier(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new iqe(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        iqe iqeVar = (iqe) hvhVar;
        iqeVar.a = this.a;
        iqeVar.b = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.a == ((OnSizeChangedModifier) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
