package androidx.compose.foundation.gestures;

import defpackage.dpe;
import defpackage.dpf;
import defpackage.dpo;
import defpackage.dpp;
import defpackage.dqs;
import defpackage.dwn;
import defpackage.ffji;
import defpackage.ffjn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableElement extends ivp<dpo> {
    private static final ffji a = dpf.a;
    private final dpp b;
    private final dqs c;
    private final boolean d;
    private final boolean f;
    private final ffjn g;
    private final ffjn h;
    private final boolean i;
    private final dwn j;

    public DraggableElement(dpp dppVar, dqs dqsVar, boolean z, dwn dwnVar, boolean z2, ffjn ffjnVar, ffjn ffjnVar2, boolean z3) {
        this.b = dppVar;
        this.c = dqsVar;
        this.d = z;
        this.j = dwnVar;
        this.f = z2;
        this.g = ffjnVar;
        this.h = ffjnVar2;
        this.i = z3;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dpo(this.b, a, this.c, this.d, this.j, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        boolean z;
        boolean z2;
        dpo dpoVar = (dpo) hvhVar;
        ffji ffjiVar = a;
        dpp dppVar = dpoVar.a;
        dpp dppVar2 = this.b;
        if (ffkj.e(dppVar, dppVar2)) {
            z = false;
        } else {
            dpoVar.a = dppVar2;
            z = true;
        }
        dqs dqsVar = this.c;
        if (dpoVar.b != dqsVar) {
            dpoVar.b = dqsVar;
            z = true;
        }
        boolean z3 = this.i;
        if (dpoVar.k != z3) {
            dpoVar.k = z3;
            z2 = true;
        } else {
            z2 = z;
        }
        ffjn ffjnVar = this.h;
        ffjn ffjnVar2 = this.g;
        boolean z4 = this.f;
        dwn dwnVar = this.j;
        boolean z5 = this.d;
        dpoVar.d = ffjnVar2;
        dpoVar.j = ffjnVar;
        dpoVar.c = z4;
        dpoVar.B(ffjiVar, z5, dwnVar, dqsVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return ffkj.e(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && ffkj.e(this.j, draggableElement.j) && this.f == draggableElement.f && ffkj.e(this.g, draggableElement.g) && ffkj.e(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        dwn dwnVar = this.j;
        return (((((((((((hashCode * 31) + dpe.a(this.d)) * 31) + (dwnVar != null ? dwnVar.hashCode() : 0)) * 31) + dpe.a(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + dpe.a(this.i);
    }
}
