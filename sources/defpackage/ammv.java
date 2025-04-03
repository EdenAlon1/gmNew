package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ammv implements ammx {
    public static final entd a = entd.c("Bugle");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator");
    public final errl c;
    public final errl d;
    public final fazb e;
    public final ffbr f;
    public final ffbr g;
    public final bdtd h;
    public final cbgf i;
    public final dtuu j;
    public final Optional k;
    public final avkj l;
    public final ffbr m;
    public final ffbr n;
    public final asmj o;
    public final ffbr p;
    private final errl r;
    private final ffbr s;
    private final ctvb t;
    private final bcvw u;
    private final aolr v;
    private final ayif w;
    private final ecrj x;
    private final ffbr y;

    public ammv(errl errlVar, errl errlVar2, errl errlVar3, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ctvb ctvbVar, bdtd bdtdVar, cbgf cbgfVar, dtuu dtuuVar, bcvw bcvwVar, Optional optional, avkj avkjVar, ffbr ffbrVar3, aolr aolrVar, ayif ayifVar, ffbr ffbrVar4, ffbr ffbrVar5, ecrj ecrjVar, ffbr ffbrVar6, asmj asmjVar, ffbr ffbrVar7) {
        this.d = errlVar2;
        this.c = errlVar;
        this.r = errlVar3;
        this.e = fazbVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.t = ctvbVar;
        this.h = bdtdVar;
        this.i = cbgfVar;
        this.j = dtuuVar;
        this.u = bcvwVar;
        this.k = optional;
        this.l = avkjVar;
        this.m = ffbrVar3;
        this.v = aolrVar;
        this.w = ayifVar;
        this.s = ffbrVar4;
        this.n = ffbrVar5;
        this.x = ecrjVar;
        this.y = ffbrVar6;
        this.o = asmjVar;
        this.p = ffbrVar7;
    }

    @Override // defpackage.ammx
    public final elfl a(final long j, final String str, final boolean z, final Optional optional, final engw engwVar, final Optional optional2, final axad axadVar) {
        if (this.t.G()) {
            return elfo.g(new Callable() { // from class: amml
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final ammv ammvVar = ammv.this;
                    final engw C = ((bczy) ammvVar.g.b()).C(engwVar);
                    return (engw) ammvVar.j.c("GetOrCreateConversationAction#syncParticipantsWithDatabase", new emyl() { // from class: ammh
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emyl
                        public final Object get() {
                            int i = engw.d;
                            engr engrVar = new engr();
                            engw engwVar2 = C;
                            int size = engwVar2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ammv ammvVar2 = ammv.this;
                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) engwVar2.get(i2);
                                ((bdrr) ammvVar2.f.b()).i(bindData);
                                engrVar.h(bindData);
                            }
                            return engrVar.g();
                        }
                    });
                }
            }, this.c).i(new eroh() { // from class: ammm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ammv ammvVar;
                    ammv ammvVar2 = ammv.this;
                    boolean z2 = z;
                    final Optional optional3 = optional;
                    long j2 = j;
                    final String str2 = str;
                    final engw engwVar2 = (engw) obj;
                    if (!z2 || engwVar2.size() <= 1) {
                        Optional optional4 = optional2;
                        if (!z2 || !optional4.isEmpty()) {
                            return ammvVar2.c(j2, str2, z2, optional3, engwVar2, optional4);
                        }
                        ((ensz) ((ensz) ammv.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "getOrCreateConversation", 217, "BugleLegacyConversationCreator.java")).q("RCS group was not successfully created");
                        return elfo.e(bdgq.a);
                    }
                    final axad axadVar2 = axadVar;
                    axadVar2.getClass();
                    final String b2 = eeja.b();
                    GroupInfo groupInfo = new GroupInfo();
                    groupInfo.a(b2);
                    groupInfo.a = str2;
                    engr engrVar = new engr();
                    Iterator<E> it = engwVar2.iterator();
                    while (it.hasNext()) {
                        String U = ((ParticipantsTable.BindData) it.next()).U();
                        if (U == null) {
                            ammvVar = ammvVar2;
                            ((ensz) ((ensz) ammv.a.j()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "generateUserInfoListFromBugleParticipants", 752, "BugleLegacyConversationCreator.java")).q("Participant's normalized destination is null. Ignoring participant when converting Bugle participants to UserInfos for ChatAPI conversation creation.");
                        } else {
                            ammvVar = ammvVar2;
                            engrVar.h(new UserInfo(U));
                        }
                        ammvVar2 = ammvVar;
                    }
                    final ammv ammvVar3 = ammvVar2;
                    groupInfo.b = engrVar.g();
                    return ammvVar3.c(j2, str2, true, optional3, engwVar2, Optional.of(groupInfo)).i(new eroh() { // from class: ammg
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final ConversationIdType conversationIdType = (ConversationIdType) obj2;
                            if (conversationIdType.b()) {
                                ((ensz) ((ensz) ammv.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 712, "BugleLegacyConversationCreator.java")).q("Skipping chat api group creation due to failure creating the conversation.");
                                return elfo.e(bdgq.a);
                            }
                            engw engwVar3 = engwVar2;
                            String str3 = str2;
                            String str4 = b2;
                            Optional optional5 = optional3;
                            final ammv ammvVar4 = ammv.this;
                            awuv awuvVar = (awuv) awuw.a.createBuilder();
                            awuvVar.copyOnWrite();
                            awuw awuwVar = (awuw) awuvVar.instance;
                            str4.getClass();
                            awuwVar.b |= 1;
                            awuwVar.c = str4;
                            awuvVar.copyOnWrite();
                            awuw awuwVar2 = (awuw) awuvVar.instance;
                            awuwVar2.b |= 2;
                            awuwVar2.d = emxe.b(str3);
                            awui awuiVar = (awui) optional5.flatMap(new ammd()).flatMap(new ammo()).orElseThrow(new Supplier() { // from class: amly
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    entd entdVar = ammv.a;
                                    return new IllegalStateException("selfIdentity expected for RCS group");
                                }
                            });
                            awuvVar.copyOnWrite();
                            awuw awuwVar3 = (awuw) awuvVar.instance;
                            awuiVar.getClass();
                            awuwVar3.f = awuiVar;
                            awuwVar3.b |= 8;
                            ArrayList arrayList = new ArrayList();
                            Iterator<E> it2 = engwVar3.iterator();
                            while (it2.hasNext()) {
                                String j3 = bdqu.j((ParticipantsTable.BindData) it2.next());
                                if (j3 != null) {
                                    arrayList.add(((avkc) ammvVar4.m.b()).a(j3, false));
                                }
                            }
                            avkj avkjVar = ammvVar4.l;
                            axad axadVar3 = axadVar2;
                            awuvVar.a(arrayList);
                            awuvVar.copyOnWrite();
                            awuw awuwVar4 = (awuw) awuvVar.instance;
                            awuwVar4.j = axadVar3;
                            awuwVar4.b |= 64;
                            awus awusVar = (awus) awut.a.createBuilder();
                            awusVar.copyOnWrite();
                            awut awutVar = (awut) awusVar.instance;
                            str4.getClass();
                            awutVar.b |= 1;
                            awutVar.c = str4;
                            awusVar.copyOnWrite();
                            awut awutVar2 = (awut) awusVar.instance;
                            awutVar2.e = axadVar3;
                            awutVar2.b |= 4;
                            eyee byteString = ((awut) awusVar.build()).toByteString();
                            awuvVar.copyOnWrite();
                            awuw awuwVar5 = (awuw) awuvVar.instance;
                            awuwVar5.b |= 16;
                            awuwVar5.h = byteString;
                            return avkjVar.b((awuw) awuvVar.build()).h(new emwl() { // from class: ammk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    awud awudVar = ((awuz) obj3).c;
                                    if (awudVar == null) {
                                        awudVar = awud.a;
                                    }
                                    awuc awucVar = awuc.OK;
                                    awuc b3 = awuc.b(awudVar.c);
                                    if (b3 == null) {
                                        b3 = awuc.UNKNOWN_STATUS;
                                    }
                                    ConversationIdType conversationIdType2 = conversationIdType;
                                    if (!awucVar.equals(b3)) {
                                        awuc awucVar2 = awuc.PENDING;
                                        awuc b4 = awuc.b(awudVar.c);
                                        if (b4 == null) {
                                            b4 = awuc.UNKNOWN_STATUS;
                                        }
                                        if (!awucVar2.equals(b4)) {
                                            ammv ammvVar5 = ammv.this;
                                            ((ensz) ((ensz) ammv.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 725, "BugleLegacyConversationCreator.java")).q("Error creating RCS group with ChatAPI.");
                                            ensz enszVar = (ensz) ammv.a.h();
                                            enszVar.Y(csux.o, conversationIdType2.toString());
                                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "createConversationWithChatApi", 728, "BugleLegacyConversationCreator.java")).q("Disabling the conversation due to chat api failure to create group.");
                                            String[] strArr = bsom.a;
                                            bsoe bsoeVar = new bsoe();
                                            bsoeVar.ap("getOrCreateConversation");
                                            bsoeVar.A(5);
                                            bsoeVar.f(conversationIdType2);
                                            ammvVar5.i.d(conversationIdType2);
                                        }
                                    }
                                    return conversationIdType2;
                                }
                            }, ammvVar4.c);
                        }
                    }, ammvVar3.c);
                }
            }, this.c);
        }
        throw new IllegalStateException("Not the default SMS app");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl b(Optional optional, final long j, boolean z, final engw engwVar, final ConversationIdType conversationIdType, final int i) {
        final Optional optional2;
        engw engwVar2;
        elfl h;
        elfl e;
        final aztg e2 = this.h.e();
        if (z) {
            e = elfo.e(true);
        } else {
            if (engwVar.size() == 1) {
                String U = ((ParticipantsTable.BindData) engwVar.get(0)).U();
                optional2 = optional;
                int intValue = ((Integer) optional2.map(new amlx()).orElseGet(new Supplier() { // from class: ammc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ensk j2 = ammv.b.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "isRcsConversationAsync", 621, "BugleLegacyConversationCreator.java")).q("Could not get subscription for selfId, using default one.");
                        return Integer.valueOf(ammv.this.h.e().e());
                    }
                })).intValue();
                bcvw bcvwVar = this.u;
                if (U != null) {
                    engwVar2 = engw.r(this.v.r(U));
                } else {
                    int i2 = engw.d;
                    engwVar2 = enou.a;
                }
                h = bcvwVar.b(conversationIdType, engwVar2, null, "", new ArrayList(), intValue, false, Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: amme
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
                        entd entdVar = ammv.a;
                        return ((ParticipantsTable.BindData) obj).o() == 1;
                    }
                })).h(new emwl() { // from class: ammf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        entd entdVar = ammv.a;
                        return Boolean.valueOf(((Integer) obj).intValue() == 3);
                    }
                }, this.d);
                return h.h(new emwl() { // from class: amlz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ammv ammvVar = ammv.this;
                        cbvt cbvtVar = (cbvt) ammvVar.e.b();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        engw engwVar3 = engwVar;
                        boolean anyMatch = Collection.EL.stream(engwVar3).anyMatch(new Predicate() { // from class: amlu
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
                                entd entdVar = ammv.a;
                                return ((ParticipantsTable.BindData) obj2).o() == 3;
                            }
                        });
                        amlx amlxVar = new amlx();
                        Optional optional3 = optional2;
                        int intValue2 = ((Integer) optional3.map(amlxVar).orElse(Integer.valueOf(e2.e()))).intValue();
                        ConversationIdType conversationIdType2 = conversationIdType;
                        int h2 = cbvtVar.h(true, conversationIdType2, booleanValue, anyMatch, i, intValue2);
                        emxf.l(h2 != 0);
                        ((cbvt) ammvVar.e.b()).o(optional3, conversationIdType2, engwVar3, h2, j);
                        return null;
                    }
                }, this.r);
            }
            e = elfo.e(false);
        }
        optional2 = optional;
        h = e;
        return h.h(new emwl() { // from class: amlz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ammv ammvVar = ammv.this;
                cbvt cbvtVar = (cbvt) ammvVar.e.b();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                engw engwVar3 = engwVar;
                boolean anyMatch = Collection.EL.stream(engwVar3).anyMatch(new Predicate() { // from class: amlu
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
                        entd entdVar = ammv.a;
                        return ((ParticipantsTable.BindData) obj2).o() == 3;
                    }
                });
                amlx amlxVar = new amlx();
                Optional optional3 = optional2;
                int intValue2 = ((Integer) optional3.map(amlxVar).orElse(Integer.valueOf(e2.e()))).intValue();
                ConversationIdType conversationIdType2 = conversationIdType;
                int h2 = cbvtVar.h(true, conversationIdType2, booleanValue, anyMatch, i, intValue2);
                emxf.l(h2 != 0);
                ((cbvt) ammvVar.e.b()).o(optional3, conversationIdType2, engwVar3, h2, j);
                return null;
            }
        }, this.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elfl c(final long j, final String str, final boolean z, final Optional optional, final engw engwVar, Optional optional2) {
        boolean z2;
        ConversationIdType C;
        cpxu cpxuVar;
        int i;
        cpxu cpxuVar2;
        final boolean z3;
        Boolean valueOf;
        ecri d = this.x.d();
        try {
            int size = engwVar.size();
            int i2 = (((Boolean) q.e()).booleanValue() && z) ? 8 : 0;
            Optional flatMap = optional.flatMap(new ammd()).flatMap(new ammo());
            final bdgc y = bdgd.y();
            y.p(engwVar);
            y.m(i2);
            ((bczj) y).b = Optional.ofNullable(str);
            y.k(false);
            y.l(z);
            y.s(optional2.flatMap(new Function() { // from class: ammp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    entd entdVar = ammv.a;
                    return Optional.ofNullable(((GroupInfo) obj).c);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            y.q(optional2.flatMap(new Function() { // from class: ammq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    entd entdVar = ammv.a;
                    return Optional.ofNullable(((GroupInfo) obj).d);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            y.t(flatMap.map(new Function() { // from class: ammr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((awui) obj).d;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            y.i(flatMap);
            if (!z || size <= 1) {
                if (size == 1) {
                    if (((ParticipantsTable.BindData) engwVar.get(0)).o() == 1) {
                        ayif ayifVar = this.w;
                        String U = ((ParticipantsTable.BindData) engwVar.get(0)).U();
                        emyw.e(U);
                        C = ayifVar.b(U, new ffbr() { // from class: amms
                            @Override // defpackage.ffbr, defpackage.ffbq
                            public final Object b() {
                                entd entdVar = ammv.a;
                                bdgc bdgcVar = bdgc.this;
                                emyw.e(bdgcVar);
                                bdgcVar.z(new cpxu());
                                return bdgcVar.A();
                            }
                        }).C();
                        cpxuVar = new cpxu();
                        ensk n = a.n();
                        n.Y(csux.o, C.toString());
                        z2 = false;
                        ((ensz) n.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "getOrCreateConversationInternal", 349, "BugleLegacyConversationCreator.java")).q("BCM: Creating conversation for RBM bot");
                        i = size;
                        cpxuVar2 = cpxuVar;
                    } else {
                        size = 1;
                    }
                }
                z2 = false;
                C = this.w.d((engw) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: ammt
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
                        entd entdVar = ammv.a;
                        return ((ParticipantsTable.BindData) obj).U() != null;
                    }
                }).map(new Function() { // from class: ammu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        entd entdVar = ammv.a;
                        String U2 = ((ParticipantsTable.BindData) obj).U();
                        emyw.e(U2);
                        return U2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a), new ffbr() { // from class: amlv
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        entd entdVar = ammv.a;
                        bdgc bdgcVar = bdgc.this;
                        emyw.e(bdgcVar);
                        bdgcVar.z(new cpxu());
                        return bdgcVar.A();
                    }
                }).C();
                cpxuVar = new cpxu();
                i = size;
                cpxuVar2 = cpxuVar;
            } else {
                emyw.e(y);
                emyw.a(optional2.isPresent());
                y.z(new cpxu());
                bdgd A = y.A();
                ckjy w = ckjz.w();
                w.q(true);
                String str2 = ((GroupInfo) optional2.get()).c;
                emyw.e(str2);
                w.u(str2);
                w.s(((GroupInfo) optional2.get()).d);
                w.r(((bczk) A).e);
                w.n(emxe.b(((GroupInfo) optional2.get()).a));
                w.j(true);
                w.p(false);
                w.v(i2);
                w.w(epby.GET_OR_CREATE_CONVERSATION_ACTION);
                w.l(flatMap);
                crme c = ((ckju) this.s.b()).c(w.D());
                emyw.e(c);
                cpxu c2 = c.c();
                C = c.a();
                i = size;
                cpxuVar2 = c2;
                z2 = false;
            }
            final ConversationIdType conversationIdType = C;
            if (conversationIdType.b()) {
                emyw.e(conversationIdType);
            }
            if (((asvn) this.y.b()).a()) {
                if (engwVar.size() != 1) {
                    valueOf = Boolean.valueOf(z2);
                    z3 = z2;
                } else {
                    z3 = z2;
                    valueOf = Boolean.valueOf(this.v.q((ParticipantsTable.BindData) engwVar.get(z3 ? 1 : 0)).C());
                }
                if (valueOf.booleanValue()) {
                    z3 = true;
                }
            } else {
                z3 = z2;
            }
            final int i3 = i;
            final boolean z4 = z3;
            final cpxu cpxuVar3 = cpxuVar2;
            return elfo.h(new erog() { // from class: amlw
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    if (!conversationIdType2.b() && !z3) {
                        buxo d2 = MessagesTable.d();
                        d2.z("getOrCreateConversationInternal-messages1");
                        d2.h(new Function() { // from class: ammj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                entd entdVar = ammv.a;
                                buxzVar.m(ConversationIdType.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean z5 = d2.b().i() == 0;
                        ensk n2 = ammv.a.n();
                        n2.Y(new ensn("isEmptyConversation", Boolean.class, false, false), Boolean.valueOf(z5));
                        n2.Y(new ensn("finalConversationId", String.class, false, false), conversationIdType2.toString());
                        ((ensz) n2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/create/BugleLegacyConversationCreator", "getOrCreateConversationInternal", 417, "BugleLegacyConversationCreator.java")).q("Creating xMS or RCS 1:1 conversation");
                        if (z5) {
                            int i4 = i3;
                            engw engwVar2 = engwVar;
                            boolean z6 = z;
                            return ammv.this.b(optional, j, z6, engwVar2, conversationIdType2, i4);
                        }
                    }
                    return elfo.e(null);
                }
            }, this.r).i(new eroh() { // from class: ammn
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    int i4;
                    boolean z5;
                    elfl b2;
                    final ConversationIdType conversationIdType2;
                    final ammv ammvVar;
                    ConversationIdType conversationIdType3 = conversationIdType;
                    emyw.e(conversationIdType3);
                    ammv ammvVar2 = ammv.this;
                    engw engwVar2 = engwVar;
                    if (!conversationIdType3.b()) {
                        if (engwVar2.size() == 1) {
                            ((bdso) ammvVar2.n.b()).b((ParticipantsTable.BindData) engwVar2.get(0), conversationIdType3);
                        } else {
                            ((bdso) ammvVar2.n.b()).c(conversationIdType3, engwVar2, bdsp.b);
                        }
                        String str3 = str;
                        if (!TextUtils.isEmpty(str3)) {
                            String[] strArr = bsom.a;
                            bsoe bsoeVar = new bsoe();
                            bsoeVar.ap("updateConversationName");
                            bsoeVar.C(str3);
                            bsoeVar.D(byyy.NAME_IS_MANUAL);
                            ((bczy) ammvVar2.g.b()).ak(conversationIdType3, bsoeVar);
                            ammvVar2.i.d(conversationIdType3);
                        }
                        return elfo.e(conversationIdType3);
                    }
                    int i5 = i3;
                    boolean z6 = z4;
                    boolean z7 = z;
                    final cpxu cpxuVar4 = cpxuVar3;
                    bdgc bdgcVar = y;
                    bczy bczyVar = (bczy) ammvVar2.g.b();
                    bdgcVar.z(cpxuVar4);
                    ConversationIdType a2 = bczyVar.j(bdgcVar.A()).a();
                    if (z6) {
                        b2 = elfo.e(null);
                        i4 = i5;
                        z5 = z7;
                        ammvVar = ammvVar2;
                        conversationIdType2 = a2;
                    } else {
                        i4 = i5;
                        z5 = z7;
                        b2 = ammvVar2.b(optional, j, z5, engwVar2, a2, i4);
                        conversationIdType2 = a2;
                        ammvVar = ammvVar2;
                    }
                    final boolean z8 = z5;
                    final int i6 = i4;
                    return b2.h(new emwl() { // from class: ammi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            final cpxu cpxuVar5 = cpxuVar4;
                            if (cpxuVar5.c()) {
                                final int i7 = i6;
                                final boolean z9 = z8;
                                ammv ammvVar3 = ammv.this;
                                if (ammvVar3.o.a()) {
                                    ((azei) ammvVar3.p.b()).d(new Consumer() { // from class: amma
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj3) {
                                            cpdd cpddVar = (cpdd) obj3;
                                            entd entdVar = ammv.a;
                                            cpxu cpxuVar6 = cpxuVar5;
                                            if (z9) {
                                                cpddVar.e(cpxuVar6);
                                            } else if (i7 > 1) {
                                                cpddVar.b(cpxuVar6);
                                            } else {
                                                cpddVar.d(cpxuVar6);
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                } else {
                                    ammvVar3.k.ifPresent(new Consumer() { // from class: ammb
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj3) {
                                            cpdd cpddVar = (cpdd) obj3;
                                            entd entdVar = ammv.a;
                                            cpxu cpxuVar6 = cpxuVar5;
                                            if (z9) {
                                                cpddVar.e(cpxuVar6);
                                            } else if (i7 > 1) {
                                                cpddVar.b(cpxuVar6);
                                            } else {
                                                cpddVar.d(cpxuVar6);
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            }
                            return conversationIdType2;
                        }
                    }, ammvVar.d);
                }
            }, this.r);
        } finally {
            this.x.f(d, new ecda("GetOrCreateConversationAction#getOrCreateConversation"), null, ecrh.UNKNOWN);
        }
    }
}
