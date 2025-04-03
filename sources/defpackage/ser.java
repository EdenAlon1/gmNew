package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ser extends arbh implements eerf {
    public ffbr a;
    public ffbr b;
    private crjx v;

    /* compiled from: PG */
    public interface a {
        crjx a();

        elbx b();
    }

    @Override // defpackage.arbh, defpackage.ekka, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (!csix.n()) {
                if (csjc.c()) {
                    ensk g = arbh.c.g();
                    g.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", 195, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: eng build");
                    if (!ActivityManager.isRunningInTestHarness()) {
                        csix.b = true;
                    }
                } else if (ActivityManager.isUserAMonkey()) {
                    ensk g2 = arbh.c.g();
                    g2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "setupUncaughtExceptionHandler", BasePaymentResult.ERROR_REQUEST_FAILED, "BugleApplicationBase.java")).q("BugleApplicationBase: UncaughtException unset: monkey");
                } else {
                    uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(this);
                }
            }
            this.e = uncaughtExceptionHandler;
        } catch (RuntimeException e) {
            csjb e2 = cskc.g("BugleDataModel", "BuglePhoneApplicationBase").e();
            e2.I("Exception installing exception handler. Crashes will not report");
            e2.s(e);
        }
        if (ctid.g(this)) {
            a aVar = (a) ekhw.a(this, a.class);
            ekzm b = aVar.b().b("BuglePhoneApplicationBase#attatchBaseContext");
            try {
                ekyf.r();
                crjx a2 = aVar.a();
                this.v = a2;
                a2.d();
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.eerf
    public final eere b() {
        return (eere) this.a.b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext != null ? applicationContext : this;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (ctid.g(this)) {
            ((cxqh) this.b.b()).r();
        }
    }

    @Override // defpackage.arbh, defpackage.ekka, android.app.Application
    public void onCreate() {
        crjx crjxVar;
        super.onCreate();
        if (!ctid.g(this) || (crjxVar = this.v) == null) {
            return;
        }
        crjxVar.e();
    }
}
