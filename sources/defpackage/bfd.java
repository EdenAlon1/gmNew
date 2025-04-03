package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfd implements llh {
    final AtomicBoolean a = new AtomicBoolean(true);
    final bfk b;
    final Executor c;

    public bfd(Executor executor, bfk bfkVar) {
        this.c = executor;
        this.b = bfkVar;
    }

    @Override // defpackage.llh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final bfe bfeVar = (bfe) obj;
        this.c.execute(new Runnable() { // from class: bfc
            @Override // java.lang.Runnable
            public final void run() {
                bfd bfdVar = bfd.this;
                if (bfdVar.a.get()) {
                    bfdVar.b.b(bfeVar.a);
                }
            }
        });
    }

    final void b() {
        this.a.set(false);
    }
}
