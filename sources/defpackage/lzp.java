package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lzp {
    public final /* synthetic */ mac a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ lsh c;

    public /* synthetic */ lzp(mac macVar, Executor executor, lsh lshVar) {
        this.a = macVar;
        this.b = executor;
        this.c = lshVar;
    }

    public final void a() {
        mac macVar = this.a;
        if (!macVar.k) {
            macVar.k();
            return;
        }
        final lsh lshVar = this.c;
        this.b.execute(new Runnable() { // from class: lzr
            @Override // java.lang.Runnable
            public final void run() {
                lsh.this.a();
            }
        });
        int i = lyt.a;
    }
}
