package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctgb implements Runnable {
    final /* synthetic */ nql a;
    final /* synthetic */ cter b;
    final /* synthetic */ ffrf c;
    final /* synthetic */ ctgf d;
    final /* synthetic */ long e;
    final /* synthetic */ ctgi f;

    public ctgb(nql nqlVar, ctgi ctgiVar, cter cterVar, ffrf ffrfVar, ctgf ctgfVar, long j) {
        this.a = nqlVar;
        this.f = ctgiVar;
        this.b = cterVar;
        this.c = ffrfVar;
        this.d = ctgfVar;
        this.e = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            nql nqlVar = this.a;
            nqm nqmVar = new nqm(new nql[0]);
            nqmVar.a.h(nqlVar);
            nqmVar.a.i(new nql[0]);
            npp nppVar = new npp(new nqn(nqmVar), new nqn[0]);
            nppVar.b = 2;
            npq a = nppVar.a();
            ctgi ctgiVar = this.f;
            String path = ((ctei) this.b).b.getPath();
            path.getClass();
            nsu nsuVar = ctgiVar.a;
            nsuVar.c();
            nsuVar.k = new ntv(nsuVar.b, new nsn(nsuVar));
            nsuVar.k.b();
            nsuVar.h = a;
            nsuVar.i = path;
            nsuVar.f.b();
            npq npqVar = nsuVar.h;
            lti.f(npqVar);
            if (npqVar.a.size() <= 1 && ((enou) ((nqn) nsuVar.h.a.get(0)).a).c <= 1) {
                npq npqVar2 = nsuVar.h;
                lti.f(npqVar2);
                ((nql) ((nqn) npqVar2.a.get(0)).a.get(0)).a.e.equals(lqn.a);
            }
            nsuVar.h(a, new nrx(path, nsuVar.d, nsuVar.e), nsuVar.e);
        } catch (IllegalStateException e) {
            this.c.e(-1L, ctga.a);
            ensk i = ctgf.a.i();
            i.Y(ente.a, "BugleTranscoding");
            ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$2", "run", 259, "TranscoderImpl.kt")).s("transformer failed in %d ms.", this.d.c.a() - this.e);
            this.d.d.p(2);
            this.d.d.r(13);
            ctgf ctgfVar = this.d;
            ctgfVar.d.k(ctgfVar.b(this.e));
            this.d.d.b();
        }
    }
}
