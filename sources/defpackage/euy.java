package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euy extends ffkk implements ffji {
    final /* synthetic */ eva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euy(eva evaVar) {
        super(1);
        this.a = evaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jvu jvuVar = (jvu) obj;
        String a = jvuVar.a();
        jlm jlmVar = this.a.h;
        if (!ffkj.e(a, jlmVar != null ? jlmVar.b : null)) {
            this.a.h(eug.a);
            if (this.a.q()) {
                this.a.j(false);
            } else {
                this.a.f(false);
            }
        }
        this.a.k(jpm.a);
        this.a.g(jpm.a);
        this.a.o.invoke(jvuVar);
        this.a.u.a();
        return ffcu.a;
    }
}
