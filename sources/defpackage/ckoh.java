package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckoh extends ceut {
    public static final entd a = entd.c("BugleGroupManagement");
    static final emyl b = cfvl.x(195615977, "enable_rcs_group_identifiers_telephony_batch_migration");
    public final errl c;
    public final cknu d;
    public final erqa e = new erqa();
    private final errl f;

    public ckoh(errl errlVar, errl errlVar2, cknu cknuVar) {
        this.c = errlVar;
        this.f = errlVar2;
        this.d = cknuVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RcsGroupIdentifiersTelephonyMigrationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckoj.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        if (((Boolean) ((cfup) b.get()).e()).booleanValue()) {
            return elfo.g(new Callable() { // from class: ckof
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = ckoh.a;
                    bsob e = bsom.e();
                    e.z("getConversationIdsThatRequireMigration");
                    e.i(new Function() { // from class: cknx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsol bsolVar = (bsol) obj;
                            entd entdVar2 = ckoh.a;
                            bsolVar.j(2);
                            bsolVar.b(new Function() { // from class: cknv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    entd entdVar3 = ckoh.a;
                                    bsolVar2.E("");
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ckny
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    bsolVar2.G();
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: cknz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    entd entdVar3 = ckoh.a;
                                    bsolVar2.D("");
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ckoa
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    int intValue = bsom.g().intValue();
                                    if (intValue < 40050) {
                                        dtub.w("rcs_conference_uri", intValue);
                                    }
                                    bsolVar2.aq(new dtrx("conversations.rcs_conference_uri", 5));
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ckob
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    entd entdVar3 = ckoh.a;
                                    int intValue = bsom.g().intValue();
                                    if (intValue < 58540) {
                                        dtub.w("rcs_group_self_msisdn", intValue);
                                    }
                                    bsolVar2.aq(new dtrt("conversations.rcs_group_self_msisdn", 1, ""));
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ckoc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    bsol bsolVar2 = (bsol) obj2;
                                    int intValue = bsom.g().intValue();
                                    if (intValue < 58540) {
                                        dtub.w("rcs_group_self_msisdn", intValue);
                                    }
                                    bsolVar2.aq(new dtrx("conversations.rcs_group_self_msisdn", 5));
                                    return bsolVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return bsolVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    e.r();
                    engw f = e.b().f();
                    ((ensz) ckoh.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "getConversationIdsThatRequireMigration", 169, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).r("Attempting RCS group identifiers Telephony data batch migration. Conversations needed to migrate: %d", ((enou) f).c);
                    return f;
                }
            }, this.f).h(new emwl() { // from class: ckog
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    engw engwVar = (engw) obj;
                    int i = engw.d;
                    engr engrVar = new engr();
                    int size = engwVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        final ckoh ckohVar = ckoh.this;
                        final ConversationIdType conversationIdType = (ConversationIdType) engwVar.get(i2);
                        engrVar.h(elfl.g(ckohVar.e.b(eldl.c(new erog() { // from class: ckod
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                final cknu cknuVar = ckoh.this.d;
                                final ConversationIdType conversationIdType2 = conversationIdType;
                                return elfo.g(new Callable() { // from class: cknt
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        final cknu cknuVar2 = cknu.this;
                                        final ConversationIdType conversationIdType3 = conversationIdType2;
                                        return (Boolean) cknuVar2.f.c("RcsGroupIdentifiersTelephonyMigrationHelper#migrateRcsGroupIdentifiersFromTelephony", new emyl() { // from class: ckns
                                            @Override // defpackage.emyl
                                            public final Object get() {
                                                final cknu cknuVar3 = cknu.this;
                                                Function function = new Function() { // from class: cknq
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function2) {
                                                        return Function$CC.$default$andThen(this, function2);
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Removed duplicated region for block: B:61:0x031e  */
                                                    /* JADX WARN: Removed duplicated region for block: B:62:0x0326  */
                                                    @Override // java.util.function.Function
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                        To view partially-correct add '--show-bad-code' argument
                                                    */
                                                    public final java.lang.Object apply(java.lang.Object r20) {
                                                        /*
                                                            Method dump skipped, instructions count: 1018
                                                            To view this dump add '--comments-level debug' option
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cknq.apply(java.lang.Object):java.lang.Object");
                                                    }

                                                    public final /* synthetic */ Function compose(Function function2) {
                                                        return Function$CC.$default$compose(this, function2);
                                                    }
                                                };
                                                final ConversationIdType conversationIdType4 = conversationIdType3;
                                                return (Boolean) bsom.i(conversationIdType4, function, new Supplier() { // from class: cknr
                                                    @Override // java.util.function.Supplier
                                                    public final Object get() {
                                                        ensz enszVar = (ensz) cknu.a.j();
                                                        enszVar.Y(csux.o, ConversationIdType.this.toString());
                                                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationActuator", "migrateRcsGroupIdentifiersFromTelephony", 116, "RcsGroupIdentifiersTelephonyMigrationActuator.java")).q("No conversation data found while attempting to migrate RCS group identifiers from Telephony.");
                                                        return false;
                                                    }
                                                });
                                            }
                                        });
                                    }
                                }, cknuVar.b);
                            }
                        }), ckohVar.c)));
                    }
                    return engrVar.g();
                }
            }, this.c).i(new eroh() { // from class: cknw
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final engw engwVar = (engw) obj;
                    return elfo.j(engwVar).a(new Callable() { // from class: ckoe
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            entd entdVar = ckoh.a;
                            engw engwVar2 = engw.this;
                            int size = engwVar2.size();
                            int i = 0;
                            for (int i2 = 0; i2 < size; i2++) {
                                if (!((Boolean) erqt.q((elfl) engwVar2.get(i2))).booleanValue()) {
                                    i++;
                                }
                            }
                            ((ensz) ckoh.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 132, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).J("Finished RCS group identifiers Telephony data batch migration. Migration attempted count: %d. Success count: %d. Failed count: %d", Integer.valueOf(engwVar2.size()), Integer.valueOf(engwVar2.size() - i), Integer.valueOf(i));
                            return i == 0 ? ceyt.i() : ceyt.k();
                        }
                    }, ckoh.this.c);
                }
            }, this.f);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationHandler", "processPendingWorkItemAsync", 94, "RcsGroupIdentifiersTelephonyMigrationHandler.java")).q("Returning failed no retry in RcsGroupIdentifiersTelephonyMigrationHandler because allowswitch is disabled.");
        return elfo.e(ceyt.k());
    }
}
