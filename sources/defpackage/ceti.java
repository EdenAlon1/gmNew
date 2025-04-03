package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceti extends cetx {
    public poj a;
    public Notification b;
    public eogt c;
    public Duration d;
    public Optional e = Optional.empty();
    private cevc f;
    private int g;
    private int h;
    private long i;
    private poa j;
    private boolean k;
    private byte l;

    @Override // defpackage.cetx
    public final cety a() {
        if (this.l == 15 && this.f != null && this.j != null) {
            return new cetj(this.a, this.f, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.k, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" keepAliveStrategy");
        }
        if ((this.l & 1) == 0) {
            sb.append(" maxRowsPerBatch");
        }
        if ((this.l & 2) == 0) {
            sb.append(" maxAttemptsPerItem");
        }
        if ((this.l & 4) == 0) {
            sb.append(" retryDelayMillis");
        }
        if (this.j == null) {
            sb.append(" retryBackoffPolicy");
        }
        if ((this.l & 8) == 0) {
            sb.append(" optInForSchedulerMigration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cetx
    public final void b(cevc cevcVar) {
        if (cevcVar == null) {
            throw new NullPointerException("Null keepAliveStrategy");
        }
        this.f = cevcVar;
    }

    @Override // defpackage.cetx
    public final void c(int i) {
        this.h = i;
        this.l = (byte) (this.l | 2);
    }

    @Override // defpackage.cetx
    public final void d(int i) {
        this.g = i;
        this.l = (byte) (this.l | 1);
    }

    @Override // defpackage.cetx
    public final void e(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 8);
    }

    @Override // defpackage.cetx
    public final void f(poa poaVar) {
        if (poaVar == null) {
            throw new NullPointerException("Null retryBackoffPolicy");
        }
        this.j = poaVar;
    }

    @Override // defpackage.cetx
    public final void g(long j) {
        this.i = j;
        this.l = (byte) (this.l | 4);
    }
}
