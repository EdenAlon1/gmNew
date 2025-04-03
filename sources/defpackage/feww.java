package defpackage;

import io.grpc.Status;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feww extends fect {
    final /* synthetic */ ffud a;
    final /* synthetic */ ffwm b;
    final /* synthetic */ fecu c;
    final /* synthetic */ fews d;
    private boolean e = true;

    public feww(ffud ffudVar, ffwm ffwmVar, fecu fecuVar, fews fewsVar) {
        this.a = ffudVar;
        this.b = ffwmVar;
        this.c = fecuVar;
        this.d = fewsVar;
    }

    @Override // defpackage.fect
    public final void a() {
        ffui.e(this.a, "Cancellation received from client", null);
    }

    @Override // defpackage.fect
    public final void c() {
        this.b.e(null);
    }

    @Override // defpackage.fect
    public final void d(Object obj) {
        if (this.e) {
            Object b = this.b.b(obj);
            this.e = ffws.c(b);
            if (b instanceof ffwr) {
                Throwable b2 = ffws.b(b);
                if (!(b2 instanceof CancellationException)) {
                    throw Status.o.withDescription("onMessage should never be called when requestsChannel is unready").d(b2).asException();
                }
            }
        }
        if (this.e) {
            return;
        }
        this.c.g(1);
    }

    @Override // defpackage.fect
    public final void e() {
        this.d.b();
    }
}
