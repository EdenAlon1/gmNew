package androidx.compose.foundation;

import android.view.View;
import defpackage.dhl;
import defpackage.dio;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.isx;
import defpackage.isy;
import defpackage.ivp;
import defpackage.jzn;
import defpackage.jzq;
import defpackage.jzu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MagnifierElement extends ivp<dhl> {
    private final ffji a;
    private final ffji c;
    private final dio f;
    private final ffji b = null;
    private final float d = Float.NaN;

    public MagnifierElement(ffji ffjiVar, ffji ffjiVar2, dio dioVar) {
        this.a = ffjiVar;
        this.c = ffjiVar2;
        this.f = dioVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dhl(this.a, this.c, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dhl dhlVar = (dhl) hvhVar;
        float f = dhlVar.c;
        long j = dhlVar.e;
        float f2 = dhlVar.f;
        boolean z = dhlVar.d;
        float f3 = dhlVar.g;
        boolean z2 = dhlVar.h;
        dio dioVar = dhlVar.i;
        View view = dhlVar.j;
        jzn jznVar = dhlVar.k;
        dhlVar.a = this.a;
        dhlVar.c = Float.NaN;
        dhlVar.d = true;
        dhlVar.e = 9205357640488583168L;
        dhlVar.f = Float.NaN;
        dhlVar.g = Float.NaN;
        dhlVar.h = true;
        dhlVar.b = this.c;
        dio dioVar2 = this.f;
        dhlVar.i = dioVar2;
        View a = isy.a(dhlVar);
        jzn g = isx.g(dhlVar);
        if (dhlVar.o != null && (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && f != Float.NaN && !dioVar2.a()) || j != 9205357640488583168L || !jzq.b(Float.NaN, f2) || !jzq.b(Float.NaN, f3) || !z || !z2 || !ffkj.e(dioVar2, dioVar) || !ffkj.e(a, view) || !ffkj.e(g, jznVar))) {
            dhlVar.b();
        }
        dhlVar.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (this.a != magnifierElement.a) {
            return false;
        }
        ffji ffjiVar = magnifierElement.b;
        float f = magnifierElement.d;
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + jzu.a(9205357640488583168L)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN)) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }
}
