package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.EnumSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceth implements cetc {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    private final ejjz c;
    private final errl d;

    public ceth(ejjz ejjzVar, ffbr ffbrVar, errl errlVar) {
        this.c = ejjzVar;
        this.b = ffbrVar;
        this.d = errlVar;
    }

    @Override // defpackage.cetc
    public final void a(elfl elflVar) {
        this.c.d(elflVar, eleg.c());
    }

    @Override // defpackage.cetc
    public final void b(elfl elflVar) {
        this.c.f(elflVar);
    }

    @Override // defpackage.cetc
    public final void c(elfl elflVar) {
        this.c.g(elflVar);
    }

    @Override // defpackage.cetc
    public final int d(EnumSet enumSet, elfl elflVar, Supplier supplier) {
        Object obj;
        if (enumSet.contains(cetb.WAKELOCK)) {
            try {
                c(elflVar);
            } catch (Throwable th) {
                ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", (char) 148, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attach wakelock request failed.");
            }
        }
        if (enumSet.contains(cetb.BACKGROUND_SERVICE)) {
            try {
                a(elflVar);
                return 2;
            } catch (Throwable th2) {
                ((ensz) ((ensz) a.n().g(th2)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 157, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching background service request failed.");
            }
        }
        if (!enumSet.contains(cetb.FOREGROUND_SERVICE)) {
            return 1;
        }
        try {
            obj = supplier.get();
            Notification notification = (Notification) obj;
            if (notification == null) {
                return 1;
            }
            e(elflVar, notification, 11);
            return 3;
        } catch (Throwable th3) {
            ((ensz) ((ensz) a.n().g(th3)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attach", 170, "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper attaching foreground service request failed.");
            return 1;
        }
    }

    @Override // defpackage.cetc
    public final void e(elfl elflVar, Notification notification, final int i) {
        this.c.h(elflVar, notification);
        axnw.h(elflVar.h(new emwl() { // from class: cetf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = ceth.a;
                return null;
            }
        }, erpp.a).e(Exception.class, new emwl() { // from class: cetg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                int i2 = i;
                ceth cethVar = ceth.this;
                ((ensz) ((ensz) ((ensz) ceth.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'Z', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((akzt) cethVar.b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", ceta.a(i2));
                return null;
            }
        }, this.d));
    }

    @Override // defpackage.cetc
    public final void f(String str, int i) {
        ((akzt) this.b.b()).e(str, i - 1);
    }

    @Override // defpackage.cetc
    public final void g(elfl elflVar, Notification notification, Class cls, int i) {
        ejjz ejjzVar = this.c;
        boolean z = false;
        try {
            ejjzVar.c.getPackageManager().getServiceInfo(new ComponentName(ejjzVar.c, (Class<?>) cls), 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        emxf.f(z, "Unable to find serviceClass \"%s\".", cls.getName());
        ejjzVar.d.a(cls).f(elflVar, notification, i);
        axnw.h(elflVar.h(new emwl() { // from class: cetd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = ceth.a;
                return null;
            }
        }, erpp.a).e(Exception.class, new emwl() { // from class: cete
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ceth cethVar = ceth.this;
                ((ensz) ((ensz) ((ensz) ceth.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/AndroidFuturesWrapperImpl", "attachForegroundService", 'x', "AndroidFuturesWrapperImpl.java")).q("AndroidFuturesWrapper unable to attach foreground service");
                ((akzt) cethVar.b.b()).e("Bugle.AttachingAndroidFutureWrapper.Failure.Counts", ceta.a(13));
                return null;
            }
        }, this.d));
    }
}
