package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbm extends ceut {
    public static final entd a = entd.c("BugleSuperSort");
    static final cfva b = cfvl.e(cfvl.b, "supersort_handler_max_messages_per_run", 100);
    static final emyl c = cfvl.x(192909536, "supersort_classify_missing_messages_only_when_charging");
    static final cfva d = cfvl.i(cfvl.b, "supersort_use_only_work_manager", false);
    static final cfva e = cfvl.i(cfvl.b, "supersort_bg_idle_cs", false);
    static final cfva f = cfvl.i(cfvl.b, "supersort_bg_battery_cs", false);
    public final tba g;
    private final ffbr h;
    private final errl i;
    private final errl j;

    public tbm(ffbr ffbrVar, tba tbaVar, errl errlVar, errl errlVar2) {
        this.h = ffbrVar;
        this.g = tbaVar;
        this.i = errlVar;
        this.j = errlVar2;
        tbaVar.c(false);
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        poh pohVar = new poh();
        if (((Boolean) f.e()).booleanValue() && ((Boolean) d.e()).booleanValue()) {
            pohVar.c = true;
        }
        if (((Boolean) ((cfup) c.get()).e()).booleanValue() && ((Boolean) d.e()).booleanValue()) {
            pohVar.a = true;
        }
        if (((Boolean) e.e()).booleanValue() && ((Boolean) d.e()).booleanValue()) {
            pohVar.b = true;
        }
        cetx l = cety.l();
        if (((Boolean) d.e()).booleanValue()) {
            l.b(cevc.WORKMANAGER_ONLY);
        }
        ((ceti) l).a = pohVar.a();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ClassifyMissingMessagesHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        ekzz f2 = eleg.f("ClassifyMissingMessagesHandler#processPendingWorkItemAsync");
        try {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "processPendingWorkItemAsync", 159, "ClassifyMissingMessagesHandler.java")).t("Handler %s invoked", "CLASSIFY_MISSING_MESSAGES");
            elfl h = ((ahik) this.h.b()).d().i(new eroh() { // from class: tbd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    tbd tbdVar = this;
                    Boolean bool = (Boolean) obj;
                    int i = 1;
                    elfl e2 = elfo.e(true);
                    String str = "CLASSIFY_MISSING_MESSAGES";
                    if (!aewg.h()) {
                        ((ensz) ((ensz) tbm.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "processPendingWorkItemAsync", 170, "ClassifyMissingMessagesHandler.java")).t("Supersort flag is disabled, skipping %s", "CLASSIFY_MISSING_MESSAGES");
                        return e2;
                    }
                    if (!bool.booleanValue()) {
                        ((ensz) ((ensz) tbm.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "processPendingWorkItemAsync", 175, "ClassifyMissingMessagesHandler.java")).t("Supersort feature is disabled, skipping %s", "CLASSIFY_MISSING_MESSAGES");
                        return e2;
                    }
                    tbm tbmVar = tbm.this;
                    tbmVar.g.b();
                    int intValue = ((Integer) tbm.b.e()).intValue();
                    buxo d2 = MessagesTable.d();
                    d2.z("getMessageIdsForSupersortClassification");
                    d2.r();
                    d2.h(new Function() { // from class: tbf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            Object apply;
                            buxz buxzVar = (buxz) obj2;
                            entd entdVar = tbm.a;
                            buxzVar.aj(1, 2, 11, 15, 14, 100);
                            buar a2 = buaw.a();
                            apply = new Function() { // from class: tbk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    entd entdVar2 = tbm.a;
                                    return ((buab) obj3).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(buaw.c);
                            a2.c((buac) apply);
                            a2.d(new Function() { // from class: tbl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    Object apply2;
                                    buav buavVar = (buav) obj3;
                                    entd entdVar2 = tbm.a;
                                    Function[] functionArr = {new Function() { // from class: tbi
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            buav buavVar2 = (buav) obj4;
                                            entd entdVar3 = tbm.a;
                                            buavVar2.aq(new dtrt("message_labels.model_id", 1, String.valueOf(aewg.e())));
                                            return buavVar2;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Function() { // from class: tbj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            buav buavVar2 = (buav) obj4;
                                            entd entdVar3 = tbm.a;
                                            buay buayVar = buay.USER;
                                            buavVar2.aq(new dtwe("message_labels.source", 1, Integer.valueOf(buayVar == null ? 0 : buayVar.ordinal())));
                                            return buavVar2;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }};
                                    buav[] buavVarArr = new buav[2];
                                    for (int i2 = 0; i2 < 2; i2++) {
                                        Function function = functionArr[i2];
                                        String[] strArr = buaw.a;
                                        apply2 = function.apply(new buav());
                                        buavVarArr[i2] = (buav) apply2;
                                    }
                                    buavVar.ar(buavVarArr);
                                    return buavVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            buxzVar.y(a2.b());
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    d2.d(new buxl(MessagesTable.c.i, true));
                    d2.x(intValue);
                    engw g = d2.b().g();
                    enou enouVar = (enou) g;
                    int i2 = enouVar.c;
                    int i3 = 0;
                    while (i3 < i2) {
                        ceuw ceuwVar2 = ceuwVar;
                        MessageIdType messageIdType = (MessageIdType) g.get(i3);
                        if (ceuwVar2.b()) {
                            ((ensz) ((ensz) tbm.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "processPendingWorkItemAsync", 187, "ClassifyMissingMessagesHandler.java")).t("%s got cancelled, bailing early", str);
                            return e2.h(new emwl() { // from class: tbg
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    entd entdVar = tbm.a;
                                    return false;
                                }
                            }, erpp.a);
                        }
                        String[] strArr = btki.a;
                        btik btikVar = new btik();
                        btikVar.c(i);
                        btikVar.b(messageIdType.b());
                        btikVar.d(2);
                        final btih a2 = btikVar.a();
                        final dtve b2 = btki.b();
                        dtub.b(btki.b(), "generic_worker_queue", a2, new Function() { // from class: btif
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Long.valueOf(dtve.this.R("generic_worker_queue", (ContentValues) obj2));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btig
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                final Long l = (Long) obj2;
                                if (l.longValue() >= 0) {
                                    btih btihVar = btih.this;
                                    btihVar.a = (String) new dtuj() { // from class: btie
                                        @Override // defpackage.dtuj
                                        public final Object a() {
                                            return String.valueOf(l);
                                        }
                                    }.a();
                                    btihVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        e2 = tbmVar.g.a(e2, messageIdType);
                        i3++;
                        tbdVar = this;
                        str = str;
                        i = 1;
                    }
                    final boolean z = enouVar.c < intValue || g.isEmpty();
                    return e2.h(new emwl() { // from class: tbh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = tbm.a;
                            return Boolean.valueOf(z);
                        }
                    }, erpp.a);
                }
            }, this.i).h(new emwl() { // from class: tbe
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    entd entdVar = tbm.a;
                    if (bool == null || !bool.booleanValue()) {
                        ((ensz) ((ensz) tbm.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "complete", 217, "ClassifyMissingMessagesHandler.java")).t("%s: completed and requesting rescheduling.", "CLASSIFY_MISSING_MESSAGES");
                        return ceyt.j(engw.r(ceyr.f("CLASSIFY_MISSING_MESSAGES")));
                    }
                    ((ensz) ((ensz) tbm.a.h()).h("com/google/android/apps/messaging/classify/workhandler/ClassifyMissingMessagesHandler", "complete", 213, "ClassifyMissingMessagesHandler.java")).t("%s: completed.", "CLASSIFY_MISSING_MESSAGES");
                    return ceyt.i();
                }
            }, this.j);
            f2.b(h);
            f2.close();
            return h;
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
