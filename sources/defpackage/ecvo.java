package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecvo {
    public static Context a;
    private static volatile ecvo j;
    private static volatile ecvo k;
    public final ecyr c = new ecyx();
    public final Context d;
    public final emyl e;
    public final edch f;
    public final emyl g;
    public final edai h;
    private final emyl l;
    private final emyl m;
    private final emyl n;
    private static final Object i = new Object();
    public static final emyl b = emys.a(new emyl() { // from class: ecve
        @Override // defpackage.emyl
        public final Object get() {
            Context context = ecvo.a;
            return errs.b(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: ecvi
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Context context2 = ecvo.a;
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            }));
        }
    });

    /* compiled from: PG */
    public interface a {
        emxc eK();
    }

    public ecvo(Context context, emyl emylVar, emyl emylVar2, final emyl emylVar3, emyl emylVar4, emyl emylVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        emylVar.getClass();
        emylVar2.getClass();
        emylVar3.getClass();
        emylVar4.getClass();
        emylVar5.getClass();
        emyl a2 = emys.a(emylVar);
        emyl a3 = emys.a(emylVar2);
        emyl a4 = emys.a(new emyl() { // from class: ecvj
            @Override // defpackage.emyl
            public final Object get() {
                Context context2 = ecvo.a;
                return (edav) ((emxc) emyl.this.get()).f();
            }
        });
        emyl a5 = emys.a(emylVar4);
        emyl a6 = emys.a(emylVar5);
        this.d = applicationContext;
        this.l = a2;
        this.m = a3;
        this.e = a4;
        this.n = a5;
        this.f = new edch(applicationContext, a2, a5, a3);
        this.g = a6;
        this.h = new edai(a4, a3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ecvo a(Context context) {
        boolean z;
        ecvo ecvoVar = j;
        if (ecvoVar != null) {
            return ecvoVar;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
        } catch (IllegalStateException unused) {
            z = false;
        }
        try {
            return (ecvo) ((emxn) ((a) ekhw.a(applicationContext, a.class)).eK()).a;
        } catch (IllegalStateException unused2) {
            z = true;
            synchronized (i) {
                if (j != null) {
                    return j;
                }
                emxc emxcVar = emux.a;
                boolean z2 = applicationContext instanceof a;
                if (z2) {
                    emxcVar = ((a) applicationContext).eK();
                }
                ecvo ecvoVar2 = (ecvo) emxcVar.d(new emyl() { // from class: ecvf
                    @Override // defpackage.emyl
                    public final Object get() {
                        Context context2 = ecvo.a;
                        ecvn ecvnVar = new ecvn();
                        ecvnVar.a = applicationContext;
                        return ecvnVar.a();
                    }
                });
                j = ecvoVar2;
                if (!z && !z2) {
                    ecwm.b(Level.CONFIG, ecvoVar2.e(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return ecvoVar2;
            }
        }
    }

    public static emyl d(final Context context) {
        return emys.a(new emyl() { // from class: ecvg
            @Override // defpackage.emyl
            public final Object get() {
                Context context2 = ecvo.a;
                dfqt dfqtVar = dhkk.a;
                return new ecxh(new dhlf(context));
            }
        });
    }

    public static void f(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                g();
                ecwm.b(Level.WARNING, (Executor) b.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void g() {
        ecvq.a();
        if (a == null && ecvq.a == null) {
            ecvq.a = new ecvp();
        }
    }

    public final ecxc b() {
        return (ecxc) this.m.get();
    }

    public final efbm c() {
        return (efbm) this.n.get();
    }

    public final errm e() {
        return (errm) this.l.get();
    }
}
