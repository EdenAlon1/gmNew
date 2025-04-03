package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdyn {
    static final Logger c = Logger.getLogger(fdyn.class.getName());
    public static final fdyn d = new fdyn();
    final fdyg e;
    public final fecn f;
    public final int g;

    private fdyn() {
        this.e = null;
        this.f = null;
        this.g = 0;
        e(0);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static fdyn k() {
        fdyn a = fdyl.a.a();
        return a == null ? d : a;
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public fdyn a() {
        fdyn b = fdyl.a.b(this);
        return b == null ? d : b;
    }

    public fdys b() {
        fdyg fdygVar = this.e;
        if (fdygVar == null) {
            return null;
        }
        return fdygVar.a;
    }

    public Throwable c() {
        fdyg fdygVar = this.e;
        if (fdygVar == null) {
            return null;
        }
        return fdygVar.c();
    }

    public void d(fdyh fdyhVar, Executor executor) {
        m(executor, "executor");
        fdyg fdygVar = this.e;
        if (fdygVar == null) {
            return;
        }
        fdygVar.e(new fdyj(executor, fdyhVar, this));
    }

    public void f(fdyn fdynVar) {
        m(fdynVar, "toAttach");
        fdyl.a.c(this, fdynVar);
    }

    public void g(fdyh fdyhVar) {
        fdyg fdygVar = this.e;
        if (fdygVar == null) {
            return;
        }
        fdygVar.h(fdyhVar, this);
    }

    public boolean i() {
        fdyg fdygVar = this.e;
        if (fdygVar == null) {
            return false;
        }
        return fdygVar.i();
    }

    public final fdyn l(fdyk fdykVar, Object obj) {
        fecn fecnVar = this.f;
        return new fdyn(this, fecnVar == null ? new fecm(fdykVar, obj) : fecnVar.b(fdykVar, obj, fdykVar.hashCode(), 0));
    }

    public fdyn(fdyn fdynVar, fecn fecnVar) {
        this.e = fdynVar instanceof fdyg ? (fdyg) fdynVar : fdynVar.e;
        this.f = fecnVar;
        int i = fdynVar.g + 1;
        this.g = i;
        e(i);
    }

    public fdyn(fecn fecnVar, int i) {
        this.e = null;
        this.f = fecnVar;
        this.g = i;
        e(i);
    }
}
