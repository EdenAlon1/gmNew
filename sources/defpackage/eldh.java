package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldh implements elav {
    final /* synthetic */ elav a;

    public eldh(elav elavVar) {
        this.a = elavVar;
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        efbd.d(new Runnable() { // from class: eldg
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = eldl.c;
                elav elavVar = eldh.this.a;
                synchronized (obj) {
                    if (ffkj.e(eldl.d, elavVar)) {
                        eldl.d = null;
                    }
                }
            }
        }, 10000L);
    }
}
