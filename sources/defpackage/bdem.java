package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdem implements bczy {
    public static final cskc a = cskc.g("BugleDataModel", "ConversationDatabaseOperationsImpl");
    public static final entd b = entd.c("BugleDataModel");
    private final ffbr A;
    private final ffbr B;
    public final ffbr c;
    public final Optional d;
    public final ffbr e;
    public final ffbr f;
    public final dtuu g;
    public final ffbr h;
    public final cqoh i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;

    public bdem(ffbr ffbrVar, Optional optional, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, dtuu dtuuVar, ffbr ffbrVar8, ffbr ffbrVar9, cqoh cqohVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23) {
        this.c = ffbrVar;
        this.d = optional;
        this.t = ffbrVar2;
        this.u = ffbrVar3;
        this.e = ffbrVar4;
        this.v = ffbrVar5;
        this.f = ffbrVar6;
        this.w = ffbrVar7;
        this.g = dtuuVar;
        this.h = ffbrVar8;
        this.x = ffbrVar9;
        this.i = cqohVar;
        this.y = ffbrVar10;
        this.j = ffbrVar11;
        this.z = ffbrVar12;
        this.k = ffbrVar13;
        this.l = ffbrVar14;
        this.m = ffbrVar15;
        this.n = ffbrVar16;
        this.o = ffbrVar17;
        this.p = ffbrVar18;
        this.A = ffbrVar19;
        this.q = ffbrVar20;
        this.r = ffbrVar21;
        this.s = ffbrVar22;
        this.B = ffbrVar23;
    }

    public static void aC(bsoe bsoeVar, List list, int i) {
        long j;
        boolean z;
        String str;
        String str2;
        int i2;
        String str3;
        String str4 = null;
        if (list == null || list.isEmpty()) {
            j = 0;
            z = false;
            str = null;
            str2 = null;
            i2 = i;
            str3 = null;
        } else {
            boolean b2 = bdqv.b(list);
            if (i == 0) {
                csix.a(1, list.size());
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) list.get(0);
                long u = bindData.u();
                String T = bindData.T();
                String U = bindData.U();
                str3 = bindData.P();
                str2 = U;
                str = T;
                i2 = 0;
                z = b2;
                j = u;
            } else {
                z = b2;
                j = 0;
                i2 = i;
                str3 = null;
                str = null;
                str2 = null;
            }
        }
        bsoeVar.F(j);
        bsoeVar.J(str);
        bsoeVar.K(str2);
        bsoeVar.H(str3);
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 12001) {
            dtub.w("has_ea2p_bot_recipient", intValue2);
        }
        if (intValue >= 12001) {
            bsoeVar.a.put("has_ea2p_bot_recipient", Boolean.valueOf(z));
        }
        if (i2 == 0 && list.size() == 1) {
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) list.get(0);
            if (!TextUtils.isEmpty(bindData2.S())) {
                final String S = bindData2.S();
                bwon a2 = ProfilesTable.a();
                a2.z("getProfileForParticipant");
                a2.d(new Function() { // from class: bdbq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = bdem.a;
                        return ((bwnk) obj).i;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.e(new Function() { // from class: bdbr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bwor bworVar = (bwor) obj;
                        cskc cskcVar = bdem.a;
                        bworVar.b(Long.parseLong(S));
                        return bworVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ProfilesTable.BindData bindData3 = (ProfilesTable.BindData) ((bwnm) a2.b().o()).cS();
                if (bindData3 != null && !TextUtils.isEmpty(bindData3.v()) && TextUtils.isEmpty(bindData2.Q()) && TextUtils.isEmpty(bindData2.R())) {
                    str4 = cjze.a(bindData3.v());
                }
            }
        }
        bsoeVar.ab(str4);
    }

    public static void aD(bsoe bsoeVar) {
        bsoeVar.W(false);
        bsoeVar.u("");
        bsoeVar.v("");
        bsoeVar.r("");
        bsoeVar.s(Uri.EMPTY);
    }

    public static boolean aF(int i) {
        return i == 3;
    }

    public static boolean aG(boolean z, int i) {
        return z || i == 2;
    }

    public static final engw aI(ConversationIdType conversationIdType) {
        csix.h();
        return aJ(conversationIdType).y();
    }

    private static bvvl aJ(final ConversationIdType conversationIdType) {
        csix.h();
        bvvn e = ParticipantsTable.e();
        e.z("getParticipantsForConversationQuery");
        e.h(new Function() { // from class: bdbx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                cskc cskcVar = bdem.a;
                String[] strArr = bsdr.a;
                bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.e(new Function() { // from class: bdad
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cskc cskcVar2 = bdem.a;
                        return ((bscz) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationIdType conversationIdType2 = ConversationIdType.this;
                bsdmVar.f(new Function() { // from class: bdae
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar = (bsdq) obj2;
                        cskc cskcVar2 = bdem.a;
                        bsdqVar.b(ConversationIdType.this);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvvwVar.l(bsdmVar.b());
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e.b();
    }

    private static enhk aK(List list) {
        return (enhk) Collection.EL.stream(list).distinct().collect(endq.a(new Function() { // from class: bdal
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                cskc cskcVar = bdem.a;
                return bindData;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bdam
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return new bdgi(awwp.JOINED);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    private static Predicate aL(final Function function) {
        final Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        return new Predicate() { // from class: bdbc
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
                Object apply;
                cskc cskcVar = bdem.a;
                Set set = newSetFromMap;
                apply = function.apply(obj);
                return set.add(apply);
            }
        };
    }

    public static int av(List list, int i) {
        if (i != 2) {
            return list.size();
        }
        final enin eninVar = new enin();
        Iterable$EL.forEach(list, new Consumer() { // from class: bdct
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                cskc cskcVar = bdem.a;
                if (bindData.U() != null) {
                    enin.this.c(bindData.U());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final enip g = eninVar.g();
        bvvn e = ParticipantsTable.e();
        e.z("getParticipantCount");
        e.h(new Function() { // from class: bdcv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                cskc cskcVar = bdem.a;
                bvvwVar.x(-2);
                bvvwVar.s(enip.this);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return list.size() - (e.b().T() ? 1 : 0);
    }

    public static buxm ax(ConversationIdType conversationIdType) {
        buxo d = MessagesTable.d();
        d.z("+ConversationDatabaseOperationsImpl#getLastTwoMessages");
        buxz buxzVar = new buxz();
        buxzVar.m(conversationIdType);
        buxzVar.B(false);
        d.g(buxzVar);
        d.d(new buxl(MessagesTable.c.i, false));
        d.x(2);
        d.e(new Function() { // from class: bdcg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                cskc cskcVar = bdem.a;
                return new buun[]{buumVar.i, buumVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return d.b();
    }

    @Override // defpackage.bczy
    public final engw A() {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#queryAllUnreadConversations.1");
        try {
            buxo d = MessagesTable.d();
            d.z("queryAllUnreadConversations#2");
            d.h(new Function() { // from class: bdau
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdem.a;
                    buxzVar.P(false);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.v(MessagesTable.c.b);
            d.c(MessagesTable.c.b);
            bsob e = bsom.e();
            e.c(bsom.c.a);
            e.i(new Function() { // from class: bdav
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdem.a;
                    bsolVar.z();
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.p(e.b());
            engw f2 = d.b().f();
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final engw B(engw engwVar) {
        engw engwVar2;
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#sanitizeConversationParticipants");
        try {
            csix.h();
            if (engwVar.isEmpty()) {
                engwVar2 = enou.a;
            } else {
                engwVar2 = (engw) Collection.EL.stream(engwVar).filter(aL(new bdbf())).collect(endq.a);
                final HashSet C = ((ctvb) this.z.b()).C();
                final enip d = ((ctvb) this.z.b()).d();
                engw engwVar3 = (engw) Collection.EL.stream(engwVar2).filter(new Predicate() { // from class: bdai
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
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                        cfva cfvaVar = aoqm.a;
                        return ((Boolean) new aoqa().get()).booleanValue() ? !d.contains(((aolr) bdem.this.j.b()).q(bindData)) : !C.contains(bindData.U());
                    }
                }).collect(endq.a);
                if (!engwVar3.isEmpty()) {
                    engwVar2 = engwVar3;
                }
            }
            f.close();
            return engwVar2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final engw C(engw engwVar) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#sanitizeConversationParticipantsKeepingSelf");
        try {
            csix.h();
            Stream filter = Collection.EL.stream(engwVar).filter(aL(new bdbf()));
            int i = engw.d;
            engw engwVar2 = (engw) filter.collect(endq.a);
            f.close();
            return engwVar2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final enhk D(final engw engwVar) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getExistingConversations");
        try {
            efbd.b();
            bsob e = bsom.e();
            e.z("+getExistingConversations");
            e.i(new Function() { // from class: bdao
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdem.a;
                    bsolVar.t(engw.this);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            enhk enhkVar = (enhk) Collection.EL.stream(e.b().y()).collect(endq.a(new Function() { // from class: bdap
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bseh) obj).C();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bdaq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bseh bsehVar = (bseh) obj;
                    cskc cskcVar = bdem.a;
                    return bsehVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            f.close();
            return enhkVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final enip E(String str) {
        final String m = ((bdrr) this.h.b()).m(str);
        if (TextUtils.isEmpty(m)) {
            return enpd.a;
        }
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("getConversationsForParticipant");
        bsdmVar.f(new Function() { // from class: bdar
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsdq bsdqVar = (bsdq) obj;
                cskc cskcVar = bdem.a;
                bsdqVar.f(Long.parseLong(m));
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.c(bsdr.c.a);
        return (enip) bsdmVar.b().D().map(new Function() { // from class: bdas
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bscj) obj).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
    }

    @Override // defpackage.bczy
    public final enip F(List list) {
        enin eninVar = new enin();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            String[] strArr = bsdr.a;
            bsdm bsdmVar = new bsdm(bsdr.a);
            bsdmVar.z("getConversationsForParticipants");
            bsdmVar.f(new Function() { // from class: bdcf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsdq bsdqVar = (bsdq) obj;
                    cskc cskcVar = bdem.a;
                    bsdqVar.f(Long.parseLong(str));
                    return bsdqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsdb bsdbVar = (bsdb) bsdmVar.b().o();
            while (bsdbVar.moveToNext()) {
                try {
                    eninVar.c(bsdbVar.e());
                } catch (Throwable th) {
                    try {
                        bsdbVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bsdbVar.close();
        }
        return eninVar.g();
    }

    @Override // defpackage.bczy
    public final Optional G(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationTypeInfo");
        try {
            Optional map = Optional.ofNullable(r(conversationIdType)).map(new Function() { // from class: bdcr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bseh bsehVar = (bseh) obj;
                    cskc cskcVar = bdem.a;
                    return new bczg(bsehVar.k(), bsehVar.am());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return map;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final Optional H(ConversationIdType conversationIdType) {
        Optional empty = Optional.empty();
        buuo buuoVar = (buuo) ax(conversationIdType).o();
        try {
            if (buuoVar.moveToFirst()) {
                empty = Optional.of(Long.valueOf(buuoVar.l()));
            }
            if (buuoVar.getCount() > 1) {
                if (buuoVar.i() == 3) {
                    buuoVar.moveToNext();
                }
                empty = Optional.of(Long.valueOf(buuoVar.l()));
            }
            buuoVar.close();
            return empty;
        } catch (Throwable th) {
            try {
                buuoVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final Optional I(ConversationIdType conversationIdType) {
        return Optional.ofNullable((ckkz) bsom.j(conversationIdType, new Function() { // from class: bddu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return ((bseh) obj).J();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).map(new Function() { // from class: bddv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ckkz) obj).c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.bczy
    public final String J(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationName");
        try {
            csix.h();
            bseh r = r(conversationIdType);
            String X = r != null ? r.X() : null;
            f.close();
            return X;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    @Deprecated
    public final ArrayList K(final cpbd cpbdVar, final int i) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationParticipants");
        try {
            final ArrayList arrayList = new ArrayList();
            if (cpbdVar == null) {
                a.r("Failed to get conversation participants: thread data null.");
                f.close();
                return arrayList;
            }
            cpay cpayVar = cpbdVar.h;
            if (cpayVar == null) {
                this.g.d("ConversationDatabaseOperationsImpl#getConversationParticipants", new Runnable() { // from class: bdbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (aoku aokuVar : cpbdVar.b) {
                            cfva cfvaVar = aoqm.a;
                            String k = aokuVar.k(((Boolean) new aoqj().get()).booleanValue());
                            if (TextUtils.isEmpty(k)) {
                                bdem.a.r("empty recipient, skipping.");
                            } else {
                                int i2 = i;
                                bvpo g = ((Boolean) new aooq().get()).booleanValue() ? bdqu.g(i2, aokuVar) : bdqu.i(i2, k);
                                if (TextUtils.isEmpty(g.g)) {
                                    bdem.a.r("empty send destination after building participant, skipping.");
                                } else {
                                    ArrayList arrayList2 = arrayList;
                                    ((bdrr) bdem.this.h.b()).j(g);
                                    arrayList2.add(g.a());
                                }
                            }
                        }
                    }
                });
                f.close();
                return arrayList;
            }
            int size = cpbdVar.b.size();
            if (size != 1) {
                csjb e = a.e();
                e.I("ThreadData has RBM bot info but number of recipients is");
                e.G(size);
                e.r();
            }
            String b2 = emxe.b(cpayVar.a);
            aolr aolrVar = (aolr) this.j.b();
            awuf awufVar = (awuf) awui.a.createBuilder();
            awuh awuhVar = awuh.BOT;
            awufVar.copyOnWrite();
            awui awuiVar = (awui) awufVar.instance;
            awuiVar.c = awuhVar.f;
            awuiVar.b = 1 | awuiVar.b;
            awufVar.copyOnWrite();
            awui awuiVar2 = (awui) awufVar.instance;
            awuiVar2.b |= 2;
            awuiVar2.d = b2;
            if (!cpbdVar.b.contains(aolrVar.b((awui) awufVar.build()))) {
                csjb b3 = a.b();
                b3.I("RBM bot recipient not found in thread data.");
                b3.D("rbmBotId", b2);
                b3.r();
            }
            bvpo e2 = bdqu.e(b2, cpayVar.b, cpayVar.c);
            ((bdrr) this.h.b()).j(e2);
            arrayList.add(e2.a());
            f.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final /* bridge */ /* synthetic */ List L(ConversationIdType conversationIdType) {
        return aI(conversationIdType);
    }

    @Override // defpackage.bczy
    @Deprecated
    public final List M(final cpxu cpxuVar) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getParticipantsForThread");
        try {
            csix.h();
            bsob e = bsom.e();
            e.z("getParticipantsForThread-conversations");
            e.g(new Function() { // from class: bddn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.i(new Function() { // from class: bddo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdem.a;
                    bsolVar.K(cpxu.this);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bsnz b2 = e.b();
            String[] strArr = bsdr.a;
            bsdm bsdmVar = new bsdm(bsdr.a);
            bsdmVar.z("getParticipantsForThread-conversationParticipants");
            bsdmVar.e(new Function() { // from class: bddp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bscz) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsdmVar.f(new Function() { // from class: bddr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsdq bsdqVar = (bsdq) obj;
                    cskc cskcVar = bdem.a;
                    bsdqVar.d(bsnz.this);
                    return bsdqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bsdl b3 = bsdmVar.b();
            bvvn e2 = ParticipantsTable.e();
            e2.z("getParticipantsForThread-participants");
            e2.h(new Function() { // from class: bdds
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    cskc cskcVar = bdem.a;
                    bvvwVar.l(bsdl.this);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw y = e2.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final void N(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#orphanConversation");
        try {
            csix.h();
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("orphanConversation");
            bsoeVar.A(2);
            ak(conversationIdType, bsoeVar);
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

    @Override // defpackage.bczy
    public final void O() {
        this.g.d("ConversationDatabaseOperationsImpl#rebuildConversationAvatars", new Runnable() { // from class: bdcp
            @Override // java.lang.Runnable
            public final void run() {
                bsob e = bsom.e();
                e.z("rebuildConversationAvatars");
                e.r();
                e.f(new Function() { // from class: bdce
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bskp bskpVar = (bskp) obj;
                        cskc cskcVar = bdem.a;
                        return new bskq[]{bskpVar.a, bskpVar.O};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bskr bskrVar = (bskr) e.b().o();
                bdem bdemVar = bdem.this;
                while (bskrVar.moveToNext()) {
                    try {
                        bdemVar.V(bskrVar.h(), null, bskrVar.c(), false);
                    } catch (Throwable th) {
                        try {
                            bskrVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bskrVar.close();
            }
        });
    }

    @Override // defpackage.bczy
    public final void P(final ConversationIdType conversationIdType) {
        this.g.d("ConversationDatabaseOperationsImpl#refreshConversation", new Runnable() { // from class: bdcw
            @Override // java.lang.Runnable
            public final void run() {
                bdem bdemVar = bdem.this;
                ConversationIdType conversationIdType2 = conversationIdType;
                bdemVar.V(conversationIdType2, null, bdemVar.c(conversationIdType2), true);
            }
        });
        ((cbgf) this.v.b()).n(conversationIdType);
        ((cbgf) this.v.b()).d(conversationIdType);
    }

    @Override // defpackage.bczy
    public final void Q(Set set) {
        ecri a2 = ((alrv) this.y.b()).a();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#refreshConversations");
        try {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    P((ConversationIdType) it.next());
                }
                ((cbgf) this.v.b()).c();
                csjb c = a.c();
                c.I("Number of conversations refreshed.");
                c.L("conversationIds", set);
                c.r();
                ((akzt) this.t.b()).e("Bugle.RefreshConversations.UpdatedConversations.Count", set.size());
            }
            f.close();
            ((alrv) this.y.b()).h(a2, new ecda("ConversationDatabaseOperationsImpl#refreshConversations"));
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final void R(String str) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#refreshConversationsForParticipant");
        try {
            csix.h();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            S(arrayList);
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

    @Override // defpackage.bczy
    public final void S(ArrayList arrayList) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#refreshConversationsForParticipants");
        try {
            csix.h();
            Q(F(arrayList));
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

    @Override // defpackage.bczy
    public final void T(final ConversationIdType conversationIdType) {
        bseh r = r(conversationIdType);
        if (r == null || r.k() == 2) {
            this.g.d("ConversationDatabaseOperationsImpl#refreshParticipantCountForRcsGroup", new Runnable() { // from class: bddt
                @Override // java.lang.Runnable
                public final void run() {
                    cskc cskcVar = bdem.a;
                    final ConversationIdType conversationIdType2 = ConversationIdType.this;
                    conversationIdType2.getClass();
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.al();
                    bsoeVar.ap("refreshParticipantCountForRcsGroup#setCount");
                    bsol bsolVar = new bsol();
                    bsolVar.q(conversationIdType2);
                    bsoeVar.ac(bsolVar);
                    String[] strArr2 = bjnz.a;
                    bjnu bjnuVar = new bjnu(bjnz.a);
                    bjnuVar.z("refreshParticipantCountForRcsGroup#setCount#inner");
                    bjnuVar.c(new Function() { // from class: bdcm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bjny bjnyVar = (bjny) obj;
                            cskc cskcVar2 = bdem.a;
                            bjnyVar.b(ConversationIdType.this);
                            bjnyVar.aq(new dtrw("conversation_to_participants.rcs_group_join_status", 3, bjny.at((Iterable) DesugarArrays.stream(new awwp[]{awwp.JOINED, awwp.UNKNOWN_STATE}).map(new Function() { // from class: bjnx
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return Integer.valueOf(((awwp) obj2).e);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: bjnw
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }))), true));
                            return bjnyVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    engw y = bjnuVar.b().y();
                    final enin eninVar = new enin();
                    Iterable$EL.forEach(y, new Consumer() { // from class: bdcn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            bjjo bjjoVar = (bjjo) obj;
                            cskc cskcVar2 = bdem.a;
                            if (bjjoVar.g() != null) {
                                enin.this.c(bjjoVar.g());
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    final enip g = eninVar.g();
                    bvvn e = ParticipantsTable.e();
                    e.z("refreshParticipantCountForRcsGroup#setCount#outer");
                    e.h(new Function() { // from class: bdco
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar = (bvvw) obj;
                            cskc cskcVar2 = bdem.a;
                            bvvwVar.x(-2);
                            bvvwVar.s(enip.this);
                            return bvvwVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsoeVar.G(((enou) y).c - (e.b().T() ? 1 : 0));
                    bsoeVar.b().e();
                }
            });
        }
    }

    @Override // defpackage.bczy
    public final void U(final ConversationIdType conversationIdType, final MessageCoreData messageCoreData, final boolean z) {
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationDraftSnippetAndPreview", new Runnable() { // from class: bdbg
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                Uri uri;
                String str;
                ConversationIdType conversationIdType2 = conversationIdType;
                boolean z2 = z;
                long j2 = 0;
                if (z2) {
                    buuo buuoVar = (buuo) bdem.ax(conversationIdType2).o();
                    try {
                        long l = buuoVar.moveToFirst() ? buuoVar.l() : 0L;
                        if (buuoVar.getCount() > 1) {
                            if (buuoVar.i() == 3) {
                                buuoVar.moveToNext();
                            }
                            j2 = buuoVar.l();
                        }
                        buuoVar.close();
                        j = j2;
                        j2 = l;
                    } finally {
                    }
                } else {
                    j = 0;
                }
                MessageCoreData messageCoreData2 = messageCoreData;
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.al();
                bsoeVar.ap("updateConversationDraftSnippetAndPreview");
                if (messageCoreData2 == null || !messageCoreData2.co()) {
                    bdem.aD(bsoeVar);
                } else {
                    String ar = messageCoreData2.ar();
                    String au = messageCoreData2.au();
                    Iterator it = messageCoreData2.ab().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            uri = null;
                            str = null;
                            break;
                        }
                        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                        if (messagePartCoreData.aZ() && le.q(messagePartCoreData.V())) {
                            uri = messagePartCoreData.t();
                            str = messagePartCoreData.V();
                            break;
                        }
                    }
                    if (messageCoreData2.U() != null && emxe.c(ar) && emxe.c(au) && uri == null) {
                        bdem.aD(bsoeVar);
                        j2 = j;
                    } else {
                        j2 = Math.max(j2, messageCoreData2.o());
                        bsoeVar.W(true);
                        bsoeVar.u(ar);
                        bsoeVar.v(au);
                        bsoeVar.r(str);
                        bsoeVar.s(uri);
                    }
                }
                if (z2) {
                    bsoeVar.Z(j2);
                }
                bdem.this.W(conversationIdType2, bsoeVar);
            }
        });
    }

    @Override // defpackage.bczy
    public final void V(final ConversationIdType conversationIdType, final String str, final int i, final boolean z) {
        csix.h();
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationNameAndAvatar", new Runnable() { // from class: bdaa
            /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
            /* JADX WARN: Type inference failed for: r0v3, types: [ffbr, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 344
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bdaa.run():void");
            }
        });
    }

    @Override // defpackage.bczy
    public final void W(ConversationIdType conversationIdType, bsoe bsoeVar) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#updateConversationRow");
        try {
            csix.h();
            emxf.l(ak(conversationIdType, bsoeVar));
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

    @Override // defpackage.bczy
    public final void X(String str, ParticipantCoreColor participantCoreColor) {
        ((bdrr) this.h.b()).q(str, participantCoreColor);
        if (participantCoreColor.a() != 0) {
            R(str);
            ((cbgf) this.v.b()).b();
            ((cbgf) this.v.b()).a();
        }
    }

    @Override // defpackage.bczy
    public final void Y(Set set, final String str, final String str2) {
        emxf.a(!set.isEmpty());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final ConversationIdType conversationIdType = (ConversationIdType) it.next();
            this.g.d("ConversationDatabaseOperationsImpl#updateParticipantIdList", new Runnable() { // from class: bdej
                @Override // java.lang.Runnable
                public final void run() {
                    String Z;
                    cskc cskcVar = bdem.a;
                    bsob e = bsom.e();
                    e.z("updateParticipantIdList1");
                    final ConversationIdType conversationIdType2 = ConversationIdType.this;
                    e.i(new Function() { // from class: bdbk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            cskc cskcVar2 = bdem.a;
                            bsolVar.q(ConversationIdType.this);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e.g(new Function() { // from class: bdbl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cskc cskcVar2 = bdem.a;
                            return ((bskp) obj).J;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bseh bsehVar = (bseh) ((bskr) e.b().o()).cS();
                    if (bsehVar == null || (Z = bsehVar.Z()) == null) {
                        return;
                    }
                    String str3 = str;
                    String str4 = str2;
                    TreeSet treeSet = new TreeSet(Arrays.asList(Z.split(",")));
                    emyw.a(treeSet.remove(str4));
                    treeSet.add(str3);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = treeSet.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ",");
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("updateParticipantIdList2");
                    bsoeVar.ad(new Function() { // from class: bdbm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            cskc cskcVar2 = bdem.a;
                            bsolVar.q(ConversationIdType.this);
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsoeVar.I(sb2);
                    if (bsoeVar.b().e() == 0) {
                        ensz enszVar = (ensz) bdem.b.i();
                        enszVar.aa(ensy.LARGE);
                        enszVar.Y(csux.o, conversationIdType2.toString());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantIdList", 1967, "ConversationDatabaseOperationsImpl.java")).q("Failed to update PARTICIPANT_ID_LIST in conversation table.");
                    }
                }
            });
        }
    }

    @Override // defpackage.bczy
    public final void Z(Set set, ParticipantsTable.BindData bindData) {
        emxf.a(!set.isEmpty());
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("updateParticipantRelatedConversationDataForOneOnOneConversations");
        bsol bsolVar = new bsol();
        bsolVar.t(set);
        bsolVar.j(0);
        bsoeVar.ac(bsolVar);
        bsoeVar.J(bindData.T());
        bsoeVar.K(bindData.U());
        bsoeVar.H(bindData.P());
        bsoeVar.F(bindData.u());
        if (bsoeVar.b().e() == 0) {
            ensz enszVar = (ensz) b.i();
            enszVar.aa(ensy.LARGE);
            enszVar.Y(csux.m, bindData.S());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateParticipantRelatedConversationDataForOneOnOneConversations", 2008, "ConversationDatabaseOperationsImpl.java")).q("Failed to update conversation table with new participant data.");
        }
    }

    @Override // defpackage.bczy
    public final int a(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationJoinState");
        try {
            csix.h();
            bseh r = r(conversationIdType);
            int m = r != null ? r.m() : 0;
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final void aA(bsoe bsoeVar, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bsoeVar.z(aw(list).toString());
    }

    public final void aB(bsel bselVar, List list, int i) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("fillParticipantData");
        aC(bsoeVar, list, i);
        if (!((atzy) this.q.b()).a()) {
            aA(bsoeVar, list);
        }
        bselVar.X(bsoeVar.a.getAsLong("participant_contact_id").longValue());
        bselVar.ab(bsoeVar.e());
        bselVar.ac(bsoeVar.e());
        bselVar.Z(bsoeVar.a.getAsString("participant_display_destination"));
        bselVar.z(bsoeVar.a.getAsBoolean("has_ea2p_bot_recipient").booleanValue());
        if (bsoeVar.b().n(bsom.c.t.toString())) {
            bselVar.A(bsoeVar.a.getAsString("icon"));
        }
    }

    public final void aE(int i) {
        ((akzt) this.u.b()).e("Bugle.DataModel.Data.CreateRcsGroupConversation.SelfParticipantInserted.Counts", i);
    }

    public final void aH(final ConversationIdType conversationIdType) {
        csix.h();
        this.g.d("ConversationDatabaseOperationsImpl#updateConversationAddContactBannerStatus", new Runnable() { // from class: bdde
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                Optional empty;
                Object apply2;
                cskc cskcVar = bdem.a;
                csix.h();
                String[] strArr = bqcp.a;
                bqck bqckVar = new bqck(bqcp.a);
                bqckVar.z("getAddContactBannerDataByConversationId");
                final ConversationIdType conversationIdType2 = ConversationIdType.this;
                apply = new Function() { // from class: bdcl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqco bqcoVar = (bqco) obj;
                        cskc cskcVar2 = bdem.a;
                        bqcoVar.b(ConversationIdType.this);
                        return bqcoVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bqco());
                bqckVar.k(new bqcn((bqco) apply));
                bqcb bqcbVar = (bqcb) bqckVar.b().o();
                try {
                    if (bqcbVar.moveToNext()) {
                        empty = Optional.of((bqbo) bqcbVar.cO());
                        bqcbVar.close();
                    } else {
                        bqcbVar.close();
                        empty = Optional.empty();
                    }
                    if (!empty.isPresent()) {
                        bqbr bqbrVar = new bqbr();
                        bqbrVar.c(conversationIdType2);
                        bqbrVar.b(2);
                        final bqbo a2 = bqbrVar.a();
                        final dtve a3 = bqcp.a();
                        dtub.b(bqcp.a(), "add_contact_banner", a2, new Function() { // from class: bqbk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dtve.this.R("add_contact_banner", (ContentValues) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bqbl
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                Long l = (Long) obj;
                                if (l.longValue() >= 0) {
                                    bqbo bqboVar = bqbo.this;
                                    bqboVar.a = new bqbm(l).a.longValue();
                                    bqboVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return;
                    }
                    bqcm bqcmVar = new bqcm();
                    bqcmVar.ap("updateConversationAddContactBannerStatus");
                    bqcmVar.a.put("banner_status", (Integer) 2);
                    bqcmVar.am();
                    apply2 = new Function() { // from class: bded
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bqco bqcoVar = (bqco) obj;
                            cskc cskcVar2 = bdem.a;
                            bqcoVar.b(ConversationIdType.this);
                            return bqcoVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bqco());
                    bqcmVar.af(new bqcn((bqco) apply2));
                    bqcmVar.b().e();
                } catch (Throwable th) {
                    try {
                        bqcbVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.bczy
    public final boolean aa(final SelfIdentityId selfIdentityId, bsoe bsoeVar) {
        boolean z;
        bvvn e = ParticipantsTable.e();
        e.z("addConversationSelfIdToContentValues");
        e.h(new Function() { // from class: bdch
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                cskc cskcVar = bdem.a;
                bvvwVar.k(SelfIdentityId.this.b());
                int intValue = ParticipantsTable.i().intValue();
                if (intValue < 2000) {
                    dtub.w("sim_slot_id", intValue);
                }
                bvvwVar.aq(new dtwe("participants.sim_slot_id", 2, -1));
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.f(new Function() { // from class: bdci
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return ((bvtg) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvti bvtiVar = (bvti) e.b().o();
        try {
            if (bvtiVar.getCount() > 0) {
                bsoeVar.n(selfIdentityId.c());
                z = true;
            } else {
                z = false;
            }
            bvtiVar.close();
            return z;
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean ab(Optional optional, final ParticipantsTable.BindData bindData, final bdgj bdgjVar, final ConversationIdType conversationIdType, final boolean z, final boolean z2) {
        emxf.b(bindData.r() == -2, "Is possible to persist just other participants (subId = -2)");
        final boolean isPresent = optional.filter(new Predicate() { // from class: bdck
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
                final awui awuiVar = (awui) obj;
                Optional e = ((aolr) bdem.this.j.b()).t(bindData).e();
                awuiVar.getClass();
                return e.filter(new Predicate() { // from class: bdbp
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
                        return awui.this.equals((awui) obj2);
                    }
                }).isPresent();
            }
        }).isPresent();
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantToConversation", new emyl() { // from class: bdea
            /* JADX WARN: Removed duplicated region for block: B:7:0x00c4  */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r15 = this;
                    bdem r0 = defpackage.bdem.this
                    ffbr r1 = r0.h
                    java.lang.Object r1 = r1.b()
                    bdrr r1 = (defpackage.bdrr) r1
                    com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r2 = r2
                    boolean r3 = r3
                    java.lang.String r1 = r1.l(r2, r3)
                    r1.getClass()
                    long r2 = java.lang.Long.parseLong(r1)
                    com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r6
                    boolean r5 = r5
                    bdgj r6 = r4
                    awwp r6 = r6.a()
                    r7 = 0
                    r8 = -1
                    r10 = 1
                    if (r5 == 0) goto L3c
                    cskc r5 = defpackage.bdem.a
                    csjb r5 = r5.a()
                    java.lang.String r11 = "Skipping insertion of self participant in ConversationParticipantsTable"
                    r5.I(r11)
                    r5.f(r1)
                    r5.r()
                L3a:
                    r5 = r10
                    goto L75
                L3c:
                    java.lang.String[] r5 = defpackage.brww.a
                    brvj r5 = new brvj
                    r5.<init>()
                    r5.b(r4)
                    r5.c(r2)
                    r5.d(r6)
                    brvg r5 = r5.a()
                    dtve r11 = defpackage.brww.c()
                    dtve r12 = defpackage.brww.c()
                    brve r13 = new brve
                    r13.<init>()
                    brvd r11 = new brvd
                    r11.<init>()
                    java.lang.String r14 = "conversation_participants"
                    long r11 = defpackage.dtub.b(r12, r14, r5, r13, r11)
                    java.lang.Long r5 = java.lang.Long.valueOf(r11)
                    r5.getClass()
                    int r5 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                    if (r5 == 0) goto L74
                    goto L3a
                L74:
                    r5 = r7
                L75:
                    java.lang.String[] r11 = defpackage.bsdr.a
                    bsco r11 = new bsco
                    r11.<init>()
                    r11.d(r4)
                    r11.f(r2)
                    r11.g(r6)
                    bscj r2 = r11.a()
                    dtve r3 = defpackage.bsdr.a()
                    dtve r6 = defpackage.bsdr.a()
                    bscc r11 = new bscc
                    r11.<init>()
                    bscd r3 = new bscd
                    r3.<init>()
                    java.lang.String r12 = "conversation_to_participants"
                    long r2 = defpackage.dtub.b(r6, r12, r2, r11, r3)
                    java.lang.Long r6 = java.lang.Long.valueOf(r2)
                    r6.getClass()
                    cskc r6 = defpackage.bdem.a
                    csjb r6 = r6.a()
                    r6.c(r4)
                    r6.f(r1)
                    java.lang.String r1 = "ConversationToParticipantsTable convToPartRowId: "
                    java.lang.String r1 = defpackage.a.s(r2, r1)
                    r6.I(r1)
                    r6.r()
                    int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r1 == 0) goto Lc5
                    r7 = r10
                Lc5:
                    r1 = r5 & r7
                    if (r1 == 0) goto Ld3
                    boolean r2 = r7
                    if (r2 == 0) goto Ld3
                    r0.P(r4)
                    r0.T(r4)
                Ld3:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bdea.get():java.lang.Object");
            }
        })).booleanValue();
    }

    @Override // defpackage.bczy
    public final boolean ac(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#conversationHasEmail");
        try {
            csix.h();
            boolean booleanValue = ((Boolean) bsom.i(conversationIdType, new Function() { // from class: bdcx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return Boolean.valueOf(((bseh) obj).an());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Supplier() { // from class: bdcy
                @Override // java.util.function.Supplier
                public final Object get() {
                    cskc cskcVar = bdem.a;
                    return false;
                }
            })).booleanValue();
            f.close();
            return booleanValue;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean ad(ConversationIdType conversationIdType) {
        if (!((attl) this.B.b()).a()) {
            return false;
        }
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#hasEmergencyRcsRecipient");
        try {
            efbd.b();
            boolean anyMatch = Collection.EL.stream(aI(conversationIdType)).anyMatch(new Predicate() { // from class: bdbd
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
                    return ((aolr) bdem.this.j.b()).q((ParticipantsTable.BindData) obj).w();
                }
            });
            f.close();
            return anyMatch;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean ae(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#hasRbmBotRecipient");
        try {
            csix.h();
            bseh r = r(conversationIdType);
            boolean z = false;
            if (r != null) {
                if (r.am()) {
                    z = true;
                }
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean af(final long j) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#isExistingMmsGroupConversation");
        try {
            ekzz f2 = eleg.f("ConversationDatabaseOperationsImpl#isExistingConversation");
            try {
                csix.h();
                bsob e = bsom.e();
                e.z("isExistingConversation");
                e.i(new Function() { // from class: bddi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        cskc cskcVar = bdem.a;
                        bsolVar.j(1);
                        bsolVar.K(cpxu.b(j));
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                e.g(new Function() { // from class: bddj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = bdem.a;
                        return ((bskp) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bskr bskrVar = (bskr) e.b().o();
                try {
                    boolean moveToFirst = bskrVar.moveToFirst();
                    bskrVar.close();
                    f2.close();
                    f.close();
                    return moveToFirst;
                } finally {
                }
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

    @Override // defpackage.bczy
    public final boolean ag(final String str) {
        bsob e = bsom.e();
        e.z("rcsGroupConversationExists");
        e.g(new Function() { // from class: bddb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return ((bskp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: bddc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                cskc cskcVar = bdem.a;
                bsolVar.E(str);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return !e.b().f().isEmpty();
    }

    @Override // defpackage.bczy
    public final boolean ah(final ConversationIdType conversationIdType, final String str) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#isParticipantInConversation");
        try {
            csix.h();
            String[] strArr = bsdr.a;
            bsdm bsdmVar = new bsdm(bsdr.a);
            bsdmVar.z("isParticipantInConversation");
            bsdmVar.f(new Function() { // from class: bddf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsdq bsdqVar = (bsdq) obj;
                    cskc cskcVar = bdem.a;
                    bsdqVar.b(ConversationIdType.this);
                    bsdqVar.f(Long.parseLong(str));
                    return bsdqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsdb bsdbVar = (bsdb) bsdmVar.b().o();
            try {
                boolean z = bsdbVar.getCount() > 0;
                bsdbVar.close();
                f.close();
                return z;
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

    @Override // defpackage.bczy
    public final boolean ai(ConversationIdType conversationIdType) {
        efbd.b();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#isRevocationSupported");
        try {
            bseh r = r(conversationIdType);
            boolean z = false;
            if (r != null) {
                if (r.ar()) {
                    z = true;
                }
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean aj(final ParticipantsTable.BindData bindData, final ConversationIdType conversationIdType, final boolean z) {
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#removeParticipantFromConversation", new emyl() { // from class: bddd
            @Override // defpackage.emyl
            public final Object get() {
                bdem bdemVar = bdem.this;
                final String i = ((bdrr) bdemVar.h.b()).i(bindData);
                i.getClass();
                String[] strArr = brww.a;
                brwj brwjVar = new brwj();
                brwjVar.f("removeParticipantFromConversation");
                final ConversationIdType conversationIdType2 = conversationIdType;
                brwjVar.a(new Function() { // from class: bdag
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brwv brwvVar = (brwv) obj;
                        cskc cskcVar = bdem.a;
                        brwvVar.c(Long.parseLong(i));
                        brwvVar.b(conversationIdType2);
                        return brwvVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int d = brwjVar.d();
                String[] strArr2 = bsdr.a;
                bsdi bsdiVar = new bsdi();
                bsdiVar.f("removeParticipantFromConversationToParticipants");
                bsdiVar.c(new Function() { // from class: bdah
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsdq bsdqVar = (bsdq) obj;
                        cskc cskcVar = bdem.a;
                        bsdqVar.f(Long.parseLong(i));
                        bsdqVar.b(conversationIdType2);
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boolean z2 = (d > 0) | (bsdiVar.d() > 0);
                if (z2 && z) {
                    bdemVar.P(conversationIdType2);
                    bdemVar.T(conversationIdType2);
                }
                return Boolean.valueOf(z2);
            }
        })).booleanValue();
    }

    @Override // defpackage.bczy
    public final boolean ak(ConversationIdType conversationIdType, bsoe bsoeVar) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#updateConversationRowIfExists");
        try {
            csix.h();
            boolean f2 = bsoeVar.f(conversationIdType);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final boolean al(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId) {
        csix.h();
        bsob e = bsom.e();
        e.z("updateConversationSelfIdCheck");
        e.f(new Function() { // from class: bdbh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return new bskq[]{((bskp) obj).a};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: bdbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                cskc cskcVar = bdem.a;
                bsolVar.k(aquz.b(SelfIdentityId.this));
                bsolVar.q(conversationIdType);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (!e.b().T()) {
            return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#updateConversationSelfId", new emyl() { // from class: bdbj
                @Override // defpackage.emyl
                public final Object get() {
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("updateConversationSelfId");
                    bdem bdemVar = bdem.this;
                    if (bdemVar.aa(selfIdentityId, bsoeVar)) {
                        return Boolean.valueOf(bdemVar.ak(conversationIdType, bsoeVar));
                    }
                    return false;
                }
            })).booleanValue();
        }
        ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "updateConversationSelfId", 2368, "ConversationDatabaseOperationsImpl.java")).t("Skipping self-id update, conversationId=%s", conversationIdType);
        return false;
    }

    @Override // defpackage.bczy
    public final boolean am(final ConversationIdType conversationIdType, final String str, final bdgj bdgjVar) {
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#updateParticipantJoinStatusInConversation", new emyl() { // from class: bdby
            @Override // defpackage.emyl
            public final Object get() {
                try {
                    long parseLong = Long.parseLong(str);
                    bdgj bdgjVar2 = bdgjVar;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    brwt b2 = brww.b();
                    b2.ap("updateParticipantRcsGroupJoinStatusInConversation");
                    brwv brwvVar = new brwv();
                    brwvVar.b(conversationIdType2);
                    brwvVar.c(parseLong);
                    b2.af(new brwu(brwvVar));
                    bdgi bdgiVar = (bdgi) bdgjVar2;
                    b2.d(bdgiVar.a);
                    boolean z = b2.b().e() > 0;
                    String[] strArr = bsdr.a;
                    bsdo bsdoVar = new bsdo();
                    bsdoVar.a.put("last_modified_by_key", bdqb.c(bdqb.b()));
                    bsdoVar.e.b().c("last_modified_by_key");
                    bsdoVar.ap("updateParticipantRcsGroupJoinStatusInConversation");
                    bsdq bsdqVar = new bsdq();
                    bsdqVar.b(conversationIdType2);
                    bsdqVar.f(parseLong);
                    bsdoVar.af(new bsdp(bsdqVar));
                    bsdoVar.a.put("rcs_group_join_status", Integer.valueOf(bdgiVar.a.e));
                    boolean z2 = z | (bsdoVar.b().e() > 0);
                    if (z2) {
                        bdem.this.T(conversationIdType2);
                    }
                    return Boolean.valueOf(z2);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to update RCS group join status due to invalid ID", e);
                }
            }
        })).booleanValue();
    }

    @Override // defpackage.bczy
    public final boolean an(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType) {
        return ab(Optional.empty(), bindData, new bdgi(awwp.JOINED), conversationIdType, true, false);
    }

    @Override // defpackage.bczy
    public final boolean ao(List list, final ConversationIdType conversationIdType) {
        final enhk aK = aK(list);
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new emyl() { // from class: bdbe
            @Override // defpackage.emyl
            public final Object get() {
                Map map = aK;
                for (ParticipantsTable.BindData bindData : map.keySet()) {
                    ConversationIdType conversationIdType2 = conversationIdType;
                    bdem bdemVar = bdem.this;
                    if (!bdemVar.ab(Optional.empty(), bindData, (bdgj) map.get(bindData), conversationIdType2, false, false)) {
                        return false;
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    @Override // defpackage.bczy
    public final boolean ap(final Optional optional, List list, final ConversationIdType conversationIdType, final boolean z) {
        final enhk aK = aK(list);
        return ((Boolean) this.g.c("ConversationDatabaseOperationsImpl#addParticipantsToConversation", new emyl() { // from class: bdbn
            @Override // defpackage.emyl
            public final Object get() {
                enhk enhkVar = aK;
                enqu listIterator = enhkVar.keySet().listIterator();
                while (listIterator.hasNext()) {
                    boolean z2 = z;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    Optional optional2 = optional;
                    bdem bdemVar = bdem.this;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) listIterator.next();
                    if (!bdemVar.ab(optional2, bindData, (bdgj) Optional.ofNullable((bdgj) enhkVar.get(bindData)).orElse(new bdgi(awwp.JOINED)), conversationIdType2, false, z2)) {
                        return false;
                    }
                }
                return true;
            }
        })).booleanValue();
    }

    @Override // defpackage.bczy
    public final ConversationIdType aq(final long j, final byyt byytVar, final List list, final int i, final String str, final long j2) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#createConversationId");
        try {
            final SelfIdentityId g = ((bdtd) this.c.b()).e().g();
            ConversationIdType conversationIdType = (ConversationIdType) this.g.c("ConversationDatabaseOperationsImpl#createConversationIdTransaction", new emyl() { // from class: bdcd
                /* JADX WARN: Type inference failed for: r0v3, types: [ffbr, java.lang.Object] */
                @Override // defpackage.emyl
                public final Object get() {
                    final bdem bdemVar = bdem.this;
                    final List list2 = list;
                    if (list2.isEmpty()) {
                        bdem.a.r("Creating conversation with empty list; using unknown sender.");
                        ffbr ffbrVar = bdemVar.h;
                        bvpo a2 = bdqv.a("ʼUNKNOWN_SENDER!ʼ");
                        ((bdrr) ffbrVar.b()).j(a2);
                        list2.add(a2.a());
                    }
                    final long j3 = j2;
                    final String str2 = str;
                    final int i2 = i;
                    final byyt byytVar2 = byytVar;
                    final SelfIdentityId selfIdentityId = g;
                    final long j4 = j;
                    bdemVar.d.isPresent();
                    ((csll) bdemVar.d.get().b()).i();
                    return (ConversationIdType) bdemVar.g.c("ConversationDatabaseOperationsImpl#createConversation", new emyl() { // from class: bdbw
                        @Override // defpackage.emyl
                        public final Object get() {
                            bdem bdemVar2 = bdem.this;
                            List<ParticipantsTable.BindData> list3 = list2;
                            int au = bdemVar2.au(0, false, list3.size());
                            boolean z = false;
                            for (ParticipantsTable.BindData bindData : list3) {
                                if (au != 2) {
                                    csix.k(true ^ bdtd.m(bindData));
                                }
                                z |= bdqv.c(bindData);
                            }
                            long j5 = j3;
                            String str3 = str2;
                            byyt byytVar3 = byytVar2;
                            int i3 = i2;
                            SelfIdentityId selfIdentityId2 = selfIdentityId;
                            long j6 = j4;
                            String[] strArr = bsom.a;
                            bsem bsemVar = new bsem();
                            bsemVar.as(cpxu.b(j6));
                            bsemVar.au(0L);
                            bsemVar.k(((SelfIdentityIdImpl) selfIdentityId2).a);
                            bsemVar.Y(bdem.av(list3, au));
                            bsemVar.C(z);
                            bsemVar.av(i3);
                            bsemVar.c(byytVar3);
                            bsemVar.S(true);
                            bsemVar.U(true);
                            bsemVar.T(null);
                            bsemVar.aa(str3);
                            bsemVar.i(au);
                            bsemVar.E(0);
                            bsemVar.aw(false);
                            if (j5 != -1) {
                                if (csjc.c() || ((Boolean) cful.am.e()).booleanValue()) {
                                    emxf.l(bdemVar2.q(j5).b());
                                }
                                bsemVar.am(j5);
                            }
                            bdemVar2.aB(bsemVar, list3, au);
                            final bseh a3 = bsemVar.a();
                            final dtve f2 = bsom.f();
                            ConversationIdType conversationIdType2 = new ConversationIdType(dtub.b(bsom.f(), "conversations", a3, new Function() { // from class: bsec
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dtve.this.R("conversations", (ContentValues) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bsdy
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    bseh.this.ai((Long) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }));
                            if (conversationIdType2.b()) {
                                bdem.a.n("failed to insert conversation into table.");
                                throw new IllegalStateException("unable to insert Conversation got -1 ".concat(String.valueOf(a3.toString())));
                            }
                            bdemVar2.ao(list3, conversationIdType2);
                            bdemVar2.V(conversationIdType2, null, au, true);
                            bdemVar2.aH(conversationIdType2);
                            final ayvm a4 = ((ayvn) bdemVar2.p.b()).a();
                            ensz enszVar = (ensz) ((ensz) bdem.b.h()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 830, "ConversationDatabaseOperationsImpl.java");
                            Stream map = Collection.EL.stream(list3).map(new Function() { // from class: bdee
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cskc cskcVar = bdem.a;
                                    return String.valueOf(((ParticipantsTable.BindData) obj).S());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i4 = engw.d;
                            enszVar.J("ConversationDatabaseOperationsImp: created id=%s with participantIds=%s and destinations=%s", conversationIdType2, map.collect(endq.a), Collection.EL.stream(list3).map(new bdbb()).map(new Function() { // from class: bdef
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cskc cskcVar = bdem.a;
                                    return ((ayhf) ayvm.this.a((String) obj)).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(endq.a));
                            ((bczv) bdemVar2.o.b()).a(conversationIdType2, amer.a);
                            return conversationIdType2;
                        }
                    });
                }
            });
            f.close();
            return conversationIdType;
        } finally {
        }
    }

    @Override // defpackage.bczy
    public final ConversationIdType ar(long j, byyt byytVar, List list) {
        return as(covk.a, j, byytVar, list, -1L).a();
    }

    @Override // defpackage.bczy
    public final bdfy as(final cotp cotpVar, final long j, final byyt byytVar, final List list, final long j2) {
        csix.h();
        return (bdfy) dtub.g(bsom.f(), "getOrCreateConversationWithResult", new dtuo(new emyl() { // from class: bdca
            @Override // defpackage.emyl
            public final Object get() {
                return bdfy.c(bdem.this.o(cotpVar, j));
            }
        }), new dtum(new Function() { // from class: bdcb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return Boolean.valueOf(((bdfy) obj).a().b());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dtun(new Function() { // from class: bdcc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bdfy.d(bdem.this.aq(j, byytVar, list, 0, null, j2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    @Override // defpackage.bczy
    public final boolean at(List list, final ConversationIdType conversationIdType) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(((bdrr) this.h.b()).i((ParticipantsTable.BindData) it.next()))));
        }
        String[] strArr = brww.a;
        brwj brwjVar = new brwj();
        brwjVar.f("removeParticipantsFromConversation");
        brwjVar.a(new Function() { // from class: bdab
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brwv brwvVar = (brwv) obj;
                cskc cskcVar = bdem.a;
                brwvVar.d(arrayList);
                brwvVar.b(conversationIdType);
                return brwvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boolean z = brwjVar.d() > 0;
        String[] strArr2 = bsdr.a;
        bsdi bsdiVar = new bsdi();
        bsdiVar.f("removeParticipantsFromConversation");
        bsdiVar.c(new Function() { // from class: bdac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsdq bsdqVar = (bsdq) obj;
                cskc cskcVar = bdem.a;
                bsdqVar.g(arrayList);
                bsdqVar.b(conversationIdType);
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return z | (bsdiVar.d() > 0);
    }

    public final int au(int i, boolean z, int i2) {
        if (((asvn) this.A.b()).a() && i == 9) {
            return 0;
        }
        if (i != 0 || z) {
            return 2;
        }
        return i2 > 1 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri aw(List list) {
        bdvj a2 = ((bdvl) this.n.b()).a(engw.n(list));
        final azze azzeVar = (azze) this.w.b();
        engw engwVar = a2.b.isEmpty() ? a2.a : a2.b;
        emxf.b(!engwVar.isEmpty(), "Participants must be provided.");
        if (engwVar.size() == 1) {
            return azzeVar.a((ParticipantsTable.BindData) engwVar.get(0));
        }
        return crjm.o(azzeVar.a, (engw) Collection.EL.stream(engwVar).limit(4L).map(new Function() { // from class: azzd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return azze.this.a((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
    }

    @Deprecated
    public final engw ay(cotp cotpVar, final long j) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getAllExistingConversations");
        try {
            ((cotq) this.x.b()).a(cotpVar);
            bsob e = bsom.e();
            e.z("getAllExistingConversations");
            e.i(new Function() { // from class: bddg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdem.a;
                    bsolVar.K(new cpxu(j));
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.g(new Function() { // from class: bddh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw f2 = e.b().f();
            if (!f2.isEmpty() && ((enou) f2).c != 1) {
                csjb e2 = a.e();
                e2.I("Unexpected cursor size:");
                e2.G(((enou) f2).c);
                e2.s(new Throwable());
            }
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw az(Optional optional, final ConversationIdType conversationIdType, Optional optional2) {
        engw aI = aI(conversationIdType);
        if (((Integer) optional2.orElseGet(new Supplier() { // from class: bdcj
            @Override // java.util.function.Supplier
            public final Object get() {
                return Integer.valueOf(bdem.this.c(conversationIdType));
            }
        })).intValue() != 2) {
            return aI;
        }
        if (optional.isPresent()) {
            final awui awuiVar = (awui) optional.get();
            Stream filter = Collection.EL.stream(aI).filter(new Predicate() { // from class: bdcu
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
                    cskc cskcVar = bdem.a;
                    return !awui.this.d.equals(((ParticipantsTable.BindData) obj).U());
                }
            });
            int i = engw.d;
            return (engw) filter.collect(endq.a);
        }
        csjb e = a.e();
        e.I("Failed to remove self from the list of message recipients as selfParticipant is empty.");
        e.r();
        return aI;
    }

    @Override // defpackage.bczy
    public final int b(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationSourceType");
        try {
            efbd.b();
            bseh r = r(conversationIdType);
            int s = r != null ? r.s() : 0;
            f.close();
            return s;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final int c(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationType");
        try {
            bseh r = r(conversationIdType);
            int k = r != null ? r.k() : -1;
            f.close();
            return k;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final int d(ConversationIdType conversationIdType) {
        return aJ(conversationIdType).i();
    }

    @Override // defpackage.bczy
    public final int e(List list, boolean z) {
        efbd.b();
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        bsolVar.t(list);
        if (!z) {
            bsolVar.z();
        }
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#updateMarkAsUnread");
        try {
            bsoe bsoeVar = new bsoe();
            bsoeVar.ap("updateMarkedAsUnread");
            bsoeVar.af(new bsof(bsolVar));
            int intValue = bsom.g().intValue();
            int intValue2 = bsom.g().intValue();
            if (intValue2 < 59220) {
                dtub.w("marked_as_unread", intValue2);
            }
            if (intValue >= 59220) {
                bsoeVar.a.put("marked_as_unread", Boolean.valueOf(z));
            }
            int e = bsoeVar.b().e();
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final long f(ConversationIdType conversationIdType) {
        efbd.b();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getCmsMostRecentIncomingReadMessageTimestampMs");
        try {
            bseh r = r(conversationIdType);
            long t = r == null ? 0L : r.t();
            f.close();
            return t;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final long g(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationRcsSession");
        try {
            csix.h();
            bseh r = r(conversationIdType);
            long v = r != null ? r.v() : -1L;
            f.close();
            return v;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final long h(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationSortTimestamp");
        try {
            bseh r = r(conversationIdType);
            long x = r != null ? r.x() : 0L;
            f.close();
            return x;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final SelfIdentityId i(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationSelfId");
        try {
            csix.h();
            bseh r = r(conversationIdType);
            SelfIdentityId c = aqvf.c(r != null ? r.S() : null);
            f.close();
            return c;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final /* synthetic */ bdfy j(bdgd bdgdVar) {
        return k(bdgdVar, false);
    }

    @Override // defpackage.bczy
    public final bdfy k(final bdgd bdgdVar, final boolean z) {
        return (bdfy) this.g.c("ConversationDatabaseOperationsImpl#getOrCreateConversation", new emyl() { // from class: bdeg
            @Override // defpackage.emyl
            public final Object get() {
                ConversationIdType a2;
                boolean booleanValue = ((Boolean) ayhv.a.e()).booleanValue();
                final bdem bdemVar = bdem.this;
                final bdgd bdgdVar2 = bdgdVar;
                boolean z2 = z;
                if (booleanValue) {
                    if (!z2) {
                        bczk bczkVar = (bczk) bdgdVar2;
                        if (!bczkVar.n) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            ffbr ffbrVar = new ffbr() { // from class: bdbs
                                @Override // defpackage.ffbr, defpackage.ffbq
                                public final Object b() {
                                    cskc cskcVar = bdem.a;
                                    atomicBoolean.set(true);
                                    return bdgdVar2;
                                }
                            };
                            Stream map = Collection.EL.stream(bczkVar.e).filter(new Predicate() { // from class: bdbt
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
                                    cskc cskcVar = bdem.a;
                                    return ((ParticipantsTable.BindData) obj).W() != null;
                                }
                            }).map(new Function() { // from class: bdbu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return ((aolr) bdem.this.j.b()).t((ParticipantsTable.BindData) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = engw.d;
                            ConversationIdType C = ((ayif) bdemVar.k.b()).c((engw) map.collect(endq.a), ffbrVar).C();
                            bczh bczhVar = new bczh();
                            bczhVar.b(C);
                            bczhVar.c(atomicBoolean.get());
                            return bczhVar.a();
                        }
                        final ckjy w = ckjz.w();
                        w.q(true);
                        w.p(false);
                        w.w(epby.UNKNOWN_TRIGGER_SOURCE);
                        w.j(false);
                        w.r(bczkVar.e);
                        bczkVar.o.ifPresent(new Consumer() { // from class: bddw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ckjy.this.u((String) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        bczkVar.q.ifPresent(new Consumer() { // from class: bddx
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ckjy.this.y((String) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        bczkVar.p.ifPresent(new Consumer() { // from class: bddy
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ckjy.this.s((String) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        bczkVar.l.ifPresent(new Consumer() { // from class: bddz
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ckjy.this.n((String) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        w.z(bczkVar.k);
                        a2 = ((ayvt) bdemVar.l.b()).a(w.D());
                    }
                    a2 = bdemVar.p(coto.f, ((bczk) bdgdVar2).a);
                } else {
                    if (!z2) {
                        a2 = bczw.a(bdemVar, ((bczk) bdgdVar2).a);
                    }
                    a2 = bdemVar.p(coto.f, ((bczk) bdgdVar2).a);
                }
                return !a2.b() ? bdfy.c(a2) : bdfy.d(bdemVar.l(bdgdVar2));
            }
        });
    }

    @Override // defpackage.bczy
    public final ConversationIdType l(final bdgd bdgdVar) {
        ConversationIdType conversationIdType = (ConversationIdType) this.g.c("ConversationDatabaseOperationsImpl#createConversation", new emyl() { // from class: bdan
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                Optional i;
                final bdem bdemVar = bdem.this;
                final bdgd bdgdVar2 = bdgdVar;
                SelfIdentityId selfIdentityId = (SelfIdentityId) bdgdVar2.p().orElseGet(new Supplier() { // from class: bddq
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ((ensz) ((ensz) bdem.b.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 884, "ConversationDatabaseOperationsImpl.java")).q("selfId is not provided, fallback on default.");
                        return ((bdtd) bdem.this.c.b()).e().g();
                    }
                });
                engw g = bdgdVar2.g();
                if (g.isEmpty()) {
                    bdem.a.r("Creating conversation with empty list; using unknown sender.");
                    ffbr ffbrVar = bdemVar.h;
                    bvpo a2 = bdqv.a("ʼUNKNOWN_SENDER!ʼ");
                    ((bdrr) ffbrVar.b()).j(a2);
                    g = engw.r(a2.a());
                }
                int au = bdemVar.au(bdgdVar2.a(), bdgdVar2.s(), bdgdVar2.g().size());
                Optional.empty();
                if (byyr.d(au)) {
                    i = bdgdVar2.i().or(new Supplier() { // from class: bdaf
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            Optional filter = bdgdVar2.o().filter(new Predicate() { // from class: bdeh
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
                                    String str = (String) obj;
                                    cskc cskcVar = bdem.a;
                                    if (!str.isEmpty()) {
                                        int length = str.length();
                                        int i2 = 0;
                                        while (i2 < length) {
                                            int codePointAt = str.codePointAt(i2);
                                            if (!Character.isWhitespace(codePointAt)) {
                                                return true;
                                            }
                                            i2 += Character.charCount(codePointAt);
                                        }
                                    }
                                    return false;
                                }
                            });
                            final avkc avkcVar = (avkc) bdem.this.m.b();
                            avkcVar.getClass();
                            return filter.map(new Function() { // from class: bdei
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return avkc.this.c((String) obj);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                    });
                    if (!bdgdVar2.r()) {
                        Optional map = i.map(new Function() { // from class: bdel
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
                        });
                        boolean r = bdgdVar2.r();
                        int w = bdgdVar2.w();
                        if (!map.isEmpty()) {
                            if (bdem.aG(r, w)) {
                                bdemVar.aE(2);
                            } else if (bdem.aF(w)) {
                                bdemVar.aE(6);
                            } else {
                                bdemVar.aE(1);
                            }
                            final String str = (String) map.get();
                            if (!Collection.EL.stream(g).anyMatch(new Predicate() { // from class: bdak
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
                                    cskc cskcVar = bdem.a;
                                    return str.equals(((ParticipantsTable.BindData) obj).U());
                                }
                            })) {
                                engr engrVar = new engr();
                                engrVar.j(g);
                                engrVar.h(bdqu.b((String) map.get()));
                                g = engrVar.g();
                            }
                        } else {
                            if (!bdem.aG(r, w) && !bdem.aF(w)) {
                                bdemVar.aE(3);
                                throw new IllegalStateException("Self participant is not set.");
                            }
                            if (bdem.aG(r, w)) {
                                bdemVar.aE(4);
                                ((ensz) ((ensz) bdem.b.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "addSelfParticipantToParticipantList", 1111, "ConversationDatabaseOperationsImpl.java")).q("Self participant is not being set when recovering from telephony.");
                            } else if (bdem.aF(w)) {
                                bdemVar.aE(5);
                                ((ensz) ((ensz) bdem.b.j()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "addSelfParticipantToParticipantList", 1116, "ConversationDatabaseOperationsImpl.java")).q("Self participant is not being set when recovering from CMS.");
                            }
                        }
                        g = engw.n(g);
                    }
                } else {
                    i = bdgdVar2.i();
                }
                engw g2 = bdgdVar2.g();
                int size = g2.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) g2.get(i2);
                    if (au != 2) {
                        emxf.a(!bdtd.m(bindData));
                    }
                    z = bdqv.c(bindData) | z;
                }
                String[] strArr = bsom.a;
                final bsem bsemVar = new bsem();
                bsemVar.as(bdgdVar2.f());
                bsemVar.au(0L);
                bsemVar.k(selfIdentityId.c());
                bsemVar.Y(bdem.av(g, au));
                bsemVar.C(z);
                bdgdVar2.x();
                bsemVar.av(0);
                bsemVar.c(bdgdVar2.e());
                bsemVar.S(bdgdVar2.t());
                bsemVar.U(bdgdVar2.u());
                bsemVar.T((String) bdgdVar2.q().orElse(null));
                bsemVar.aa((String) bdgdVar2.k().orElse(null));
                bsemVar.i(au);
                bsemVar.am(bdgdVar2.b());
                bsemVar.E(bdgdVar2.a());
                bsemVar.aw(false);
                if (((atlx) bdemVar.r.b()).a()) {
                    bdgdVar2.j().filter(new Predicate() { // from class: bdaj
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
                            cskc cskcVar = bdem.a;
                            return !((azcr) obj).equals(azcr.a);
                        }
                    }).ifPresent(new Consumer() { // from class: bdat
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            bsel.this.o((azcr) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                long b2 = bdgdVar2.b();
                if (b2 != -1) {
                    if (csjc.c() || ((Boolean) cful.am.e()).booleanValue()) {
                        emxf.l(bdemVar.q(b2).b());
                    }
                    bsemVar.am(b2);
                }
                if (bdgdVar2.s() && !bdgdVar2.r()) {
                    bsemVar.aj(Optional.of(bdemVar.i.f()));
                }
                if (bdgdVar2.s() || bdgdVar2.r()) {
                    bdgdVar2.n().ifPresent(new Consumer() { // from class: bdaw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            String str2 = (String) obj;
                            cskc cskcVar = bdem.a;
                            if (emxe.c(str2)) {
                                return;
                            }
                            bsel.this.ai(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    bdgdVar2.l().ifPresent(new Consumer() { // from class: bdax
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            String str2 = (String) obj;
                            cskc cskcVar = bdem.a;
                            if (emxe.c(str2)) {
                                return;
                            }
                            bsel.this.af(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    bdgdVar2.o().ifPresent(new Consumer() { // from class: bday
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            String str2 = (String) obj;
                            cskc cskcVar = bdem.a;
                            if (emxe.c(str2)) {
                                return;
                            }
                            bsel.this.ak(str2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                if (bdgdVar2.r()) {
                    bsemVar.g(csgg.RESTORED_FROM_TELEPHONY);
                }
                bdgdVar2.m().ifPresent(new Consumer() { // from class: bdaz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        bsel.this.ag((cknh) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bdemVar.aB(bsemVar, g, au);
                ConversationIdType D = bsemVar.a().D();
                bdemVar.ap(i, g, D, bdgdVar2.r());
                bdemVar.V(D, (String) bdgdVar2.h().orElse(null), au, true);
                if (!bdgdVar2.r()) {
                    bdemVar.aH(D);
                }
                final ayvm a3 = ((ayvn) bdemVar.p.b()).a();
                ((ensz) ((ensz) bdem.b.h()).h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationDatabaseOperationsImpl", "createConversation", 1056, "ConversationDatabaseOperationsImpl.java")).J("ConversationDatabaseOperationsImpl: created id=%s with participantIds=%s and destinations=%s", D, Collection.EL.stream(g).map(new Function() { // from class: bdba
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = bdem.a;
                        return String.valueOf(((ParticipantsTable.BindData) obj).S());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a), Collection.EL.stream(g).map(new bdbb()).map(new Function() { // from class: bdeb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = bdem.a;
                        return ((ayhf) ayvm.this.a((String) obj)).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a));
                return D;
            }
        });
        ((bczv) this.o.b()).a(conversationIdType, bdgdVar.c());
        return conversationIdType;
    }

    @Override // defpackage.bczy
    public final /* synthetic */ ConversationIdType m(long j) {
        return o(covk.a, j);
    }

    @Override // defpackage.bczy
    public final /* synthetic */ ConversationIdType n(cpxu cpxuVar) {
        return bczw.a(this, cpxuVar);
    }

    @Override // defpackage.bczy
    public final ConversationIdType o(cotp cotpVar, long j) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getExistingConversation");
        try {
            csix.h();
            ((cotq) this.x.b()).a(cotpVar);
            ConversationIdType conversationIdType = (ConversationIdType) Collection.EL.stream(ay(cotpVar, j)).findFirst().orElse(bdgq.a);
            f.close();
            return conversationIdType;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final ConversationIdType p(cotp cotpVar, cpxu cpxuVar) {
        if (cpxuVar.d()) {
            return bdgq.a;
        }
        ((cotq) this.x.b()).a(cotpVar);
        return o(cotpVar, cpxv.a(cpxuVar));
    }

    @Override // defpackage.bczy
    public final ConversationIdType q(final long j) {
        ConversationIdType conversationIdType;
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getExistingRcsConversation");
        try {
            csix.h();
            csix.e(-1L, j);
            bsob e = bsom.e();
            e.z("getExistingRcsConversation");
            e.g(new Function() { // from class: bdek
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.i(new Function() { // from class: bczz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdem.a;
                    bsolVar.I(j);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            try {
                if (bskrVar.moveToFirst()) {
                    if (bskrVar.getCount() != 1) {
                        csjb e2 = a.e();
                        e2.I("Unexpected cursor size:");
                        e2.G(bskrVar.getCount());
                        e2.s(new Throwable());
                    }
                    conversationIdType = bskrVar.h();
                } else {
                    conversationIdType = bdgq.a;
                }
                bskrVar.close();
                f.close();
                return conversationIdType;
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

    @Override // defpackage.bczy
    public final bseh r(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getConversationDataFromConversationId");
        try {
            bseh bsehVar = (bseh) bsom.j(conversationIdType, new Function() { // from class: bdda
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bseh bsehVar2 = (bseh) obj;
                    cskc cskcVar = bdem.a;
                    return bsehVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return bsehVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final byyt s(ConversationIdType conversationIdType) {
        return (byyt) bsom.j(conversationIdType, new Function() { // from class: bdcq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bdem.a;
                return ((bseh) obj).G();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.bczy
    public final csgg t(ConversationIdType conversationIdType) {
        efbd.b();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getCmsLifeCycleState");
        try {
            csgg csggVar = (csgg) bsom.j(conversationIdType, new Function() { // from class: bdcs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bseh) obj).N();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return csggVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final engw u() {
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getAllConversationIds");
        try {
            bsob e = bsom.e();
            e.z("getAllConversationIds");
            e.g(new Function() { // from class: bddk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdem.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw f2 = e.b().f();
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final /* synthetic */ engw v(cpxu cpxuVar) {
        return w(covk.a, cpxuVar);
    }

    @Override // defpackage.bczy
    public final engw w(cotp cotpVar, cpxu cpxuVar) {
        return ay(cotpVar, cpxv.a(cpxuVar));
    }

    @Override // defpackage.bczy
    public final engw x(final ConversationIdType conversationIdType) {
        String[] strArr = bjnz.a;
        bjnu bjnuVar = new bjnu(bjnz.a);
        bjnuVar.z("getRcsGroupJoinStatusOfParticipantsInConversation");
        bjnuVar.c(new Function() { // from class: bdec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bjny bjnyVar = (bjny) obj;
                cskc cskcVar = bdem.a;
                bjnyVar.b(ConversationIdType.this);
                return bjnyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bjnuVar.b().y();
    }

    @Override // defpackage.bczy
    public final engw y(final Optional optional, final ConversationIdType conversationIdType) {
        efbd.b();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getRecipientsForConversation");
        try {
            engw engwVar = (engw) this.g.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new emyl() { // from class: bdcz
                @Override // defpackage.emyl
                public final Object get() {
                    return bdem.this.az(optional, conversationIdType, Optional.empty());
                }
            });
            f.close();
            return engwVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bczy
    public final engw z(final Optional optional, final ConversationIdType conversationIdType, final int i) {
        efbd.b();
        ekzz f = eleg.f("ConversationDatabaseOperationsImpl#getRecipientsForConversationWithCachedType");
        try {
            engw engwVar = (engw) this.g.c("ConversationDatabaseOperationsImpl#getRecipientsForConversation", new emyl() { // from class: bdbz
                @Override // defpackage.emyl
                public final Object get() {
                    return bdem.this.az(optional, conversationIdType, Optional.of(Integer.valueOf(i)));
                }
            });
            f.close();
            return engwVar;
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
