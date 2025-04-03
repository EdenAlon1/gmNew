package defpackage;

import android.app.Notification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyo {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper");
    public static final cfva b = cfvl.f(cfvl.b, "background_service_duration_seconds", 65);
    public final akzt c;
    private final ffbr d;
    private final errl e;
    private final ffbr f;
    private final asks g;
    private final errm h;
    private final ffbr i;
    private final csiy j;

    public cfyo(ffbr ffbrVar, csiy csiyVar, ffbr ffbrVar2, akzt akztVar, errl errlVar, ffbr ffbrVar3, asks asksVar, errm errmVar) {
        this.d = ffbrVar;
        this.j = csiyVar;
        this.i = ffbrVar2;
        this.c = akztVar;
        this.e = errlVar;
        this.f = ffbrVar3;
        this.g = asksVar;
        this.h = errmVar;
    }

    public static boolean c(int i, int i2) {
        return i == 1 || i2 == 1;
    }

    private final void d(boolean z, boolean z2, boolean z3) {
        if (!z && !z2) {
            if (!z3) {
                return;
            } else {
                z3 = true;
            }
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 164, "TickleHandlerHelper.java")).q("Prewarm service starting");
        ekzz f = eleg.f("TickleHandlerHelper::backgroundService");
        try {
            elfl g = elfl.g(this.h.schedule(new Runnable() { // from class: cfyl
                @Override // java.lang.Runnable
                public final void run() {
                    ensk h2 = cfyo.a.h();
                    h2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 170, "TickleHandlerHelper.java")).q("Prewarm service can finish now");
                }
            }, ((Long) b.e()).longValue(), TimeUnit.SECONDS));
            f.b(g);
            if (z) {
                try {
                    ((cetc) this.f.b()).b(g);
                } catch (Throwable th) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", (char) 178, "TickleHandlerHelper.java")).q("Wakelock or service can't be attached.");
                }
                f.close();
                return;
            }
            if (z2) {
                try {
                    ((cetc) this.f.b()).a(g);
                } catch (Throwable th2) {
                    ensk j2 = a.j();
                    j2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j2).g(th2)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", (char) 186, "TickleHandlerHelper.java")).q("Unable to attachService.");
                }
            }
            if (z3) {
                try {
                    ((cetc) this.f.b()).c(g);
                } catch (Throwable th3) {
                    ensk j3 = a.j();
                    j3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j3).g(th3)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", (char) 193, "TickleHandlerHelper.java")).q("Unable to attachWakelock.");
                }
            }
            f.close();
            return;
        } finally {
        }
    }

    public final elfl a(emwl emwlVar, fcek fcekVar, final String str, final String str2) {
        return ((elfl) emwlVar.apply(fcekVar)).e(Throwable.class, new emwl() { // from class: cfym
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk i = cfyo.a.i();
                i.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) ((enrr) i).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "invokeFunction", 211, "TickleHandlerHelper.java")).t("TickleHandlerHelper: %s", str);
                cfyo.this.c.c(str2);
                return null;
            }
        }, this.e);
    }

    public final void b(String str, final fcek fcekVar, final emwl emwlVar, emwl emwlVar2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = this.j.a;
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "handleNonDittoTickle", 100, "TickleHandlerHelper.java")).K("Handling non-Ditto firebase tickle. Type: [%s], ID: [%s], isHighPriority: [%b], isForeground: [%b]", str2, str, Boolean.valueOf(z), Boolean.valueOf(z6));
        if (z6) {
            a(emwlVar, fcekVar, "Failed to bind in response to tickle", "Bugle.Fcm.Phone.Bind.Failure.Count");
            if (((ersq) ((arnm) this.g).a.b()).a("bugle.enable_service_wakelock_after_message_received")) {
                d(z3, z4, z5);
                return;
            }
            return;
        }
        elfl a2 = a(emwlVar2, fcekVar, "Failed to pull messages in response to tickle", "Bugle.Fcm.Phone.Pull.Failure.Count");
        if (z2) {
            a2.i(new eroh() { // from class: cfyn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return cfyo.this.a(emwlVar, fcekVar, "Failed to bind in response to tickle after pulling", "Bugle.Fcm.Phone.BindAfterPull.Failure.Count");
                }
            }, erpp.a);
            d(z3, z4, z5);
        }
        Notification b2 = z ? ((cins) this.i.b()).b() : null;
        if (b2 == null) {
            ((ejjz) this.d.b()).g(a2);
            return;
        }
        cetc cetcVar = (cetc) this.f.b();
        ((ejjz) this.d.b()).g(a2);
        cetcVar.e(a2, b2, 12);
    }
}
