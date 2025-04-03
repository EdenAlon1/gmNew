package androidx.compose.foundation.selection;

import defpackage.dhf;
import defpackage.dwn;
import defpackage.epu;
import defpackage.eqb;
import defpackage.ffji;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jjj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ToggleableElement extends ivp<eqb> {
    private final boolean a;
    private final dhf b;
    private final boolean c;
    private final jjj d;
    private final ffji f;
    private final dwn g;

    public ToggleableElement(boolean z, dwn dwnVar, dhf dhfVar, boolean z2, jjj jjjVar, ffji ffjiVar) {
        this.a = z;
        this.g = dwnVar;
        this.b = dhfVar;
        this.c = z2;
        this.d = jjjVar;
        this.f = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eqb(this.a, this.g, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eqb eqbVar = (eqb) hvhVar;
        boolean z = eqbVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            eqbVar.i = z2;
            ixo.a(eqbVar);
        }
        ffji ffjiVar = this.f;
        jjj jjjVar = this.d;
        boolean z3 = this.c;
        dhf dhfVar = this.b;
        dwn dwnVar = this.g;
        eqbVar.j = ffjiVar;
        eqbVar.x(dwnVar, dhfVar, z3, null, jjjVar, eqbVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.a == toggleableElement.a && ffkj.e(this.g, toggleableElement.g) && ffkj.e(this.b, toggleableElement.b) && this.c == toggleableElement.c && ffkj.e(this.d, toggleableElement.d) && this.f == toggleableElement.f;
    }

    public final int hashCode() {
        dwn dwnVar = this.g;
        int hashCode = dwnVar != null ? dwnVar.hashCode() : 0;
        boolean z = this.a;
        dhf dhfVar = this.b;
        int hashCode2 = dhfVar != null ? dhfVar.hashCode() : 0;
        int a = (epu.a(z) * 31) + hashCode;
        boolean z2 = this.c;
        jjj jjjVar = this.d;
        return (((((((a * 31) + hashCode2) * 31) + epu.a(z2)) * 31) + (jjjVar != null ? jjjVar.a : 0)) * 31) + this.f.hashCode();
    }
}
