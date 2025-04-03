package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsg implements byb {
    final /* synthetic */ kfb a;
    final /* synthetic */ bsv b;
    final /* synthetic */ btb c;

    public bsg(btb btbVar, kfb kfbVar, bsv bsvVar) {
        this.c = btbVar;
        this.a = kfbVar;
        this.b = bsvVar;
    }

    @Override // defpackage.byb
    public final void a(bxs bxsVar) {
        this.a.c(bxsVar);
    }

    @Override // defpackage.byb
    public final void b() {
        this.a.b(null);
    }

    @Override // defpackage.byb
    public final void c(bxt bxtVar) {
        boolean z;
        btb btbVar = this.c;
        if (btbVar.A != null) {
            try {
                btbVar.x(bxtVar, this.b);
                bxtVar.close();
                return;
            } catch (Throwable th) {
                try {
                    bxtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (btbVar.r) {
            avw.a("Recorder", "Drop video data since recording is stopping.");
            bxtVar.close();
            return;
        }
        bxt bxtVar2 = btbVar.Q;
        if (bxtVar2 != null) {
            bxtVar2.close();
            this.c.Q = null;
            z = true;
        } else {
            z = false;
        }
        if (!bxtVar.e()) {
            if (z) {
                avw.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            avw.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            final bzy bzyVar = (bzy) this.c.D;
            bzyVar.h.execute(new Runnable() { // from class: byp
                @Override // java.lang.Runnable
                public final void run() {
                    bzy bzyVar2 = bzy.this;
                    int i = bzyVar2.A;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 1) {
                        bzyVar2.m();
                    } else if (i2 == 6 || i2 == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                }
            });
            bxtVar.close();
            return;
        }
        btb btbVar2 = this.c;
        btbVar2.Q = bxtVar;
        if (!btbVar2.y() || !btbVar2.ag.c()) {
            avw.a("Recorder", "Received video keyframe. Starting muxer...");
            this.c.r(this.b);
        } else if (z) {
            avw.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            avw.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }

    @Override // defpackage.byb
    public final void d(bzq bzqVar) {
        this.c.ae = bzqVar;
    }
}
