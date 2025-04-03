package androidx.compose.foundation.selection;

import defpackage.dhf;
import defpackage.dwn;
import defpackage.epn;
import defpackage.ept;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;
import defpackage.jjj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectableElement extends ivp<ept> {
    private final boolean a;
    private final dhf b;
    private final boolean c;
    private final jjj d;
    private final ffix f;
    private final dwn g;

    public SelectableElement(boolean z, dwn dwnVar, dhf dhfVar, boolean z2, jjj jjjVar, ffix ffixVar) {
        this.a = z;
        this.g = dwnVar;
        this.b = dhfVar;
        this.c = z2;
        this.d = jjjVar;
        this.f = ffixVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ept(this.a, this.g, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ept eptVar = (ept) hvhVar;
        boolean z = eptVar.i;
        boolean z2 = this.a;
        if (z != z2) {
            eptVar.i = z2;
            ixo.a(eptVar);
        }
        ffix ffixVar = this.f;
        jjj jjjVar = this.d;
        boolean z3 = this.c;
        eptVar.x(this.g, this.b, z3, null, jjjVar, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.a == selectableElement.a && ffkj.e(this.g, selectableElement.g) && ffkj.e(this.b, selectableElement.b) && this.c == selectableElement.c && ffkj.e(this.d, selectableElement.d) && this.f == selectableElement.f;
    }

    public final int hashCode() {
        dwn dwnVar = this.g;
        int hashCode = dwnVar != null ? dwnVar.hashCode() : 0;
        boolean z = this.a;
        dhf dhfVar = this.b;
        int hashCode2 = dhfVar != null ? dhfVar.hashCode() : 0;
        int a = (epn.a(z) * 31) + hashCode;
        boolean z2 = this.c;
        jjj jjjVar = this.d;
        return (((((((a * 31) + hashCode2) * 31) + epn.a(z2)) * 31) + (jjjVar != null ? jjjVar.a : 0)) * 31) + this.f.hashCode();
    }
}
