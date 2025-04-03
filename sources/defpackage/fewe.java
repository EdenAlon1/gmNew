package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewe extends fdxn {
    final /* synthetic */ ffwm a;
    final /* synthetic */ fews b;

    public fewe(ffwm ffwmVar, fews fewsVar) {
        this.a = ffwmVar;
        this.b = fewsVar;
    }

    @Override // defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        status.getClass();
        feboVar.getClass();
        this.a.e(status.f() ? null : new StatusException(status, feboVar));
    }

    @Override // defpackage.fdxn
    public final void c(Object obj) {
        Object b = this.a.b(obj);
        if (b instanceof ffwr) {
            Throwable b2 = ffws.b(b);
            if (b2 != null) {
                throw b2;
            }
            throw new AssertionError("onMessage should never be called until responses is ready");
        }
    }

    @Override // defpackage.fdxn
    public final void d() {
        this.b.b();
    }
}
