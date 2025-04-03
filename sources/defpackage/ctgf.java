package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgf implements ctfv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl");
    public final ejlk b;
    public final cqoh c;
    public final ctfl d;
    private final ffsk e;
    private final ctfu f;
    private final csuu g;
    private final ffbr h;
    private final ctgh i;

    public ctgf(Context context, ejlk ejlkVar, ffsk ffskVar, ctfu ctfuVar, cqoh cqohVar, csuu csuuVar, ctcd ctcdVar, ctfl ctflVar, ctgh ctghVar, ffbr ffbrVar) {
        context.getClass();
        ejlkVar.getClass();
        ffskVar.getClass();
        cqohVar.getClass();
        csuuVar.getClass();
        ctcdVar.getClass();
        ctflVar.getClass();
        ffbrVar.getClass();
        this.b = ejlkVar;
        this.e = ffskVar;
        this.f = ctfuVar;
        this.c = cqohVar;
        this.g = csuuVar;
        this.d = ctflVar;
        this.i = ctghVar;
        this.h = ffbrVar;
    }

    @Override // defpackage.ctfv
    public final elfl a(cter cterVar) {
        ekzz f = eleg.f("Transformer.transcode");
        try {
            ffsk ffskVar = this.e;
            ffhe ffheVar = ffhe.a;
            elfl g = elfl.g(fgfz.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ctfw(null, this, cterVar)));
            f.b(g);
            ffig.a(f, null);
            g.getClass();
            return g;
        } finally {
        }
    }

    public final Duration b(long j) {
        return Duration.between(Instant.ofEpochMilli(j), Instant.ofEpochMilli(this.c.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0477  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cter r45, defpackage.ffgu r46) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctgf.c(cter, ffgu):java.lang.Object");
    }
}
