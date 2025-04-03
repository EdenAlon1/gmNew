package androidx.compose.foundation;

import defpackage.ddx;
import defpackage.dfg;
import defpackage.dfp;
import defpackage.dhf;
import defpackage.dwn;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ilx;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jjj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CombinedClickableElement extends ivp<dfp> {
    private final dhf a;
    private final boolean b;
    private final jjj c;
    private final ffix d;
    private final ffix f;
    private final ffix g;
    private final dwn h;

    public /* synthetic */ CombinedClickableElement(dwn dwnVar, dhf dhfVar, boolean z, jjj jjjVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        this.h = dwnVar;
        this.a = dhfVar;
        this.b = z;
        this.c = jjjVar;
        this.d = ffixVar;
        this.f = ffixVar2;
        this.g = ffixVar3;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dfp(this.d, this.f, this.g, this.h, this.a, this.b, this.c);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        boolean z;
        ilx ilxVar;
        dfp dfpVar = (dfp) hvhVar;
        dfpVar.k = true;
        if (!ffkj.e(null, null)) {
            ixo.a(dfpVar);
        }
        ffix ffixVar = this.f;
        if ((dfpVar.i == null) != (ffixVar == null)) {
            dfpVar.i();
            ixo.a(dfpVar);
            z = true;
        } else {
            z = false;
        }
        jjj jjjVar = this.c;
        boolean z2 = this.b;
        boolean z3 = false;
        dhf dhfVar = this.a;
        dwn dwnVar = this.h;
        ffix ffixVar2 = this.g;
        ffix ffixVar3 = this.d;
        dfpVar.i = ffixVar;
        boolean z4 = !((dfpVar.j == null) == (ffixVar2 == null));
        dfpVar.j = ffixVar2;
        if (((ddx) dfpVar).b == z2) {
            z3 = true;
        }
        dfpVar.x(dwnVar, dhfVar, z2, null, jjjVar, ffixVar3);
        if ((!(true ^ z3) && !(z4 | z)) || (ilxVar = dfpVar.d) == null) {
            return;
        }
        ilxVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return ffkj.e(this.h, combinedClickableElement.h) && ffkj.e(this.a, combinedClickableElement.a) && this.b == combinedClickableElement.b && ffkj.e(null, null) && ffkj.e(this.c, combinedClickableElement.c) && this.d == combinedClickableElement.d && ffkj.e(null, null) && this.f == combinedClickableElement.f && this.g == combinedClickableElement.g;
    }

    public final int hashCode() {
        dwn dwnVar = this.h;
        int hashCode = dwnVar != null ? dwnVar.hashCode() : 0;
        dhf dhfVar = this.a;
        int hashCode2 = dhfVar != null ? dhfVar.hashCode() : 0;
        int i = hashCode * 31;
        boolean z = this.b;
        jjj jjjVar = this.c;
        int a = ((((((i + hashCode2) * 31) + dfg.a(z)) * 961) + (jjjVar != null ? jjjVar.a : 0)) * 31) + this.d.hashCode();
        ffix ffixVar = this.f;
        int hashCode3 = ((a * 961) + (ffixVar != null ? ffixVar.hashCode() : 0)) * 31;
        ffix ffixVar2 = this.g;
        return ((hashCode3 + (ffixVar2 != null ? ffixVar2.hashCode() : 0)) * 31) + dfg.a(true);
    }
}
