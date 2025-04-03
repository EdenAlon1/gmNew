package defpackage;

import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbdc implements Runnable {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable");
    public static final cfup b = cfvl.i(cfvl.b, "action_exceptions_crash", false);
    protected final bbdd c;
    protected final bbcj d;
    protected final String e;
    public final Action f;
    protected final long g;
    protected final int h;
    protected final errl i;
    protected final ffbr j;
    protected final ffbr k;
    protected final ffbr l;
    public akzw m;
    private final Runnable n = eldl.l(new bbdb(this));

    public bbdc(bbcj bbcjVar, Action action, String str, long j, bbdd bbddVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = bbddVar;
        this.e = str;
        this.d = bbcjVar;
        this.f = action;
        this.g = j;
        this.h = ((ActionExecutorImpl) bbddVar).p.getAndIncrement();
        this.i = errlVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
    }

    public final void a(elfl elflVar) {
        elflVar.h(new emwl() { // from class: bbcz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                if (wakeLock == null) {
                    return null;
                }
                try {
                    wakeLock.release();
                    return null;
                } catch (RuntimeException e) {
                    bbdc bbdcVar = bbdc.this;
                    ensk h = bbdc.a.h();
                    h.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) ((enrr) h).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "releaseWakeLock", 175, "ActionRunnable.java")).t("%s took so long that the OS released the wakelock before it finished", bbdcVar.f);
                    return null;
                }
            }
        }, this.i).k(axnw.b(), this.i);
    }

    public abstract void b();

    public final void c(akzw akzwVar) {
        if (this.m != null) {
            throw new IllegalStateException("An ActionRunnable can only be queued once");
        }
        this.m = akzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.run();
    }
}
