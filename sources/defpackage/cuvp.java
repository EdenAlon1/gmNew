package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvp implements culp {
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/util/spam/system/bugle/BugleSpamDatabaseOperations");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final dtuu g;
    private final ffsk h;

    public cuvp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, dtuu dtuuVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = dtuuVar;
        this.h = ffskVar;
    }

    static /* synthetic */ Long p(final cuvp cuvpVar, final MessageIdType messageIdType, final cuvb cuvbVar, final cukx cukxVar, cula culaVar, final erdy erdyVar, int i, erer ererVar, String str, eres eresVar, int i2) {
        final cula culaVar2 = (i2 & 8) != 0 ? cula.a : culaVar;
        final int i3 = (i2 & 32) != 0 ? 0 : i;
        final erer ererVar2 = (i2 & 64) != 0 ? erer.UNKNOWN_SPAM_VERDICT : ererVar;
        final String str2 = (i2 & 128) != 0 ? "" : str;
        final eres eresVar2 = (i2 & 256) != 0 ? eres.UNKNOWN_SPAM_ERROR : eresVar;
        ekzz f = eleg.f("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction");
        try {
            efbd.b();
            if (!culg.b().booleanValue() && messageIdType.c()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (eresVar2 != eres.UNKNOWN_SPAM_ERROR && ererVar2 != erer.UNKNOWN_SPAM_VERDICT) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Long l = (Long) cuvpVar.g.c("SpamDatabaseOperations#insertMessageSpamTableEntryWithoutAction", new emyl() { // from class: cuvi
                @Override // defpackage.emyl
                public final Object get() {
                    cuvp cuvpVar2 = cuvp.this;
                    MessageCoreData z = ((bdmq) cuvpVar2.e.b()).z(culg.b().booleanValue() ? cuvbVar.a : messageIdType);
                    if (z == null) {
                        return null;
                    }
                    int i4 = i3;
                    eres eresVar3 = eresVar2;
                    erdy erdyVar2 = erdyVar;
                    String str3 = str2;
                    erer ererVar3 = ererVar2;
                    cula culaVar3 = culaVar2;
                    cukx cukxVar2 = cukxVar;
                    String[] strArr = buld.a;
                    buiv buivVar = new buiv();
                    buivVar.h(z.B());
                    buivVar.f(z.z());
                    buivVar.l(cukxVar2.l);
                    buivVar.k(culaVar3.a());
                    buivVar.i(ererVar3);
                    buivVar.d(str3);
                    buivVar.m(erdyVar2);
                    buivVar.c(fbcx.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION);
                    buivVar.b(new cukz().a());
                    buivVar.e(((cqoh) cuvpVar2.f.b()).f().toEpochMilli());
                    buivVar.g(eresVar3);
                    buivVar.j(i4);
                    final buis a = buivVar.a();
                    final dtve b2 = buld.b();
                    return Long.valueOf(dtub.b(buld.b(), "message_spam", a, new Function() { // from class: buip
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dtve.this.S("message_spam", (ContentValues) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: buin
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            Long l2 = (Long) obj;
                            if (l2.longValue() >= 0) {
                                buis buisVar = buis.this;
                                buisVar.a = new buio(l2).a.longValue();
                                buisVar.fY(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }));
                }
            });
            ffig.a(f, null);
            return l;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.culp
    public final Map a(final List list, final List list2) {
        list2.getClass();
        ekzz f = eleg.f("SpamDatabaseOperations#fetchSpamSourcesDataList");
        try {
            if (culg.b().booleanValue() && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!(((cuvb) it.next()) instanceof cuvb)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            efbd.b();
            bukw a = buld.a();
            a.z("+fetchSpamSourcesDataList");
            a.c(new Function() { // from class: cuvl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Collection collection;
                    bulc bulcVar = (bulc) obj;
                    if (culg.b().booleanValue()) {
                        List<cuvb> list3 = list2;
                        collection = new ArrayList(ffdx.n(list3, 10));
                        for (cuvb cuvbVar : list3) {
                            cuvbVar.getClass();
                            collection.add(cuvbVar.a);
                        }
                    } else {
                        collection = list;
                    }
                    engr engrVar = new engr();
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        engrVar.h(String.valueOf(bdhb.a((MessageIdType) it2.next())));
                    }
                    bulcVar.aq(new dtrw("message_spam.message_id", 3, bulc.at(engrVar.g()), true));
                    return bulcVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = a.b().y();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            enqv it2 = y.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                buis buisVar = (buis) it2.next();
                if (buisVar.s() != erer.UNKNOWN_SPAM_VERDICT) {
                    if (linkedHashMap.get(buisVar.q()) == null) {
                        linkedHashMap.put(buisVar.q(), new ArrayList());
                    }
                    Object obj = linkedHashMap.get(buisVar.q());
                    obj.getClass();
                    ((List) obj).add(Integer.valueOf(buisVar.n()));
                }
            }
            ffig.a(f, null);
            return linkedHashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.culp
    public final void b(long j, fbcx fbcxVar, cukz cukzVar) {
        efbd.b();
        ekzz f = eleg.f("SpamDatabaseOperations#addActionToClassificationRecord");
        try {
            if (!ffdx.g(fbcx.DO_NOTHING, fbcx.UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION).contains(fbcxVar) && cukzVar.e()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String[] strArr = buld.a;
            buky bukyVar = new buky();
            int intValue = buld.c().intValue();
            int intValue2 = buld.c().intValue();
            if (intValue2 < 59460) {
                dtub.w("action_type", intValue2);
            }
            if (intValue >= 59460) {
                bukyVar.a.put("action_type", Integer.valueOf(fbcxVar.a()));
            }
            int a = cukzVar.a();
            int intValue3 = buld.c().intValue();
            int intValue4 = buld.c().intValue();
            if (intValue4 < 59460) {
                dtub.w("action_contributors", intValue4);
            }
            if (intValue3 >= 59460) {
                bukyVar.a.put("action_contributors", Integer.valueOf(a));
            }
            bulc bulcVar = new bulc();
            bulcVar.aq(new dtwe("message_spam._id", 1, Long.valueOf(j)));
            bukyVar.aj(new bukz(bulcVar), "message_spam-buildAndUpdateForId");
            ffig.a(f, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.culp
    public final void c() {
        axol.k(this.h, null, new cuvo(this, null), 3);
    }

    @Override // defpackage.culp
    public final cuuy d(cuvb cuvbVar, cukx cukxVar, cula culaVar, erdy erdyVar, int i, erer ererVar, String str) {
        Long p = p(this, bdhb.a, cuvbVar, cukxVar, culaVar, erdyVar, i, ererVar, str, null, 256);
        if (p == null) {
            return null;
        }
        return new cuuy(p.longValue());
    }

    @Override // defpackage.culp
    public final engw e(final MessageIdType messageIdType, final cuvb cuvbVar, final ConversationIdType conversationIdType, final cuva cuvaVar) {
        if (culg.b().booleanValue()) {
            if (cuvbVar == null && cuvaVar == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (messageIdType == null && conversationIdType == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        bukw a = buld.a();
        a.z("SpamDatabaseOperations#getLatestNonEmptyClassificationBySource");
        a.c(new Function() { // from class: cuvg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulc bulcVar = (bulc) obj;
                if (culg.b().booleanValue()) {
                    cuvb cuvbVar2 = cuvb.this;
                    if (cuvbVar2 != null) {
                        bulcVar.c(cuvbVar2.a);
                    }
                    cuva cuvaVar2 = cuvaVar;
                    if (cuvaVar2 != null) {
                        bulcVar.b(cuvaVar2.a);
                    }
                } else {
                    MessageIdType messageIdType2 = messageIdType;
                    if (messageIdType2 != null) {
                        bulcVar.c(messageIdType2);
                    }
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (conversationIdType2 != null) {
                        bulcVar.b(conversationIdType2);
                    }
                }
                bulcVar.d(erer.SPAM, erer.NOT_SPAM);
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.n(new dtzq(" MAX($V) ", new Object[]{buld.b.h}), "max_timestamp");
        a.v(buld.b.d);
        engw y = a.b().y();
        y.getClass();
        return y;
    }

    @Override // defpackage.culp
    public final engw f(final MessageIdType messageIdType, final cuvb cuvbVar) {
        messageIdType.getClass();
        ekzz f = eleg.f("SpamDatabaseOperations#getSpamListForMessage");
        try {
            culg.b().booleanValue();
            efbd.b();
            bukw a = buld.a();
            a.z("getSpamCursorFromMessageId");
            a.c(new Function() { // from class: cuvj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bulc bulcVar = (bulc) obj;
                    bulcVar.c(culg.b().booleanValue() ? cuvb.this.a : messageIdType);
                    return bulcVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            buka bukaVar = (buka) a.b().p(buld.b.d);
            try {
                engw e = bukaVar.e();
                bukaVar.close();
                e.getClass();
                ffig.a(f, null);
                return e;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.culp
    public final Long g(MessageIdType messageIdType, cuvb cuvbVar, cukx cukxVar, cula culaVar, erdy erdyVar, int i, erer ererVar, String str) {
        return p(this, messageIdType, cuvbVar, cukxVar, culaVar, erdyVar, i, ererVar, str, null, 256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.culp
    public final List h(final cuvb cuvbVar, final cuva cuvaVar) {
        if (cuvbVar == null && cuvaVar == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        bukw a = buld.a();
        a.z("SpamDatabaseOperations#getLatestNonEmptyClassificationBySource");
        a.c(new Function() { // from class: cuvk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cuvb cuvbVar2 = cuvb.this;
                bulc bulcVar = (bulc) obj;
                if (cuvbVar2 != null) {
                    bulcVar.c(cuvbVar2.a);
                }
                cuva cuvaVar2 = cuvaVar;
                if (cuvaVar2 != null) {
                    bulcVar.b(cuvaVar2.a);
                }
                bulcVar.d(erer.SPAM, erer.NOT_SPAM);
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.n(new dtzq(" MAX($V) ", new Object[]{buld.b.h}), "max_timestamp");
        a.v(buld.b.d);
        engw y = a.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            buis buisVar = (buis) it.next();
            buisVar.getClass();
            buisVar.az(0, "_id");
            cuuy cuuyVar = new cuuy(buisVar.a);
            MessageIdType q = buisVar.q();
            q.getClass();
            cuvb cuvbVar2 = new cuvb(q);
            buisVar.az(2, "conversation_id");
            ConversationIdType conversationIdType = buisVar.c;
            conversationIdType.getClass();
            cuva cuvaVar2 = new cuva(conversationIdType);
            cukx cukxVar = cukx.a;
            cukx a2 = cukw.a(buisVar.n());
            cula culaVar = new cula(buisVar.k());
            long o = buisVar.o();
            erdy r = buisVar.r();
            r.getClass();
            int m = buisVar.m();
            erer s = buisVar.s();
            s.getClass();
            String v = buisVar.v();
            if (v == null) {
                v = "";
            }
            eres t = buisVar.t();
            t.getClass();
            fbcx u = buisVar.u();
            u.getClass();
            arrayList.add(new cuux(cuuyVar, cuvbVar2, cuvaVar2, a2, culaVar, o, r, m, s, v, t, u, cuky.a(buisVar.l())));
        }
        return arrayList;
    }

    @Override // defpackage.culp
    public final void i(cuuy cuuyVar, fbcx fbcxVar, cukz cukzVar) {
        b(cuuyVar.a, fbcxVar, cukzVar);
    }

    @Override // defpackage.culp
    public final boolean j(ConversationIdType conversationIdType, cuva cuvaVar) {
        ekzz f = eleg.f("SpamDatabaseOperations#getConversationSpamDismissStatus");
        try {
            culg.b().booleanValue();
            efbd.b();
            bczy bczyVar = (bczy) this.d.b();
            if (culg.b().booleanValue()) {
                conversationIdType = cuvaVar.a;
            }
            bseh r = bczyVar.r(conversationIdType);
            boolean z = false;
            if (r != null) {
                if (r.at()) {
                    z = true;
                }
            }
            ffig.a(f, null);
            return z;
        } finally {
        }
    }

    @Override // defpackage.culp
    public final boolean k(final ConversationIdType conversationIdType, final cuva cuvaVar, final fbcx fbcxVar) {
        culg.b().booleanValue();
        bukw a = buld.a();
        a.z("SpamDatabaseOperations.hasActionBeenAppliedToConversation");
        a.c(new Function() { // from class: cuve
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulc bulcVar = (bulc) obj;
                bulcVar.b(culg.b().booleanValue() ? cuva.this.a : conversationIdType);
                int intValue = buld.c().intValue();
                if (intValue < 59460) {
                    dtub.w("action_type", intValue);
                }
                bulcVar.aq(new dtwe("message_spam.action_type", 1, Integer.valueOf(fbcxVar.a())));
                return bulcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b().T();
    }

    @Override // defpackage.culp
    public final boolean l(final ConversationIdType conversationIdType, final cuva cuvaVar) {
        conversationIdType.getClass();
        efbd.b();
        culg.b().booleanValue();
        Object c = this.g.c("SpamDatabaseOperations#updateConversationSpamDismissStatus", new emyl() { // from class: cuvm
            @Override // defpackage.emyl
            public final Object get() {
                bczy bczyVar = (bczy) cuvp.this.d.b();
                ConversationIdType conversationIdType2 = culg.b().booleanValue() ? cuvaVar.a : conversationIdType;
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("updateConversationSpamDismissStatus");
                bsoeVar.aa(true);
                return Boolean.valueOf(bczyVar.ak(conversationIdType2, bsoeVar));
            }
        });
        c.getClass();
        return ((Boolean) c).booleanValue();
    }

    @Override // defpackage.culp
    public final boolean m(final String str, final cuvc cuvcVar, final cukx cukxVar, final boolean z) {
        cukxVar.getClass();
        efbd.b();
        if (culg.b().booleanValue()) {
            if (cuvcVar == null) {
                return false;
            }
        } else if (str == null || ffpc.J(str)) {
            return false;
        }
        Object c = this.g.c("SpamDatabaseOperations#updateParticipantIsSpam", new emyl() { // from class: cuvd
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
            
                if (r6 != false) goto L42;
             */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 347
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cuvd.get():java.lang.Object");
            }
        });
        c.getClass();
        return ((Boolean) c).booleanValue();
    }

    @Override // defpackage.culp
    public final void n(final String str, final cuvc cuvcVar) {
        efbd.b();
        if (culg.b().booleanValue()) {
            if (cuvcVar == null) {
                return;
            }
        } else if (str == null || ffpc.J(str)) {
            return;
        }
        Object c = this.g.c("SpamDatabaseOperations#updateParticipantIsSpam", new emyl() { // from class: cuvf
            @Override // defpackage.emyl
            public final Object get() {
                String str2;
                bdrr bdrrVar = (bdrr) cuvp.this.c.b();
                boolean booleanValue = culg.b().booleanValue();
                cuvc cuvcVar2 = cuvcVar;
                String str3 = str;
                if (booleanValue) {
                    cuvcVar2.getClass();
                    str2 = cuvcVar2.a;
                } else {
                    str2 = str3;
                }
                ParticipantsTable.BindData b2 = bdrrVar.b(str2);
                if (b2 != null && !cuky.a(b2.n()).c()) {
                    bvvr f = ParticipantsTable.f();
                    f.ap("markParticipantAsAllowlisted");
                    f.A(new cukz().a());
                    f.z(false);
                    if (culg.b().booleanValue()) {
                        cuvcVar2.getClass();
                        str3 = cuvcVar2.a;
                    }
                    return Boolean.valueOf(f.e(str3));
                }
                return false;
            }
        });
        c.getClass();
        ((Boolean) c).booleanValue();
    }

    @Override // defpackage.culp
    public final void o(MessageIdType messageIdType, cuvb cuvbVar, cukx cukxVar, erdy erdyVar, int i, eres eresVar) {
        eresVar.getClass();
        p(this, messageIdType, cuvbVar, cukxVar, null, erdyVar, i, null, null, eresVar, BasePaymentResult.ERROR_REQUEST_FAILED);
    }
}
