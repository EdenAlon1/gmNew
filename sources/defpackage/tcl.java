package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcl extends ceut {
    public static final entd a = entd.c("BugleSuperSort");
    static final cfva b = cfvl.i(cfvl.b, "supersort_enable_qpbc", false);
    static final cfva c = cfvl.i(cfvl.b, "supersort_qpbc_charging", false);
    static final cfva d = cfvl.e(cfvl.b, "supersort_qpbc_max", 3);
    static final cfva e = cfvl.e(cfvl.b, "supersort_qpbc_max_items", 100);
    public final ffbr f;
    public final ffbr g;
    public final tba h;
    public final errl i;
    private final errl j;

    public tcl(ffbr ffbrVar, ffbr ffbrVar2, tba tbaVar, errl errlVar, errl errlVar2) {
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = tbaVar;
        this.i = errlVar;
        this.j = errlVar2;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        poh pohVar = new poh();
        pohVar.c = true;
        if (((Boolean) c.e()).booleanValue()) {
            pohVar.a = true;
        }
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ParticipantBasedQuickClassificationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "processPendingWorkItemAsync", 157, "ParticipantBasedQuickClassificationHandler.java")).t("Handler %s invoked", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
        if (((Boolean) b.e()).booleanValue()) {
            return ((ahik) this.f.b()).e().i(new eroh() { // from class: tbv
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ahij ahijVar = (ahij) obj;
                    if (!aewg.h()) {
                        ((ensz) ((ensz) tcl.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "processPendingWorkItemAsync", 169, "ParticipantBasedQuickClassificationHandler.java")).t("Supersort flag is disabled, skipping %s", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
                        return elfo.e(true);
                    }
                    if (!ahijVar.c().c() && ahijVar.c().e()) {
                        ((ensz) ((ensz) tcl.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "processPendingWorkItemAsync", 175, "ParticipantBasedQuickClassificationHandler.java")).t("Supersort feature is disabled by the user, skipping %s", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
                        return elfo.e(true);
                    }
                    if (ahijVar.a() >= ((Integer) tcl.d.e()).intValue()) {
                        ((ensz) ((ensz) tcl.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "processPendingWorkItemAsync", 181, "ParticipantBasedQuickClassificationHandler.java")).t("Supersort reached max attempt, skipping %s", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
                        return elfo.e(true);
                    }
                    final tcl tclVar = tcl.this;
                    return ((ahik) tclVar.f.b()).c().i(new eroh() { // from class: tck
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            elfl e2 = elfo.e(true);
                            tcl tclVar2 = tcl.this;
                            tclVar2.h.b();
                            int intValue = ((Integer) tcl.e.e()).intValue();
                            bsob e3 = bsom.e();
                            e3.z("getConversationsWithoutLabelInfo-conversations");
                            e3.i(new Function() { // from class: tbu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bsol bsolVar = (bsol) obj3;
                                    entd entdVar2 = tcl.a;
                                    brry a2 = brsd.a();
                                    a2.c(new Function() { // from class: tbx
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            entd entdVar3 = tcl.a;
                                            return ((brrd) obj4).b;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bsolVar.v(a2.b());
                                    return bsolVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            e3.x(intValue);
                            e3.e(new bsny(bsom.c.r, false));
                            bskr bskrVar = (bskr) e3.b().o();
                            try {
                                int i = engw.d;
                                final engr engrVar = new engr();
                                while (bskrVar.moveToNext()) {
                                    if (bskrVar.i().a > 0) {
                                        try {
                                            engrVar.h(bskrVar.h());
                                        } catch (NumberFormatException unused) {
                                            ((ensz) tcl.a.a(Level.WARNING).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "getConversationsWithoutLabelInfo", 252, "ParticipantBasedQuickClassificationHandler.java")).t("cannot parse %s as a conversation id", bskrVar.h());
                                        }
                                    }
                                }
                                ekzz f = eleg.f("ParticipantBasedQuickClassificationHandler::getConversationsWithoutLabelInfo_dsdrGroupsFlag");
                                try {
                                    bvvn e4 = ParticipantsTable.e();
                                    e4.z("getConversationsWithoutLabelInfo#participants");
                                    e4.h(new Function() { // from class: tcc
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            bvvw bvvwVar = (bvvw) obj3;
                                            entd entdVar2 = tcl.a;
                                            String[] strArr = bsdr.a;
                                            bsdm bsdmVar = new bsdm(bsdr.a);
                                            bsdmVar.e(new Function() { // from class: tca
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj4) {
                                                    entd entdVar3 = tcl.a;
                                                    return ((bscz) obj4).b;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            final engr engrVar2 = engr.this;
                                            bsdmVar.f(new Function() { // from class: tcb
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj4) {
                                                    bsdq bsdqVar = (bsdq) obj4;
                                                    entd entdVar3 = tcl.a;
                                                    bsdqVar.e(engr.this.g());
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
                                    final enhk enhkVar = (enhk) Collection.EL.stream(e4.b().y()).collect(endq.a(new Function() { // from class: tcd
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            return ((ParticipantsTable.BindData) obj3).S();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Function() { // from class: tce
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                                            entd entdVar2 = tcl.a;
                                            return bindData;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }));
                                    String[] strArr = bsdr.a;
                                    bsdm bsdmVar = new bsdm(bsdr.a);
                                    bsdmVar.z("getConversationsWithoutLabelInfo#conversation_participants");
                                    bsdmVar.f(new Function() { // from class: tcf
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            bsdq bsdqVar = (bsdq) obj3;
                                            entd entdVar2 = tcl.a;
                                            bsdqVar.e(engr.this.g());
                                            return bsdqVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    Map map = (Map) Collection.EL.stream(bsdmVar.b().y()).collect(Collectors.groupingBy(new Function() { // from class: tcg
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            entd entdVar2 = tcl.a;
                                            return ((bscj) obj3).m();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Supplier() { // from class: tch
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return new HashMap();
                                        }
                                    }, Collectors.mapping(new Function() { // from class: tci
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj3) {
                                            entd entdVar2 = tcl.a;
                                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) enhk.this.get(String.valueOf(((bscj) obj3).k()));
                                            bindData.getClass();
                                            return bindData;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, endq.b)));
                                    bskrVar.moveToPosition(-1);
                                    engr engrVar2 = new engr();
                                    while (bskrVar.moveToNext()) {
                                        ConversationIdType h = bskrVar.h();
                                        if (map.containsKey(h)) {
                                            MessageIdType i2 = bskrVar.i();
                                            enip enipVar = (enip) Collection.EL.stream((enip) map.get(h)).filter(new Predicate() { // from class: tcj
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
                                                public final boolean test(Object obj3) {
                                                    entd entdVar2 = tcl.a;
                                                    return !bdtd.m((ParticipantsTable.BindData) obj3);
                                                }
                                            }).collect(endq.b);
                                            if (enipVar == null) {
                                                throw new NullPointerException("Null otherParticipants");
                                            }
                                            engrVar2.h(new tar(h, i2, enipVar));
                                        }
                                    }
                                    engw g = engrVar2.g();
                                    f.close();
                                    bskrVar.close();
                                    int i3 = ((enou) g).c;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        tbt tbtVar = (tbt) g.get(i4);
                                        enqu listIterator = tbtVar.c().listIterator();
                                        while (listIterator.hasNext()) {
                                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) listIterator.next();
                                            if (aoqw.j(bindData.U()) || bdqv.d(bindData) || bindData.D().a()) {
                                                if (!aewg.g(SuperSortLabel.BUSINESS_UPDATE)) {
                                                    e2 = tclVar2.k(e2, tbtVar, SuperSortLabel.BUSINESS_UPDATE);
                                                }
                                            }
                                        }
                                        enqu listIterator2 = tbtVar.c().listIterator();
                                        while (true) {
                                            if (!listIterator2.hasNext()) {
                                                break;
                                            }
                                            if (!TextUtils.isEmpty(((ParticipantsTable.BindData) listIterator2.next()).T())) {
                                                e2 = tclVar2.k(e2, tbtVar, SuperSortLabel.PERSONAL);
                                                break;
                                            }
                                        }
                                    }
                                    return e2.h(new emwl() { // from class: tby
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            entd entdVar2 = tcl.a;
                                            return true;
                                        }
                                    }, erpp.a);
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    bskrVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, tclVar.i);
                }
            }, this.j).h(new emwl() { // from class: tbw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    entd entdVar2 = tcl.a;
                    if (bool == null || !bool.booleanValue()) {
                        ((ensz) ((ensz) tcl.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "complete", 223, "ParticipantBasedQuickClassificationHandler.java")).t("%s: completed and requesting rescheduling.", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
                        return ceyt.j(engw.r(ceyr.f("PARTICIPANT_BASED_QUICK_CLASSIFICATION")));
                    }
                    ((ensz) ((ensz) tcl.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "complete", 219, "ParticipantBasedQuickClassificationHandler.java")).t("%s: completed.", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
                    return ceyt.i();
                }
            }, this.j);
        }
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/classify/workhandler/ParticipantBasedQuickClassificationHandler", "processPendingWorkItemAsync", 159, "ParticipantBasedQuickClassificationHandler.java")).t("%s: disabled by flag.", "PARTICIPANT_BASED_QUICK_CLASSIFICATION");
        return elfo.e(ceyt.i());
    }

    public final elfl k(elfl elflVar, final tbt tbtVar, final SuperSortLabel superSortLabel) {
        return elflVar.i(new eroh() { // from class: tbz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                aeyq aeyqVar = (aeyq) tcl.this.g.b();
                MessageIdType b2 = tbtVar.b();
                buax buaxVar = buax.LOW;
                String valueOf = String.valueOf(aewg.e());
                return aeyqVar.a(new aeyc(b2, superSortLabel, "", buay.MODEL, buaxVar, valueOf.concat("_approximate"), false));
            }
        }, this.i);
    }
}
