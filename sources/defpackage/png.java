package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class png {
    public final Activity a;
    public final ksp b;
    public pmd c;
    private final Executor d;

    public png(Activity activity, Executor executor, ksp kspVar) {
        this.a = activity;
        this.d = executor;
        this.b = kspVar;
    }

    public final void a(final pmd pmdVar) {
        this.c = pmdVar;
        this.d.execute(new Runnable() { // from class: pnf
            @Override // java.lang.Runnable
            public final void run() {
                png.this.b.accept(pmdVar);
            }
        });
    }
}
