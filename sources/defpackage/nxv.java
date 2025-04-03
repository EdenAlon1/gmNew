package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxv extends ffkk implements ffji {
    final /* synthetic */ ffkx a;
    final /* synthetic */ ffkx b;
    final /* synthetic */ nyj c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffdn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxv(ffkx ffkxVar, ffkx ffkxVar2, nyj nyjVar, boolean z, ffdn ffdnVar) {
        super(1);
        this.a = ffkxVar;
        this.b = ffkxVar2;
        this.c = nyjVar;
        this.d = z;
        this.e = ffdnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        nxm nxmVar = (nxm) obj;
        nxmVar.getClass();
        this.a.a = true;
        this.b.a = true;
        this.c.k(nxmVar, this.d, this.e);
        return ffcu.a;
    }
}
