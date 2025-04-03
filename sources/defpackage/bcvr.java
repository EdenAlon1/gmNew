package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcvr extends bcpr implements appz, bcyq {
    private static final ensn I = new ensn("rcs_one_on_one_conditions", ephg.class, false, false);
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData");
    public static final cskc b = cskc.g("Bugle", "DraftMessageData");
    public static final Pattern c = Pattern.compile("^[ -_\\x0A\\x0C\\x0D\\x61-\\x7E\\u0400-\\u1CC0\\u2C00-\\u2C5F\\u2D00-\\u2DFF\\u2E80-\\u3370\\u33E0-\\uD7FF\\uA000-\\uD7FF\\uD800-\\uDFFF]*$");
    static final cfva d = cfvl.i(cfvl.b, "enable_warn_of_exceeding_sms_message_length_to_emergency_number_dialog", false);
    public final cpbw A;
    public final Context B;
    public final csuk C;
    public final covo D;
    public final cpaz E;
    public final uco F;
    public final ffbr G;
    public final ffbr H;
    private eoxo J;
    private eoze K;
    private boolean M;
    private boolean N;
    private SelfIdentityId Q;
    private final cqoh S;
    private final ckds T;
    private final ffbr U;
    private final csxu V;
    private final ctwb W;
    private final cpde X;
    private final bcvw Y;
    private final aqgi Z;
    private final bdvi aa;
    private final bcxm ab;
    private final byzp ac;
    private final bdis ad;
    private final ffbr ae;
    private final azei ag;
    public final ConversationIdType e;
    final bcvl f;
    public bcvn g;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public boolean q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public bcvj w;

    @Deprecated
    public final cflw x;
    public cnmd y;
    public final cpbs z;
    public boolean h = false;
    private final AtomicReference L = new AtomicReference();
    private Optional O = Optional.empty();
    private String P = "text/plain";
    public int o = -2;
    private final AtomicReference R = new AtomicReference();
    public Optional p = Optional.empty();
    private final llg af = new llg();

    public bcvr(cqoh cqohVar, cflw cflwVar, ckds ckdsVar, cpbs cpbsVar, cpbw cpbwVar, Context context, csxu csxuVar, ctwb ctwbVar, csuk csukVar, covo covoVar, cpaz cpazVar, cpde cpdeVar, bcvw bcvwVar, aqgi aqgiVar, bdvi bdviVar, bcxm bcxmVar, byzp byzpVar, uco ucoVar, bdis bdisVar, ffbr ffbrVar, ffbr ffbrVar2, ConversationIdType conversationIdType, boolean z, ffbr ffbrVar3, azei azeiVar, ffbr ffbrVar4) {
        this.S = cqohVar;
        this.x = cflwVar;
        this.T = ckdsVar;
        this.z = cpbsVar;
        this.A = cpbwVar;
        this.B = context;
        this.V = csxuVar;
        this.W = ctwbVar;
        this.C = csukVar;
        this.D = covoVar;
        this.E = cpazVar;
        this.X = cpdeVar;
        this.Y = bcvwVar;
        this.Z = aqgiVar;
        this.aa = bdviVar;
        this.ab = bcxmVar;
        this.ac = byzpVar;
        this.F = ucoVar;
        this.ad = bdisVar;
        this.ae = ffbrVar;
        this.U = ffbrVar2;
        this.G = ffbrVar3;
        this.ag = azeiVar;
        this.H = ffbrVar4;
        this.e = conversationIdType;
        O(z);
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        this.s = DesugarCollections.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.t = arrayList2;
        this.u = DesugarCollections.unmodifiableList(arrayList2);
        this.v = new ArrayList();
        this.f = new bcvl();
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5.A.d(r1) != false) goto L11;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean aA() {
        /*
            r5 = this;
            java.lang.String r0 = "DraftMessageData::requiresMmsForRecipients"
            ekzz r0 = defpackage.eleg.f(r0)
            int r1 = r5.q()     // Catch: java.lang.Throwable -> L2e
            cpde r2 = r5.X     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r5.M     // Catch: java.lang.Throwable -> L2e
            cflw r4 = r5.x     // Catch: java.lang.Throwable -> L2e
            int r4 = r4.a()     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.a(r3, r1, r4)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            if (r2 != 0) goto L2a
            boolean r2 = r5.i     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            if (r2 == 0) goto L29
            cpbw r2 = r5.A     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r3 = r4
        L2a:
            r0.close()
            return r3
        L2e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            r1.addSuppressed(r0)
        L37:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvr.aA():boolean");
    }

    private final int ao(boolean z) {
        if (this.h) {
            return this.j ? 40 : 30;
        }
        if (z) {
            return 20;
        }
        return (!this.i || this.A.d(q())) ? 10 : 11;
    }

    @Deprecated
    private final int ap() {
        return this.V.b("bugle_mms_attachment_limit", 10);
    }

    @Deprecated
    private final int aq() {
        return this.V.b("bugle_rcs_attachment_limit", 10);
    }

    private final awui ar() {
        awui a2 = ((ckac) this.ae.b()).a(this.o);
        if (a2 != null) {
            return a2;
        }
        awui awuiVar = (awui) this.R.get();
        if (awuiVar != null) {
            return awuiVar;
        }
        throw new bcvp(this.o);
    }

    private final engw as(Predicate predicate, List list) {
        Stream filter = Collection.EL.stream(list).filter(predicate);
        int i = engw.d;
        engw engwVar = (engw) filter.collect(endq.a);
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) engwVar.get(i2);
            if (ah(messagePartCoreData)) {
                cbit cbitVar = (cbit) this.G.b();
                Uri t = messagePartCoreData.t();
                t.getClass();
                cbitVar.c(t, this.C.b(-1));
            }
        }
        if (!engwVar.isEmpty()) {
            list.removeAll(engwVar);
            this.v.removeAll(engwVar);
            Collection.EL.stream(engwVar).forEach(new Consumer() { // from class: bcvf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((MessagePartCoreData) obj).ak();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            J(1);
        }
        return engwVar;
    }

    private final String at(String str) {
        if (TextUtils.isEmpty(str) || !this.O.isPresent()) {
            return str;
        }
        return String.valueOf(str).concat((String) this.O.get());
    }

    private final void au(eoxo eoxoVar) {
        csjb a2 = b.a();
        a2.I("set emptyDraftRcsConditions");
        a2.c(this.e);
        eoks b2 = eoks.b(eoxoVar.f);
        if (b2 == null) {
            b2 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        a2.A("conversationType", b2.name());
        a2.B("hasRbmRecipient", eoxoVar.j);
        eoxn b3 = eoxn.b(eoxoVar.k);
        if (b3 == null) {
            b3 = eoxn.UNKNOWN_SEND_MODE;
        }
        a2.A("sendMode", b3.name());
        a2.r();
        this.J = eoxoVar;
    }

    private final void av() {
        if (this.o >= 0) {
            this.R.set(((ckac) this.ae.b()).b(this.o));
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "updateLocalRcsSender", 848, "DraftMessageData.java")).q("Unable to update local RCS sender as selfSubId is not valid.");
    }

    private final boolean aw(final MessagePartCoreData messagePartCoreData) {
        return Collection.EL.stream(this.v).anyMatch(new Predicate() { // from class: bcus
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                enru enruVar = bcvr.a;
                return ((MessagePartCoreData) obj).bH(MessagePartCoreData.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r0 != defpackage.eoxn.SEND_MODE_XMS_LATCH) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean ax(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvr.ax(boolean, boolean):boolean");
    }

    private final boolean ay() {
        return !this.t.isEmpty();
    }

    private final boolean az(MessagePartCoreData messagePartCoreData) {
        int k = k();
        if (((Boolean) cjja.a.e()).booleanValue()) {
            k -= C().size();
        }
        if (k >= l()) {
            return (((Boolean) cjja.a.e()).booleanValue() && messagePartCoreData.bm()) ? false : true;
        }
        return false;
    }

    public static int p(int i) {
        if (i != 20) {
            return (i == 30 || i == 40) ? 3 : 0;
        }
        return 1;
    }

    public final Stream A() {
        return Collection.EL.stream(this.v).filter(new Predicate() { // from class: bcuu
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                enru enruVar = bcvr.a;
                return !((MessagePartCoreData) obj).bm();
            }
        });
    }

    public final List B(final List list) {
        return (List) Collection.EL.stream(this.v).filter(new Predicate() { // from class: bcuv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                enru enruVar = bcvr.a;
                Stream stream = Collection.EL.stream(list);
                messagePartCoreData.getClass();
                return stream.anyMatch(new Predicate() { // from class: bcur
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return MessagePartCoreData.this.bG((Uri) obj2);
                    }
                });
            }
        }).collect(endq.a);
    }

    public final List C() {
        Stream filter = Collection.EL.stream(this.v).filter(new bcvg());
        int i = engw.d;
        return (List) filter.collect(endq.a);
    }

    public final void D(bcvm bcvmVar) {
        this.f.add(bcvmVar);
    }

    public final void E(PendingAttachmentData pendingAttachmentData, bcpu bcpuVar) {
        if (W(pendingAttachmentData, bcpuVar.b())) {
            I();
        }
        J(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0161, code lost:
    
        if (r8.matcher(r0).matches() != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(boolean r6, boolean r7, int r8, defpackage.bcvk r9, defpackage.bcpu r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvr.F(boolean, boolean, int, bcvk, bcpu):void");
    }

    public final void G() {
        H(false);
    }

    public final void H(boolean z) {
        this.r.clear();
        this.t.clear();
        this.v.clear();
        S(null);
        R(null);
        this.n = false;
        N();
        if (z) {
            J(PrivateKeyType.INVALID);
        }
    }

    public final void I() {
        this.f.fv(this);
    }

    public final void J(int i) {
        ekzz f = eleg.f("DraftMessageData::dispatchChanged");
        try {
            bcvj bcvjVar = this.w;
            if (bcvjVar != null) {
                bcvjVar.cancel(true);
                this.w = null;
            }
            this.f.b(this, i);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void K(boolean z) {
        ax(z, true);
    }

    public final void L(tys tysVar, ephg ephgVar) {
        typ typVar = (typ) tysVar;
        this.i = typVar.c != 0;
        this.M = typVar.f;
        this.N = typVar.e;
        this.j = typVar.d;
        eoxk eoxkVar = (eoxk) eoxo.a.createBuilder();
        enru enruVar = aqgi.a;
        int i = typVar.c;
        eoks eoksVar = i != 0 ? i != 1 ? i != 2 ? eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE : eoks.CONVERSATION_TYPE_GROUP_RCS : eoks.CONVERSATION_TYPE_GROUP_MMS : eoks.CONVERSATION_TYPE_ONE_ON_ONE;
        eoxkVar.copyOnWrite();
        eoxo eoxoVar = (eoxo) eoxkVar.instance;
        eoxoVar.f = eoksVar.f;
        eoxoVar.b |= 8;
        boolean z = typVar.e;
        eoxkVar.copyOnWrite();
        eoxo eoxoVar2 = (eoxo) eoxkVar.instance;
        eoxoVar2.b |= 256;
        eoxoVar2.j = z;
        eoxn a2 = aqgi.a(typVar.m);
        eoxkVar.copyOnWrite();
        eoxo eoxoVar3 = (eoxo) eoxkVar.instance;
        eoxoVar3.k = a2.e;
        eoxoVar3.b |= 512;
        if (typVar.c != 0 || typVar.e) {
            au((eoxo) eoxkVar.build());
            return;
        }
        if (ephgVar != null) {
            int q = q();
            aqgi aqgiVar = this.Z;
            if (q < 0) {
                ensk j = aqgi.a.j();
                j.Y(ente.a, "BugleDataModel");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.t, Integer.valueOf(q));
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isSubscriptionRcsAvailable", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ConversationRcsSelector.java")).q("Passing invalid subId to the rcs availability check.");
            } else {
                ensk e = aqgi.a.e();
                e.Y(ente.a, "BugleDataModel");
                enrr enrrVar2 = (enrr) e;
                enrrVar2.Y(csux.t, Integer.valueOf(q));
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/protocol/ConversationRcsSelector", "isSubscriptionRcsAvailable", 106, "ConversationRcsSelector.java")).q("Check RCS availability in convo v1.");
            }
            boolean x = ((djrv) aqgiVar.b.b()).x(q);
            eqwf eqwfVar = ((djrv) this.U.b()).d(q).a;
            ephf createBuilder = ephg.a.createBuilder(ephgVar);
            createBuilder.copyOnWrite();
            ephg ephgVar2 = (ephg) createBuilder.instance;
            ephgVar2.k = eqwfVar.N;
            ephgVar2.b |= 256;
            createBuilder.copyOnWrite();
            ephg ephgVar3 = (ephg) createBuilder.instance;
            ephgVar3.b = 1 | ephgVar3.b;
            ephgVar3.c = x;
            createBuilder.copyOnWrite();
            ephg ephgVar4 = (ephg) createBuilder.instance;
            ephgVar4.b |= 128;
            ephgVar4.j = x;
            ephg build = createBuilder.build();
            ensk e2 = a.e();
            e2.Y(ente.a, "Bugle");
            enrr enrrVar3 = (enrr) e2;
            enrrVar3.Y(csux.t, Integer.valueOf(q));
            enrrVar3.Y(csux.p, this.e);
            enrrVar3.Y(I, build);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "overwriteRcsAvailability", 1779, "DraftMessageData.java")).q("Overwrite self_rcs_available.");
            eoxkVar.copyOnWrite();
            eoxo eoxoVar4 = (eoxo) eoxkVar.instance;
            build.getClass();
            eoxoVar4.l = build;
            eoxoVar4.b |= 1024;
        } else {
            eoxo eoxoVar5 = this.J;
            if (eoxoVar5 != null && (eoxoVar5.b & 1024) != 0) {
                ephg ephgVar5 = eoxoVar5.l;
                if (ephgVar5 == null) {
                    ephgVar5 = ephg.a;
                }
                eoxkVar.copyOnWrite();
                eoxo eoxoVar6 = (eoxo) eoxkVar.instance;
                ephgVar5.getClass();
                eoxoVar6.l = ephgVar5;
                eoxoVar6.b |= 1024;
            }
        }
        au((eoxo) eoxkVar.build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (defpackage.ffkj.e(r8.y, r10.U()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r10.cE() == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.Object r9, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, defpackage.bcyk r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvr.M(java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, bcyk, android.content.Context):void");
    }

    public final void N() {
        this.y = null;
    }

    @Override // defpackage.bcyq
    public final void O(boolean z) {
        this.h = z;
        this.af.j(Boolean.valueOf(z));
    }

    public final void P(String str) {
        if (TextUtils.isEmpty(str)) {
            this.P = "text/plain";
        } else {
            this.P = str;
        }
    }

    public final void Q(Optional optional) {
        if (optional.isEmpty()) {
            this.O = Optional.empty();
        } else {
            this.O = Optional.of("\n".concat((String) optional.get()));
        }
    }

    @Override // defpackage.bcyq
    public final void R(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.m = str;
    }

    @Override // defpackage.bcyq
    public final void S(String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        if (dktk.a(this.l, str)) {
            return;
        }
        this.l = str;
        if (this.p.isEmpty()) {
            this.p = Optional.of(this.S.f());
        }
        cflw cflwVar = this.x;
        csld.a(cflwVar.b, new cflv(cflwVar, q(), emxe.b(at(str)), eldl.l(new Runnable() { // from class: bcup
            @Override // java.lang.Runnable
            public final void run() {
                bcvr.this.J(0);
            }
        })));
    }

    public final void T(final SelfIdentityId selfIdentityId, final int i) {
        if (dktk.a(aquz.b(this.Q), aquz.b(selfIdentityId)) && this.o == i) {
            return;
        }
        csjb a2 = b.a();
        a2.I("set:");
        a2.A("selfId", selfIdentityId);
        a2.m(i);
        a2.c(this.e);
        a2.r();
        this.Q = selfIdentityId;
        this.o = i;
        if (this.i) {
            if (this.h) {
                av();
            }
        } else if (!((djrv) this.U.b()).x(i)) {
            K(false);
        } else if (this.g.fu()) {
            ai(true);
        }
        this.ag.d(new Consumer() { // from class: bcux
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                enru enruVar = bcvr.a;
                ((ayhb) obj).f(SelfIdentityId.this, i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        J(8);
    }

    public final boolean U(java.util.Collection collection, String str) {
        boolean V;
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            Uri t = messagePartCoreData.t();
            if (messagePartCoreData instanceof PendingAttachmentData) {
                V = W((PendingAttachmentData) messagePartCoreData, str);
            } else if (csuu.v(t)) {
                csjb a2 = b.a();
                a2.I("adding attachment uri:");
                a2.I(t);
                a2.r();
                PendingAttachmentData d2 = this.ab.d(messagePartCoreData.V(), messagePartCoreData.t(), messagePartCoreData.v(), messagePartCoreData.c(), messagePartCoreData.b(), messagePartCoreData.k(), messagePartCoreData.N(), messagePartCoreData.ad(), messagePartCoreData.ac(), messagePartCoreData.m(), messagePartCoreData.X(), null);
                d2.h = messagePartCoreData.O();
                V = W(d2, str);
            } else {
                V = V(messagePartCoreData);
            }
            z |= V;
        }
        if (z) {
            I();
        }
        J(1);
        return !z;
    }

    public final boolean V(MessagePartCoreData messagePartCoreData) {
        csix.k(messagePartCoreData.aZ());
        boolean az = az(messagePartCoreData);
        if (aw(messagePartCoreData)) {
            return false;
        }
        if (az) {
            messagePartCoreData.ak();
            return true;
        }
        this.r.add(messagePartCoreData);
        this.v.add(messagePartCoreData);
        return false;
    }

    public final boolean W(PendingAttachmentData pendingAttachmentData, String str) {
        boolean az = az(pendingAttachmentData);
        if (az || aw(pendingAttachmentData)) {
            pendingAttachmentData.ak();
            return az;
        }
        csix.k(!this.t.contains(pendingAttachmentData));
        csix.a(0, pendingAttachmentData.k);
        this.t.add(pendingAttachmentData);
        this.v.add(pendingAttachmentData);
        pendingAttachmentData.bR();
        if (pendingAttachmentData.k == 0) {
            pendingAttachmentData.k = 1;
            bcxk bcxkVar = new bcxk(pendingAttachmentData, PendingAttachmentData.j, this, str);
            bcxkVar.e(new Void[0]);
            pendingAttachmentData.l = bcxkVar;
        }
        return false;
    }

    public final boolean X() {
        return !this.v.isEmpty();
    }

    @Override // defpackage.bcyq
    public final boolean Y(boolean z) {
        return !z ? !this.r.isEmpty() : Collection.EL.stream(this.r).anyMatch(new Predicate() { // from class: bcvc
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                enru enruVar = bcvr.a;
                return ((MessagePartCoreData) obj).I() != byza.GOOGLE_PHOTOS_LINK;
            }
        });
    }

    public final boolean Z() {
        return this.y != null;
    }

    @Override // defpackage.appw
    public final /* synthetic */ engw a() {
        int i = engw.d;
        return enou.a;
    }

    public final boolean aa() {
        bcvj bcvjVar = this.w;
        return (bcvjVar == null || bcvjVar.isCancelled()) ? false : true;
    }

    public final boolean ab() {
        return TextUtils.isEmpty(this.l) && this.r.isEmpty() && TextUtils.isEmpty(this.m) && this.y == null;
    }

    public final boolean ac() {
        return this.h && this.i;
    }

    public final boolean ad() {
        if (this.h) {
            return false;
        }
        if (!aA()) {
            ekzz f = eleg.f("DraftMessageData::requiresMmsForContent");
            try {
                if (!this.n && TextUtils.isEmpty(this.m) && !this.x.c()) {
                    if (!Y(true)) {
                        f.close();
                    } else if (((djrv) this.U.b()).x(q())) {
                        int d2 = this.T.d();
                        f.close();
                        if (d2 != 1) {
                        }
                    }
                    return false;
                }
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return true;
    }

    public final boolean ae() {
        eoxo eoxoVar = this.J;
        if (eoxoVar == null) {
            return false;
        }
        aqgi aqgiVar = this.Z;
        eoks b2 = eoks.b(eoxoVar.f);
        if (b2 == null) {
            b2 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        if (b2 == eoks.CONVERSATION_TYPE_GROUP_RCS || eoxoVar.j) {
            return true;
        }
        eoxn b3 = eoxn.b(eoxoVar.k);
        if (b3 == null) {
            b3 = eoxn.UNKNOWN_SEND_MODE;
        }
        if (!aqgi.g(b3)) {
            return false;
        }
        boolean z = eoxoVar.j;
        int i = eoxoVar.f;
        eoks b4 = eoks.b(i);
        if (b4 == null) {
            b4 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        eoks eoksVar = eoks.CONVERSATION_TYPE_GROUP_RCS;
        eoks b5 = eoks.b(i);
        if (b5 == null) {
            b5 = eoks.UNKNOWN_BUGLE_CONVERSATION_TYPE;
        }
        eoks eoksVar2 = eoks.CONVERSATION_TYPE_ONE_ON_ONE;
        if (z || b4 == eoksVar) {
            return true;
        }
        if (b5 != eoksVar2 || (eoxoVar.b & 1024) == 0) {
            return false;
        }
        ephg ephgVar = eoxoVar.l;
        if (ephgVar == null) {
            ephgVar = ephg.a;
        }
        return aqgiVar.e(ephgVar);
    }

    public final boolean af() {
        return this.Z.f(z());
    }

    public final boolean ag() {
        return (this.h || ad()) ? false : true;
    }

    public final boolean ah(MessagePartCoreData messagePartCoreData) {
        return (messagePartCoreData.bo() || messagePartCoreData.bD()) && this.h && messagePartCoreData.N() != eohh.FILE_CHOOSER;
    }

    public final boolean ai(boolean z) {
        boolean z2 = true;
        if (!this.i && !this.N) {
            z2 = false;
        }
        return ax(z, z2);
    }

    public final boolean aj(boolean z) {
        boolean anyMatch = Collection.EL.stream(this.v).anyMatch(new Predicate() { // from class: bcvd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).bp();
            }
        });
        bcvo bcvoVar = new bcvo(anyMatch, z);
        csjb a2 = b.a();
        a2.I("updateLocationSupportConditions");
        a2.c(this.e);
        a2.B("hasLocationAttachment", anyMatch);
        a2.B("locationPushSupported", z);
        a2.r();
        this.L.set(bcvoVar);
        return !bcvoVar.a || bcvoVar.b;
    }

    public final void ak() {
        csjb e = b.e();
        e.I("draft not loaded.");
        e.c(this.e);
        e.r();
    }

    public final void al(final List list) {
        Predicate predicate = new Predicate() { // from class: bcve
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                enru enruVar = bcvr.a;
                Stream stream = Collection.EL.stream(list);
                messagePartCoreData.getClass();
                return stream.anyMatch(new bcva(messagePartCoreData));
            }
        };
        engw as = as(predicate, this.r);
        if (as.size() == list.size()) {
            as.size();
        } else {
            as(predicate, this.t).size();
            as.size();
        }
    }

    public final void am(bcvm bcvmVar) {
        this.f.remove(bcvmVar);
    }

    public final void an(MessagePartCoreData messagePartCoreData) {
    }

    @Override // defpackage.appw, defpackage.appj
    public final /* synthetic */ String b() {
        return "text/plain";
    }

    @Override // defpackage.appw
    public final String c() {
        return emxe.b(this.l);
    }

    @Override // defpackage.appz
    public final String d() {
        return emxe.b(this.m);
    }

    @Override // defpackage.appz
    public final boolean e() {
        return this.n;
    }

    @Override // defpackage.bcpr
    protected final void h() {
        this.f.clear();
    }

    @Override // defpackage.bcyq
    public final int k() {
        return this.v.size();
    }

    public final int l() {
        return (this.h || ag()) ? aq() : ap();
    }

    public final int m() {
        ekzz f = eleg.f("DraftMessageData::getDraftMessageType");
        try {
            int ao = ao(ad());
            f.close();
            return ao;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int n() {
        return ao(this.h ? false : aA());
    }

    public final int o() {
        return p(m());
    }

    public final int q() {
        bcvn bcvnVar = this.g;
        this.o = bcvnVar == null ? -1 : bcvnVar.a();
        if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
            csjb d2 = b.d();
            d2.I("getSelfSubId");
            d2.y("selfSubId", this.o);
            d2.r();
        }
        return this.o;
    }

    public final int r(MessagePartCoreData messagePartCoreData) {
        Iterator it = this.v.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MessagePartCoreData) it.next()).bH(messagePartCoreData)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final long s() {
        return A().mapToLong(new ToLongFunction() { // from class: bcut
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                return ermr.e(messagePartCoreData.bQ(), messagePartCoreData.p(), 0);
            }
        }).sum();
    }

    public final SelfIdentityId t() {
        if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
            csjb d2 = b.d();
            d2.I("getSelfId");
            d2.A("selfId", this.Q);
            d2.r();
        }
        return this.Q;
    }

    public final MessageCoreData u(boolean z) {
        MessageCoreData i;
        ekzz f = eleg.f("DraftMessageData::createMessageWithCurrentAttachments");
        try {
            if (this.h) {
                i = this.ac.h(this.e, this.Q, ar(), this.l, this.P, null);
                if (this.j) {
                    i.by();
                }
            } else if (ad()) {
                i = this.ac.g(this.e, this.Q, this.l, this.m, this.n);
            } else if (this.r.isEmpty()) {
                i = this.ac.i(this.e, this.Q, this.l);
            } else {
                try {
                    i = this.ac.e(this.e, this.Q, this.l, ar());
                } catch (RuntimeException e) {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "createMessageWithCurrentAttachments", (char) 622, "DraftMessageData.java")).q("failed to draft as sms link file transfer, drafting without chat endpoint instead");
                    i = this.ac.i(this.e, this.Q, this.l);
                }
            }
            ArrayList arrayList = new ArrayList(this.r.size());
            Iterator it = this.r.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessagePartCoreData) it.next()).D());
            }
            ((MessageData) i).i.addAll(0, arrayList);
            ((MessageData) i).m = this.y;
            if (z) {
                H(true);
            }
            f.close();
            return i;
        } finally {
        }
    }

    public final MessageCoreData v(long j) {
        return w(j, true);
    }

    public final MessageCoreData w(long j, boolean z) {
        ekzz f = eleg.f("DraftMessageData::prepareMessageForSending");
        try {
            csix.k(!ay());
            this.l = at(this.l);
            MessageCoreData u = u(z);
            u.cf(u.z(), u.u(), j);
            ((MessageData) u).p = z();
            f.close();
            return u;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final MessagePartCoreData x(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        engw as = as(new bcva(messagePartCoreData), this.r);
        if (as.isEmpty()) {
            as = as(new bcva(messagePartCoreData), this.t);
        }
        return (MessagePartCoreData) Collection.EL.stream(as).findFirst().orElse(null);
    }

    public final eoks y() {
        ekzz f = eleg.f("DraftMessageData::getConversationType");
        try {
            eoks eoksVar = ac() ? eoks.CONVERSATION_TYPE_GROUP_RCS : this.i ? eoks.CONVERSATION_TYPE_GROUP_MMS : eoks.CONVERSATION_TYPE_ONE_ON_ONE;
            csjb a2 = b.a();
            a2.I("messageConversationType:");
            a2.I(eoksVar);
            a2.r();
            f.close();
            return eoksVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bcyq
    public final eoxo z() {
        eoxo eoxoVar;
        ekzz f = eleg.f("DraftMessageData::getDraftProtocolConditions");
        try {
            bcvo bcvoVar = (bcvo) this.L.get();
            if (this.J == null && this.K == null && bcvoVar == null) {
                eoxoVar = null;
            } else {
                eoxk eoxkVar = (eoxk) eoxo.a.createBuilder();
                boolean z = !this.v.isEmpty();
                eoxkVar.copyOnWrite();
                eoxo eoxoVar2 = (eoxo) eoxkVar.instance;
                eoxoVar2.b |= 16384;
                eoxoVar2.p = z;
                eoxo eoxoVar3 = this.J;
                if (eoxoVar3 != null) {
                    eoxkVar.mergeFrom((eoxk) eoxoVar3);
                }
                eoze eozeVar = this.K;
                if (eozeVar != null) {
                    eoxkVar.copyOnWrite();
                    eoxo eoxoVar4 = (eoxo) eoxkVar.instance;
                    eoxoVar4.m = eozeVar;
                    eoxoVar4.b |= 2048;
                }
                if (bcvoVar != null) {
                    boolean z2 = bcvoVar.a;
                    eoxkVar.copyOnWrite();
                    eoxo eoxoVar5 = (eoxo) eoxkVar.instance;
                    eoxoVar5.b |= 4096;
                    eoxoVar5.n = z2;
                    boolean z3 = bcvoVar.b;
                    eoxkVar.copyOnWrite();
                    eoxo eoxoVar6 = (eoxo) eoxkVar.instance;
                    eoxoVar6.b |= 8192;
                    eoxoVar6.o = z3;
                }
                eoxoVar = (eoxo) eoxkVar.build();
            }
            f.close();
            return eoxoVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
