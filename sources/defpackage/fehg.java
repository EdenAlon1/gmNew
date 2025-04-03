package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehg extends fect {
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.fect
    public final void a() {
        this.b.offer(new fehf() { // from class: fehd
            @Override // defpackage.fehf
            public final void a(fect fectVar) {
                fectVar.a();
            }
        });
        f();
    }

    @Override // defpackage.fect
    public final void b() {
        this.b.offer(new fehf() { // from class: fehb
            @Override // defpackage.fehf
            public final void a(fect fectVar) {
                fectVar.b();
            }
        });
        f();
    }

    @Override // defpackage.fect
    public final void c() {
        this.b.offer(new fehf() { // from class: feha
            @Override // defpackage.fehf
            public final void a(fect fectVar) {
                fectVar.c();
            }
        });
        f();
    }

    @Override // defpackage.fect
    public final void d(final Object obj) {
        this.b.offer(new fehf() { // from class: fehe
            @Override // defpackage.fehf
            public final void a(fect fectVar) {
                fectVar.d(obj);
            }
        });
        f();
    }

    @Override // defpackage.fect
    public final void e() {
        this.b.offer(new fehf() { // from class: fehc
            @Override // defpackage.fehf
            public final void a(fect fectVar) {
                fectVar.e();
            }
        });
        f();
    }

    public final void f() {
        fect fectVar = (fect) this.a.get();
        if (fectVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                fehf fehfVar = (fehf) this.b.poll();
                if (fehfVar != null) {
                    fehfVar.a(fectVar);
                }
            }
        }
    }
}
