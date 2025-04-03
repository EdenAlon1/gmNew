package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aitg extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler");
    static final cfup b = cfvl.i(cfvl.b, "disable_logging_otp_auto_delete_handler_process_count", false);
    public final cgrq c;
    public final ffbr d;
    public final ffbr e;
    public final asix f;
    private final errl g;
    private final aitz h;
    private final ffbr i;
    private final aiuv j;

    public aitg(errl errlVar, cgrq cgrqVar, aitz aitzVar, ffbr ffbrVar, ffbr ffbrVar2, aiuv aiuvVar, ffbr ffbrVar3, asix asixVar) {
        this.g = errlVar;
        this.c = cgrqVar;
        this.h = aitzVar;
        this.i = ffbrVar;
        this.d = ffbrVar2;
        this.j = aiuvVar;
        this.e = ffbrVar3;
        this.f = asixVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        poh pohVar = new poh();
        if (((Boolean) aitk.d.e()).booleanValue()) {
            pohVar.b = true;
        }
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("OtpDeletionHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return aitj.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final aitj aitjVar = (aitj) eyhsVar;
        if (!((Boolean) b.e()).booleanValue()) {
            ((akzt) this.i.b()).e("OTP.Auto.Delete.Handler.Process.Count", 1);
        }
        this.j.d(aitjVar.c, 3);
        return !((Boolean) aitk.a.e()).booleanValue() ? elfo.e(ceyt.i()) : this.h.c().h(new emwl() { // from class: aitf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aitg aitgVar;
                if (!((Boolean) obj).booleanValue()) {
                    return ceyt.i();
                }
                final aitj aitjVar2 = aitjVar;
                ((enrr) ((enrr) aitg.a.h()).h("com/google/android/apps/messaging/otp/deletion/OtpDeletionHandler", "processPendingWorkItemAsync", 150, "OtpDeletionHandler.java")).q("Running OtpDeletionHandler.");
                int i = engw.d;
                engr engrVar = new engr();
                engr engrVar2 = new engr();
                buxo d = MessagesTable.d();
                d.z("OtpDeletionHandler#processPendingWorkItemAsync");
                d.h(new Function() { // from class: aisy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        enru enruVar = aitg.a;
                        buxzVar.u((Iterable) Collection.EL.stream(aitj.this.b).map(new Function() { // from class: aisw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                enru enruVar2 = aitg.a;
                                return bdhb.b((String) obj3);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: aisx
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        })));
                        buxzVar.ah(100);
                        buxzVar.am(117);
                        btta b2 = bttf.b();
                        b2.z("isOtp");
                        b2.d(new Function() { // from class: aitc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                enru enruVar2 = aitg.a;
                                return ((btsl) obj3).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        b2.f(new Function() { // from class: aitd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                btte btteVar = (btte) obj3;
                                enru enruVar2 = aitg.a;
                                btteVar.f(new dtzq("$V", new Object[]{MessagesTable.c.a}));
                                return btteVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        b2.f(new Function() { // from class: aite
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                btte btteVar = (btte) obj3;
                                enru enruVar2 = aitg.a;
                                btteVar.b(1);
                                return btteVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxzVar.as(new dtym(b2.b()));
                        bvvn e = ParticipantsTable.e();
                        e.z("isNotContact");
                        e.f(new Function() { // from class: aita
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                enru enruVar2 = aitg.a;
                                return ((bvtg) obj3).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        e.h(new Function() { // from class: aitb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bvvw bvvwVar = (bvvw) obj3;
                                enru enruVar2 = aitg.a;
                                bvvwVar.aq(new dtru("participants._id", 1, new dtzq("$V", new Object[]{MessagesTable.c.c})));
                                bvvwVar.q();
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buxzVar.as(new dtym(e.b()));
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                d.e(new Function() { // from class: aisz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buum buumVar = (buum) obj2;
                        enru enruVar = aitg.a;
                        return new buun[]{buumVar.a, buumVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buuo buuoVar = (buuo) d.b().o();
                while (true) {
                    try {
                        boolean moveToNext = buuoVar.moveToNext();
                        aitgVar = aitg.this;
                        if (!moveToNext) {
                            break;
                        }
                        engrVar.h(buuoVar.q());
                        MessageCoreData v = ((bdmq) aitgVar.e.b()).v(buuoVar.q());
                        if (v != null) {
                            engrVar2.h(v);
                        }
                    } catch (Throwable th) {
                        try {
                            buuoVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                buuoVar.close();
                if (aitgVar.f.a()) {
                    cgrq cgrqVar = aitgVar.c;
                    engw g = engrVar.g();
                    cgrr cgrrVar = cgrr.OTP_DELETION;
                    if (cgrqVar.c.a()) {
                        cgrc cgrcVar = cgrqVar.a;
                        cgra cgraVar = (cgra) cgrb.a.createBuilder();
                        cgraVar.a((Iterable) Collection.EL.stream(g).map(new cgrj()).collect(Collectors.toCollection(new cgrk())));
                        cgraVar.copyOnWrite();
                        cgrb cgrbVar = (cgrb) cgraVar.instance;
                        cgrbVar.e = cgrrVar.a();
                        cgrbVar.b |= 1;
                        cgrcVar.d((cgrb) cgraVar.build());
                    } else {
                        cgrqVar.h(g);
                    }
                } else {
                    aitgVar.c.h(engrVar.g());
                }
                final engw g2 = engrVar2.g();
                if (!g2.isEmpty()) {
                    final aewk aewkVar = (aewk) aitgVar.d.b();
                    final SuperSortLabel superSortLabel = SuperSortLabel.OTP;
                    if (((Boolean) aexw.a.e()).booleanValue()) {
                        ((enrr) ((enrr) aewk.a.h()).h("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger", "logAutoDelete", 45, "AutoDeletedMessagesEventLogger.java")).q("Not logging auto delete event because logging is disabled");
                    } else {
                        ((enrr) ((enrr) aewk.a.h()).h("com/google/android/apps/messaging/label/analytics/AutoDeletedMessagesEventLogger", "logAutoDelete", 48, "AutoDeletedMessagesEventLogger.java")).q("Logging auto delete event");
                        emxf.a(!g2.isEmpty());
                        aewkVar.o(new Supplier() { // from class: aewi
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                final eqgx eqgxVar = (eqgx) eqha.a.createBuilder();
                                Stream stream = Collection.EL.stream(g2);
                                final aewk aewkVar2 = aewk.this;
                                final SuperSortLabel superSortLabel2 = superSortLabel;
                                stream.forEach(new Consumer() { // from class: aewj
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        MessageCoreData messageCoreData = (MessageCoreData) obj2;
                                        eqgy eqgyVar = (eqgy) eqgz.a.createBuilder();
                                        aewk aewkVar3 = aewk.this;
                                        long b2 = ((akvz) aewkVar3.b.b()).b(messageCoreData.z());
                                        eqgyVar.copyOnWrite();
                                        eqgz eqgzVar = (eqgz) eqgyVar.instance;
                                        eqgzVar.b |= 4;
                                        eqgzVar.e = b2;
                                        long d2 = ((akvz) aewkVar3.b.b()).d(messageCoreData);
                                        eqgyVar.copyOnWrite();
                                        eqgz eqgzVar2 = (eqgz) eqgyVar.instance;
                                        eqgzVar2.b |= 2;
                                        eqgzVar2.d = d2;
                                        eqjv b3 = aeya.b(superSortLabel2);
                                        eqgyVar.copyOnWrite();
                                        eqgz eqgzVar3 = (eqgz) eqgyVar.instance;
                                        eqgzVar3.c = b3.i;
                                        eqgzVar3.b |= 1;
                                        eqgx eqgxVar2 = eqgxVar;
                                        eqgxVar2.copyOnWrite();
                                        eqha eqhaVar = (eqha) eqgxVar2.instance;
                                        eqgz eqgzVar4 = (eqgz) eqgyVar.build();
                                        eqha eqhaVar2 = eqha.a;
                                        eqgzVar4.getClass();
                                        eygr eygrVar = eqhaVar.b;
                                        if (!eygrVar.c()) {
                                            eqhaVar.b = eyfy.mutableCopy(eygrVar);
                                        }
                                        eqhaVar.b.add(eqgzVar4);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                return (eqha) eqgxVar.build();
                            }
                        });
                    }
                }
                return ceyt.i();
            }
        }, this.g);
    }
}
