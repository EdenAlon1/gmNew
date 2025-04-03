package androidx.compose.ui.draw;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.hxu;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithContentElement extends ivp<hxu> {
    private final ffji a;

    public DrawWithContentElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hxu(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((hxu) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && this.a == ((DrawWithContentElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
