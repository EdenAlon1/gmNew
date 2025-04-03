package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsi implements byb {
    final /* synthetic */ kfb a;
    final /* synthetic */ ksp b;
    final /* synthetic */ bsv c;
    final /* synthetic */ btb d;

    public bsi(btb btbVar, kfb kfbVar, ksp kspVar, bsv bsvVar) {
        this.d = btbVar;
        this.a = kfbVar;
        this.b = kspVar;
        this.c = bsvVar;
    }

    @Override // defpackage.byb
    public final void a(bxs bxsVar) {
        if (this.d.R == null) {
            this.b.accept(bxsVar);
        }
    }

    @Override // defpackage.byb
    public final void b() {
        this.a.b(null);
    }

    @Override // defpackage.byb
    public final void c(bxt bxtVar) {
        btb btbVar = this.d;
        if (btbVar.ab == 3) {
            bxtVar.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        if (btbVar.A != null) {
            try {
                btbVar.w(bxtVar, this.c);
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
            avw.a("Recorder", "Drop audio data since recording is stopping.");
        } else {
            btbVar.ag.b(new bxr(bxtVar));
            if (this.d.Q != null) {
                avw.a("Recorder", "Received audio data. Starting muxer...");
                this.d.r(this.c);
            } else {
                avw.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        bxtVar.close();
    }

    @Override // defpackage.byb
    public final void d(bzq bzqVar) {
        this.d.af = bzqVar;
    }
}
