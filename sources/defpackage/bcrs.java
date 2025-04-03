package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcrs extends bcyk implements bcyg {
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData");
    public final ffbr a;
    public final azbq b;
    private final ffbr h;
    private final ffbr i;
    private final csjk j;
    private final clws k;
    private final ffbr l;
    private final ffbr m;
    private final Context n;
    private final ffbr o;

    public bcrs(ffbr ffbrVar, ffbr ffbrVar2, csjk csjkVar, clws clwsVar, ffbr ffbrVar3, azbq azbqVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Context context) {
        this.h = ffbrVar;
        String[] strArr = bgmn.a;
        bfle.a(bdgq.a, new cpxu(), byyy.NAME_IS_AUTOMATIC, byyt.UNARCHIVED, ayhd.b(0), bdhe.b(-1L), new cfmh(0L), bdhb.a, ardn.VMT_STATUS_UNKNOWN, bdgq.a, new dtrr(bgmn.d()));
        String[] strArr2 = bfkq.a;
        this.d = bejh.a(bdgq.a, new cpxu(), byyy.NAME_IS_AUTOMATIC, byyt.UNARCHIVED, ayhd.b(0), bdhe.b(-1L), new cfmh(0L), bdhb.a, ardn.VMT_STATUS_UNKNOWN, bdgq.a, new dtrr(bfkq.e()));
        this.i = ffbrVar2;
        this.j = csjkVar;
        this.k = clwsVar;
        this.a = ffbrVar3;
        this.b = azbqVar;
        this.o = ffbrVar4;
        this.l = ffbrVar5;
        this.m = ffbrVar6;
        this.n = context;
    }

    private final Optional Z() {
        if (f() == null) {
            ensk j = g.j();
            j.Y(ente.a, "BugleConversation");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 705, "ConversationListItemData.java")).q("currentSelfId is null");
            return Optional.empty();
        }
        Optional map = Optional.ofNullable(((bdtd) this.o.b()).f(f())).map(new Function() { // from class: bcrp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((aztg) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map.isEmpty()) {
            ensk j2 = g.j();
            j2.Y(ente.a, "BugleConversation");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getSubIdFromSelfId", 719, "ConversationListItemData.java")).q("subId is not present");
        }
        return map;
    }

    @Override // defpackage.bcyk
    public final String A(String str) {
        return (!E() && b() == 210) ? str : z();
    }

    public final boolean B() {
        return !bdqu.o(this.d.o());
    }

    public final boolean C() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            p().ifPresent(new Consumer() { // from class: bcrq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    atomicBoolean.set(((aoku) obj).A());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return B() && !atomicBoolean.get();
    }

    @Override // defpackage.bcyk
    public final boolean D() {
        bejf bejfVar = this.d;
        bejfVar.az(23, "notification_enabled");
        return bejfVar.x;
    }

    @Override // defpackage.bcyg
    public final boolean E() {
        return this.d.q();
    }

    public final boolean F() {
        bejf bejfVar = this.d;
        bejfVar.az(32, "IS_ENTERPRISE");
        return bejfVar.G;
    }

    public final boolean G() {
        return !Q().b();
    }

    @Override // defpackage.bcyg
    public final boolean H() {
        if (this.d.h() == 4) {
            return false;
        }
        return bcym.d(this.d.q(), this.d.i());
    }

    @Override // defpackage.bcyg
    public final boolean I() {
        bejf bejfVar = this.d;
        bejfVar.az(52, "read");
        return bejfVar.aa;
    }

    final boolean J() {
        return d() == 2;
    }

    @Override // defpackage.bcyk
    public final boolean K() {
        return ((bzqc) this.i.b()).g() && this.d.g() != 0;
    }

    @Override // defpackage.bcyk
    public final int a() {
        bejf bejfVar = this.d;
        bejfVar.az(29, "join_state");
        return bejfVar.D;
    }

    @Override // defpackage.bcyg
    public final int b() {
        return this.d.i();
    }

    public final int c() {
        bejf bejfVar = this.d;
        bejfVar.az(22, "participant_count");
        return bejfVar.w;
    }

    @Override // defpackage.bcyk
    public final int d() {
        bejf bejfVar = this.d;
        bejfVar.az(31, "send_mode");
        return bejfVar.F;
    }

    @Override // defpackage.bcyk
    public final long e() {
        return this.d.j();
    }

    @Override // defpackage.bcyk
    public final SelfIdentityId f() {
        return aqvf.c(this.d.m());
    }

    public final bcyl g() {
        return new bcyl(c() == 2 ? null : Integer.valueOf(((cttz) this.h.b()).g().a), this.d.n(), this.d.o());
    }

    @Override // defpackage.bcyk
    public final MessageUsageStatisticsData h(eooi eooiVar, DeviceData deviceData, long j) {
        ekzz f = eleg.f("ConversationListItemData::createMessageUsageStatisticsData");
        try {
            MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl(eooiVar, deviceData, L(), ((Boolean) ((cfup) MessageUsageStatisticsData.b.get()).e()).booleanValue() ? eoog.FIRST_ATTEMPT_TO_SEND : l(), eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON, m(), k(), n(), o().N, j);
            f.close();
            return messageUsageStatisticsDataImpl;
        } finally {
        }
    }

    @Override // defpackage.bcyk
    public final MessageIdType i() {
        return this.d.l();
    }

    @Override // defpackage.bcyk
    public final cpxu j() {
        bejf bejfVar = this.d;
        bejfVar.az(1, "sms_thread_id");
        return bejfVar.b;
    }

    public final eooe k() {
        if (L() != 0) {
            return eooe.GROUP_CONVERSATION;
        }
        if (d() == 1) {
            return eooe.CONVERSATION_SET_TO_XMS_ONLY;
        }
        Optional Z = Z();
        if (!Z.isEmpty()) {
            if (((djrv) this.l.b()).x(((Integer) Z.get()).intValue())) {
                Optional p = p();
                return (!p.isEmpty() && this.b.a((aoku) p.get()).g()) ? J() ? eooe.CONVERSATION_LATCHED_TO_XMS : eooe.OTHER_REASON : eooe.RECEIVER_NOT_AVAILABLE;
            }
        }
        return eooe.SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
    }

    public final eoog l() {
        int b = b();
        return (b == 6 || b == 7 || b == 8 || b == 19 || b == 9) ? eoog.RESEND_ATTEMPT : eoog.FIRST_ATTEMPT_TO_SEND;
    }

    public final eooo m() {
        return e() != -1 ? eooo.WAS_RCS_CONVERSATION : eooo.HAS_ALWAYS_BEEN_XMS_CONVERSATION;
    }

    public final eoxo n() {
        eosl eoslVar;
        eoxk eoxkVar = (eoxk) eoxo.a.createBuilder();
        Optional Z = Z();
        if (Z.filter(new Predicate() { // from class: bcrj
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
                return ((Integer) obj).intValue() == -1;
            }
        }).isPresent()) {
            ensk j = g.j();
            j.Y(ente.a, "BugleConversation");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/ConversationListItemData", "getRcsReadinessConditions", 693, "ConversationListItemData.java")).q("Unexpected default subId in rcs readiness conditions");
            eoslVar = this.k.d();
        } else {
            Optional filter = Z.filter(new Predicate() { // from class: bcrk
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
                    return ((Integer) obj).intValue() >= 0;
                }
            });
            final clws clwsVar = this.k;
            clwsVar.getClass();
            eoslVar = (eosl) filter.map(new Function() { // from class: bcrl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return clws.this.e(((Integer) obj).intValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseGet(new Supplier() { // from class: bcrm
                @Override // java.util.function.Supplier
                public final Object get() {
                    eosk eoskVar = (eosk) eosl.a.createBuilder();
                    eoskVar.copyOnWrite();
                    eosl eoslVar2 = (eosl) eoskVar.instance;
                    eoslVar2.f = 1;
                    eoslVar2.b |= 16;
                    return (eosl) eoskVar.build();
                }
            });
        }
        eoxkVar.copyOnWrite();
        eoxo eoxoVar = (eoxo) eoxkVar.instance;
        eoslVar.getClass();
        eoxoVar.c = eoslVar;
        eoxoVar.b |= 1;
        eoks b = altl.b(Integer.valueOf(L()));
        eoxkVar.copyOnWrite();
        eoxo eoxoVar2 = (eoxo) eoxkVar.instance;
        eoxoVar2.f = b.f;
        eoxoVar2.b |= 8;
        int i = d() == 1 ? 3 : 2;
        eoxkVar.copyOnWrite();
        eoxo eoxoVar3 = (eoxo) eoxkVar.instance;
        eoxoVar3.g = i - 1;
        eoxoVar3.b |= 16;
        int i2 = true != J() ? 2 : 3;
        eoxkVar.copyOnWrite();
        eoxo eoxoVar4 = (eoxo) eoxkVar.instance;
        eoxoVar4.h = i2 - 1;
        eoxoVar4.b |= 32;
        return (eoxo) eoxkVar.build();
    }

    public final eqwf o() {
        return ((ckge) this.j.a()).d();
    }

    @Override // defpackage.bcyg
    public final Optional p() {
        return Optional.ofNullable(this.d.o()).map(new Function() { // from class: bcrr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bcrs bcrsVar = bcrs.this;
                return ((aolr) bcrsVar.a.b()).u(emxe.b((String) obj), bcrsVar.M());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final Boolean q() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            p().ifPresent(new Consumer() { // from class: bcrn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    atomicBoolean.set(((aoku) obj).A());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    public final Boolean r() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (((asvn) this.m.b()).a()) {
            p().ifPresent(new Consumer() { // from class: bcro
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    atomicBoolean.set(((aoku) obj).C());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(atomicBoolean.get());
    }

    @Override // defpackage.bcyk
    public final String s() {
        if (P() == amny.c) {
            return cggr.a.toString();
        }
        bejf bejfVar = this.d;
        bejfVar.az(16, "icon");
        return bejfVar.q;
    }

    @Override // defpackage.bcyg
    public final String t() {
        return (P() == amny.c && byyr.b(L())) ? this.n.getString(R.string.unapproved_group_conversation_name) : this.d.n();
    }

    public final String u() {
        bejf bejfVar = this.d;
        bejfVar.az(18, "participant_lookup_key");
        return bejfVar.s;
    }

    @Override // defpackage.bcyg
    public final String v() {
        bejf bejfVar = this.d;
        bejfVar.az(7, "preview_content_type");
        return bejfVar.h;
    }

    @Override // defpackage.bcyk
    public final String w() {
        bejf bejfVar = this.d;
        bejfVar.az(38, "rcs_conference_uri");
        return bejfVar.M;
    }

    @Override // defpackage.bcyk
    public final String x() {
        bejf bejfVar = this.d;
        bejfVar.az(37, "rcs_group_id");
        return bejfVar.L;
    }

    @Override // defpackage.bcyk
    public final String y() {
        bejf bejfVar = this.d;
        bejfVar.az(60, "first_name");
        String str = bejfVar.ai;
        bejf bejfVar2 = this.d;
        bejfVar2.az(59, "full_name");
        String str2 = bejfVar2.ah;
        bejf bejfVar3 = this.d;
        bejfVar3.az(58, "display_destination");
        return this.c.a(str, str2, bejfVar3.ag);
    }

    public final String z() {
        if (this.d.aF("SNIPPET_TO_USE")) {
            return this.d.ay("SNIPPET_TO_USE");
        }
        bejf bejfVar = this.d;
        bejfVar.az(4, "snippet_text");
        return bejfVar.e;
    }
}
