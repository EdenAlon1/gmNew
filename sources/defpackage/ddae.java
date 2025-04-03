package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.manual.PhoneNumberInputV2Activity;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddae implements ddas {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer");
    public static final cskc b = cskc.g("Bugle", "PhoneNumberInputBottomSheetFragmentPeer");
    public ddar A;
    private final String B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    public final dczw d;
    public final String e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public efto s;
    public ddan t;
    public final emyl u;
    public adg v;
    public ejlr w;
    public ejlr x;
    public final AtomicReference c = new AtomicReference(Optional.empty());
    public final ejlr y = new ejlr<Void, Void>() { // from class: ddae.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ddae.b.m("Successfully stored manually entered phone number to disk");
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ddae.b.o("Error while trying to save manually entered phone number to disk", th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr z = new ejlr<String, Void>() { // from class: ddae.2
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((enrr) ((enrr) ddae.a.h()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onSuccess", 250, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Successfully incremented daily retry counter for simId: %s", dktx.SIM_ID.c((String) obj));
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ((enrr) ((enrr) ((enrr) ddae.a.j()).g(th)).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer$2", "onFailure", 257, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Failed to increment daily retry counter for simId: %s", dktx.SIM_ID.c((String) obj));
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public ddae(dczw dczwVar, ddap ddapVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, final ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21) {
        this.d = dczwVar;
        this.B = ddapVar.d;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.C = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.D = ffbrVar7;
        this.E = ffbrVar8;
        this.k = ffbrVar9;
        this.F = ffbrVar10;
        this.l = ffbrVar11;
        this.u = emys.a(new emyl() { // from class: dczy
            @Override // defpackage.emyl
            public final Object get() {
                return ((dcxt) ffbr.this.b()).a(epgt.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT, 4);
            }
        });
        this.G = ffbrVar13;
        this.m = ffbrVar14;
        this.o = ffbrVar15;
        this.n = ffbrVar16;
        this.H = ffbrVar17;
        this.p = ffbrVar18;
        this.q = ffbrVar19;
        this.r = ffbrVar20;
        this.I = ffbrVar21;
        if ((ddapVar.b & 1) == 0) {
            throw new IllegalArgumentException("PhoneNumberInputBottomSheetFragment does not have simId");
        }
        this.e = ddapVar.c;
    }

    final Button a() {
        return (Button) this.d.N().findViewById(R.id.continue_button);
    }

    final EditText b() {
        return (EditText) this.d.N().findViewById(R.id.country_code_text);
    }

    final EditText c() {
        return (EditText) this.d.N().findViewById(R.id.phone_number_text);
    }

    public final aoku d() {
        Editable text = c().getText();
        final efto eftoVar = this.s;
        return (text == null || eftoVar == null) ? ((aolr) this.H.b()).f() : ((aolr) this.H.b()).c(text.toString(), new emyl() { // from class: ddaa
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(efto.this.c);
            }
        });
    }

    public final ddan e() {
        if (this.s != null) {
            this.t = new ddan(this, this.s.c);
        } else {
            this.t = new ddan(this);
        }
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.efto f() {
        /*
            r4 = this;
            efto r0 = r4.s
            if (r0 != 0) goto Lab
            ffbr r0 = r4.g
            java.lang.Object r0 = r0.b()
            ctyx r0 = (defpackage.ctyx) r0
            java.lang.String r1 = "manual_msisdn_entered_country_code"
            byte[] r0 = r0.r(r1)
            r1 = 0
            if (r0 == 0) goto L26
            efto r2 = defpackage.efto.a     // Catch: defpackage.eygu -> L1e
            eyfy r0 = defpackage.eyfy.parseFrom(r2, r0)     // Catch: defpackage.eygu -> L1e
            efto r0 = (defpackage.efto) r0     // Catch: defpackage.eygu -> L1e
            goto L27
        L1e:
            r0 = move-exception
            cskc r2 = defpackage.ddae.b
            java.lang.String r3 = "Not able to parse country code from SharedPrefs"
            r2.s(r3, r0)
        L26:
            r0 = r1
        L27:
            if (r0 != 0) goto Lab
            dczw r0 = r4.d
            eg r0 = r0.fe()
            java.lang.String r2 = "phone"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getSimCountryIso()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L44
            goto L46
        L44:
            r1 = r0
            goto L64
        L46:
            dczw r0 = r4.d
            android.content.Context r0 = r0.A()
            java.util.Locale r0 = defpackage.ctid.c(r0)
            if (r0 != 0) goto L53
            goto L64
        L53:
            java.lang.String r0 = r0.getCountry()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L5e
            goto L64
        L5e:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toUpperCase(r1)
        L64:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L6d
            efto r0 = defpackage.efto.a
            return r0
        L6d:
            java.lang.String r0 = defpackage.emuz.d(r1)
            ffbr r1 = r4.f
            java.lang.Object r1 = r1.b()
            ctvb r1 = (defpackage.ctvb) r1
            ctvf r1 = r1.c(r0)
            boolean r2 = r1.a()
            if (r2 != 0) goto La9
            efto r2 = defpackage.efto.a
            eyfq r2 = r2.createBuilder()
            eftn r2 = (defpackage.eftn) r2
            int r1 = r1.a
            r2.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r3 = r2.instance
            efto r3 = (defpackage.efto) r3
            r3.d = r1
            r2.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r2.instance
            efto r1 = (defpackage.efto) r1
            r0.getClass()
            r1.c = r0
            eyfy r0 = r2.build()
            efto r0 = (defpackage.efto) r0
            return r0
        La9:
            efto r0 = defpackage.efto.a
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddae.f():efto");
    }

    public final String g() {
        Editable text = c().getText();
        efto eftoVar = this.s;
        return (text == null || eftoVar == null) ? "" : ((ctvb) this.f.b()).v(text.toString(), eftoVar.c);
    }

    public final String h() {
        cfva cfvaVar = aoqm.a;
        return ((Boolean) new aoqg().get()).booleanValue() ? emxe.b(d().p(true)) : g();
    }

    public final void i(int i) {
        if (o()) {
            this.d.fe().setResult(i);
            this.d.fe().finish();
        }
    }

    public final void j() {
        efto eftoVar = this.s;
        if (eftoVar == null || efto.a.equals(eftoVar)) {
            return;
        }
        b().setText(this.d.fe().getString(R.string.registration_country_code_format, new Object[]{eftoVar.c, String.valueOf(eftoVar.d)}));
    }

    public final void k(epgr epgrVar) {
        cmfb cmfbVar = (cmfb) this.I.b();
        epgt epgtVar = epgt.PROVISIONING_UI_TYPE_STREAMLINED_PHONE_NUMBER_INPUT;
        int r = r();
        epgn epgnVar = (epgn) epgo.a.createBuilder();
        boolean q = q();
        epgnVar.copyOnWrite();
        epgo epgoVar = (epgo) epgnVar.instance;
        epgoVar.b |= 1;
        epgoVar.c = q;
        boolean p = p();
        epgnVar.copyOnWrite();
        epgo epgoVar2 = (epgo) epgnVar.instance;
        epgoVar2.b |= 4;
        epgoVar2.d = p;
        cmfbVar.g(epgtVar, epgrVar, r, (epgo) epgnVar.build(), ((Integer) ((Optional) this.c.get()).orElse(-1)).intValue(), this.e);
    }

    public final void l() {
        if (!((AccessibilityManager) this.d.fe().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            Context z = this.d.z();
            if (ddzd.a(z) > z.getResources().getDimensionPixelSize(R.dimen.extra_small_screen_width_dp)) {
                EditText c = c();
                ((dede) this.D.b()).j(c.getContext(), c);
                return;
            }
        }
        m(b());
        m(c());
    }

    public final void m(EditText editText) {
        ((dede) this.D.b()).i(editText.getContext(), editText);
    }

    @Override // defpackage.ddas
    public final boolean n() {
        return this.d.aF();
    }

    public final boolean o() {
        try {
            return this.d.fe() instanceof PhoneNumberInputV2Activity;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final boolean p() {
        if (!o() && djai.w().equals("phone_number_ui_variant_promo_bottomsheet")) {
            return false;
        }
        ((crln) this.E.b()).f();
        Optional b2 = ((crln) this.E.b()).b();
        return ((crln) this.E.b()).f() && b2.isPresent() && ((cqoh) this.F.b()).f().toEpochMilli() - ((Date) b2.get()).getTime() > Duration.ofDays((long) ((Integer) djai.t().a.x.a()).intValue()).toMillis();
    }

    public final boolean q() {
        return ((Boolean) djai.t().a.R.a()).booleanValue() || ((ctwb) this.C.b()).a() >= 2;
    }

    public final int r() {
        return clzd.b(Integer.parseInt(this.B));
    }

    public final void s(int i) {
        clza b2 = ((clzh) this.G.b()).b(r(), i);
        clze clzeVar = o() ? clze.INPUT_FULLSCREEN : clze.INPUT_BOTTOMSHEET;
        b2.copyOnWrite();
        clzf clzfVar = (clzf) b2.instance;
        clzf clzfVar2 = clzf.a;
        clzfVar.h = clzeVar.a();
        clzfVar.b |= 64;
        boolean q = q();
        b2.copyOnWrite();
        clzf clzfVar3 = (clzf) b2.instance;
        clzfVar3.b |= 8;
        clzfVar3.f = q;
        boolean p = p();
        b2.copyOnWrite();
        clzf clzfVar4 = (clzf) b2.instance;
        clzfVar4.b |= 32;
        clzfVar4.g = p;
        clzf build = b2.build();
        ((ejlq) this.l.b()).i(ejlp.b(((clzh) this.G.b()).a(this.e, build)), ejlm.a(build), this.w);
    }

    /* compiled from: PG */
    final class a implements ejwd<Integer> {
        public a() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            ddae.b.s("GetRepromptCountCallback exception", th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Integer num = (Integer) obj;
            int intValue = ddae.this.r() == 3 ? num.intValue() + 1 : num.intValue();
            if (((Optional) ddae.this.c.getAndSet(Optional.of(Integer.valueOf(intValue)))).isEmpty()) {
                ddae ddaeVar = ddae.this;
                if (ddaeVar.d.aI()) {
                    ddaeVar.k(epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
                }
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }
}
