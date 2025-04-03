package androidx.compose.ui.draw;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.hxp;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawBehindElement extends ivp<hxp> {
    private final ffji a;

    public DrawBehindElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hxp(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((hxp) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && this.a == ((DrawBehindElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
