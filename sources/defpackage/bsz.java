package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsz {
    public final axt a;
    public final int b;
    public boolean c = false;
    public int d = 0;
    public ScheduledFuture e = null;
    final /* synthetic */ btb f;
    public final int g;

    public bsz(btb btbVar, axt axtVar, int i, boolean z, int i2) {
        this.f = btbVar;
        this.a = axtVar;
        this.g = i;
        btbVar.Z = z;
        this.b = i2;
    }

    final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
    }

    public final void b(final axt axtVar, final int i) {
        this.f.g().b(new Runnable() { // from class: bsw
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            
                if (r2.e == r3) goto L30;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bsw.run():void");
            }
        }, this.f.h);
    }
}
