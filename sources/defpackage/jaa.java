package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jaa extends ffkk implements ffix {
    final /* synthetic */ jfr a;
    final /* synthetic */ jae b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaa(jfr jfrVar, jae jaeVar) {
        super(0);
        this.a = jfrVar;
        this.b = jaeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        jjw jjwVar;
        iui iuiVar;
        jfr jfrVar = this.a;
        jjk jjkVar = jfrVar.d;
        jjk jjkVar2 = jfrVar.e;
        Float f = jfrVar.b;
        Float f2 = jfrVar.c;
        float floatValue = (jjkVar == null || f == null) ? 0.0f : ((Number) jjkVar.a.invoke()).floatValue() - f.floatValue();
        float floatValue2 = (jjkVar2 == null || f2 == null) ? 0.0f : ((Number) jjkVar2.a.invoke()).floatValue() - f2.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            int m = this.b.m(this.a.a);
            jae jaeVar = this.b;
            jft jftVar = (jft) jaeVar.q().a(jaeVar.i);
            if (jftVar != null) {
                jae jaeVar2 = this.b;
                try {
                    kxu kxuVar = jaeVar2.k;
                    if (kxuVar != null) {
                        kxuVar.o(jaeVar2.n(jftVar));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            jae jaeVar3 = this.b;
            jft jftVar2 = (jft) jaeVar3.q().a(jaeVar3.j);
            if (jftVar2 != null) {
                jae jaeVar4 = this.b;
                try {
                    kxu kxuVar2 = jaeVar4.l;
                    if (kxuVar2 != null) {
                        kxuVar2.o(jaeVar4.n(jftVar2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            this.b.b.invalidate();
            jft jftVar3 = (jft) this.b.q().a(m);
            if (jftVar3 != null && (jjwVar = jftVar3.a) != null && (iuiVar = jjwVar.b) != null) {
                jae jaeVar5 = this.b;
                if (jjkVar != null) {
                    jaeVar5.n.f(m, jjkVar);
                }
                if (jjkVar2 != null) {
                    jaeVar5.o.f(m, jjkVar2);
                }
                jaeVar5.u(iuiVar);
            }
        }
        if (jjkVar != null) {
            this.a.b = (Float) jjkVar.a.invoke();
        }
        if (jjkVar2 != null) {
            this.a.c = (Float) jjkVar2.a.invoke();
        }
        return ffcu.a;
    }
}
