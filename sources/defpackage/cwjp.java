package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjp extends cpdo {
    public final Context a;
    private final errl b;

    public cwjp(Context context, errl errlVar) {
        this.a = context;
        this.b = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("ProfileInstallerStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.f(new Runnable() { // from class: cwjo
            @Override // java.lang.Runnable
            public final void run() {
                ope opeVar = opf.a;
                opf.c(cwjp.this.a, new Executor() { // from class: opb
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, opf.a, false);
            }
        }, this.b);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return false;
    }
}
