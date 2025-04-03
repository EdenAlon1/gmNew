package androidx.compose.ui.draw;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.hxl;
import defpackage.hxn;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DrawWithCacheElement extends ivp<hxl> {
    private final ffji a;

    public DrawWithCacheElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new hxl(new hxn(), this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        hxl hxlVar = (hxl) hvhVar;
        hxlVar.a = this.a;
        hxlVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && this.a == ((DrawWithCacheElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
