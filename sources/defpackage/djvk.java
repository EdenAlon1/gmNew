package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.ServerMessage;
import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvk {
    private static final enru f = enru.c("com/google/android/ims/provisioning/engine/ProvisioningEngineConfigUtils");
    public final dkrx a;
    public final dkcp b;
    public final dkpp c;
    public final ffbr d;
    public final ffbr e;
    private final Context g;
    private final dkdv h;
    private final diju i;
    private final ctvb j;
    private final dkpm k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final dkpj p;

    public djvk(Context context, diju dijuVar, dkrx dkrxVar, dkdv dkdvVar, ctvb ctvbVar, dkcp dkcpVar, dkpp dkppVar, dkpj dkpjVar, dkpm dkpmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.g = context;
        this.i = dijuVar;
        this.a = dkrxVar;
        this.h = dkdvVar;
        this.j = ctvbVar;
        this.b = dkcpVar;
        this.c = dkppVar;
        this.p = dkpjVar;
        this.k = dkpmVar;
        this.d = ffbrVar;
        this.l = ffbrVar2;
        this.e = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
    }

    static final boolean g(djtp djtpVar) {
        WelcomeMessage t = djtpVar.t();
        return (t == null || !t.mHasAcceptButton || t.mHasRejectButton) ? false : true;
    }

    public static int h(djtp djtpVar) {
        if (djtpVar == null) {
            return 3;
        }
        if (djtpVar.R()) {
            return 2;
        }
        if (djtpVar.S()) {
            return 5;
        }
        if (djtpVar.U()) {
            return 6;
        }
        return djtpVar.T() ? 4 : 1;
    }

    private final djtp i(String str) {
        return this.b.f(str);
    }

    private final void j(djtp djtpVar, String str) {
        this.b.t(str, djtpVar);
        if (!((dixk) this.o.b()).a()) {
            diju dijuVar = this.i;
            Context context = this.g;
            int e = djtpVar.e();
            long g = djtpVar.g();
            int d = djtpVar.d();
            dkty.o("Logging Configuration Update: Version: %d Validity: %d Remaining Validity : %d", Integer.valueOf(e), Integer.valueOf(d), Long.valueOf(g));
            eysv eysvVar = (eysv) eysy.a.createBuilder();
            eysvVar.copyOnWrite();
            eysy eysyVar = (eysy) eysvVar.instance;
            eysyVar.b = 2 | eysyVar.b;
            eysyVar.d = e;
            eysvVar.copyOnWrite();
            eysy eysyVar2 = (eysy) eysvVar.instance;
            eysyVar2.b = 4 | eysyVar2.b;
            eysyVar2.e = g;
            eysvVar.copyOnWrite();
            eysy eysyVar3 = (eysy) eysvVar.instance;
            eysyVar3.b |= 16;
            eysyVar3.g = d;
            dijuVar.G(context, (eysy) eysvVar.build());
            return;
        }
        diju dijuVar2 = this.i;
        Context context2 = this.g;
        int e2 = djtpVar.e();
        long g2 = djtpVar.g();
        int d2 = djtpVar.d();
        int a = djtpVar.a();
        dkty.p(diju.b, "Logging Configuration Update: Version: %d Validity: %d Remaining Validity : %d Config State: %d", Integer.valueOf(e2), Integer.valueOf(d2), Long.valueOf(g2), Integer.valueOf(a));
        eysv eysvVar2 = (eysv) eysy.a.createBuilder();
        eysvVar2.copyOnWrite();
        eysy eysyVar4 = (eysy) eysvVar2.instance;
        eysyVar4.b |= 2;
        eysyVar4.d = e2;
        eysvVar2.copyOnWrite();
        eysy eysyVar5 = (eysy) eysvVar2.instance;
        eysyVar5.b |= 4;
        eysyVar5.e = g2;
        eysvVar2.copyOnWrite();
        eysy eysyVar6 = (eysy) eysvVar2.instance;
        eysyVar6.b |= 16;
        eysyVar6.g = d2;
        int a2 = eysx.a(a);
        if (a2 == 0) {
            throw null;
        }
        eysvVar2.copyOnWrite();
        eysy eysyVar7 = (eysy) eysvVar2.instance;
        eysyVar7.f = a2 - 1;
        eysyVar7.b |= 8;
        dijuVar2.G(context2, (eysy) eysvVar2.build());
    }

    public final djtp a(djtp djtpVar, ezez ezezVar, String str, dikl diklVar, String str2) {
        Optional empty;
        d(djtpVar, i(str2), str2);
        djtp i = i(str2);
        if (i != null) {
            diklVar.o(this.g, ezezVar, h(i), i.d(), str, new djro(str2));
            if (djam.d()) {
                String str3 = ((cosz) ((cort) this.l.b()).j(new djro(str2)).orElse(cosz.a)).n;
                if (str3.isEmpty()) {
                    ensk j = f.j();
                    j.Y(ente.a, "BugleRcsProvisioning");
                    enrr enrrVar = (enrr) j;
                    enrrVar.aa(ensy.MEDIUM);
                    ((enrr) enrrVar.h("com/google/android/ims/provisioning/engine/ProvisioningEngineConfigUtils", "persistConfigFileInternal", 238, "ProvisioningEngineConfigUtils.java")).q("No ICCID found for simId when setting ICCID binding for config.");
                    return i(str2);
                }
                if (str3.isEmpty()) {
                    dkty.g("not able to bind iccid list because there is no iccid initialized", new Object[0]);
                } else {
                    int i2 = engw.d;
                    List<String> list = enou.a;
                    String w = i.w();
                    if (!TextUtils.isEmpty(w)) {
                        this.h.o(41);
                        list = Arrays.asList(w.split(","));
                    }
                    try {
                        empty = Optional.of(this.p.a.b(str3));
                    } catch (dksb e) {
                        dkty.s(e, "Error while retrieving rcs user identity from Bugle", new Object[0]);
                        empty = Optional.empty();
                    }
                    if (empty.isPresent()) {
                        String w2 = i.m().w();
                        if (!TextUtils.isEmpty(w2)) {
                            String k = dkut.k(w2, this.j);
                            if (!TextUtils.isEmpty(k)) {
                                this.h.o(42);
                                this.k.a.p((String) empty.get(), k);
                            }
                        }
                        for (String str4 : list) {
                            dkty.k("binding iccid %s to %s", dktx.SIM_ICCID.c(str4), dktx.SIM_ICCID.c(empty.get()));
                            this.p.a.j("rcs_user_id_".concat(String.valueOf(str4)), (String) empty.get(), "bugle");
                        }
                    }
                }
            }
        }
        this.h.f(this.g, ezezVar, diklVar, str, new djro(str2));
        return i(str2);
    }

    final void b(djtp djtpVar, String str) {
        dkty.c("Set supported network to 3g and wifi", new Object[0]);
        ImsConfiguration n = djtpVar.n();
        if (n == null) {
            dkty.g("Can't apply config, null ImsConfiguration - this is a bug!", new Object[0]);
            return;
        }
        djtpVar.o().mAnonymousChat = true;
        String str2 = n.mPublicIdentity;
        if (TextUtils.isEmpty(str2)) {
            dkty.k("Applied a config with an empty publicIdentity, msisdn and country data won't be available", new Object[0]);
            return;
        }
        String k = dkut.k(str2, this.j);
        dkty.c("ProvisioningEngineConfigUtils parsed msisdn:[%s] from publicIdentity:[%s] for simId:[%s]", dktx.PHONE_NUMBER.c(k), dktx.URI_SIP.c(str2), dktx.SIM_ID.c(str));
        ctvb ctvbVar = this.j;
        String str3 = null;
        if (k != null) {
            try {
                str3 = ctvbVar.z(new ctvf(ctvbVar.e(k, null).a()));
            } catch (esfg e) {
                csjb b = ctvb.a.b();
                b.I("getCountryForPhone: Not able to parse");
                b.k(k);
                b.s(e);
            }
        }
        this.a.o(str3);
        this.a.r(k);
        ((dkdw) this.d.b()).v(str, k);
    }

    @Deprecated
    final void c(String str) {
        djtp f2 = this.b.f(str);
        if (f2.a() == 2) {
            f2 = new Configuration();
        } else {
            f2.B();
            f2.D();
        }
        j(f2, str);
    }

    public final void d(djtp djtpVar, djtp djtpVar2, String str) {
        if (djtpVar == null) {
            dkty.c("Skipped processing null remote configuration", new Object[0]);
            return;
        }
        dkty.k("Configuration update received. Updating \nfrom [%s] \nto [%s]", djtpVar2.x(), djtpVar.x());
        boolean z = ((diwy) this.m.b()).a() && ((cguo) this.n.b()).c(str).I && (djtpVar2.Q() || g(djtpVar2));
        int c = djtpVar.c();
        if (c == 1) {
            djtpVar.G(false);
            djtpVar.E(System.currentTimeMillis() / 1000);
            j(djtpVar, str);
            if (djai.Y()) {
                djtpVar.F(djtpVar.e());
            }
            if (!djtpVar.S()) {
                b(djtpVar, str);
            }
            dkty.k("Provisioning refreshed with full configuration", new Object[0]);
            djtpVar2 = djtpVar;
        } else if (c == 2 || c == 3) {
            djtpVar2.K(djtpVar.d());
            djtpVar2.L(djtpVar.e());
            djtpVar2.H(djtpVar.q());
            djtpVar2.M(djtpVar.t());
            djtpVar2.G(false);
            if (Configuration.a.equals(djtpVar.k())) {
                dkty.q("Received configuration with no token or invalid token during refresh.", new Object[0]);
            } else if (!djtpVar2.k().equals(djtpVar.k())) {
                djtpVar2.I(djtpVar.k());
                dkty.k("Received configuration with a new token during refresh", new Object[0]);
            }
            djtpVar2.E(System.currentTimeMillis() / 1000);
            if (djai.Y()) {
                djtpVar2.F(djtpVar2.e());
            }
            j(djtpVar2, str);
            dkty.k("Provisioning refreshed with partial configuration.", new Object[0]);
        } else {
            dkty.k("Received carrier configuration in an unexpected format.", new Object[0]);
        }
        Optional of = Optional.of(str);
        ServerMessage q = djtpVar2.q();
        if (q != null && q.mHasAcceptButton && q.mHasRejectButton && e(djtpVar, djtpVar2)) {
            if (!djtpVar.m().C()) {
                of.isPresent();
                this.h.p(18, (String) of.get());
            }
        } else if (g(djtpVar2) && !z) {
            if (!djtpVar.m().C()) {
                of.isPresent();
                this.h.p(20, (String) of.get());
            }
            WelcomeMessage t = djtpVar2.t();
            diun diunVar = (diun) diuo.a.createBuilder();
            String str2 = t.mMessage;
            diunVar.copyOnWrite();
            diuo diuoVar = (diuo) diunVar.instance;
            str2.getClass();
            diuoVar.b = 1 | diuoVar.b;
            diuoVar.c = str2;
            String str3 = t.mTitle;
            diunVar.copyOnWrite();
            diuo diuoVar2 = (diuo) diunVar.instance;
            str3.getClass();
            diuoVar2.b = 2 | diuoVar2.b;
            diuoVar2.d = str3;
            boolean z2 = t.mHasAcceptButton;
            diunVar.copyOnWrite();
            diuo diuoVar3 = (diuo) diunVar.instance;
            diuoVar3.b |= 4;
            diuoVar3.e = z2;
            boolean z3 = t.hasSettingsButton;
            diunVar.copyOnWrite();
            diuo diuoVar4 = (diuo) diunVar.instance;
            diuoVar4.b |= 16;
            diuoVar4.g = z3;
            diuo diuoVar5 = (diuo) diunVar.build();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("com.google.android.ims.provisioning.enginge.welcome_message", diuoVar5.toByteArray());
            of.ifPresent(new Consumer() { // from class: djvj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bundle.putString("com.google.android.ims.provisioning.sim.id.key", (String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            djtb.c(this.g, 3, bundle);
        }
        djtp f2 = this.b.f(str);
        if (!f2.R() && !f2.ab()) {
            dkty.c("Processed disabled configuration", new Object[0]);
            return;
        }
        if (!f2.X()) {
            dkty.c("Processed invalid version in configuration", new Object[0]);
        } else if (f(djtpVar, djtpVar2)) {
            dkty.c("Waiting for user to confirm configuration", new Object[0]);
        } else {
            f2.J();
            j(f2, str);
        }
    }

    final boolean e(djtp djtpVar, djtp djtpVar2) {
        if (djtpVar2.q() == null) {
            return false;
        }
        if (!djtpVar2.R() || !djtpVar2.X()) {
            return true;
        }
        if (djtpVar2.a() == 0) {
            return djtpVar.c() == 1;
        }
        if (!djtpVar.m().C()) {
            this.h.o(19);
        }
        return false;
    }

    final boolean f(djtp djtpVar, djtp djtpVar2) {
        ServerMessage q;
        return e(djtpVar, djtpVar2) && (q = djtpVar2.q()) != null && q.mHasRejectButton;
    }
}
