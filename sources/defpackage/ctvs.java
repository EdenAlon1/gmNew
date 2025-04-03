package defpackage;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvs {
    public static final entd a = entd.c("Bugle");
    public final Context b;
    public final emyl c;
    public final emyl d;
    public final emyl e;
    private emyl f;
    private emyl g;

    public ctvs(final Context context) {
        this.b = context;
        context.getClass();
        this.c = emys.a(new emyl() { // from class: ctvm
            @Override // defpackage.emyl
            public final Object get() {
                return context.getPackageManager();
            }
        });
        this.d = emys.a(new emyl() { // from class: ctvn
            @Override // defpackage.emyl
            public final Object get() {
                ctvs ctvsVar = ctvs.this;
                TelephonyManager telephonyManager = (TelephonyManager) ctvsVar.b.getSystemService("phone");
                if (telephonyManager == null) {
                    return null;
                }
                boolean hasSystemFeature = ((PackageManager) ctvsVar.c.get()).hasSystemFeature("android.hardware.type.watch");
                boolean hasSystemFeature2 = ((PackageManager) ctvsVar.c.get()).hasSystemFeature("android.hardware.telephony");
                if (hasSystemFeature) {
                    if (!hasSystemFeature2) {
                        ensz enszVar = (ensz) ctvs.a.h();
                        enszVar.Y(csux.O, "PhoneConfiguration");
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "getTelephonyManager", 99, "PhoneConfiguration.java")).q("Watch has non-null TelephonyManager but no FEATURE_TELEPHONY; overriding TelephonyManager to be null");
                        return null;
                    }
                } else if (!hasSystemFeature2) {
                    ensz enszVar2 = (ensz) ctvs.a.j();
                    enszVar2.Y(csux.O, "PhoneConfiguration");
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "getTelephonyManager", 107, "PhoneConfiguration.java")).q("Phone has non-null TelephonyManager but no FEATURE_TELEPHONY");
                    return telephonyManager;
                }
                return telephonyManager;
            }
        });
        this.e = emys.a(new emyl() { // from class: ctvo
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = ctvs.a;
                if (ctid.c) {
                    return abk$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(abk$$ExternalSyntheticApiModelOutline0.m50m()));
                }
                return null;
            }
        });
        this.f = emys.b(new emyl() { // from class: ctvp
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = ctvs.a;
                return Telephony.Sms.getDefaultSmsPackage(context);
            }
        }, Duration.ofMinutes(1L));
        this.g = h();
    }

    private final synchronized emyl g() {
        return emys.b(new emyl() { // from class: ctvq
            @Override // defpackage.emyl
            public final Object get() {
                return ctvs.this.b();
            }
        }, Duration.ofMinutes(1L));
    }

    private final emyl h() {
        return emys.b(new emyl() { // from class: ctvr
            @Override // defpackage.emyl
            public final Object get() {
                boolean isRoleHeld;
                RoleManager m = abk$$ExternalSyntheticApiModelOutline0.m(ctvs.this.e.get());
                boolean z = false;
                if (m != null) {
                    isRoleHeld = m.isRoleHeld("android.app.role.SMS");
                    if (isRoleHeld) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, Duration.ofMinutes(1L));
    }

    public final synchronized String a() {
        return (String) this.f.get();
    }

    public final synchronized String b() {
        return Telephony.Sms.getDefaultSmsPackage(this.b);
    }

    public final synchronized void c() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "updateDefaultSmsApp", 173, "PhoneConfiguration.java")).q("Updating default SMS app");
        this.f = g();
        this.g = h();
    }

    public final boolean d() {
        ekzz f = eleg.f("PhoneConfiguration#isDefaultSmsApp");
        try {
            boolean booleanValue = ctid.c ? ((Boolean) this.g.get()).booleanValue() : this.b.getPackageName().equals(a());
            f.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.d.get();
        return telephonyManager != null && telephonyManager.isSmsCapable();
    }

    public final boolean f() {
        return e() && d();
    }
}
