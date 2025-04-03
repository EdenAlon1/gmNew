package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsy implements bjt {
    final /* synthetic */ buj a;
    final /* synthetic */ bsz b;

    public bsy(bsz bszVar, buj bujVar) {
        this.b = bszVar;
        this.a = bujVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bjt
    public final void a(Throwable th) {
        bsv bsvVar;
        Objects.toString(th);
        avw.g("Recorder", "VideoEncoder Setup error: ".concat(th.toString()), th);
        bsz bszVar = this.b;
        int i = bszVar.d;
        if (i < bszVar.b) {
            bszVar.d = i + 1;
            bszVar.e = btb.h(new Runnable() { // from class: bsx
                @Override // java.lang.Runnable
                public final void run() {
                    bsy bsyVar = bsy.this;
                    if (bsyVar.b.c) {
                        return;
                    }
                    avw.a("Recorder", "Retry setupVideo #" + bsyVar.b.d);
                    bsz bszVar2 = bsyVar.b;
                    bszVar2.b(bszVar2.a, bszVar2.g);
                }
            }, bszVar.f.h, btb.e, TimeUnit.MILLISECONDS);
            return;
        }
        btb btbVar = bszVar.f;
        synchronized (btbVar.i) {
            bsvVar = null;
            switch (btbVar.l) {
                case CONFIGURING:
                    btbVar.q(-1);
                    btbVar.p(bta.ERROR);
                    break;
                case PENDING_RECORDING:
                case PENDING_PAUSED:
                    bsv bsvVar2 = btbVar.o;
                    btbVar.o = null;
                    bsvVar = bsvVar2;
                    btbVar.q(-1);
                    btbVar.p(bta.ERROR);
                    break;
                case IDLING:
                case RECORDING:
                case PAUSED:
                case STOPPING:
                case RESETTING:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + btbVar.l + ": " + th);
            }
        }
        if (bsvVar != null) {
            btbVar.j(bsvVar, 7, th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee A[Catch: all -> 0x012f, TryCatch #0 {, blocks: (B:18:0x00a0, B:19:0x00a6, B:22:0x010e, B:37:0x00af, B:38:0x00b7, B:41:0x00bc, B:42:0x00c3, B:44:0x00c7, B:46:0x00d1, B:47:0x00e4, B:49:0x00e8, B:52:0x00ee, B:54:0x00f3, B:55:0x00fd, B:57:0x0108), top: B:17:0x00a0 }] */
    @Override // defpackage.bjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsy.b(java.lang.Object):void");
    }
}
