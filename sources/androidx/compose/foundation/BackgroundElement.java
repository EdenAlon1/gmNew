package androidx.compose.foundation;

import defpackage.deg;
import defpackage.ffco;
import defpackage.ffcp;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ibq;
import defpackage.ibw;
import defpackage.idh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackgroundElement extends ivp<deg> {
    private final long a;
    private final ibq b;
    private final float c;
    private final idh d;

    public /* synthetic */ BackgroundElement(long j, ibq ibqVar, float f, idh idhVar, int i) {
        j = (i & 1) != 0 ? ibw.h : j;
        ibqVar = (i & 2) != 0 ? null : ibqVar;
        this.a = j;
        this.b = ibqVar;
        this.c = f;
        this.d = idhVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new deg(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        deg degVar = (deg) hvhVar;
        degVar.a = this.a;
        degVar.b = this.b;
        degVar.c = this.c;
        degVar.d = this.d;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement == null) {
            return false;
        }
        long j = this.a;
        long j2 = backgroundElement.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.b, backgroundElement.b) && this.c == backgroundElement.c && ffkj.e(this.d, backgroundElement.d);
    }

    public final int hashCode() {
        long j = ibw.a;
        ibq ibqVar = this.b;
        return (((((ffco.a(this.a) * 31) + (ibqVar != null ? ibqVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d.hashCode();
    }
}
