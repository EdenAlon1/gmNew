package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.LocalDate;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmii implements cmgr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl");
    public static final ejui b = new ejtz("RCS_ENABLED_DATA_SOURCE_KEY");
    public static final ejui c = new ejtz("RCS_SETTINGS_DATA_SOURCE_KEY");
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ctbl D;
    public final ffbr d;
    public final ffsk e;
    public final ffhd f;
    public final errl g;
    public final comc h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final avcq q;
    public final cvjg r;
    private final Context s;
    private final ejvp t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ctbk x;
    private final ffbr y;
    private final ffbr z;

    public cmii(Context context, ffbr ffbrVar, ffsk ffskVar, ffhd ffhdVar, errl errlVar, comc comcVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ejvp ejvpVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ctbk ctbkVar, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, avcq avcqVar, cvjg cvjgVar, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        errlVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ejvpVar.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ctbkVar.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        ffbrVar15.getClass();
        cvjgVar.getClass();
        ffbrVar16.getClass();
        ffbrVar17.getClass();
        ffbrVar18.getClass();
        this.s = context;
        this.d = ffbrVar;
        this.e = ffskVar;
        this.f = ffhdVar;
        this.g = errlVar;
        this.h = comcVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar5;
        this.t = ejvpVar;
        this.l = ffbrVar6;
        this.u = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.v = ffbrVar10;
        this.o = ffbrVar11;
        this.w = ffbrVar12;
        this.x = ctbkVar;
        this.y = ffbrVar13;
        this.p = ffbrVar14;
        this.z = ffbrVar15;
        this.q = avcqVar;
        this.r = cvjgVar;
        this.A = ffbrVar16;
        this.B = ffbrVar17;
        this.C = ffbrVar18;
        this.D = ctbkVar.a(new cmhc());
    }

    private final cmiu C() {
        return (cmiu) this.h.l();
    }

    public final void A(cmip cmipVar) {
        if (cmipVar != cmip.TOGGLE_STATE_UNSPECIFIED) {
            return;
        }
        cmip cmipVar2 = ((ctyx) this.d.b()).q(this.s.getString(R.string.enable_rcs_pref_key), true) ? cmip.TOGGLE_STATE_ENABLED : cmip.TOGGLE_STATE_USER_DISABLED;
        m(cmipVar2);
        ((enrr) a.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "backfillGlobalToggleFromBuglePrefs", 171, "RcsSettingsDataServiceImpl.kt")).t("backfillGlobalToggleFromBuglePrefs: setting global toggle to %s", cmipVar2);
    }

    public final void B(cmip cmipVar) {
        if (cmipVar == cmip.TOGGLE_STATE_ENABLED) {
            ((ctyx) this.d.b()).h(this.s.getString(R.string.enable_rcs_pref_key), true);
        } else if (cmipVar == cmip.TOGGLE_STATE_USER_DISABLED || cmipVar == cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED) {
            ((ctyx) this.d.b()).h(this.s.getString(R.string.enable_rcs_pref_key), false);
        }
    }

    @Override // defpackage.cmgr
    public final cmip a() {
        cmip b2 = cmip.b(C().e);
        if (b2 == null) {
            b2 = cmip.TOGGLE_STATE_UNSPECIFIED;
        }
        b2.getClass();
        A(b2);
        cmip b3 = cmip.b(C().e);
        if (b3 == null) {
            b3 = cmip.TOGGLE_STATE_UNSPECIFIED;
        }
        b3.getClass();
        return b3;
    }

    @Override // defpackage.cmgr
    public final cmis b(djrm djrmVar) {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new eygq(C().c, cmiu.f));
        unmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(unmodifiableMap.size()));
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new djro((String) key), entry.getValue());
        }
        Object obj = linkedHashMap.get(djrmVar);
        if (obj == null) {
            obj = o(djrmVar);
        }
        return (cmis) obj;
    }

    @Override // defpackage.cmgr
    public final ejxi c() {
        return new cmhm(this);
    }

    @Override // defpackage.cmgr
    public final ejxi d(lkk lkkVar) {
        lkkVar.getClass();
        lkkVar.c(new cmhw(this, new csmx() { // from class: cmgs
            @Override // defpackage.csmx
            public final void y() {
                cmii.this.k();
            }
        }, new ckgc() { // from class: cmgt
            @Override // defpackage.ckgc
            public final void al(ckgd ckgdVar) {
                cmii.this.k();
            }
        }));
        return new cmhr(this);
    }

    @Override // defpackage.cmgr
    public final elfl e(djrm djrmVar) {
        elfl c2;
        c2 = axol.c(this.e, ffhe.a, ffsm.a, new cmhv(this, djrmVar, null));
        return c2;
    }

    @Override // defpackage.cmgr
    public final elfl f(djrm djrmVar, cmis cmisVar) {
        elfl c2;
        cmisVar.getClass();
        c2 = axol.c(this.e, ffhe.a, ffsm.a, new cmid(this, djrmVar, cmisVar, null));
        return c2;
    }

    @Override // defpackage.cmgr
    public final elfl g(cmip cmipVar) {
        elfl c2;
        cmipVar.getClass();
        c2 = axol.c(this.e, ffhe.a, ffsm.a, new cmig(this, cmipVar, null));
        return c2;
    }

    @Override // defpackage.cmgr
    public final elfl h(cmip cmipVar) {
        elfl c2;
        cmipVar.getClass();
        c2 = axol.c(this.e, ffhe.a, ffsm.a, new cmih(this, cmipVar, null));
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cmgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cmho
            if (r0 == 0) goto L13
            r0 = r6
            cmho r0 = (defpackage.cmho) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmho r0 = new cmho
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.f
            ffhd r6 = defpackage.ekxi.a(r6)
            cmhn r2 = new cmhn
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.i(ffgu):java.lang.Object");
    }

    @Override // defpackage.cmgr
    public final void j() {
        if (((asqs) this.j.b()).a() || ((aumz) this.B.b()).a()) {
            axol.k(this.e, null, new cmhd(this, null), 3);
        }
    }

    @Override // defpackage.cmgr
    public final void k() {
        this.t.a(elfo.e(null), c);
        this.D.c(new Supplier() { // from class: cmgu
            @Override // java.util.function.Supplier
            public final Object get() {
                enru enruVar = cmii.a;
                return null;
            }
        }, "RcsSettingsDataService::notifyDataChanged");
    }

    @Override // defpackage.cmgr
    public final void l(final djrm djrmVar, final cmis cmisVar) {
        djrmVar.getClass();
        cmisVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: cmgv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                enru enruVar = cmii.a;
                cmin cminVar = (cmin) ((cmiu) obj).toBuilder();
                cminVar.a(djrn.a(djrm.this).a, cmisVar);
                return (cmiu) cminVar.build();
            }
        };
        this.h.m(new emwl() { // from class: cmgw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = cmii.a;
                return ffji.this.invoke(obj);
            }
        });
    }

    @Override // defpackage.cmgr
    public final void m(final cmip cmipVar) {
        cmipVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: cmgx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                enru enruVar = cmii.a;
                cmin cminVar = (cmin) ((cmiu) obj).toBuilder();
                cminVar.copyOnWrite();
                cmiu cmiuVar = (cmiu) cminVar.instance;
                cmiuVar.e = cmip.this.e;
                cmiuVar.b |= 2;
                return (cmiu) cminVar.build();
            }
        };
        this.h.m(new emwl() { // from class: cmgy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enru enruVar = cmii.a;
                return ffji.this.invoke(obj);
            }
        });
        B(cmipVar);
        k();
    }

    @Override // defpackage.cmgr
    public final boolean n() {
        return a().equals(cmip.TOGGLE_STATE_ENABLED);
    }

    public final cmis o(djrm djrmVar) {
        int b2 = ((clwp) this.w.b()).b(djrmVar) - 1;
        cmis cmisVar = b2 != 0 ? b2 != 1 ? cmis.PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED : cmis.PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED : cmis.PER_SIM_TOGGLE_STATE_ENABLED;
        ((enrr) a.e().h("com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl", "getDefaultSimLevelToggleStateForProvisioningRule", 346, "RcsSettingsDataServiceImpl.kt")).D("Default sim level toggle state for rcsProvisioningId: %s is %s", dktx.SIM_ID.c(djrn.a(djrmVar).a), cmisVar);
        if (cmisVar == cmis.PER_SIM_TOGGLE_STATE_ENABLED) {
            l(djrmVar, cmisVar);
        }
        return cmisVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r2.y(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0089 -> B:18:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.cmhb
            if (r0 == 0) goto L13
            r0 = r9
            cmhb r0 = (defpackage.cmhb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cmhb r0 = new cmhb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r9)
            goto Lc0
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            java.lang.Object r2 = r0.a
            cmii r6 = r0.e
            defpackage.ffci.b(r9)
            goto L8b
        L3e:
            cmii r2 = r0.e
            defpackage.ffci.b(r9)
            goto L5a
        L44:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.i
            java.lang.Object r9 = r9.b()
            cort r9 = (defpackage.cort) r9
            r0.e = r8
            r0.d = r5
            java.lang.Object r9 = r9.u()
            if (r9 == r1) goto Lc3
            r2 = r8
        L5a:
            java.util.Set r9 = (java.util.Set) r9
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto Lc0
            boolean r6 = r9 instanceof java.util.Collection
            if (r6 == 0) goto L6d
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L6d
            goto L95
        L6d:
            java.util.Iterator r9 = r9.iterator()
            r6 = r2
            r2 = r9
        L73:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L94
            java.lang.Object r9 = r2.next()
            djrm r9 = (defpackage.djrm) r9
            r0.e = r6
            r0.a = r2
            r0.d = r4
            java.lang.Object r9 = r6.u(r9, r0)
            if (r9 == r1) goto Lc3
        L8b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L73
            r5 = 0
        L94:
            r2 = r6
        L95:
            if (r5 == 0) goto Lc0
            enru r9 = defpackage.cmii.a
            ensk r9 = r9.h()
            java.lang.String r4 = "automaticallyDisableGlobalToggle"
            r5 = 420(0x1a4, float:5.89E-43)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r7 = "RcsSettingsDataServiceImpl.kt"
            ensk r9 = r9.h(r6, r4, r5, r7)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r4 = "All sim level toggles disabled, automatically disabling global toggle"
            r9.q(r4)
            cmip r9 = defpackage.cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED
            r4 = 0
            r0.e = r4
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r2.y(r9, r0)
            if (r9 != r1) goto Lc0
            goto Lc3
        Lc0:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.p(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cmhe
            if (r0 == 0) goto L13
            r0 = r12
            cmhe r0 = (defpackage.cmhe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cmhe r0 = new cmhe
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.a
            cmii r5 = r0.e
            defpackage.ffci.b(r12)
            goto L59
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            cmii r2 = r0.e
            defpackage.ffci.b(r12)
            r5 = r2
            goto L53
        L3d:
            defpackage.ffci.b(r12)
            ffbr r12 = r11.i
            java.lang.Object r12 = r12.b()
            cort r12 = (defpackage.cort) r12
            r0.e = r11
            r0.d = r4
            java.lang.Object r12 = r12.u()
            if (r12 == r1) goto Lc6
            r5 = r11
        L53:
            java.util.Set r12 = (java.util.Set) r12
            java.util.Iterator r2 = r12.iterator()
        L59:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Lc3
            java.lang.Object r12 = r2.next()
            djrm r12 = (defpackage.djrm) r12
            ffbr r6 = r5.w
            java.lang.Object r6 = r6.b()
            clwp r6 = (defpackage.clwp) r6
            int r6 = r6.b(r12)
            djro r7 = defpackage.djrn.a(r12)
            java.lang.String r7 = r7.a
            ffbr r8 = r5.i
            java.lang.Object r8 = r8.b()
            cort r8 = (defpackage.cort) r8
            cost r8 = r8.a()
            java.lang.String r8 = r8.c
            boolean r7 = defpackage.ffkj.e(r7, r8)
            if (r6 == r4) goto L8f
            if (r6 != r3) goto L59
            if (r7 == 0) goto L59
        L8f:
            enru r6 = defpackage.cmii.a
            ensk r6 = r6.h()
            java.lang.String r7 = "enableProvisioningRuleEligibleSims"
            r8 = 248(0xf8, float:3.48E-43)
            java.lang.String r9 = "com/google/android/apps/messaging/shared/rcsdata/settings/RcsSettingsDataServiceImpl"
            java.lang.String r10 = "RcsSettingsDataServiceImpl.kt"
            ensk r6 = r6.h(r9, r7, r8, r10)
            enrr r6 = (defpackage.enrr) r6
            dktx r7 = defpackage.dktx.SIM_ID
            djro r8 = defpackage.djrn.a(r12)
            java.lang.String r8 = r8.a
            java.lang.String r7 = r7.c(r8)
            java.lang.String r8 = "Enabling RCS for provisioning rule eligible SIM: %s"
            r6.t(r8, r7)
            cmis r6 = defpackage.cmis.PER_SIM_TOGGLE_STATE_ENABLED
            r0.e = r5
            r0.a = r2
            r0.d = r3
            java.lang.Object r12 = r5.x(r12, r6, r0)
            if (r12 != r1) goto L59
            goto Lc6
        Lc3:
            ffcu r12 = defpackage.ffcu.a
            return r12
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.q(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.djrm r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cmhg
            if (r0 == 0) goto L13
            r0 = r7
            cmhg r0 = (defpackage.cmhg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmhg r0 = new cmhg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.f
            ffhd r7 = defpackage.ekxi.a(r7)
            cmhf r2 = new cmhf
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.r(djrm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.djrm r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cmhi
            if (r0 == 0) goto L13
            r0 = r7
            cmhi r0 = (defpackage.cmhi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmhi r0 = new cmhi
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.f
            ffhd r7 = defpackage.ekxi.a(r7)
            cmhh r2 = new cmhh
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.s(djrm, ffgu):java.lang.Object");
    }

    public final Object t(ffgu ffguVar) {
        return this.h.c(ffguVar);
    }

    public final Object u(djrm djrmVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.f), new cmhj(null, this, djrmVar), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:11:0x0061->B:13:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cmhp
            if (r0 == 0) goto L13
            r0 = r5
            cmhp r0 = (defpackage.cmhp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cmhp r0 = new cmhp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.t(r0)
            if (r5 == r1) goto L84
        L3a:
            cmiu r5 = (defpackage.cmiu) r5
            eygq r0 = new eygq
            eyhm r5 = r5.c
            eygm r1 = defpackage.cmiu.f
            r0.<init>(r5, r1)
            java.util.Map r5 = j$.util.DesugarCollections.unmodifiableMap(r0)
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.size()
            int r1 = defpackage.ffew.a(r1)
            r0.<init>(r1)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            djro r2 = new djro
            java.lang.Object r3 = r1.getKey()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L61
        L83:
            return r0
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.v(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0447  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x051a -> B:13:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.Set r42, defpackage.ffgu r43) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmii.w(java.util.Set, ffgu):java.lang.Object");
    }

    public final Object x(djrm djrmVar, cmis cmisVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.f), new cmib(null, this, djrmVar, cmisVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final Object y(cmip cmipVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.f), new cmie(null, this, cmipVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    public final String z(djrm djrmVar) {
        String str = djrn.a(djrmVar).a;
        LocalDate b2 = ((cqoh) this.l.b()).g().b();
        Objects.toString(b2);
        return str.concat(String.valueOf(b2));
    }
}
