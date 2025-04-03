package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adat implements adaq {
    public static final /* synthetic */ int f = 0;
    volatile Boolean e;
    private final Context i;
    private final ffbr j;
    private final Optional k;
    private final akmj l;
    private static final enru g = enru.c("com/google/android/apps/messaging/externalapi/enableandromedamde/EnableAndromedaMdeImpl");
    static final cfup b = cfvl.n(cfvl.b, "enable_device_always_support_andromeda", false);
    static final emyl c = cfvl.w("support_non_prod_packages_for_andromeda");
    private static final Object h = new Object();
    static final engw d = engw.A("com.samsung.android.mdecservice", "com.samsung.android.geargplugin", "com.samsung.android.gearnplugin", "com.samsung.android.gearoplugin", "com.samsung.android.gearpplugin", "com.samsung.android.gearrplugin", "com.samsung.android.gear1plugin", "com.samsung.android.gear2plugin", "com.samsung.android.gearfit2plugin", "com.samsung.android.bixby.agent");

    public adat(Context context, final ffbr ffbrVar, Optional optional, akmj akmjVar) {
        this.i = context;
        this.j = new ffbr() { // from class: adar
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                int i = adat.f;
                comy comyVar = (comy) ffbr.this.b();
                comu c2 = comv.c();
                c2.d(comb.CMC_USER_CONSENT_SETTINGS);
                c2.f(akoh.a);
                return comyVar.a(c2.a());
            }
        };
        this.k = optional;
        this.l = akmjVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [comc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [comc, java.lang.Object] */
    @Override // defpackage.adaq
    @Deprecated
    public final boolean a() {
        csix.h();
        if (!((Boolean) a.e()).booleanValue() || !c()) {
            return false;
        }
        try {
            return ((akoh) this.j.b().l()).c;
        } catch (eygu e) {
            this.j.b().n();
            throw new IllegalStateException("Unexpected error while fetching consent setting data", e);
        }
    }

    @Override // defpackage.adaq
    public final boolean b() {
        return ((Boolean) a.e()).booleanValue() && c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean c() {
        ApplicationInfo applicationInfo;
        if (this.e == null) {
            synchronized (h) {
                if (this.e != null) {
                    return this.e.booleanValue();
                }
                boolean z = true;
                if (((Boolean) b.e()).booleanValue()) {
                    ensk h2 = g.h();
                    h2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/externalapi/enableandromedamde/EnableAndromedaMdeImpl", "initDeviceSupportsAndromeda", 204, "EnableAndromedaMdeImpl.java")).q("Assuming device always supports Andromeda");
                } else {
                    if (this.l.a()) {
                        int i = engw.d;
                        final engr engrVar = new engr();
                        engrVar.j(d);
                        if (((Boolean) ((cfup) c.get()).e()).booleanValue()) {
                            this.k.ifPresent(new Consumer() { // from class: adas
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    int i2 = adat.f;
                                    engr.this.j(((adau) obj).a());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                        engw g2 = engrVar.g();
                        int i2 = ((enou) g2).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            try {
                                applicationInfo = this.i.getPackageManager().getApplicationInfo((String) g2.get(i3), 128);
                            } catch (PackageManager.NameNotFoundException unused) {
                                applicationInfo = null;
                            }
                            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.getBoolean("com.samsung.android.mdecservice.android_message_support", false)) {
                                break;
                            }
                        }
                        ensk j = g.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/externalapi/enableandromedamde/EnableAndromedaMdeImpl", "initDeviceSupportsAndromeda", 230, "EnableAndromedaMdeImpl.java")).q("Can't find any CMC/MP packages");
                    } else {
                        ensk h3 = g.h();
                        h3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/externalapi/enableandromedamde/EnableAndromedaMdeImpl", "initDeviceSupportsAndromeda", 209, "EnableAndromedaMdeImpl.java")).q("Device does not support Andromeda");
                    }
                    z = false;
                }
                this.e = Boolean.valueOf(z);
            }
        }
        return this.e.booleanValue();
    }
}
