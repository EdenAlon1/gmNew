package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egui implements ffjm {
    public static final egui a = new egui();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final long j = gft.a(hfdVar).F;
            c = ebs.c(hvi.e, 1.0f);
            hfdVar.v(-748243406);
            boolean C = hfdVar.C(j);
            Object f = hfdVar.f();
            if (C || f == hfc.a) {
                f = new ffji() { // from class: eguh
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ifr ifrVar = (ifr) obj3;
                        ifrVar.getClass();
                        ifrVar.r(j, 0L, (r20 & 4) != 0 ? ifq.c(ifrVar.b(), 0L) : ifrVar.b(), (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            deu.a(c, (ffji) f, hfdVar, 6);
        }
        return ffcu.a;
    }
}
