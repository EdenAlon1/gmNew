package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpo extends dpb {
    public dpp a;
    public dqs b;
    public boolean c;
    public ffjn d;
    public ffjn j;
    public boolean k;

    public dpo(dpp dppVar, ffji ffjiVar, dqs dqsVar, boolean z, dwn dwnVar, boolean z2, ffjn ffjnVar, ffjn ffjnVar2, boolean z3) {
        super(ffjiVar, z, dwnVar, dqsVar);
        this.a = dppVar;
        this.b = dqsVar;
        this.c = z2;
        this.d = ffjnVar;
        this.j = ffjnVar2;
        this.k = z3;
    }

    @Override // defpackage.dpb
    public final Object b(ffjm ffjmVar, ffgu ffguVar) {
        Object a = this.a.a(dhy.b, new dpl(ffjmVar, this, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.dpb
    public final void g(long j) {
        if (!this.z || ffkj.e(this.d, dpj.a)) {
            return;
        }
        ffqy.d(D(), null, ffsm.d, new dpm(this, j, null), 1);
    }

    @Override // defpackage.dpb
    public final void h(long j) {
        if (!this.z || ffkj.e(this.j, dpj.b)) {
            return;
        }
        ffqy.d(D(), null, ffsm.d, new dpn(this, j, null), 1);
    }

    @Override // defpackage.dpb
    public final boolean k() {
        return this.c;
    }
}
