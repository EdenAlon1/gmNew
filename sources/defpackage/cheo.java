package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cheo implements erqj {
    final /* synthetic */ akzw a;
    final /* synthetic */ chis b;
    final /* synthetic */ ciin c;
    final /* synthetic */ chep d;

    public cheo(chep chepVar, akzw akzwVar, chis chisVar, ciin ciinVar) {
        this.a = akzwVar;
        this.b = chisVar;
        this.c = ciinVar;
        this.d = chepVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.c();
        String str = ((chgs) ((chgt) this.b).b).b;
        if (str != null) {
            chep chepVar = this.d;
            chepVar.g.e(str, Status.b.getCode().value());
        }
        if (this.c.b().a() == ciik.ANONYMOUS) {
            chep chepVar2 = this.d;
            chepVar2.a.c(Status.b, this.c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.c();
        String str = ((chgs) ((chgt) this.b).b).b;
        if (str != null) {
            this.d.g.g(str, Status.c(th).getCode().value());
        }
        this.c.h(th);
        if (this.c.b().a() == ciik.ANONYMOUS) {
            this.d.a.c(Status.c(th), this.c);
        }
    }
}
