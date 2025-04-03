package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctge implements nst {
    final /* synthetic */ ffrf a;
    final /* synthetic */ ctgf b;
    final /* synthetic */ long c;

    public ctge(ffrf ffrfVar, ctgf ctgfVar, long j) {
        this.a = ffrfVar;
        this.b = ctgfVar;
        this.c = j;
    }

    @Override // defpackage.nst
    public final void a(npq npqVar, nrg nrgVar) {
        ctgf ctgfVar = this.b;
        long j = this.c;
        ffrf ffrfVar = this.a;
        ekzz f = eleg.f("Transformer.onCompleted");
        try {
            ffrfVar.e(Long.valueOf(nrgVar.b), ctgc.a);
            ensk h = ctgf.a.h();
            h.Y(ente.a, "BugleTranscoding");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 173, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", npqVar.d);
            ensk h2 = ctgf.a.h();
            h2.Y(ente.a, "BugleTranscoding");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 176, "TranscoderImpl.kt")).L("transformer succeeded in %s ms, durationMs: %s, width: %s, height: %s, bytes: %s.", Long.valueOf(ctgfVar.c.a() - j), Long.valueOf(nrgVar.a), Integer.valueOf(nrgVar.k), Integer.valueOf(nrgVar.j), Long.valueOf(nrgVar.b));
            ctgfVar.d.p(1);
            ctgfVar.d.k(ctgfVar.b(j));
            ctgfVar.d.b();
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.nst
    public final void b(npq npqVar, nrd nrdVar) {
        ctgf ctgfVar = this.b;
        long j = this.c;
        ffrf ffrfVar = this.a;
        ekzz f = eleg.f("Transformer.onError");
        try {
            ffrfVar.e(-1L, ctgd.a);
            ensk i = ctgf.a.i();
            i.Y(ente.a, "BugleTranscoding");
            ((enrr) i.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", 205, "TranscoderImpl.kt")).C("transformer onError(%s) in %d ms.", nrdVar.getMessage(), ctgfVar.c.a() - j);
            ensk h = ctgf.a.h();
            h.Y(ente.a, "BugleTranscoding");
            ((enrr) h.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", 210, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", npqVar.d);
            ctgfVar.d.p(2);
            ctgfVar.d.r(12);
            ctgfVar.d.k(ctgfVar.b(j));
            ctgfVar.d.b();
            ffig.a(f, null);
        } finally {
        }
    }
}
