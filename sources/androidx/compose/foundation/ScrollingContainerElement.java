package androidx.compose.foundation;

import defpackage.dik;
import defpackage.djj;
import defpackage.djm;
import defpackage.dmk;
import defpackage.dpq;
import defpackage.dqs;
import defpackage.dsg;
import defpackage.dwn;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingContainerElement extends ivp<djm> {
    private final dsg a;
    private final dqs b;
    private final boolean c;
    private final boolean d;
    private final dpq f;
    private final dmk g;
    private final boolean h;
    private final dik i;
    private final dwn j;

    public ScrollingContainerElement(dsg dsgVar, dqs dqsVar, boolean z, boolean z2, dpq dpqVar, dwn dwnVar, dmk dmkVar, boolean z3, dik dikVar) {
        this.a = dsgVar;
        this.b = dqsVar;
        this.c = z;
        this.d = z2;
        this.f = dpqVar;
        this.j = dwnVar;
        this.g = dmkVar;
        this.h = z3;
        this.i = dikVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new djm(this.a, this.b, this.c, this.d, this.f, this.j, this.g, this.h, this.i);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((djm) hvhVar).g(this.a, this.b, this.h, this.i, this.c, this.d, this.f, this.j, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return ffkj.e(this.a, scrollingContainerElement.a) && this.b == scrollingContainerElement.b && this.c == scrollingContainerElement.c && this.d == scrollingContainerElement.d && ffkj.e(this.f, scrollingContainerElement.f) && ffkj.e(this.j, scrollingContainerElement.j) && ffkj.e(this.g, scrollingContainerElement.g) && this.h == scrollingContainerElement.h && ffkj.e(this.i, scrollingContainerElement.i);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dpq dpqVar = this.f;
        int a = ((((((hashCode * 31) + djj.a(this.c)) * 31) + djj.a(this.d)) * 31) + (dpqVar != null ? dpqVar.hashCode() : 0)) * 31;
        dwn dwnVar = this.j;
        int hashCode2 = (a + (dwnVar != null ? dwnVar.hashCode() : 0)) * 31;
        dmk dmkVar = this.g;
        int hashCode3 = (((hashCode2 + (dmkVar != null ? dmkVar.hashCode() : 0)) * 31) + djj.a(this.h)) * 31;
        dik dikVar = this.i;
        return hashCode3 + (dikVar != null ? dikVar.hashCode() : 0);
    }
}
