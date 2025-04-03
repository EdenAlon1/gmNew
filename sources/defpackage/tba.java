package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tba {
    public static final emyl a = cfvl.w("ss_no_ml_outgoing");
    public static final entd b = entd.c("BugleSuperSort");
    public static final engw c = engw.w(SuperSortLabel.PERSONAL, SuperSortLabel.TRANSACTION, SuperSortLabel.PROMOTION, SuperSortLabel.OTP, SuperSortLabel.UPDATE, SuperSortLabel.BUSINESS_UPDATE);
    public final fazb d;
    public final aeyd e;
    public final ffbr f;
    public final errl g;
    public boolean h = true;
    public int i = 1;
    public final bafi j;
    private final errl k;
    private final ffbr l;

    public tba(fazb fazbVar, aeyd aeydVar, ffbr ffbrVar, bafi bafiVar, errl errlVar, errl errlVar2, ffbr ffbrVar2) {
        this.d = fazbVar;
        this.e = aeydVar;
        this.f = ffbrVar;
        this.j = bafiVar;
        this.k = errlVar;
        this.g = errlVar2;
        this.l = ffbrVar2;
    }

    final elfl a(elfl elflVar, final MessageIdType messageIdType) {
        return elflVar.i(new eroh() { // from class: tav
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final String b2 = messageIdType.b();
                tba tbaVar = tba.this;
                return elfl.g(((GenericWorkerQueueAction) tbaVar.j.b()).n(Integer.parseInt(b2))).e(Throwable.class, new emwl() { // from class: taz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ensz enszVar = (ensz) tba.b.j();
                        enszVar.Y(csux.a, b2.toString());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "processGwqWorkItems", 172, "ClassifyMessages.java")).q("Couldn't ensure annotations are generated");
                        return null;
                    }
                }, tbaVar.g);
            }
        }, this.k).i(new eroh() { // from class: taw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                tba tbaVar = tba.this;
                bdmq bdmqVar = (bdmq) tbaVar.f.b();
                MessageIdType messageIdType2 = messageIdType;
                MessageCoreData v = bdmqVar.v(messageIdType2);
                if (v == null) {
                    ensz enszVar = (ensz) tba.b.j();
                    enszVar.Y(csux.a, messageIdType2.b());
                    ((ensz) enszVar.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "generateClassifications", 185, "ClassifyMessages.java")).q("ClassifyMessages: no corresponding message found.");
                    return elfo.e(new ctin().a());
                }
                if (((Boolean) ((cfup) tba.a.get()).e()).booleanValue() && v.cS()) {
                    ensk o = tba.b.o();
                    o.Y(csux.a, messageIdType2.b());
                    ((ensz) o.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "generateClassifications", 193, "ClassifyMessages.java")).q("ClassifyMessages: outgoing message, skipping.");
                    return elfo.e(new ctin().a());
                }
                if (TextUtils.isEmpty(v.ar())) {
                    ensk o2 = tba.b.o();
                    o2.Y(csux.a, messageIdType2.b());
                    ((ensz) o2.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "generateClassifications", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "ClassifyMessages.java")).q("ClassifyMessages: not a text message, skipping.");
                    return elfo.e(new ctin().a());
                }
                ensk o3 = tba.b.o();
                o3.X(tbaVar.i);
                o3.Y(csux.a, messageIdType2.b());
                ((ensz) o3.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "generateClassifications", 209, "ClassifyMessages.java")).q("ClassifyMessages: generating supersort classifications");
                return ((ctiw) tbaVar.d.b()).a(engw.r(v));
            }
        }, this.k).i(new eroh() { // from class: tax
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ctje ctjeVar = (ctje) obj;
                String b2 = messageIdType.b();
                if (ctjeVar == null) {
                    ensk o = tba.b.o();
                    o.Y(csux.a, b2.toString());
                    ((ensz) o.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "persistClassifications", 219, "ClassifyMessages.java")).q("ClassifyMessages: received null smartsResults");
                    return elfo.e(false);
                }
                tba tbaVar = tba.this;
                ensk o2 = tba.b.o();
                o2.X(tbaVar.i);
                o2.Y(csux.a, b2.toString());
                ((ensz) o2.h("com/google/android/apps/messaging/classify/workhandler/ClassifyMessages", "persistClassifications", 227, "ClassifyMessages.java")).q("ClassifyMessages: persisting supersort classifications");
                final MessageIdType b3 = bdhb.b(b2);
                final boolean z = tbaVar.h;
                if (aewg.h()) {
                    final List list = ctjeVar.b;
                    final aeyo aeyoVar = (aeyo) tbaVar.e;
                    return ((ahik) aeyoVar.d.b()).d().i(new eroh() { // from class: aeyg
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            if (!((Boolean) obj2).booleanValue()) {
                                return elfo.e(false);
                            }
                            final MessageIdType messageIdType2 = b3;
                            final MessagesTable.BindData b4 = MessagesTable.b(messageIdType2);
                            if (b4 == null || b4.X() == null) {
                                ensz enszVar = (ensz) aeyo.a.j();
                                enszVar.Y(csux.a, messageIdType2.b());
                                ((ensz) enszVar.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 86, "ClassificationPersisterImpl.java")).q("Unable to load message");
                                return elfo.e(false);
                            }
                            final ConversationIdType C = b4.C();
                            if (C.b()) {
                                ensz enszVar2 = (ensz) aeyo.a.j();
                                enszVar2.Y(csux.a, messageIdType2.b());
                                ((ensz) enszVar2.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 94, "ClassificationPersisterImpl.java")).q("Unable to determine the conversation");
                                return elfo.e(false);
                            }
                            final boolean z2 = z;
                            final List list2 = list;
                            final aeyo aeyoVar2 = aeyo.this;
                            final engw e = bdrr.e(C);
                            String X = b4.X();
                            X.getClass();
                            return (ListenableFuture) ParticipantsTable.k(X, new Function() { // from class: aeyk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    boolean z3;
                                    SuperSortLabel superSortLabel;
                                    aeyo aeyoVar3 = aeyo.this;
                                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                                    aezz aezzVar = aeyoVar3.c.get();
                                    buxo d = MessagesTable.d();
                                    d.z("isConversationStartedByUser");
                                    d.f(new Function() { // from class: aeyh
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            entd entdVar = aeyo.a;
                                            return ((buum) obj4).k;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    final ConversationIdType conversationIdType = C;
                                    d.h(new Function() { // from class: aeyi
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            buxz buxzVar = (buxz) obj4;
                                            entd entdVar = aeyo.a;
                                            buxzVar.m(ConversationIdType.this);
                                            buxzVar.b(new Function() { // from class: aeym
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj5) {
                                                    buxz buxzVar2 = (buxz) obj5;
                                                    entd entdVar2 = aeyo.a;
                                                    buxzVar2.al();
                                                    return buxzVar2;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Function() { // from class: aeyn
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo448andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj5) {
                                                    buxz buxzVar2 = (buxz) obj5;
                                                    entd entdVar2 = aeyo.a;
                                                    buxzVar2.ag();
                                                    return buxzVar2;
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            });
                                            buxzVar.B(false);
                                            return buxzVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    buum buumVar = MessagesTable.c;
                                    d.d(new buxl(buumVar.i, true), new buxl(buumVar.a, true));
                                    d.x(1);
                                    buuo buuoVar = (buuo) d.b().o();
                                    try {
                                        if (buuoVar.moveToNext()) {
                                            int i = buuoVar.i();
                                            boolean z4 = i > 0 && i <= 25;
                                            buuoVar.close();
                                            z3 = z4;
                                        } else {
                                            buuoVar.close();
                                            z3 = false;
                                        }
                                        final MessagesTable.BindData bindData2 = b4;
                                        agsp a2 = agss.a();
                                        a2.z("getPreviousLabelInConversation");
                                        a2.r();
                                        a2.e(new Function() { // from class: aeyj
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                Object apply;
                                                agsr agsrVar = (agsr) obj4;
                                                entd entdVar = aeyo.a;
                                                final MessagesTable.BindData bindData3 = MessagesTable.BindData.this;
                                                agsrVar.b(bindData3.C());
                                                Function[] functionArr = {new Function() { // from class: aeye
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        agsr agsrVar2 = (agsr) obj5;
                                                        entd entdVar2 = aeyo.a;
                                                        agsrVar2.aq(new dtwe("messages.received_timestamp", 8, Long.valueOf(MessagesTable.BindData.this.w())));
                                                        return agsrVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }, new Function() { // from class: aeyf
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        agsr agsrVar2 = (agsr) obj5;
                                                        entd entdVar2 = aeyo.a;
                                                        MessagesTable.BindData bindData4 = MessagesTable.BindData.this;
                                                        agsrVar2.aq(new dtwe("messages.received_timestamp", 1, Long.valueOf(bindData4.w())));
                                                        agsrVar2.aq(new dtru("messages._id", 8, new dtzq("$V", new Object[]{Long.valueOf(bindData4.D().a)})));
                                                        return agsrVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }};
                                                agsr[] agsrVarArr = new agsr[2];
                                                for (int i2 = 0; i2 < 2; i2++) {
                                                    Function function = functionArr[i2];
                                                    String[] strArr = agss.a;
                                                    apply = function.apply(new agsr());
                                                    agsrVarArr[i2] = (agsr) apply;
                                                }
                                                agsrVar.ar(agsrVarArr);
                                                return agsrVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        agsi agsiVar = agss.c;
                                        a2.c(new agsm(agsiVar.e), new agsm(agsiVar.f));
                                        a2.x(1);
                                        agsk agskVar = (agsk) a2.b().o();
                                        try {
                                            if (agskVar.moveToNext()) {
                                                superSortLabel = SuperSortLabel.a(agskVar.c());
                                                agskVar.close();
                                            } else {
                                                agskVar.close();
                                                superSortLabel = SuperSortLabel.UNKNOWN;
                                            }
                                            MessageIdType messageIdType3 = messageIdType2;
                                            List list3 = list2;
                                            aezy a3 = aezzVar.a(new aezf(bindData, e, engw.n(list3), z3, superSortLabel));
                                            if (a3.b() == SuperSortLabel.UNKNOWN) {
                                                ensz enszVar3 = (ensz) aeyo.a.j();
                                                enszVar3.Y(csux.a, messageIdType3.b());
                                                ((ensz) enszVar3.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 118, "ClassificationPersisterImpl.java")).r("Unable to get supersort label, results size %d", list3.size());
                                                return elfo.e(false);
                                            }
                                            ensz enszVar4 = (ensz) aeyo.a.h();
                                            enszVar4.Y(csux.a, messageIdType3.b());
                                            ((ensz) enszVar4.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 125, "ClassificationPersisterImpl.java")).J("Persisting message with label %s, score %f and intent %s", a3.b(), Float.valueOf(a3.a()), a3.c());
                                            aeyq aeyqVar = aeyoVar3.b;
                                            SuperSortLabel b5 = a3.b();
                                            String c2 = a3.c();
                                            float a4 = a3.a();
                                            return aeyqVar.a(new aeyc(messageIdType3, b5, c2, buay.MODEL, a4 >= 0.7f ? buax.HIGH : a4 >= 0.3f ? buax.MEDIUM : buax.LOW, aewg.e(), z2));
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Supplier() { // from class: aeyl
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    ensz enszVar3 = (ensz) aeyo.a.j();
                                    enszVar3.Y(csux.m, MessagesTable.BindData.this.X());
                                    ((ensz) enszVar3.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 141, "ClassificationPersisterImpl.java")).q("Unable to load participant");
                                    return elfo.e(false);
                                }
                            });
                        }
                    }, aeyoVar.e);
                }
                ensz enszVar = (ensz) aeyo.a.h();
                enszVar.Y(csux.a, b3.b());
                ((ensz) enszVar.h("com/google/android/apps/messaging/label/data/ClassificationPersisterImpl", "save", 68, "ClassificationPersisterImpl.java")).q("Skipping supersort persistence, feature disabled.");
                return elfo.e(true);
            }
        }, this.g);
    }

    final void b() {
        Object apply;
        String[] strArr = byfi.a;
        byfd byfdVar = new byfd(byfi.a);
        byfdVar.z("shouldAttemptCreatingMissingLabels");
        apply = new Function() { // from class: tau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                byfh byfhVar = (byfh) obj;
                byfhVar.aq(new dtrw("supersort_labels._id", 3, byfh.at((Iterable) Collection.EL.stream(tba.c).map(new Function() { // from class: tat
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((SuperSortLabel) obj2).i);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b)), true));
                return byfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new byfh());
        byfdVar.k(new byfg((byfh) apply));
        if (byfdVar.b().i() < ((enou) c).c) {
            ((dtuu) this.l.b()).d("ClassifyMessages#ensureLabelsExistInDb", new Runnable() { // from class: tas
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    emyl emylVar = tba.a;
                    String[] strArr2 = byfi.a;
                    byfd byfdVar2 = new byfd(byfi.a);
                    byfdVar2.z("ensureLabelsExistInDbWithoutTransaction");
                    byet byetVar = (byet) byfdVar2.b().p(byfi.b.a);
                    try {
                        engw c2 = byetVar.c();
                        byetVar.close();
                        enip enipVar = (enip) Collection.EL.stream(c2).map(new Function() { // from class: tay
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return SuperSortLabel.a(((Integer) obj).intValue());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.b);
                        engw engwVar = tba.c;
                        int i = ((enou) engwVar).c;
                        for (int i2 = 0; i2 < i; i2++) {
                            SuperSortLabel superSortLabel = (SuperSortLabel) engwVar.get(i2);
                            if (!enipVar.contains(superSortLabel)) {
                                byek byekVar = new byek();
                                byekVar.c(superSortLabel.i);
                                byekVar.d(superSortLabel.toString());
                                byekVar.e(byfj.NO_CHANGE);
                                byekVar.b();
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            byetVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        }
    }

    final void c(boolean z) {
        this.h = z;
        this.i = true == z ? 10 : 1;
    }
}
