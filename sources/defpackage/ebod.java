package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebod {
    private final Queue a = new ArrayDeque();
    private final eboc b;

    public ebod(eboc ebocVar) {
        this.b = ebocVar;
    }

    public final void a() {
        efbd.c();
        while (!this.a.isEmpty()) {
            ((Runnable) this.a.remove()).run();
        }
    }

    public final void b() {
        emxf.m(this.b.b(), "Object was not initialized");
        ebpa.a(new Runnable() { // from class: ebob
            @Override // java.lang.Runnable
            public final void run() {
                ebod.this.a();
            }
        });
    }

    public final void c(Runnable runnable) {
        efbd.c();
        this.a.add(runnable);
        if (this.b.b()) {
            a();
        }
    }
}
