package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgg extends fdxn {
    public final fdxn a;
    private final elds b = elds.b();

    public evgg(fdxn fdxnVar) {
        this.a = fdxnVar;
    }

    private final void e(Runnable runnable) {
        if (ekyf.v()) {
            runnable.run();
        } else {
            elds.d(this.b, runnable).run();
        }
    }

    @Override // defpackage.fdxn
    public final void a(final Status status, final febo feboVar) {
        e(new Runnable() { // from class: evge
            @Override // java.lang.Runnable
            public final void run() {
                evgg.this.a.a(status, feboVar);
            }
        });
    }

    @Override // defpackage.fdxn
    public final void b(final febo feboVar) {
        e(new Runnable() { // from class: evgc
            @Override // java.lang.Runnable
            public final void run() {
                evgg.this.a.b(feboVar);
            }
        });
    }

    @Override // defpackage.fdxn
    public final void c(final Object obj) {
        e(new Runnable() { // from class: evgf
            @Override // java.lang.Runnable
            public final void run() {
                evgg.this.a.c(obj);
            }
        });
    }

    @Override // defpackage.fdxn
    public final void d() {
        final fdxn fdxnVar = this.a;
        fdxnVar.getClass();
        e(new Runnable() { // from class: evgd
            @Override // java.lang.Runnable
            public final void run() {
                fdxn.this.d();
            }
        });
    }
}
