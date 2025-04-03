package androidx.compose.foundation.selection;

import defpackage.dhf;
import defpackage.dwn;
import defpackage.eqc;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jjj;
import defpackage.jlc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TriStateToggleableElement extends ivp<eqc> {
    private final jlc a;
    private final dhf b;
    private final boolean c;
    private final jjj d;
    private final ffix f;
    private final dwn g;

    public TriStateToggleableElement(jlc jlcVar, dwn dwnVar, dhf dhfVar, boolean z, jjj jjjVar, ffix ffixVar) {
        this.a = jlcVar;
        this.g = dwnVar;
        this.b = dhfVar;
        this.c = z;
        this.d = jjjVar;
        this.f = ffixVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eqc(this.a, this.g, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eqc eqcVar = (eqc) hvhVar;
        jlc jlcVar = eqcVar.i;
        jlc jlcVar2 = this.a;
        if (jlcVar != jlcVar2) {
            eqcVar.i = jlcVar2;
            ixo.a(eqcVar);
        }
        ffix ffixVar = this.f;
        jjj jjjVar = this.d;
        boolean z = this.c;
        eqcVar.x(this.g, this.b, z, null, jjjVar, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.a == triStateToggleableElement.a && ffkj.e(this.g, triStateToggleableElement.g) && ffkj.e(this.b, triStateToggleableElement.b) && this.c == triStateToggleableElement.c && ffkj.e(this.d, triStateToggleableElement.d) && this.f == triStateToggleableElement.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dwn dwnVar = this.g;
        int hashCode2 = (hashCode + (dwnVar != null ? dwnVar.hashCode() : 0)) * 31;
        dhf dhfVar = this.b;
        return ((((((hashCode2 + (dhfVar != null ? dhfVar.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.a) * 31) + this.f.hashCode();
    }
}
