package defpackage;

import android.database.DatabaseUtils;
import android.util.Patterns;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayxm implements ayif, ayvr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher");
    static final cfup b = cfvl.n(cfvl.b, "use_guessed_min_match_value", false);
    static final cfup c = cfvl.i(cfvl.b, "crash_on_conversation_creation_mismatch", false);
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffbr j;
    private final errl k;
    private final errl l;
    private final fazb m;
    private final ecrj n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;

    public ayxm(ffbr ffbrVar, errl errlVar, errl errlVar2, errl errlVar3, fazb fazbVar, ffbr ffbrVar2, ecrj ecrjVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.j = ffbrVar;
        this.k = errlVar;
        this.l = errlVar2;
        this.d = errlVar3;
        this.m = fazbVar;
        this.e = ffbrVar2;
        this.n = ecrjVar;
        this.g = ffbrVar3;
        this.o = ffbrVar4;
        this.p = ffbrVar5;
        this.f = ffbrVar6;
        this.q = ffbrVar7;
        this.r = ffbrVar8;
        this.s = ffbrVar9;
        this.h = ffbrVar10;
        this.i = ffbrVar11;
        this.t = ffbrVar12;
    }

    public static String D(String str) {
        return str.length() <= 4 ? str : str.substring(str.length() - 4);
    }

    public static boolean H(ParticipantsTable.BindData bindData, String str, int i) {
        if (bindData.U() == null || !ayvs.e(bindData.U(), str, i)) {
            return bindData.W() != null && ayvs.e(bindData.W(), str, i);
        }
        return true;
    }

    private final elfl I() {
        return ((Boolean) b.e()).booleanValue() ? ((ayyi) this.j.b()).a().h(new emwl() { // from class: aywv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(ayxm.v((Optional) obj));
            }
        }, erpp.a) : ayvs.b();
    }

    private final Optional J(bseh bsehVar, engw engwVar, int i, ayvm ayvmVar) {
        return K(bsehVar, engwVar, i, ayvmVar) ? Optional.ofNullable(bsom.b(bsehVar.C())) : Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean K(bseh bsehVar, engw engwVar, int i, ayvm ayvmVar) {
        boolean z;
        ParticipantsTable.BindData[] bindDataArr = (ParticipantsTable.BindData[]) bsehVar.aG("participants", new ParticipantsTable.BindData[0]);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (ParticipantsTable.BindData bindData : bindDataArr) {
            if (bindData.U() != null) {
                hashMap.put(bindData.U(), bindData);
            }
            if (bindData.W() != null) {
                hashMap.put(bindData.W(), bindData);
            }
        }
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) engwVar.get(i2);
            if (hashMap.containsKey(str)) {
                hashSet.add(str);
                hashSet2.add(((ParticipantsTable.BindData) hashMap.get(str)).S());
            }
        }
        for (ParticipantsTable.BindData bindData2 : bindDataArr) {
            int size2 = engwVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) engwVar.get(i3);
                if (!hashSet.contains(str2) && H(bindData2, str2, i)) {
                    hashSet2.add(bindData2.S());
                    hashSet.add(str2);
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, bindData2);
                    }
                }
            }
        }
        HashSet hashSet3 = new HashSet((Collection) DesugarArrays.stream(bindDataArr).map(new Function() { // from class: aywo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).S();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b));
        int size3 = engwVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z = true;
                break;
            }
            String str3 = (String) engwVar.get(i4);
            if (!hashSet.contains(str3)) {
                z = false;
                break;
            }
            hashSet.remove(str3);
            if (hashMap.get(str3) != null) {
                hashSet3.remove(((ParticipantsTable.BindData) hashMap.get(str3)).S());
            }
            i4++;
        }
        if (!hashSet3.isEmpty() || !hashSet.isEmpty() || !z) {
            return false;
        }
        engw engwVar2 = (engw) DesugarArrays.stream(bindDataArr).map(new Function() { // from class: aywp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = ayxm.a;
                String W = ((ParticipantsTable.BindData) obj).W();
                W.getClass();
                return W;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        ensk e = a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "isMatchingConversation", 992, "TelephonyCompatibleMatcher.java");
        ConversationIdType C = bsehVar.C();
        ayvj ayvjVar = new ayvj(ayvmVar, engwVar2);
        int length = bindDataArr.length;
        enrrVar.L("ConversationMatcher#findMatchingConversation returning conversation %s because phone numbers %s (%d) participants matched phone numbers %s (%d)", C, ayvjVar, Integer.valueOf(length), new ayvj(ayvmVar, engwVar), Integer.valueOf(engwVar.size()));
        if (length < engwVar.size()) {
            ((akzt) this.o.b()).c("Bugle.TelephonyCompatibleMatcher.FindConversation.DuplicateDestinationsInQuery");
        }
        return true;
    }

    public static int v(Optional optional) {
        return (!optional.isPresent() || ((Integer) optional.get()).intValue() < 6) ? ayvs.a() : ((Integer) optional.get()).intValue();
    }

    public static bsnz w(Function function) {
        return x(function, new Function() { // from class: ayxl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                enru enruVar = ayxm.a;
                return new bskq[]{bskpVar.a, bskpVar.O, bskpVar.R};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).b();
    }

    public static bsob x(Function function, Function function2) {
        bsob e = bsom.e();
        e.z("createQueryForConversationsWithAllParticipant");
        e.i(function);
        e.e(new bsny(bsom.c.a, false));
        e.f(function2);
        e.v(bsom.c.a);
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bvvn e2 = ParticipantsTable.e();
        e2.e(new Function() { // from class: ayxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                enru enruVar = ayxm.a;
                return new bvth[]{bvtgVar.a, bvtgVar.f, bvtgVar.g};
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
        dtvy i = dtvz.i(e2.b(), ParticipantsTable.c.a, bsdr.c.b);
        ((dtrd) i).e = "participants";
        bsdmVar.D(i.g());
        dtvy i2 = dtvz.i(bsdmVar.b(), bsdr.c.a, bsom.c.a);
        ((dtrd) i2).e = "conversation_participants";
        e.D(i2.g());
        e.r();
        return e;
    }

    public static bvvn y(engi engiVar) {
        dtzq dtzqVar = new dtzq("$V IN ($R)", new Object[]{z(ParticipantsTable.c.f), (String) Collection.EL.stream(engiVar).distinct().map(new Function() { // from class: ayxj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = ayxm.a;
                return DatabaseUtils.sqlEscapeString((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","))});
        bvvn e = ParticipantsTable.e();
        e.z("createQueryForRecipientsByDestinationSuffix");
        bvvw bvvwVar = new bvvw();
        bvvwVar.w(-2);
        bvvwVar.as(dtzqVar);
        e.g(bvvwVar);
        return e;
    }

    public static dtzj z(dtry dtryVar) {
        return new dtzq("substr($V, -$V)", new Object[]{dtryVar, 4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw A(engw engwVar, int i, ayvm ayvmVar, final enip enipVar, final int i2) {
        ekzz f = eleg.f("BugleCompatibleConversationMatcher#findAllGroupConversationSyncInTransaction");
        try {
            ensk g = a.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findAllConversationsSyncInTransaction", 907, "TelephonyCompatibleMatcher.java")).t("ConversationMatcher#findAllGroupConversationSyncInTransaction called with %s", new ayvj(ayvmVar, engwVar));
            int i3 = engw.d;
            final engr engrVar = new engr();
            bskr bskrVar = (bskr) w(new Function() { // from class: ayvx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    enru enruVar = ayxm.a;
                    int intValue = bsom.g().intValue();
                    if (intValue < 10007) {
                        dtub.w("conv_type", intValue);
                    }
                    int i4 = i2;
                    bsolVar.aq(new dtrw("conversations.conv_type", 3, bsol.at(enip.this), true));
                    bsolVar.B(i4);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).o();
            try {
                enqv it = bskrVar.cW().iterator();
                while (it.hasNext()) {
                    J((bseh) it.next(), engwVar, i, ayvmVar).ifPresent(new Consumer() { // from class: ayvy
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            engr.this.h((bseh) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                engw g2 = engrVar.g();
                bskrVar.close();
                f.close();
                return g2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional B(final String str, final int i) {
        ecri d = this.n.d();
        try {
            ekzz f = eleg.f("BugleCompatibleConversationMatcher#getConversationId(recipient)");
            try {
                final String a2 = ((ctve) this.r.b()).a();
                Optional optional = (Optional) ((dtuu) this.e.b()).c("BugleCompatibleConversationMatcher#getConversationId.txn", new emyl() { // from class: ayvz
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
                    
                        r0 = r3.c();
                     */
                    @Override // defpackage.emyl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 293
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayvz.get():java.lang.Object");
                    }
                });
                f.close();
                return optional;
            } finally {
            }
        } finally {
            this.n.f(d, new ecda("TelephonyCompatibleMatcher#find1To1ConversationSync"), null, ecrh.SUCCESS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        r14 = defpackage.ayxm.a.h();
        r14.Y(defpackage.ente.a, "Bugle");
        ((defpackage.enrr) ((defpackage.enrr) r14).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findGroupConversationSyncInTransaction", 872, "TelephonyCompatibleMatcher.java")).B("ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)", new defpackage.ayvj(r1, r13), r13.size());
        r10 = j$.util.Optional.empty();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional C(defpackage.engw r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "TelephonyCompatibleMatcher#findGroupConversationSync#withDuplicateHandling"
            int r1 = r13.size()
            r2 = 1
            if (r1 == r2) goto La
            goto Lb
        La:
            r2 = 0
        Lb:
            defpackage.emxf.a(r2)
            ffbr r1 = r12.f
            ecrj r2 = r12.n
            ecri r2 = r2.d()
            java.lang.Object r1 = r1.b()
            ayvn r1 = (defpackage.ayvn) r1
            ayvm r1 = r1.a()
            enru r3 = defpackage.ayxm.a
            ensk r3 = r3.g()
            ensn r4 = defpackage.ente.a
            java.lang.String r5 = "Bugle"
            r3.Y(r4, r5)
            enrr r3 = (defpackage.enrr) r3
            r4 = 843(0x34b, float:1.181E-42)
            java.lang.String r6 = "com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher"
            java.lang.String r7 = "findGroupConversationSyncInTransaction"
            java.lang.String r8 = "TelephonyCompatibleMatcher.java"
            ensk r3 = r3.h(r6, r7, r4, r8)
            enrr r3 = (defpackage.enrr) r3
            ayvj r4 = new ayvj
            r4.<init>(r1, r13)
            java.lang.String r9 = "ConversationMatcher#findGroupConversationSyncInTransaction called with %s"
            r3.t(r9, r4)
            int r3 = r13.size()
            r4 = 0
            ayvw r9 = new ayvw     // Catch: java.lang.Throwable -> Lbc
            r9.<init>()     // Catch: java.lang.Throwable -> Lbc
            bsnz r3 = w(r9)     // Catch: java.lang.Throwable -> Lbc
            dtsu r3 = r3.o()     // Catch: java.lang.Throwable -> Lbc
            bskr r3 = (defpackage.bskr) r3     // Catch: java.lang.Throwable -> Lbc
            engw r9 = r3.cW()     // Catch: java.lang.Throwable -> Lb2
            enqv r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lb2
        L63:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r10 == 0) goto L7d
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lb2
            bseh r10 = (defpackage.bseh) r10     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r10 = r12.J(r10, r13, r14, r1)     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = r10.isPresent()     // Catch: java.lang.Throwable -> Lb2
            if (r11 == 0) goto L63
        L79:
            r3.close()     // Catch: java.lang.Throwable -> Lbc
            goto La5
        L7d:
            enru r14 = defpackage.ayxm.a     // Catch: java.lang.Throwable -> Lb2
            ensk r14 = r14.h()     // Catch: java.lang.Throwable -> Lb2
            ensn r9 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lb2
            r14.Y(r9, r5)     // Catch: java.lang.Throwable -> Lb2
            enrr r14 = (defpackage.enrr) r14     // Catch: java.lang.Throwable -> Lb2
            r5 = 872(0x368, float:1.222E-42)
            ensk r14 = r14.h(r6, r7, r5, r8)     // Catch: java.lang.Throwable -> Lb2
            enrr r14 = (defpackage.enrr) r14     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)"
            ayvj r6 = new ayvj     // Catch: java.lang.Throwable -> Lb2
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> Lb2
            int r13 = r13.size()     // Catch: java.lang.Throwable -> Lb2
            r14.B(r5, r6, r13)     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r10 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Lb2
            goto L79
        La5:
            ecrj r13 = r12.n
            ecda r14 = new ecda
            r14.<init>(r0)
            ecrh r0 = defpackage.ecrh.SUCCESS
            r13.f(r2, r14, r4, r0)
            return r10
        Lb2:
            r13 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lbc
        Lbb:
            throw r13     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r13 = move-exception
            ecrj r14 = r12.n
            ecda r1 = new ecda
            r1.<init>(r0)
            ecrh r0 = defpackage.ecrh.SUCCESS
            r14.f(r2, r1, r4, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayxm.C(engw, int):j$.util.Optional");
    }

    public final String E(String str) {
        boolean I;
        boolean I2;
        int Q;
        int Q2;
        if (str.contains("@")) {
            str.getClass();
            I = ffpc.I(str, "<", false);
            if (I) {
                I2 = ffpc.I(str, ">", false);
                if (I2 && (Q = ffpc.Q(str, "<", 0, false, 6)) <= (Q2 = ffpc.Q(str, ">", 0, false, 6))) {
                    String substring = str.substring(Q + 1, Q2);
                    substring.getClass();
                    if (Patterns.EMAIL_ADDRESS.matcher(substring).matches()) {
                        return substring;
                    }
                }
            }
        }
        return str;
    }

    public final void F(engw engwVar, final bseh bsehVar, ayvm ayvmVar) {
        bseh bsehVar2 = (bseh) ((bskr) w(new Function() { // from class: aywa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                enru enruVar = ayxm.a;
                bsolVar.q(bseh.this.C());
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).o()).cS();
        bsehVar2.getClass();
        int size = engwVar.size();
        if (K(bsehVar2, engwVar, u(), ayvmVar)) {
            return;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "checkConversationCorrectness", 452, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#checkConversationCorrectness thinks it created conversation %s for %s, but that doesn't exist", bsehVar.C(), new ayvj(ayvmVar, engwVar));
        ((akzt) this.o.b()).e("Bugle.TelephonyCompatibleMatcher.FindOrCreateConversation.ConversationMismatch.Count", size != 1 ? 2 : 1);
        ayhu ayhuVar = (ayhu) this.q.b();
        ConversationIdType C = bsehVar.C();
        if (((Boolean) ayhv.e.e()).booleanValue()) {
            ayvm a2 = ((ayvn) ayhuVar.c.b()).a();
            engw n = engw.n(((bczy) ayhuVar.b.b()).L(C));
            engw engwVar2 = (engw) Collection.EL.stream(n).filter(new Predicate() { // from class: ayho
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
                    return ((ParticipantsTable.BindData) obj).M() != null;
                }
            }).map(new Function() { // from class: ayhp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String M = ((ParticipantsTable.BindData) obj).M();
                    M.getClass();
                    return M;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
            engw engwVar3 = (engw) Collection.EL.stream(n).filter(new Predicate() { // from class: ayhq
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
                    return ((ParticipantsTable.BindData) obj).U() != null;
                }
            }).map(new Function() { // from class: ayhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String U = ((ParticipantsTable.BindData) obj).U();
                    U.getClass();
                    return U;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
            engw engwVar4 = (engw) Collection.EL.stream(n).filter(new Predicate() { // from class: ayhs
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
                    return ((ParticipantsTable.BindData) obj).W() != null;
                }
            }).map(new Function() { // from class: ayht
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String U = ((ParticipantsTable.BindData) obj).U();
                    U.getClass();
                    return U;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
            enrr enrrVar = (enrr) ayhu.a.j();
            enrrVar.aa(ensy.FULL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger", "logAnonymousDestinationsForConversationCreationFailures", 73, "ConversationDetailsLogger.java")).K("BCM created a conversation but the query check couldn't find any conversation with matching destinations: Anonymized conversation destinations: [%s] newConversation Comparable Destinations: [%s] newConversation Normalized Destinations: [%s] newConversation Send Destinations: [%s]", ayhu.a(engwVar, a2), ayhu.a(engwVar2, a2), ayhu.a(engwVar3, a2), ayhu.a(engwVar4, a2));
        }
        if (((Boolean) c.e()).booleanValue()) {
            emyw.c(false, "ConversationMatcher created a new conversation for a phone number, but the conversation doesn't actually match that phone number. Check logcat for \"BCM created a conversation but the query check couldn't find any conversation with\" for more details", new Object[0]);
        }
    }

    public final boolean G(String str, int i, String[] strArr, String str2) {
        for (String str3 : strArr) {
            if (str3 != null && ((ayvs) this.m.b()).f(str3.trim(), str.trim(), i, str2) != 4) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ayif
    public final /* synthetic */ bseh a(aoku aokuVar, ffbr ffbrVar) {
        return ayie.a(this, aokuVar, ffbrVar);
    }

    @Override // defpackage.ayif
    public final bseh b(final String str, final ffbr ffbrVar) {
        final ayvm a2 = ((ayvn) this.f.b()).a();
        return (bseh) ((dtuu) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreate1to1ConversationSync", new emyl() { // from class: ayxg
            @Override // defpackage.emyl
            public final Object get() {
                ensk g = ayxm.a.g();
                g.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 340, "TelephonyCompatibleMatcher.java");
                ayvm ayvmVar = a2;
                String str2 = str;
                enrrVar.t("ConversationMatcher#findOrCreate1to1ConversationSync called with %s", new ayvh(ayvmVar, str2));
                ayxm ayxmVar = ayxm.this;
                Optional q = ayxmVar.q(str2);
                if (q.isPresent()) {
                    ensk e = ayxm.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 346, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreate1to1ConversationSync returning existing conversation %s for destination %s", ((bseh) q.get()).C(), new ayvh(ayvmVar, str2));
                    return (bseh) q.get();
                }
                ConversationIdType l = ((bczy) ayxmVar.g.b()).l((bdgd) ffbrVar.b());
                bseh c2 = bsom.c(l);
                ensk e2 = ayxm.a.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 358, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreate1to1ConversationSync found no conversation for %s, so created conversation %s", new ayvh(ayvmVar, str2), l);
                if (!((askm) ayxmVar.i.b()).a()) {
                    return c2;
                }
                ayxmVar.F(engw.r(str2), c2, ayvmVar);
                return c2;
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ bseh c(java.util.Collection collection, ffbr ffbrVar) {
        return ayie.b(this, collection, ffbrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ayif
    public final bseh d(final engw engwVar, final ffbr ffbrVar) {
        if (engwVar.size() == 1) {
            return b((String) engwVar.get(0), ffbrVar);
        }
        final ayvm a2 = ((ayvn) this.f.b()).a();
        return (bseh) ((dtuu) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreateConversationSync", new emyl() { // from class: aywr
            @Override // defpackage.emyl
            public final Object get() {
                final ayxm ayxmVar = ayxm.this;
                final int u = ayxmVar.u();
                dtuu dtuuVar = (dtuu) ayxmVar.e.b();
                final engw engwVar2 = engwVar;
                Optional optional = (Optional) dtuuVar.c("TelephonyCompatibleMatcher#findGroupConversationSync", new emyl() { // from class: ayvv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return ayxm.this.C(engwVar2, u);
                    }
                });
                boolean isPresent = optional.isPresent();
                ayvm ayvmVar = a2;
                if (isPresent) {
                    ensk e = ayxm.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreateConversationSync", 388, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreateConversationSync returning existing conversation %s for destinations %s", ((bseh) optional.get()).C(), new ayvj(ayvmVar, engwVar2));
                    return (bseh) optional.get();
                }
                bdgd bdgdVar = (bdgd) ffbrVar.b();
                ConversationIdType l = ((bczy) ayxmVar.g.b()).l(bdgdVar);
                emyw.a(!bdgdVar.s());
                bseh c2 = bsom.c(l);
                if (!bdgdVar.s() && ((askm) ayxmVar.i.b()).a()) {
                    ayxmVar.F(engwVar2, c2, ayvmVar);
                }
                return c2;
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl e(aoku aokuVar) {
        return ayie.c(this, aokuVar);
    }

    @Override // defpackage.ayif
    public final elfl f(final String str) {
        return I().h(new emwl() { // from class: aywc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ayxm.this.B(str, ((Integer) obj).intValue());
            }
        }, this.l);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl g(String str) {
        return ayie.d(this, str);
    }

    @Override // defpackage.ayif
    public final elfl h(final engw engwVar) {
        final ayvm a2 = ((ayvn) this.f.b()).a();
        return I().h(new emwl() { // from class: ayxh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final ayxm ayxmVar = ayxm.this;
                dtuu dtuuVar = (dtuu) ayxmVar.e.b();
                final engw engwVar2 = engwVar;
                final ayvm ayvmVar = a2;
                return (engw) dtuuVar.c("BugleCompatibleConversationMatcher#findAllConversations.txn", new emyl() { // from class: ayvu
                    @Override // defpackage.emyl
                    public final Object get() {
                        int intValue = num.intValue();
                        enip r = enip.r(1, 0);
                        ayxm ayxmVar2 = ayxm.this;
                        ayvm ayvmVar2 = ayvmVar;
                        engw engwVar3 = engwVar2;
                        return ayxmVar2.A(engwVar3, intValue, ayvmVar2, r, engwVar3.size());
                    }
                });
            }
        }, this.l);
    }

    @Override // defpackage.ayif
    public final elfl i(aoku aokuVar, java.util.Collection collection) {
        final ayvm a2 = ((ayvn) this.f.b()).a();
        if (((atzt) this.p.b()).a()) {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h(aokuVar);
            engrVar.j(collection);
            collection = engrVar.g();
        }
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: aywt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = ayxm.a;
                return emxe.b(((aoku) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        final engw engwVar = (engw) map.collect(endq.a);
        return I().h(new emwl() { // from class: aywu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final ayxm ayxmVar = ayxm.this;
                dtuu dtuuVar = (dtuu) ayxmVar.e.b();
                final engw engwVar2 = engwVar;
                final ayvm ayvmVar = a2;
                return (engw) dtuuVar.c("BugleCompatibleConversationMatcher#findAllRcsGroupConversations.txn", new emyl() { // from class: aywn
                    @Override // defpackage.emyl
                    public final Object get() {
                        int intValue = num.intValue();
                        enpx enpxVar = new enpx(2);
                        ayxm ayxmVar2 = ayxm.this;
                        ayvm ayvmVar2 = ayvmVar;
                        engw engwVar3 = engwVar2;
                        return ayxmVar2.A(engwVar3, intValue, ayvmVar2, enpxVar, engwVar3.size());
                    }
                });
            }
        }, this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ayif
    public final elfl j(final engw engwVar) {
        return engwVar.size() == 1 ? f((String) engwVar.get(0)) : I().h(new emwl() { // from class: aywm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final ayxm ayxmVar = ayxm.this;
                dtuu dtuuVar = (dtuu) ayxmVar.e.b();
                final engw engwVar2 = engwVar;
                return (Optional) dtuuVar.c("BugleCompatibleConversationMatcher#findConversation.txn", new emyl() { // from class: aywq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return ayxm.this.C(engwVar2, num.intValue());
                    }
                });
            }
        }, this.l);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl k(java.util.Collection collection) {
        return ayie.e(this, collection);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ elfl l(aoku aokuVar, ffbr ffbrVar) {
        return ayie.f(this, aokuVar, ffbrVar);
    }

    @Override // defpackage.ayif
    public final elfl m(final String str, final ffbr ffbrVar) {
        return elfo.g(new Callable() { // from class: ayxc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayxm.this.b(str, ffbrVar);
            }
        }, this.l);
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional n(aoku aokuVar) {
        return ayie.g(this, aokuVar);
    }

    @Override // defpackage.ayif
    public final Optional o(String str) {
        return q(str).map(new Function() { // from class: ayxi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = ayxm.a;
                return ((bseh) obj).C();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional p(aoku aokuVar) {
        return ayie.h(this, aokuVar);
    }

    @Override // defpackage.ayif
    public final Optional q(String str) {
        emxf.l(!efbd.g());
        return B(str, u());
    }

    @Override // defpackage.ayif
    public final /* synthetic */ Optional r(java.util.Collection collection) {
        return ayie.i(this, collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ayif
    public final Optional s(final engw engwVar) {
        emxf.l(!efbd.g());
        if (engwVar.size() == 1) {
            return q((String) engwVar.get(0));
        }
        final int u = u();
        return (Optional) ((dtuu) this.e.b()).c("BugleCompatibleConversationMatcher#findConversation.txn", new emyl() { // from class: ayxf
            @Override // defpackage.emyl
            public final Object get() {
                return ayxm.this.C(engwVar, u);
            }
        });
    }

    @Override // defpackage.ayvr
    public final elfl t(final Set set) {
        if (set.isEmpty()) {
            return elfo.e(new HashMap());
        }
        if (((aren) this.t.b()).a()) {
            return elfo.g(new Callable() { // from class: ayww
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Set set2 = set;
                    if (set2.isEmpty()) {
                        return new HashMap();
                    }
                    final ayxm ayxmVar = ayxm.this;
                    enhk enhkVar = (enhk) Collection.EL.stream(set2).filter(new Predicate() { // from class: aywg
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
                            enru enruVar = ayxm.a;
                            return !emxe.c(((aoku) obj).l());
                        }
                    }).collect(endq.b(new Function() { // from class: aywh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String l = ((aoku) obj).l();
                            l.getClass();
                            return ayxm.this.E(l);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: aywi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            aoku aokuVar = (aoku) obj;
                            enru enruVar = ayxm.a;
                            return aokuVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new BinaryOperator() { // from class: aywj
                        public final /* synthetic */ BiFunction andThen(Function function) {
                            return BiFunction$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            aoku aokuVar = (aoku) obj;
                            ensk h = ayxm.a.h();
                            h.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findParticipantsForDestinationsSync", 1223, "TelephonyCompatibleMatcher.java")).q("findRecipientsForDestinations duplicate search destinations; discarding duplicate.");
                            return aokuVar;
                        }
                    }));
                    int u = ayxmVar.u();
                    enhk enhkVar2 = (enhk) Collection.EL.stream(enhkVar.keySet()).collect(endq.b(new aywb(), new aywd(), new BinaryOperator() { // from class: aywk
                        public final /* synthetic */ BiFunction andThen(Function function) {
                            return BiFunction$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            enru enruVar = ayxm.a;
                            Stream concat = Stream.CC.concat(Collection.EL.stream((engw) obj), Collection.EL.stream((engw) obj2));
                            int i = engw.d;
                            return (engw) concat.collect(endq.a);
                        }
                    }));
                    bvvn y = ayxm.y(enhkVar2.keySet());
                    y.z("findRecipientsForDestinations");
                    bvti bvtiVar = (bvti) y.b().o();
                    try {
                        HashMap hashMap = new HashMap();
                        bvtiVar.dh();
                        while (bvtiVar.moveToNext()) {
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bvtiVar.cO();
                            String U = bindData.U();
                            U.getClass();
                            engw engwVar = (engw) enhkVar2.get(ayxm.D(U));
                            if (engwVar != null) {
                                enqv it = engwVar.iterator();
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    aoku aokuVar = (aoku) enhkVar.get(str);
                                    aokuVar.getClass();
                                    if (ayxm.H(bindData, ayxmVar.E(aokuVar.j()), u)) {
                                        aoku aokuVar2 = (aoku) enhkVar.get(str);
                                        aokuVar2.getClass();
                                        ((List) Map.EL.computeIfAbsent(hashMap, aokuVar2, new Function() { // from class: aywl
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                enru enruVar = ayxm.a;
                                                return new ArrayList();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).add(bindData);
                                    }
                                }
                            }
                        }
                        bvtiVar.close();
                        return hashMap;
                    } catch (Throwable th) {
                        try {
                            bvtiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.k);
        }
        final enhk enhkVar = (enhk) Collection.EL.stream(set).filter(new Predicate() { // from class: aywx
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
                enru enruVar = ayxm.a;
                return !emxe.c(((aoku) obj).l());
            }
        }).collect(endq.b(new Function() { // from class: aywy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String l = ((aoku) obj).l();
                l.getClass();
                return ayxm.this.E(l);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: aywz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aoku aokuVar = (aoku) obj;
                enru enruVar = ayxm.a;
                return aokuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: ayxa
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                aoku aokuVar = (aoku) obj;
                ensk h = ayxm.a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findParticipantsForDestinations", 1141, "TelephonyCompatibleMatcher.java")).q("findRecipientsForDestinations duplicate search destinations; discarding duplicate.");
                return aokuVar;
            }
        }));
        return I().i(new eroh() { // from class: ayxb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final enhk enhkVar2 = enhkVar;
                final Integer num = (Integer) obj;
                final enhk enhkVar3 = (enhk) Collection.EL.stream(enhkVar2.keySet()).collect(endq.b(new aywb(), new aywd(), new BinaryOperator() { // from class: aywe
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        enru enruVar = ayxm.a;
                        Stream concat = Stream.CC.concat(Collection.EL.stream((engw) obj2), Collection.EL.stream((engw) obj3));
                        int i = engw.d;
                        return (engw) concat.collect(endq.a);
                    }
                }));
                bvvn y = ayxm.y(enhkVar3.keySet());
                y.z("findRecipientsForDestinations");
                elfj v = y.b().v();
                final ayxm ayxmVar = ayxm.this;
                return v.f(new erow() { // from class: aywf
                    @Override // defpackage.erow
                    public final Object a(erpc erpcVar, Object obj2) {
                        bvti bvtiVar = (bvti) obj2;
                        HashMap hashMap = new HashMap();
                        bvtiVar.dh();
                        while (bvtiVar.moveToNext()) {
                            enhk enhkVar4 = enhkVar3;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bvtiVar.cO();
                            String U = bindData.U();
                            U.getClass();
                            engw engwVar = (engw) enhkVar4.get(ayxm.D(U));
                            if (engwVar != null) {
                                int size = engwVar.size();
                                for (int i = 0; i < size; i++) {
                                    Integer num2 = num;
                                    enhk enhkVar5 = enhkVar2;
                                    ayxm ayxmVar2 = ayxm.this;
                                    String str = (String) engwVar.get(i);
                                    aoku aokuVar = (aoku) enhkVar5.get(str);
                                    aokuVar.getClass();
                                    if (ayxm.H(bindData, ayxmVar2.E(aokuVar.j()), num2.intValue())) {
                                        aoku aokuVar2 = (aoku) enhkVar5.get(str);
                                        aokuVar2.getClass();
                                        ((List) Map.EL.computeIfAbsent(hashMap, aokuVar2, new Function() { // from class: ayws
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                enru enruVar = ayxm.a;
                                                return new ArrayList();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).add(bindData);
                                    }
                                }
                            }
                        }
                        return hashMap;
                    }
                }, ayxmVar.d).h();
            }
        }, this.d);
    }

    public final int u() {
        return ((Boolean) b.e()).booleanValue() ? v(((ayyi) this.j.b()).b()) : ayvs.a();
    }
}
