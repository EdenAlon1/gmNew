package androidx.compose.foundation.lazy.layout;

import defpackage.dqs;
import defpackage.eks;
import defpackage.eku;
import defpackage.elb;
import defpackage.ffix;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.ixo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends ivp<elb> {
    private final ffix a;
    private final eks b;
    private final dqs c;
    private final boolean d;
    private final boolean f;

    public LazyLayoutSemanticsModifier(ffix ffixVar, eks eksVar, dqs dqsVar, boolean z, boolean z2) {
        this.a = ffixVar;
        this.b = eksVar;
        this.c = dqsVar;
        this.d = z;
        this.f = z2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new elb(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        elb elbVar = (elb) hvhVar;
        elbVar.a = this.a;
        elbVar.b = this.b;
        dqs dqsVar = elbVar.c;
        dqs dqsVar2 = this.c;
        if (dqsVar != dqsVar2) {
            elbVar.c = dqsVar2;
            ixo.a(elbVar);
        }
        boolean z = this.f;
        boolean z2 = this.d;
        if (elbVar.d == z2 && elbVar.e == z) {
            return;
        }
        elbVar.d = z2;
        elbVar.e = z;
        elbVar.a();
        ixo.a(elbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.a == lazyLayoutSemanticsModifier.a && ffkj.e(this.b, lazyLayoutSemanticsModifier.b) && this.c == lazyLayoutSemanticsModifier.c && this.d == lazyLayoutSemanticsModifier.d && this.f == lazyLayoutSemanticsModifier.f;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + eku.a(this.d)) * 31) + eku.a(this.f);
    }
}
