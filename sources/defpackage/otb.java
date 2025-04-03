package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class otb {
    public volatile oxi a;
    public ffsk b;
    public ffhd c;
    public Executor d;
    public Executor e;
    public osw f;
    public osg g;
    public boolean i;
    public final out h = new out();
    private final ThreadLocal l = new ThreadLocal();
    public final Map j = new LinkedHashMap();
    public boolean k = true;

    protected abstract osg a();

    public final osg b() {
        osg osgVar = this.g;
        if (osgVar != null) {
            return osgVar;
        }
        ffkj.c("internalTracker");
        return null;
    }

    protected otf c() {
        throw new ffce((byte[]) null);
    }

    @ffbs
    protected oxn d(orp orpVar) {
        throw new ffce((byte[]) null);
    }

    public final oxn e() {
        osw oswVar = this.f;
        if (oswVar == null) {
            ffkj.c("connectionManager");
            oswVar = null;
        }
        oxn c = oswVar.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object f(Callable callable) {
        n();
        try {
            Object call = callable.call();
            q();
            return call;
        } finally {
            o();
        }
    }

    protected Map g() {
        return ffem.a;
    }

    @ffbs
    public Set h() {
        return ffen.a;
    }

    public final ffhd i() {
        ffsk ffskVar = this.b;
        if (ffskVar == null) {
            ffkj.c("coroutineScope");
            ffskVar = null;
        }
        return ((fggf) ffskVar).a;
    }

    public final ffhd j() {
        ffhd ffhdVar = this.c;
        if (ffhdVar != null) {
            return ffhdVar;
        }
        ffkj.c("transactionContext");
        return null;
    }

    public final ffsk k() {
        ffsk ffskVar = this.b;
        if (ffskVar != null) {
            return ffskVar;
        }
        ffkj.c("coroutineScope");
        return null;
    }

    public final void l() {
        if (!this.i && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void m() {
        if (r() && !s() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @ffbs
    public final void n() {
        l();
        l();
        oxi b = e().b();
        if (!b.i()) {
            ffqz.a(ffhe.a, new osf(b(), null));
        }
        if (((oxv) b).d.isWriteAheadLoggingEnabled()) {
            b.e();
        } else {
            b.d();
        }
    }

    public final void o() {
        e().b().f();
        if (s()) {
            return;
        }
        osg b = b();
        b.b.g(b.e, b.f);
    }

    public final void p(Runnable runnable) {
        n();
        try {
            runnable.run();
            q();
        } finally {
            o();
        }
    }

    @ffbs
    public final void q() {
        e().b().h();
    }

    public final boolean r() {
        osw oswVar = this.f;
        if (oswVar == null) {
            ffkj.c("connectionManager");
            oswVar = null;
        }
        return oswVar.c() != null;
    }

    public final boolean s() {
        return t() && e().b().i();
    }

    public final boolean t() {
        osw oswVar = this.f;
        if (oswVar == null) {
            ffkj.c("connectionManager");
            oswVar = null;
        }
        oxi oxiVar = oswVar.d;
        if (oxiVar != null) {
            return oxiVar.j();
        }
        return false;
    }

    public final void u(ouz ouzVar) {
        osg b = b();
        our ourVar = b.b;
        ovi a = ouzVar.a("PRAGMA query_only");
        try {
            a.j();
            boolean l = a.l();
            ffit.a(a, null);
            if (!l) {
                oxe.a(ouzVar, "PRAGMA temp_store = MEMORY");
                oxe.a(ouzVar, "PRAGMA recursive_triggers = 1");
                oxe.a(ouzVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ourVar.b) {
                    oxe.a(ouzVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    oxe.a(ouzVar, ffpc.q("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                osl oslVar = ourVar.c;
                ReentrantLock reentrantLock = oslVar.a;
                reentrantLock.lock();
                try {
                    oslVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (b.i) {
                osi osiVar = b.h;
            }
        } finally {
        }
    }

    @ffbs
    public List v() {
        return ffel.a;
    }

    public final Object w(ffjm ffjmVar, ffgu ffguVar) {
        osw oswVar = this.f;
        if (oswVar == null) {
            ffkj.c("connectionManager");
            oswVar = null;
        }
        return ffjmVar.a(new ove(new ouz(oswVar.e.a.a.b())), ffguVar);
    }
}
