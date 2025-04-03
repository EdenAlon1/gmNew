package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absp extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final abro a;
    public final bsnz b;
    private final dtuu d;

    public absp(dtuu dtuuVar, abro abroVar) {
        bsob e = bsom.e();
        e.z("activeRcsGroupConversationIdQuery");
        e.g(new Function() { // from class: absl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = absp.c;
                return ((bskp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: absm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                int i = absp.c;
                bsolVar.j(2);
                bsolVar.x(0);
                bsolVar.F();
                bsolVar.H();
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = e.b();
        this.d = dtuuVar;
        this.a = abroVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final bseh bsehVar = (bseh) dtukVar.b();
        if (bsehVar != null && bsehVar.k() == 2 && bsehVar.m() == 0) {
            final String ad = bsehVar.ad();
            if (emxe.c(ad)) {
                return;
            }
            this.d.g(new dtut() { // from class: absn
                @Override // defpackage.dtut
                public final ekzz a() {
                    int i = absp.c;
                    return eleg.f("FCTCL::onChangeInTransaction::runAfterCommit");
                }
            }, null, new Runnable() { // from class: abso
                @Override // java.lang.Runnable
                public final void run() {
                    abro abroVar = absp.this.a;
                    ffbr ffbrVar = abroVar.a;
                    ConversationIdType C = bsehVar.C();
                    errl errlVar = (errl) ffbrVar.b();
                    errlVar.getClass();
                    errl errlVar2 = (errl) abroVar.b.b();
                    errlVar2.getClass();
                    abuy abuyVar = (abuy) abroVar.c.b();
                    abuyVar.getClass();
                    C.getClass();
                    String str = ad;
                    str.getClass();
                    final abrn abrnVar = new abrn(errlVar, errlVar2, abuyVar, C, str);
                    elfo.f(new Runnable() { // from class: abrm
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            abrn abrnVar2 = abrn.this;
                            if (abrnVar2.f.isEmpty()) {
                                ((ensz) abrn.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 68, "DuplicateRcsGroupIdDatabaseChecker.java")).q("Skipping evaluations because RCS group ID is empty");
                                return;
                            }
                            ((ensz) abrn.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 71, "DuplicateRcsGroupIdDatabaseChecker.java")).D("Starting evaluation for conversation %s with RCS group ID %s", abrnVar2.e, abrnVar2.f);
                            final ConversationIdType conversationIdType = abrnVar2.e;
                            final String str2 = abrnVar2.f;
                            emxf.b(!str2.isEmpty(), "RCS group ID is empty");
                            bsob e = bsom.e();
                            e.z("getForkedConversationJoinStates");
                            e.g(new Function() { // from class: abrk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    entd entdVar = abrn.a;
                                    return ((bskp) obj).N;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            e.i(new Function() { // from class: abrl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsol bsolVar = (bsol) obj;
                                    entd entdVar = abrn.a;
                                    bsolVar.w(ConversationIdType.this);
                                    bsolVar.E(str2);
                                    return bsolVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bskr bskrVar = (bskr) e.b().p(bsom.c.N);
                            try {
                                engw o = bskrVar.o();
                                bskrVar.close();
                                if (o.isEmpty()) {
                                    return;
                                }
                                abut abutVar = new abut();
                                abutVar.d(epwn.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID);
                                abutVar.c(abrnVar2.e);
                                abutVar.c = Optional.of(o);
                                final String str3 = abrnVar2.f;
                                emxf.b(!str3.isEmpty(), "RCS group ID is empty");
                                HashSet hashSet = new HashSet();
                                bsob e2 = bsom.e();
                                e2.z("getForkedConversationDifferentNamesLocalCount");
                                e2.f(new Function() { // from class: abri
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bskp bskpVar = (bskp) obj;
                                        entd entdVar = abrn.a;
                                        return new bskq[]{bskpVar.c, bskpVar.d};
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                e2.i(new Function() { // from class: abrj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsol bsolVar = (bsol) obj;
                                        entd entdVar = abrn.a;
                                        bsolVar.E(str3);
                                        return bsolVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                engw y = e2.b().y();
                                int i = ((enou) y).c;
                                int i2 = 0;
                                for (int i3 = 0; i3 < i; i3++) {
                                    bseh bsehVar2 = (bseh) y.get(i3);
                                    if (bsehVar2.H() == byyy.NAME_IS_AUTOMATIC) {
                                        i2 = 1;
                                    } else {
                                        hashSet.add(emxe.b(bsehVar2.X()));
                                    }
                                }
                                abutVar.d = Optional.of(Integer.valueOf(hashSet.size() + i2));
                                abrnVar2.d.b(abutVar.e());
                                ((ensz) abrn.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/DuplicateRcsGroupIdDatabaseChecker", "evaluate", 86, "DuplicateRcsGroupIdDatabaseChecker.java")).J("Conversation %s evaluation: RCS group ID %s occured %d other times", abrnVar2.e, abrnVar2.f, Integer.valueOf(((enou) o).c));
                            } catch (Throwable th) {
                                try {
                                    bskrVar.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, abrnVar.b).k(axnw.b(), abrnVar.c);
                }
            });
        }
    }
}
