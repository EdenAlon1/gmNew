package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exw extends ffkk implements ffji {
    final /* synthetic */ jlk a;
    final /* synthetic */ evc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exw(jlk jlkVar, evc evcVar) {
        super(1);
        this.a = jlkVar;
        this.b = evcVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jlk a;
        jph a2;
        jph a3;
        jph a4;
        evt evtVar = (evt) obj;
        jph a5 = ((jlw) this.a.a).a();
        jou jouVar = null;
        jou e = eyh.e(eyh.e(a5 != null ? a5.a : null, (!this.b.a() || (a4 = ((jlw) this.a.a).a()) == null) ? null : a4.b), (!this.b.b() || (a3 = ((jlw) this.a.a).a()) == null) ? null : a3.c);
        if (this.b.c() && (a2 = ((jlw) this.a.a).a()) != null) {
            jouVar = a2.d;
        }
        jou e2 = eyh.e(e, jouVar);
        jlk jlkVar = this.a;
        ffkx ffkxVar = new ffkx();
        jlm jlmVar = evtVar.a;
        evs evsVar = new evs(ffkxVar, jlkVar, e2);
        jlj jljVar = new jlj(jlmVar);
        int size = jljVar.a.size();
        for (int i = 0; i < size; i++) {
            a = ((jli) jljVar.a.get(i)).a(Integer.MIN_VALUE);
            jljVar.a.set(i, jlh.a((jlk) evsVar.invoke(a)));
        }
        evtVar.b = jljVar.b();
        return ffcu.a;
    }
}
