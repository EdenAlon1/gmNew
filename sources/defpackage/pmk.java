package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pmk implements pmi {
    @Override // defpackage.pmi
    public void a(Context context, Executor executor, final ksp kspVar) {
        executor.execute(new Runnable() { // from class: pmj
            @Override // java.lang.Runnable
            public final void run() {
                ksp.this.accept(new pmd(ffel.a));
            }
        });
    }

    @Override // defpackage.pmi
    public void b(ksp kspVar) {
    }
}
