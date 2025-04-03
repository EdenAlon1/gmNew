package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etk extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jvw c;
    final /* synthetic */ jvu d;
    final /* synthetic */ juw e;
    final /* synthetic */ jvj f;
    final /* synthetic */ fhi g;
    final /* synthetic */ ffsk h;
    final /* synthetic */ epe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etk(eva evaVar, boolean z, jvw jvwVar, jvu jvuVar, juw juwVar, jvj jvjVar, fhi fhiVar, ffsk ffskVar, epe epeVar) {
        super(1);
        this.a = evaVar;
        this.b = z;
        this.c = jvwVar;
        this.d = jvuVar;
        this.e = juwVar;
        this.f = jvjVar;
        this.g = fhiVar;
        this.h = ffskVar;
        this.i = epeVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        exq d;
        hzo hzoVar = (hzo) obj;
        if (this.a.p() != hzoVar.b()) {
            this.a.d.b(Boolean.valueOf(hzoVar.b()));
            if (this.a.p() && this.b) {
                eub.f(this.c, this.a, this.d, this.e, this.f);
            } else {
                eub.d(this.a);
            }
            if (hzoVar.b() && (d = this.a.d()) != null) {
                ffqy.d(this.h, null, null, new etj(this.i, this.d, this.a, d, this.f, null), 3);
            }
            if (!hzoVar.b()) {
                this.g.h(null);
            }
        }
        return ffcu.a;
    }
}
