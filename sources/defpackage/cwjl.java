package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjl extends cpdo {
    public static final cskc a = cskc.g("Bugle", "BugleStartup");
    public final csjk b;
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final errl g;

    public cwjl(Context context, ffbr ffbrVar, csjk csjkVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.c = context;
        this.d = ffbrVar;
        this.b = csjkVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("PhoneAsyncPermissionsStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        try {
            cskc cskcVar = a;
            cskcVar.p("Registering SIM change receiver...");
            ekzz f = eleg.f("PhoneAsyncPermissionsStartupTask#registerSimChangeReceiverAndUpdateAppConfig");
            try {
                lpf.a(this.c).b(new cnhd(), dkpw.s());
                if (((ctvs) this.e.b()).e()) {
                    cskcVar.p("Updating app config...");
                    ((cnew) this.f.b()).a();
                }
                cskcVar.p("Done with SIM change receiver & app config.");
                f.close();
            } finally {
            }
        } catch (RuntimeException e) {
            a.s("Failed to register SIM change receiver.", e);
        }
        a.p("Handling shared prefs upgrade & Load MMS Configuration...");
        final akve akveVar = (akve) this.d.b();
        return elfo.f(new Runnable() { // from class: akvc
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f2 = eleg.f("SharedAsyncPermissionsStartupTask#initializeDataModelMmsLibSimInfoProviderAndCsLibFlags");
                final akve akveVar2 = akve.this;
                try {
                    if (((ctvs) akveVar2.d.b()).e()) {
                        ((carb) akveVar2.i.b()).c();
                        akveVar2.b.registerReceiver((BroadcastReceiver) akveVar2.k.b(), new IntentFilter("android.telephony.action.CARRIER_CONFIG_CHANGED"), 2);
                    }
                    ekzz f3 = eleg.f("SharedAsyncPermissionsStartupTask#initializeSimInfoProviderAndCsLibFlags");
                    try {
                        ((dkpm) akveVar2.h.b()).i();
                        dizc.m();
                        ((coqq) akveVar2.j.b()).a();
                        f3.close();
                        final int d = ((ctyx) akveVar2.c.b()).d("shared_preferences_version", -1);
                        int parseInt = Integer.parseInt(akveVar2.b.getString(R.string.pref_version));
                        if (parseInt > d) {
                            ensk h = akve.a.h();
                            h.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 123, "SharedAsyncPermissionsStartupTask.java")).u("Upgrading shared prefs from %d to %d", d, parseInt);
                            try {
                                ((ctyx) akveVar2.c.b()).c(d);
                                ((ctwb) akveVar2.e.b()).o(new ctwa() { // from class: akvd
                                    @Override // defpackage.ctwa
                                    public final boolean a(int i) {
                                        ((ctyw) akve.this.f.b()).a(i).c(d);
                                        return true;
                                    }
                                });
                                ((ctyx) akveVar2.c.b()).j("shared_preferences_version", parseInt);
                            } catch (Exception e2) {
                                ensk i = akve.a.i();
                                i.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", (char) 143, "SharedAsyncPermissionsStartupTask.java")).q("Failed to upgrade shared prefs");
                            }
                        } else if (parseInt < d) {
                            ensk i2 = akve.a.i();
                            i2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 148, "SharedAsyncPermissionsStartupTask.java")).u("Shared prefs downgrade requested and ignored. oldVersion = %d, newVersion = %d", d, parseInt);
                        }
                        f2.close();
                    } finally {
                    }
                } finally {
                }
            }
        }, akveVar.g).h(new emwl() { // from class: cwjk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cwjl.a.p("Initializing RCS availability...");
                ekzz f2 = eleg.f("PhoneAsyncPermissionsStartupTask#initializeRcsAvailability");
                try {
                    ((ckge) cwjl.this.b.a()).j();
                    cwjl.a.p("Done with RCS availability.");
                    f2.close();
                    cwjl.a.p("Done initializing with enabled individual init failures.");
                    return 0;
                } catch (Throwable th) {
                    try {
                        f2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.g);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
