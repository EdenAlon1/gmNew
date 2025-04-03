package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbi {
    public final emyl A;
    public final ffbr B;
    public final cpza C;
    private final dtuu F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final covo J;
    private final ffbr K;
    private final byzp L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final emyl P;
    private final ffbr Q;
    private final asne R;
    private final ffbr S;
    private final ffbr T;
    private final ffbr U;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final Set i;
    public final Set k;
    public final ffbr l;
    public final ffbr m;
    public final cnjp n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final coxk u;
    public final cozl v;
    public final cbgf w;
    public final ffbr x;
    public final ffbr y;
    public final ffbr z;
    public static final cskc a = cskc.g("Bugle", "SyncMessageBatch");
    private static final entd D = entd.c("Bugle");
    static final cfva b = cfvl.q(132812332);
    static final emyl c = cfvl.w("log_duplicate_rcs_message_id_event_in_sync_message_batch");
    public final HashSet d = new HashSet();
    private final cpn E = new cpn();
    public final HashSet j = new HashSet();

    public cqbi(cnjp cnjpVar, covo covoVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, coxk coxkVar, cozl cozlVar, cbgf cbgfVar, ffbr ffbrVar7, byzp byzpVar, dtuu dtuuVar, ffbr ffbrVar8, final ctud ctudVar, final ctwb ctwbVar, ffbr ffbrVar9, ffbr ffbrVar10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Set set, Set set2, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, cpza cpzaVar, asne asneVar, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22) {
        this.n = cnjpVar;
        this.J = covoVar;
        this.o = ffbrVar;
        this.p = ffbrVar2;
        this.r = ffbrVar4;
        this.q = ffbrVar3;
        this.s = ffbrVar5;
        this.t = ffbrVar6;
        this.u = coxkVar;
        this.v = cozlVar;
        this.w = cbgfVar;
        this.K = ffbrVar7;
        this.L = byzpVar;
        this.F = dtuuVar;
        this.G = ffbrVar8;
        this.M = ffbrVar9;
        this.x = ffbrVar10;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = arrayList4;
        this.i = set;
        this.k = set2;
        this.H = ffbrVar11;
        this.l = ffbrVar12;
        this.I = ffbrVar13;
        this.N = ffbrVar14;
        this.y = cpzaVar.a;
        this.O = ffbrVar15;
        this.z = ffbrVar16;
        this.m = ffbrVar17;
        this.B = ffbrVar18;
        this.Q = ffbrVar19;
        this.C = cpzaVar;
        this.R = asneVar;
        this.S = ffbrVar20;
        this.T = ffbrVar21;
        this.U = ffbrVar22;
        this.P = emys.a(new emyl() { // from class: cqbe
            @Override // defpackage.emyl
            public final Object get() {
                if (((Boolean) cqbi.b.e()).booleanValue()) {
                    return ctud.this.l() ? ctwbVar.j().n() : "default_device_id";
                }
                return null;
            }
        });
        this.A = emys.a(new emyl() { // from class: cqbf
            /* JADX WARN: Type inference failed for: r2v4, types: [aoku, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v2, types: [aoku, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = cqbi.a;
                engr engrVar = new engr();
                Iterator it = ctwb.this.m().iterator();
                while (it.hasNext()) {
                    Optional k = ((ctwi) it.next()).k(true);
                    if (!k.isEmpty() && !TextUtils.isEmpty(k.get().n())) {
                        engrVar.h(k.get().n());
                    }
                }
                return engrVar.g();
            }
        });
    }

    public static boolean f(Map map, coux couxVar) {
        return Boolean.TRUE.equals(map.get(couxVar.a));
    }

    public static cqdh g(cqdh cqdhVar) {
        return cqdhVar == null ? new cqdh(byyt.ARCHIVED, false, false, "", 0, -1L) : new cqdh(byyt.ARCHIVED, cqdhVar.b, cqdhVar.c, cqdhVar.d, cqdhVar.e, cqdhVar.f);
    }

    private final SelfIdentityId h(final int i) {
        ffbr ffbrVar = new ffbr() { // from class: cqbh
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                enru enruVar = bdqu.a;
                int i2 = i;
                csix.k(i2 != -2);
                String[] strArr = ParticipantsTable.a;
                bvpp bvppVar = new bvpp();
                bdqu.u(bvppVar);
                bvppVar.T(i2);
                bvppVar.S(-1);
                bvppVar.R(null);
                bvppVar.I(null);
                bvppVar.q(null);
                bvppVar.u(null);
                bvppVar.t(null);
                bvppVar.N(null);
                bvppVar.l(-1L);
                bvppVar.D(null);
                bvppVar.e(false);
                bvppVar.U(0);
                bvppVar.V(null);
                return ((bdrr) cqbi.this.o.b()).i(bvppVar.a());
            }
        };
        cpza cpzaVar = this.C;
        return aqvf.b((String) cpza.e(cpzaVar, cpzaVar.c, Integer.valueOf(i), ffbrVar, "selfDestinationCache", null, null, 48));
    }

    private final ConversationIdType i(coux couxVar) {
        return j(couxVar, false);
    }

    private final ConversationIdType j(coux couxVar, boolean z) {
        long j = couxVar.i;
        int i = couxVar.q;
        cqdh b2 = b(j);
        String str = couxVar.a;
        emyw.e(str);
        return this.v.d(j, i, b2, str, byyt.b(false), z);
    }

    private final String k(int i, aoku aokuVar) {
        String n = aokuVar.n();
        n.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) this.E.get(n);
        if (bindData == null) {
            cfva cfvaVar = aoqm.a;
            bvpo g = ((Boolean) new aooq().get()).booleanValue() ? bdqu.g(i, aokuVar) : bdqu.i(i, n);
            ((bdrr) this.o.b()).k(g, true);
            cpn cpnVar = this.E;
            bindData = g.a();
            cpnVar.put(n, bindData);
        }
        return bindData.S();
    }

    private final String l(final int i, final String str) {
        ffbr ffbrVar = new ffbr() { // from class: cqbb
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                bvpo i2 = bdqu.i(i, str);
                ((bdrr) cqbi.this.o.b()).k(i2, true);
                return i2.a().S();
            }
        };
        str.getClass();
        String str2 = i + "::" + str;
        final cpza cpzaVar = this.C;
        return (String) cpza.e(cpzaVar, cpzaVar.d, str2, ffbrVar, "participantCache", new ffji() { // from class: cpyz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String str3 = (String) obj;
                str3.getClass();
                return cpza.this.c(str3);
            }
        }, null, 32);
    }

    private final void m(int i) {
        ((akzt) this.T.b()).e("Bugle.Telephony.ForwardSync.SyncMessageBatch.ThirdPartyOrLegacyMessageCount", i);
    }

    private static boolean n(ckex ckexVar) {
        ckbd ckbdVar = (ckbd) ckexVar;
        return ckbdVar.e.isPresent() && (((ckbn) ckbdVar.e.get()).b & 1) != 0;
    }

    public final ConversationIdType a(final covb covbVar) {
        final aoku aokuVar;
        aoku aokuVar2 = covbVar.c;
        if (aokuVar2 == null || aokuVar2.E()) {
            final cpxu cpxuVar = new cpxu(covbVar.i);
            final cpza cpzaVar = this.C;
            aokuVar = (aoku) cpza.e(cpzaVar, cpzaVar.e, cpxuVar, new ffbr() { // from class: cqar
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    final cqbi cqbiVar = cqbi.this;
                    coxk coxkVar = cqbiVar.u;
                    cpxu cpxuVar2 = cpxuVar;
                    List K = cqbiVar.u.K(emxe.b(coxkVar.I(cpxuVar2)));
                    if (K.size() != 1) {
                        csjb e = cqbi.a.e();
                        e.I("Thread ID had an SMS message but had 0 or multiple recipients");
                        e.A("threadId", cpxuVar2);
                        e.y("recipients.size()", K.size());
                        e.r();
                    }
                    return (aoku) Collection.EL.stream(K).findFirst().orElseGet(new Supplier() { // from class: cqal
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return ((aolr) cqbi.this.y.b()).f();
                        }
                    });
                }
            }, "firstRecipientForThreadCache", null, new ffji() { // from class: cpyt
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    aoku aokuVar3 = (aoku) obj;
                    aokuVar3.getClass();
                    return cpza.this.c(aokuVar3.toString());
                }
            }, 16);
        } else {
            aokuVar = covbVar.c;
        }
        cfva cfvaVar = aoqm.a;
        ((Boolean) new aoou().get()).booleanValue();
        aokuVar.p(false);
        return ((ayif) this.H.b()).a(aokuVar, new ffbr() { // from class: cqay
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                cqbi cqbiVar = cqbi.this;
                covb covbVar2 = covbVar;
                cqdh b2 = cqbiVar.b(covbVar2.i);
                cpxu b3 = cpxu.b(covbVar2.i);
                if (b3.c() && cqbiVar.u.W(b3)) {
                    b2 = cqbi.g(b2);
                }
                aoku aokuVar3 = aokuVar;
                return ((cpye) cqbiVar.l.b()).d(b2, aokuVar3, covbVar2.m, new cpxu(covbVar2.i), true);
            }
        }).C();
    }

    public final cqdh b(long j) {
        if (!((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            return ((coxg) this.G.b()).b(j);
        }
        cno cnoVar = ((cqdi) this.N.b()).a;
        if (cnoVar != null) {
            return (cqdh) cnoVar.d(j);
        }
        return null;
    }

    public final void c(final covb covbVar, boolean z) {
        final ConversationIdType d;
        aoku aokuVar = covbVar.c;
        if (aokuVar == null || aokuVar.x()) {
            a.r("SMS has no address; using unknown sender");
            covbVar.c = ((aolr) this.y.b()).f();
            ((akzt) this.x.b()).c("Bugle.Telephony.ForwardSync.EmptySmsAddress");
        }
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            String str = covbVar.d;
            if (str != null) {
                final cpza cpzaVar = this.C;
                final ffbr ffbrVar = new ffbr() { // from class: cqap
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return cqbi.this.a(covbVar);
                    }
                };
                final engw r = engw.r(str);
                r.getClass();
                String engiVar = r.toString();
                engiVar.getClass();
                final fflb fflbVar = new fflb();
                d = (ConversationIdType) cpza.e(cpzaVar, cpzaVar.b, engiVar, new ffbr() { // from class: cpyq
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        TreeSet treeSet = new TreeSet();
                        ffdx.aB(r, treeSet);
                        String obj = treeSet.toString();
                        fflb fflbVar2 = fflb.this;
                        fflbVar2.a = obj;
                        ConversationIdType conversationIdType = (ConversationIdType) cpzaVar.b.get(fflbVar2.a);
                        return conversationIdType == null ? ffbrVar.b() : conversationIdType;
                    }
                }, "conversationIdCache-unsorted", new ffji() { // from class: cpyr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str2 = (String) obj;
                        str2.getClass();
                        return cpza.this.c(str2);
                    }
                }, null, 32);
                String str2 = (String) fflbVar.a;
                if (str2 != null) {
                }
            } else {
                d = a(covbVar);
            }
        } else {
            cozl cozlVar = this.v;
            long j = covbVar.i;
            d = cozlVar.d(j, covbVar.m, b(j), covbVar.b, byyt.b(false), false);
        }
        ConversationIdType conversationIdType = d;
        if (conversationIdType.b()) {
            csjb b2 = a.b();
            b2.I("Failed to create conversation for SMS thread");
            b2.H(covbVar.i);
            b2.r();
            return;
        }
        int i = covbVar.m;
        SelfIdentityId h = h(i);
        final MessageCoreData n = this.L.n(covbVar.b, z ? ((SelfIdentityIdImpl) h).a : !cuxt.i(covbVar.d) ? l(i, covbVar.d) : k(i, covbVar.c), h, conversationIdType, cpdg.b(z, covbVar.h, covbVar.j), covbVar.l, covbVar.k, covbVar.g, covbVar.f, covbVar.e);
        if (((auxc) this.U.b()).a()) {
            covbVar.f().ifPresent(new Consumer() { // from class: cqaq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = cqbi.a;
                    MessageCoreData.this.bA(Optional.of((UUID) obj));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        try {
            ((bdjr) this.M.b()).d(n, true, Optional.ofNullable((String) this.P.get()));
        } catch (SQLiteConstraintException unused) {
        }
        csjb d2 = a.d();
        d2.I("Inserted new SMS message.");
        d2.d(n.B());
        d2.A("smsMessageUri", n.u());
        d2.z("receivedTimeStamp", n.o());
        d2.A("messagePersistenceId", n.ad());
        d2.r();
        this.d.add(conversationIdType);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:6|(2:8|(12:12|(1:14)(1:216)|15|16|17|(6:19|(1:21)(1:38)|22|(3:24|(1:26)(1:33)|27)(2:34|(1:36)(1:37))|28|(1:32))|39|(1:41)|42|(1:44)|45|(1:47)(2:150|(11:152|(2:200|(6:204|155|(6:168|(3:170|(2:172|(1:174))(2:190|(1:192)(1:193))|175)(2:194|(2:196|(1:198))(1:199))|176|177|178|179)|158|(2:162|(1:166))|167))|154|155|(0)|168|(0)(0)|176|177|178|179)(5:205|(2:207|(2:209|(2:211|(2:213|(1:215)))))|158|(3:160|162|(2:164|166))|167))))|217|218|(1:220)(1:247)|221|(2:228|(1:230)(14:(1:232)(1:246)|233|(4:235|236|237|238)|241|242|(1:244)|17|(0)|39|(0)|42|(0)|45|(0)(0)))(1:227)|16|17|(0)|39|(0)|42|(0)|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00f7, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05f8  */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final defpackage.coux r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqbi.d(coux, boolean):void");
    }

    public final void e() {
        HashMap hashMap;
        boolean z;
        ekzz f = eleg.f("SyncMessageBatch#updateLocalDatabase");
        try {
            ecri d = ((ecrj) this.Q.b()).d();
            ecrh ecrhVar = ecrh.ERROR;
            try {
                cskc cskcVar = a;
                csjb c2 = cskcVar.c();
                c2.I("synchronizing.");
                c2.O("threadsToMerge", this.k);
                c2.O("smsToAdd", this.e);
                c2.O("mmsToAdd", this.f);
                c2.O("messagesToDelete", this.h);
                c2.r();
                if (cskcVar.t(2)) {
                    ArrayList arrayList = this.h;
                    int i = 0;
                    for (int size = arrayList.size(); i < size; size = size) {
                        couu couuVar = (couu) arrayList.get(i);
                        csjb d2 = a.d();
                        d2.I("Deleted message.");
                        d2.A("localId", couuVar.d);
                        d2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, couuVar.b);
                        d2.z("timestamp", couuVar.c);
                        d2.r();
                        i++;
                    }
                }
                final HashMap hashMap2 = new HashMap();
                ArrayList arrayList2 = this.f;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    coux couxVar = (coux) arrayList2.get(i2);
                    String str = couxVar.a;
                    if (str != null) {
                        if (TextUtils.isEmpty(couxVar.o)) {
                            hashMap = hashMap2;
                            if (this.v.a(coto.a, couxVar.i, str).h != null) {
                                z = true;
                                hashMap2 = hashMap;
                                hashMap2.put(str, Boolean.valueOf(z));
                            }
                        } else {
                            hashMap = hashMap2;
                        }
                        z = false;
                        hashMap2 = hashMap;
                        hashMap2.put(str, Boolean.valueOf(z));
                    }
                }
                this.F.d("SyncMessageBatch#updateLocalDatabase", new Runnable() { // from class: cqao
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map;
                        boolean z2;
                        ekzz f2;
                        ekzz f3;
                        String str2;
                        String str3;
                        final cqbi cqbiVar = cqbi.this;
                        for (cpzh cpzhVar : cqbiVar.k) {
                            long a2 = cpzhVar.a();
                            cpbd b2 = cpzhVar.b();
                            ConversationIdType m = ((bczy) cqbiVar.p.b()).m(a2);
                            byyt s = ((bczy) cqbiVar.p.b()).s(m);
                            if (s == null) {
                                s = byyt.UNARCHIVED;
                            }
                            byyt byytVar = s;
                            ConversationIdType conversationIdType = bdgq.a;
                            try {
                                conversationIdType = ((bdgb) cqbiVar.s.b()).c(covk.a, b2, byytVar, -1).a();
                            } catch (cpbe e) {
                                cqbi.a.o("Mismatched threads", e);
                            }
                            cqbiVar.u.ad(a2, b2.a);
                            if (!m.b()) {
                                csjb e2 = cqbi.a.e();
                                e2.I("Moving messages from");
                                e2.c(m);
                                e2.I("to");
                                e2.c(conversationIdType);
                                e2.r();
                                ((bdes) cqbiVar.r.b()).a(m, conversationIdType, byytVar);
                            }
                            cqbiVar.d.add(conversationIdType);
                        }
                        ArrayList arrayList3 = cqbiVar.e;
                        int size3 = arrayList3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            covb covbVar = (covb) arrayList3.get(i3);
                            if (covbVar.e == null) {
                                csjb e3 = cqbi.a.e();
                                e3.I("SMS message has no body; add empty one.");
                                e3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, covbVar.b);
                                e3.r();
                                covbVar.e = "";
                            }
                            boolean z3 = covbVar.h != 1;
                            if (covbVar.b == null || z3) {
                                cqbiVar.c(covbVar, z3);
                            } else {
                                cnjp cnjpVar = cqbiVar.n;
                                String str4 = covbVar.e;
                                if (!TextUtils.isEmpty(str4)) {
                                    engw engwVar = cnjpVar.b;
                                    int size4 = engwVar.size();
                                    int i4 = 0;
                                    while (i4 < size4) {
                                        boolean f4 = ((cnjo) engwVar.get(i4)).f(str4);
                                        i4++;
                                        if (f4) {
                                            cqbiVar.u.a(Uri.parse(covbVar.b), "Bugle.Telephony.Delete.Message.Latency");
                                            String str5 = covbVar.b;
                                            int a3 = cqbiVar.u.a(Uri.parse(str5), "Bugle.Telephony.Delete.Message.Latency");
                                            csjb c3 = cqbi.a.c();
                                            c3.I("Ignored SMS message deleted.");
                                            c3.y("count", a3);
                                            c3.A("messageUri", str5);
                                            c3.r();
                                            break;
                                        }
                                    }
                                }
                                cqbiVar.c(covbVar, false);
                            }
                            i3++;
                        }
                        for (cpzg cpzgVar : cqbiVar.i) {
                            couu b3 = cpzgVar.b();
                            String d3 = cpzgVar.a().d();
                            if (!emxe.c(d3)) {
                                String[] strArr = MessagesTable.a;
                                buxr buxrVar = new buxr();
                                buxrVar.ap("associateMessages");
                                buxrVar.S(Uri.parse(d3));
                                buxz buxzVar = new buxz();
                                buxzVar.q(b3.d);
                                buxrVar.X(buxzVar);
                                buxrVar.b().e();
                            }
                        }
                        ArrayList arrayList4 = cqbiVar.g;
                        int size5 = arrayList4.size();
                        int i5 = 0;
                        while (true) {
                            map = hashMap2;
                            if (i5 >= size5) {
                                break;
                            }
                            coux couxVar2 = (coux) arrayList4.get(i5);
                            cqbiVar.d(couxVar2, cqbi.f(map, couxVar2));
                            i5++;
                        }
                        ArrayList arrayList5 = cqbiVar.f;
                        int size6 = arrayList5.size();
                        for (int i6 = 0; i6 < size6; i6++) {
                            coux couxVar3 = (coux) arrayList5.get(i6);
                            cqbiVar.d(couxVar3, cqbi.f(map, couxVar3));
                        }
                        ArrayList arrayList6 = cqbiVar.h;
                        int size7 = arrayList6.size();
                        for (int i7 = 0; i7 < size7; i7++) {
                            couu couuVar2 = (couu) arrayList6.get(i7);
                            cqbiVar.w.l(couuVar2.e, couuVar2.d, new String[0]);
                            cqbiVar.d.add(couuVar2.e);
                        }
                        ArrayList arrayList7 = cqbiVar.h;
                        int size8 = arrayList7.size();
                        final MessageIdType[] messageIdTypeArr = new MessageIdType[size8];
                        for (int i8 = 0; i8 < size8; i8++) {
                            messageIdTypeArr[i8] = ((couu) arrayList7.get(i8)).d;
                        }
                        final int i9 = 0;
                        while (i9 < size8) {
                            final int min = Math.min(size8, i9 + 128);
                            String[] strArr2 = MessagesTable.a;
                            buxh buxhVar = new buxh();
                            buxhVar.f("batchDeleteMessages");
                            buxhVar.c(new Function() { // from class: cqbc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    buxz buxzVar2 = (buxz) obj;
                                    cskc cskcVar2 = cqbi.a;
                                    buxzVar2.v((MessageIdType[]) Arrays.copyOfRange(messageIdTypeArr, i9, min));
                                    return buxzVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            buxhVar.d();
                            i9 = min + 1;
                        }
                        if (cqbi.a.t(2)) {
                            ArrayList arrayList8 = cqbiVar.h;
                            int size9 = arrayList8.size();
                            for (int i10 = 0; i10 < size9; i10++) {
                                couu couuVar3 = (couu) arrayList8.get(i10);
                                csjb d4 = cqbi.a.d();
                                d4.I("Deleted message.");
                                d4.A("localId", couuVar3.d);
                                d4.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, couuVar3.b);
                                d4.z("timestamp", couuVar3.c);
                                d4.r();
                            }
                        }
                        Iterator it = cqbiVar.d.iterator();
                        while (it.hasNext()) {
                            ConversationIdType conversationIdType2 = (ConversationIdType) it.next();
                            if (!((cgpv) cqbiVar.t.b()).g(conversationIdType2)) {
                                byyt b4 = byyt.b(false);
                                if (!((Boolean) ayhv.a.e()).booleanValue() || cqbiVar.j.contains(conversationIdType2)) {
                                    if (((Boolean) ayhv.a.e()).booleanValue()) {
                                        final cpxu a4 = ((ayfi) cqbiVar.m.b()).a(conversationIdType2);
                                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                        cpza cpzaVar = cqbiVar.C;
                                        ffbr ffbrVar = new ffbr() { // from class: cqbg
                                            @Override // defpackage.ffbr, defpackage.ffbq
                                            public final Object b() {
                                                atomicBoolean.set(true);
                                                return byyt.b(cqbi.this.u.W(a4));
                                            }
                                        };
                                        a4.getClass();
                                        b4 = true != atomicBoolean.get() ? null : (byyt) cpza.e(cpzaVar, cpzaVar.f, a4, ffbrVar, "threadArchiveStatusCache", null, null, 48);
                                    } else {
                                        b4 = byyt.b(cqbiVar.v.c(conversationIdType2));
                                    }
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                ((bdfl) cqbiVar.q.b()).a(conversationIdType2, true, true == z2 ? b4 : null);
                                if (((Boolean) ((cfup) ckey.a.get()).e()).booleanValue()) {
                                    f2 = eleg.f("SyncMessageBatch#updateConversationMmsOrRcs");
                                    try {
                                        efbd.b();
                                        bseh r = ((bczy) cqbiVar.p.b()).r(conversationIdType2);
                                        if (r == null) {
                                            cqbi.a.n(String.format("Skip updating conversation %s. Conversation is null", conversationIdType2));
                                        } else if (r.k() == 2) {
                                            MessageCoreData n = ((bdmq) cqbiVar.z.b()).n(conversationIdType2);
                                            f3 = eleg.f("SyncMessageBatch#updateConversationRcsConferenceUri");
                                            try {
                                                efbd.b();
                                                ConversationIdType C = r.C();
                                                if (!TextUtils.isEmpty(r.ac())) {
                                                    cqbi.a.m(String.format("Skipping updating RCS conference URI for conversation %s. Conference URI is already present: %s", C, r.ac()));
                                                } else if (n == null) {
                                                    cqbi.a.m(String.format("Skipping updating RCS conference URI for conversation %s. No messages in the conversation", C));
                                                } else {
                                                    String av = n.av();
                                                    if (TextUtils.isEmpty(av)) {
                                                        csjb a5 = cqbi.a.a();
                                                        a5.I("Skipping updating RCS conference URI, last message has empty transaction ID");
                                                        a5.c(C);
                                                        a5.r();
                                                    } else {
                                                        ckex c4 = ckey.c(av);
                                                        if (c4 == null) {
                                                            csjb a6 = cqbi.a.a();
                                                            a6.I("Skipping updating RCS conference URI, parsed transaction ID is null");
                                                            a6.c(C);
                                                            a6.r();
                                                        } else {
                                                            if (((ckbd) c4).c.isPresent() && ((ckbt) ((ckbd) c4).c.get()).c == 2) {
                                                                Object obj = ((ckbd) c4).c.get();
                                                                str2 = (((ckbt) obj).c == 2 ? (ckbr) ((ckbt) obj).d : ckbr.a).d;
                                                            } else if (((ckbd) c4).b.isPresent()) {
                                                                str2 = ((ckba) ((ckbd) c4).b.get()).a;
                                                            } else {
                                                                csjb a7 = cqbi.a.a();
                                                                a7.I("Skipping updating RCS conference URI, not present in parsed transaction ID");
                                                                a7.c(C);
                                                                a7.r();
                                                            }
                                                            String[] strArr3 = bsom.a;
                                                            bsoe bsoeVar = new bsoe();
                                                            bsoeVar.ap("updateConversationRcsConferenceUri2");
                                                            bsoeVar.N(str2);
                                                            bsoeVar.f(C);
                                                        }
                                                    }
                                                }
                                                f3.close();
                                            } finally {
                                            }
                                        } else if (r.k() == 1) {
                                            MessageCoreData p = ((bdmq) cqbiVar.z.b()).p(conversationIdType2);
                                            f3 = eleg.f("SyncMessageBatch#updateConversationMmsGroupName");
                                            try {
                                                efbd.b();
                                                ConversationIdType C2 = r.C();
                                                if (p == null) {
                                                    cqbi.a.m(String.format("Skipping updating MMS group name for conversation %s. No messages in the conversation", C2));
                                                } else {
                                                    String av2 = p.av();
                                                    if (TextUtils.isEmpty(av2)) {
                                                        csjb a8 = cqbi.a.a();
                                                        a8.I("Skipping updating MMS group name, last message has empty transaction ID");
                                                        a8.c(C2);
                                                        a8.r();
                                                    } else {
                                                        ckex c5 = ckey.c(av2);
                                                        if (c5 == null) {
                                                            csjb d5 = cqbi.a.d();
                                                            d5.I("Skipping updating MMS group name, parsed transaction ID is null");
                                                            d5.c(C2);
                                                            d5.r();
                                                        } else if (((ckbd) c5).e.isPresent() && !((ckbn) ((ckbd) c5).e.get()).d.isEmpty() && r.H() == byyy.NAME_IS_AUTOMATIC) {
                                                            ((bczy) cqbiVar.p.b()).V(C2, ((ckbn) ((ckbd) c5).e.get()).d, 1, false);
                                                            ((akzt) cqbiVar.x.b()).e("Bugle.Telephony.ForwardSync.MmsGroupNameRestore", p.d());
                                                        } else {
                                                            csjb a9 = cqbi.a.a();
                                                            a9.I("Skipping updating MMS group name, not present in parsed transaction ID");
                                                            a9.c(C2);
                                                            a9.r();
                                                        }
                                                    }
                                                }
                                                f3.close();
                                            } finally {
                                            }
                                        }
                                        f2.close();
                                    } finally {
                                    }
                                } else {
                                    f2 = eleg.f("SyncMessageBatch#updateConversationRcsConferenceUri");
                                    try {
                                        efbd.b();
                                        bseh r2 = ((bczy) cqbiVar.p.b()).r(conversationIdType2);
                                        if (r2 == null) {
                                            cqbi.a.n(String.format("Skipping updating RCS conference URI for conversation %s. Conversation is null", conversationIdType2));
                                        } else if (r2.k() != 2) {
                                            cqbi.a.m(String.format("Skipping updating RCS conference URI for conversation %s. Conversation is not RCS group", conversationIdType2));
                                        } else if (TextUtils.isEmpty(r2.ac())) {
                                            MessageCoreData n2 = ((bdmq) cqbiVar.z.b()).n(conversationIdType2);
                                            if (n2 == null) {
                                                cqbi.a.m(String.format("Skipping updating RCS conference URI for conversation %s. No messages in the conversation", conversationIdType2));
                                            } else {
                                                String av3 = n2.av();
                                                if (TextUtils.isEmpty(av3)) {
                                                    csjb a10 = cqbi.a.a();
                                                    a10.I("Skipping updating RCS conference URI, last message has empty transaction ID");
                                                    a10.c(conversationIdType2);
                                                    a10.r();
                                                } else {
                                                    ckex c6 = ckey.c(av3);
                                                    if (c6 == null) {
                                                        csjb a11 = cqbi.a.a();
                                                        a11.I("Skipping updating RCS conference URI, parsed transaction ID is null");
                                                        a11.c(conversationIdType2);
                                                        a11.r();
                                                    } else {
                                                        if (((ckbd) c6).c.isPresent() && ((ckbt) ((ckbd) c6).c.get()).c == 2) {
                                                            Object obj2 = ((ckbd) c6).c.get();
                                                            str3 = (((ckbt) obj2).c == 2 ? (ckbr) ((ckbt) obj2).d : ckbr.a).d;
                                                        } else if (((ckbd) c6).b.isPresent()) {
                                                            str3 = ((ckba) ((ckbd) c6).b.get()).a;
                                                        } else {
                                                            csjb a12 = cqbi.a.a();
                                                            a12.I("Skipping updating RCS conference URI, not present in parsed transaction ID");
                                                            a12.c(conversationIdType2);
                                                            a12.r();
                                                        }
                                                        String[] strArr4 = bsom.a;
                                                        bsoe bsoeVar2 = new bsoe();
                                                        bsoeVar2.ap("updateConversationRcsConferenceUri1");
                                                        bsoeVar2.N(str3);
                                                        bsoeVar2.f(conversationIdType2);
                                                    }
                                                }
                                            }
                                        } else {
                                            cqbi.a.m(String.format("Skipping updating RCS conference URI for conversation %s. Conference URI is already present: %s", conversationIdType2, r2.ac()));
                                        }
                                        f2.close();
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                });
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.w.k((ConversationIdType) it.next());
                }
                this.w.c();
                ecrh ecrhVar2 = ecrh.SUCCESS;
                if (this.e.size() + this.f.size() + this.g.size() + this.h.size() + this.i.size() >= ((Integer) cpze.g.e()).intValue()) {
                    ((ecrj) this.Q.b()).f(d, new ecda("ForwardSync::SyncOneBatch::Full"), null, ecrhVar2);
                } else {
                    ((ecrj) this.Q.b()).f(d, new ecda("ForwardSync::SyncOneBatch::Partial"), null, ecrhVar2);
                }
                f.close();
            } catch (Throwable th) {
                if (this.e.size() + this.f.size() + this.g.size() + this.h.size() + this.i.size() >= ((Integer) cpze.g.e()).intValue()) {
                    ((ecrj) this.Q.b()).f(d, new ecda("ForwardSync::SyncOneBatch::Full"), null, ecrhVar);
                } else {
                    ((ecrj) this.Q.b()).f(d, new ecda("ForwardSync::SyncOneBatch::Partial"), null, ecrhVar);
                }
                throw th;
            }
        } finally {
        }
    }
}
