package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqh implements ffji {
    final /* synthetic */ ffsk a;
    final /* synthetic */ zqj b;
    final /* synthetic */ engw c;
    final /* synthetic */ ffxx d;

    public zqh(ffsk ffskVar, zqj zqjVar, engw engwVar, ffxx ffxxVar) {
        this.a = ffskVar;
        this.b = zqjVar;
        this.c = engwVar;
        this.d = ffxxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ajiy ajiyVar = (ajiy) obj;
        ajiyVar.getClass();
        fflb fflbVar = new fflb();
        fflbVar.a = axol.k(this.a, null, new zqf(this.d, ajiyVar, this.b, fflbVar, null), 3);
        return this.b.a(this.c, ajiyVar, new zqg(fflbVar));
    }
}
