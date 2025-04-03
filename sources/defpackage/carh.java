package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceService;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carh implements carb {
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final elbx e;
    public final emyl f;
    private final Context h;
    private final csjk i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ejlk r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final AtomicReference w = new AtomicReference(bdgq.a);
    private final AtomicBoolean x = new AtomicBoolean(false);
    private static final cskc g = cskc.g("BugleDataModel", "DataModelImpl");
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl");

    public carh(Context context, final errl errlVar, csjk csjkVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ejlk ejlkVar, elbx elbxVar, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, final fazb fazbVar, ffbr ffbrVar18, final ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22) {
        this.h = context;
        this.i = csjkVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar7;
        this.b = ffbrVar8;
        this.c = ffbrVar10;
        this.d = ffbrVar11;
        this.p = ffbrVar13;
        this.q = ffbrVar14;
        this.r = ejlkVar;
        this.e = elbxVar;
        this.s = ffbrVar15;
        this.t = ffbrVar16;
        this.u = ffbrVar17;
        this.v = ffbrVar18;
        final carj carjVar = new carj(ffbrVar8, ffbrVar20, ffbrVar12, ffbrVar9, ffbrVar6, ffbrVar21, ffbrVar22);
        this.f = emys.a(new emyl() { // from class: carc
            @Override // defpackage.emyl
            public final Object get() {
                final carj carjVar2 = carjVar;
                final ffbr ffbrVar23 = ffbrVar19;
                return new axph(new erog() { // from class: card
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ffbr ffbrVar24 = ffbrVar23;
                        boolean a2 = ((atru) ffbrVar24.b()).a();
                        carj carjVar3 = carj.this;
                        if (a2) {
                            ((akzt) carjVar3.g.b()).c("Bugle.Datamodel.SubscriptionChanged.CallbackEvent.Count");
                        }
                        if (((atru) ffbrVar24.b()).a()) {
                            ensk h = carh.a.h();
                            h.Y(ente.a, "BugleDataModel");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl", "scheduleCountryCodeDetectorAction", 315, "DataModelImpl.java")).q("Scheduling country code detector action, because a subscription changed its state.");
                            ((bacz) carjVar3.a.b()).b().G(((Long) carjVar3.b.b()).longValue());
                        } else {
                            ((bacz) carjVar3.a.b()).b().M();
                        }
                        final cpbs cpbsVar = (cpbs) carjVar3.c.b();
                        final cpbv cpbvVar = (cpbv) carjVar3.d.b();
                        elfl f = elfo.f(new Runnable() { // from class: cpbq
                            @Override // java.lang.Runnable
                            public final void run() {
                                cpbs.this.c(cpbvVar);
                            }
                        }, cpbsVar.c);
                        if (!((atru) ffbrVar24.b()).a()) {
                            ((bavz) carjVar3.e.b()).b().M();
                            return f;
                        }
                        ensk h2 = carh.a.h();
                        h2.Y(ente.a, "BugleDataModel");
                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/impl/DataModelImpl", "scheduleSelfParticipantsRefreshAction", 332, "DataModelImpl.java")).q("Scheduling self participants refresh action, because a subscription changed its state.");
                        ((bavz) carjVar3.e.b()).b().G(((Long) carjVar3.f.b()).longValue());
                        return f;
                    }
                }, errlVar);
            }
        });
    }

    private final boolean h() {
        return ((Optional) ((fbbb) this.l).a).isPresent();
    }

    @Override // defpackage.carb
    public final bbcf a() {
        return (bbcf) this.m.b();
    }

    @Override // defpackage.carb
    public final void b() {
        if (!h() && ((ctvs) this.t.b()).d()) {
            if (ctid.h(this.h)) {
                cark carkVar = (cark) this.u.b();
                ((ejtr) carkVar.a.b()).d(Telephony.MmsSms.CONTENT_URI, true, carkVar);
                ((coxg) this.n.b()).l(eqqh.SECONDARY_USER_SYNC);
            } else {
                cark carkVar2 = (cark) this.u.b();
                ((ejtr) carkVar2.a.b()).e(carkVar2);
                crqh crqhVar = (crqh) this.p.b();
                axol.k(crqhVar.c, null, new crqg(crqhVar, null), 3);
            }
        }
        final cggk cggkVar = (cggk) this.s.b();
        final ecri a2 = ((alrv) cggkVar.d.b()).a();
        dglp dglpVar = cggkVar.f;
        final dhri dhriVar = new dhri();
        final dglw dglwVar = (dglw) dglpVar;
        dglwVar.b.execute(new Runnable() { // from class: dglv
            @Override // java.lang.Runnable
            public final void run() {
                emxc emxcVar;
                dglw.a.g("start reading cache", new Object[0]);
                dglw dglwVar2 = dglw.this;
                dgme dgmeVar = dglwVar2.c.a;
                long nanoTime = System.nanoTime();
                emxc a3 = dgmeVar.a();
                if (a3.g()) {
                    ewoj ewojVar = (ewoj) a3.c();
                    try {
                        ewoi ewoiVar = (ewoi) eyfy.parseFrom(ewoi.a, ewojVar.c, eyfc.a());
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(Instant.now().toEpochMilli());
                        eyja eyjaVar = ewoiVar.f;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                        emxcVar = seconds >= eyjaVar.b ? emux.a : emxc.j(ewojVar);
                    } catch (eygu unused) {
                        emxcVar = emux.a;
                    }
                } else {
                    emxcVar = emux.a;
                }
                final dhri dhriVar2 = dhriVar;
                dglq a4 = dgmg.a(emxcVar);
                dglw.a.g("finished reading cache in %f ms", Double.valueOf((System.nanoTime() - nanoTime) / 1000000.0d));
                if (a4.b()) {
                    dglw.a.g("responding based on cache", new Object[0]);
                    dhriVar2.d(a4);
                }
                final dgms dgmsVar = dglwVar2.d;
                dhre a5 = duik.a(erny.f(erqc.o(erqt.n(new erog() { // from class: dglr
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final dgms dgmsVar2 = dgms.this;
                        return erqt.n(new erog() { // from class: dgmj
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                dfun dfunVar = new dfun();
                                dfunVar.a = new dfuf() { // from class: dgna
                                    @Override // defpackage.dfuf
                                    public final void a(Object obj, Object obj2) {
                                        dgmz dgmzVar = (dgmz) obj;
                                        int i = dgne.a;
                                        dgnc dgncVar = new dgnc((dhri) obj2);
                                        Context context = dgmzVar.c;
                                        ((IGmsDeviceComplianceService) dgmzVar.w()).getGmsDeviceCompliance(dgncVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                                    }
                                };
                                dfunVar.b = new Feature[]{dgll.a};
                                dfunVar.b();
                                dfunVar.c = 13801;
                                dfuo a6 = dfunVar.a();
                                final dgms dgmsVar3 = dgms.this;
                                return erny.g(ernq.f(erny.f(erqc.o(duin.a(((dfra) dgmsVar3.d).i(a6))), new emwl() { // from class: dgmr
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        return emxc.j((GmsDeviceComplianceResponse) obj);
                                    }
                                }, dgmsVar3.c), Exception.class, new emwl() { // from class: dgmh
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        dgms.a.f("apk call failed", (Exception) obj, new Object[0]);
                                        return emux.a;
                                    }
                                }, dgmsVar3.c), new eroh() { // from class: dgmi
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj) {
                                        emxc emxcVar2;
                                        final emxc emxcVar3 = (emxc) obj;
                                        if (emxcVar3.g()) {
                                            GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) emxcVar3.c();
                                            long j = dgmg.a;
                                            byte[] bArr = gmsDeviceComplianceResponse.f;
                                            if (bArr != null) {
                                                try {
                                                    emxcVar2 = emxc.j((ewoj) eyfy.parseFrom(ewoj.a, bArr, eyfc.a()));
                                                } catch (eygu unused2) {
                                                }
                                                final dgms dgmsVar4 = dgms.this;
                                                dgmy dgmyVar = dgmsVar4.e;
                                                Long l = (Long) ((emxc) dgmyVar.c.get()).e(0L);
                                                l.longValue();
                                                final dgmx dgmxVar = new dgmx(dgmyVar.a, new dgwy(emxc.j(l), emux.a));
                                                return (ListenableFuture) dgms.a(emxcVar2, new emxg() { // from class: dgmo
                                                    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
                                                    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2 A[RETURN] */
                                                    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                                                    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
                                                    @Override // defpackage.emxg
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct add '--show-bad-code' argument
                                                    */
                                                    public final boolean a(java.lang.Object r18) {
                                                        /*
                                                            Method dump skipped, instructions count: 456
                                                            To view this dump add '--comments-level debug' option
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgmo.a(java.lang.Object):boolean");
                                                    }
                                                }).b(new emwl() { // from class: dgmp
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj2) {
                                                        return dgms.this.b((ewoj) obj2);
                                                    }
                                                }).d(new emyl() { // from class: dgmq
                                                    @Override // defpackage.emyl
                                                    public final Object get() {
                                                        emxc emxcVar4 = emxcVar3;
                                                        if (!emxcVar4.g()) {
                                                            return erqt.i(emux.a);
                                                        }
                                                        GmsDeviceComplianceResponse gmsDeviceComplianceResponse2 = (GmsDeviceComplianceResponse) emxcVar4.c();
                                                        long j2 = dgmg.a;
                                                        eyja d = eykm.d(Instant.now().toEpochMilli() + dgmg.a);
                                                        ewof ewofVar = gmsDeviceComplianceResponse2.b ? ewof.DO_NOT_ENFORCE : ewof.ENFORCE;
                                                        dgms dgmsVar5 = dgms.this;
                                                        ewoc ewocVar = (ewoc) ewoj.a.createBuilder();
                                                        ewod ewodVar = (ewod) ewoi.a.createBuilder();
                                                        ewodVar.copyOnWrite();
                                                        ewoi ewoiVar2 = (ewoi) ewodVar.instance;
                                                        ewoiVar2.d = ewofVar.d;
                                                        ewoiVar2.b |= 2;
                                                        ewodVar.copyOnWrite();
                                                        ewoi ewoiVar3 = (ewoi) ewodVar.instance;
                                                        d.getClass();
                                                        ewoiVar3.f = d;
                                                        ewoiVar3.b |= 8;
                                                        eyee byteString = ((ewoi) ewodVar.build()).toByteString();
                                                        ewocVar.copyOnWrite();
                                                        ewoj ewojVar2 = (ewoj) ewocVar.instance;
                                                        ewojVar2.b |= 1;
                                                        ewojVar2.c = byteString;
                                                        return dgmsVar5.b((ewoj) ewocVar.build());
                                                    }
                                                });
                                            }
                                        }
                                        emxcVar2 = emux.a;
                                        final dgms dgmsVar42 = dgms.this;
                                        dgmy dgmyVar2 = dgmsVar42.e;
                                        Long l2 = (Long) ((emxc) dgmyVar2.c.get()).e(0L);
                                        l2.longValue();
                                        final dgxf dgmxVar2 = new dgmx(dgmyVar2.a, new dgwy(emxc.j(l2), emux.a));
                                        return (ListenableFuture) dgms.a(emxcVar2, new emxg() { // from class: dgmo
                                            @Override // defpackage.emxg
                                            public final boolean a(Object obj2) {
                                                /*
                                                    Method dump skipped, instructions count: 456
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.dgmo.a(java.lang.Object):boolean");
                                            }
                                        }).b(new emwl() { // from class: dgmp
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                return dgms.this.b((ewoj) obj2);
                                            }
                                        }).d(new emyl() { // from class: dgmq
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                emxc emxcVar4 = emxcVar3;
                                                if (!emxcVar4.g()) {
                                                    return erqt.i(emux.a);
                                                }
                                                GmsDeviceComplianceResponse gmsDeviceComplianceResponse2 = (GmsDeviceComplianceResponse) emxcVar4.c();
                                                long j2 = dgmg.a;
                                                eyja d = eykm.d(Instant.now().toEpochMilli() + dgmg.a);
                                                ewof ewofVar = gmsDeviceComplianceResponse2.b ? ewof.DO_NOT_ENFORCE : ewof.ENFORCE;
                                                dgms dgmsVar5 = dgms.this;
                                                ewoc ewocVar = (ewoc) ewoj.a.createBuilder();
                                                ewod ewodVar = (ewod) ewoi.a.createBuilder();
                                                ewodVar.copyOnWrite();
                                                ewoi ewoiVar2 = (ewoi) ewodVar.instance;
                                                ewoiVar2.d = ewofVar.d;
                                                ewoiVar2.b |= 2;
                                                ewodVar.copyOnWrite();
                                                ewoi ewoiVar3 = (ewoi) ewodVar.instance;
                                                d.getClass();
                                                ewoiVar3.f = d;
                                                ewoiVar3.b |= 8;
                                                eyee byteString = ((ewoi) ewodVar.build()).toByteString();
                                                ewocVar.copyOnWrite();
                                                ewoj ewojVar2 = (ewoj) ewocVar.instance;
                                                ewojVar2.b |= 1;
                                                ewojVar2.c = byteString;
                                                return dgmsVar5.b((ewoj) ewocVar.build());
                                            }
                                        });
                                    }
                                }, dgmsVar3.c);
                            }
                        }, dgmsVar2.c);
                    }
                }, dglwVar2.b)), new emwl() { // from class: dgls
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return dgmg.a((emxc) obj);
                    }
                }, dglwVar2.b));
                a5.q(dglwVar2.b, new dhqy() { // from class: dglt
                    @Override // defpackage.dhqy
                    public final void e(Object obj) {
                        dhri.this.d((dglq) obj);
                    }
                });
                a5.p(dglwVar2.b, new dhqv() { // from class: dglu
                    @Override // defpackage.dhqv
                    public final void d(Exception exc) {
                        dhri.this.c(exc);
                    }
                });
            }
        });
        dhrm dhrmVar = dhriVar.a;
        dhrmVar.p(cggkVar.e, new dhqv() { // from class: cggi
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                cggk cggkVar2 = cggk.this;
                ((akzt) cggkVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 3);
                ((alrv) cggkVar2.d.b()).h(a2, alrv.F);
                cggk.a.r("GmsDeviceCompliance API threw an exception.");
            }
        });
        dhrmVar.q(cggkVar.e, new dhqy() { // from class: cggj
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                boolean b = ((dglq) obj).b();
                cggk cggkVar2 = cggk.this;
                if (b) {
                    ((akzt) cggkVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 1);
                    Intent intent = new Intent(cggkVar2.b, (Class<?>) UncertifiedDeviceActivity.class);
                    TextUtils.isEmpty(null);
                    if (!TextUtils.isEmpty(null)) {
                        intent = intent.putExtra("customBodyText", (String) null);
                    }
                    intent.putExtra("overrideNavBarColor", false);
                    intent.setFlags(268468224);
                    cggkVar2.b.startActivity(intent);
                } else {
                    ((akzt) cggkVar2.c.b()).e("Bugle.IPCompliance.EnforcementResult.Counts", 2);
                }
                ((alrv) cggkVar2.d.b()).h(a2, alrv.F);
            }
        });
        ((cbeq) this.j.b()).b();
        ((albq) this.k.b()).g();
        ((cgis) this.v.b()).a();
    }

    @Override // defpackage.carb
    public final void c() {
        baeo baeoVar = (baeo) this.o.b();
        cbia cbiaVar = (cbia) baeoVar.a.b();
        cbiaVar.getClass();
        dtuu dtuuVar = (dtuu) baeoVar.b.b();
        dtuuVar.getClass();
        cqoh cqohVar = (cqoh) baeoVar.d.b();
        cqohVar.getClass();
        ffbr ffbrVar = baeoVar.f;
        new FixupMessageStatusOnStartupAction(cbiaVar, dtuuVar, baeoVar.c, cqohVar, baeoVar.e, ffbrVar).G(Action.r);
        ((bbfo) this.q.b()).e();
        if (h()) {
            if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                ((coxg) this.n.b()).l(eqqh.DATA_MODEL_INIT_MICRO_APP);
            } else {
                ((coxg) this.n.b()).h();
            }
        }
        ((csmz) this.i.a()).l(new carg(this));
        this.r.post(new Runnable() { // from class: care
            @Override // java.lang.Runnable
            public final void run() {
                carh carhVar = carh.this;
                ctwf ctwfVar = (ctwf) carhVar.d.b();
                carf carfVar = new carf(carhVar);
                ctwfVar.m.addOnSubscriptionsChangedListener(carfVar);
                if (ctwfVar.l == null) {
                    ctwfVar.l = new ArrayList();
                }
                ctwfVar.l.add(carfVar);
            }
        });
    }

    @Override // defpackage.carb
    public final void d(boolean z) {
        if (this.x.getAndSet(z) != z) {
            g.q(a.q(z, "scrolledToNewest="));
        }
    }

    @Override // defpackage.carb
    public final void e(ConversationIdType conversationIdType) {
        if (((ConversationIdType) this.w.getAndSet(conversationIdType)).equals(conversationIdType)) {
            return;
        }
        g.q("focusedConversation=".concat(String.valueOf(String.valueOf(conversationIdType))));
    }

    @Override // defpackage.carb
    public final boolean f(ConversationIdType conversationIdType) {
        ConversationIdType conversationIdType2 = (ConversationIdType) this.w.get();
        return !conversationIdType2.b() && conversationIdType2.equals(conversationIdType);
    }

    @Override // defpackage.carb
    public final boolean g(ConversationIdType conversationIdType) {
        return f(conversationIdType);
    }
}
