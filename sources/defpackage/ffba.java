package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffba extends fect {
    final /* synthetic */ ffbb a;
    private final fecu b;
    private final ffay c;
    private boolean d = true;
    private boolean e;
    private Object f;

    public ffba(ffbb ffbbVar, ffay ffayVar, fecu fecuVar) {
        this.a = ffbbVar;
        this.b = fecuVar;
        this.c = ffayVar;
    }

    @Override // defpackage.fect
    public final void a() {
        this.c.b = true;
    }

    @Override // defpackage.fect
    public final void c() {
        if (this.d) {
            Object obj = this.f;
            if (obj == null) {
                this.b.a(Status.o.withDescription("Half-closed without a request"), new febo());
                return;
            }
            ffbb ffbbVar = this.a;
            ffbbVar.a.a(obj, this.c);
            this.f = null;
            if (this.e) {
                e();
            }
        }
    }

    @Override // defpackage.fect
    public final void d(Object obj) {
        if (this.f == null) {
            this.f = obj;
        } else {
            this.b.a(Status.o.withDescription("Too many requests"), new febo());
            this.d = false;
        }
    }

    @Override // defpackage.fect
    public final void e() {
        this.e = true;
    }

    @Override // defpackage.fect
    public final void b() {
    }
}
