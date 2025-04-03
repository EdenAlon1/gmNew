package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpy extends AtomicReference implements Executor, Runnable {
    erqa a;
    Executor b;
    Runnable c;
    Thread d;

    public erpy(Executor executor, erqa erqaVar) {
        super(erpx.NOT_RUN);
        this.b = executor;
        this.a = erqaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == erpx.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            erqa erqaVar = this.a;
            erqaVar.getClass();
            erpz erpzVar = erqaVar.a;
            if (erpzVar.a == this.d) {
                this.a = null;
                emxf.l(erpzVar.b == null);
                erpzVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                erpzVar.c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        erpz erpzVar = new erpz();
        erpzVar.a = currentThread;
        erqa erqaVar = this.a;
        erqaVar.getClass();
        erqaVar.a = erpzVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = erpzVar.b;
                if (runnable3 == null || (executor = erpzVar.c) == null) {
                    break;
                }
                erpzVar.b = null;
                erpzVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            erpzVar.a = null;
        }
    }
}
