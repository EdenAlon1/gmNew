package androidx.compose.ui.focus;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.hyl;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusEventElement extends ivp<hyl> {
    private final ffji a;

    public FocusEventElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hyl(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((hyl) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && this.a == ((FocusEventElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
