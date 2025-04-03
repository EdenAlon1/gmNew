package androidx.compose.ui.layout;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.ipy;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends ivp<ipy> {
    private final ffji a;

    public OnGloballyPositionedElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ipy(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((ipy) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.a == ((OnGloballyPositionedElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
