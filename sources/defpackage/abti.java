package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abti extends dtrs {
    public static final cfup a = cfvl.i(cfvl.b, "enable_too_many_1on1_participants_check", false);
    public final Executor b;
    public final abtx c;
    public final buxm d;
    private final dtuu e;

    public abti(Executor executor, dtuu dtuuVar, abtx abtxVar) {
        buxo d = MessagesTable.d();
        d.z("messageStatusQuery");
        d.f(new Function() { // from class: abte
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = abti.a;
                return ((buum) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.d = d.b();
        this.b = executor;
        this.e = dtuuVar;
        this.c = abtxVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        final MessagesTable.BindData bindData = (MessagesTable.BindData) dtukVar.b();
        if (bindData != null) {
            this.e.g(new dtut() { // from class: abtg
                @Override // defpackage.dtut
                public final ekzz a() {
                    cfup cfupVar = abti.a;
                    return eleg.f("MTCL::onChangeInTransaction::runAfterCommit");
                }
            }, null, new Runnable() { // from class: abth
                @Override // java.lang.Runnable
                public final void run() {
                    abtx abtxVar = abti.this.c;
                    errl errlVar = (errl) abtxVar.a.b();
                    errlVar.getClass();
                    errl errlVar2 = (errl) abtxVar.b.b();
                    errlVar2.getClass();
                    abuy abuyVar = (abuy) abtxVar.c.b();
                    abuyVar.getClass();
                    final abtw abtwVar = new abtw(errlVar, errlVar2, abuyVar, bindData);
                    elfo.f(new Runnable() { // from class: abts
                        @Override // java.lang.Runnable
                        public final void run() {
                            ensz enszVar = (ensz) abtw.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "evaluate", 50, "TooManyParticipantsInOneOnOne.java");
                            abtw abtwVar2 = abtw.this;
                            MessagesTable.BindData bindData2 = abtwVar2.e;
                            enszVar.D("Starting evaluation for message %s in conversation %s", bindData2.D(), bindData2.C());
                            bsob e = bsom.e();
                            e.z("getConversationBindDataFromMessage");
                            final MessagesTable.BindData bindData3 = abtwVar2.e;
                            e.i(new Function() { // from class: abtv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsol bsolVar = (bsol) obj;
                                    entd entdVar = abtw.a;
                                    ConversationIdType C = MessagesTable.BindData.this.C();
                                    C.getClass();
                                    bsolVar.q(C);
                                    return bsolVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            Optional ofNullable = Optional.ofNullable((bseh) ((bskr) e.b().o()).cS());
                            if (!ofNullable.isEmpty() && ((bseh) ofNullable.get()).k() == 0) {
                                final MessagesTable.BindData bindData4 = abtwVar2.e;
                                bseh bsehVar = (bseh) ofNullable.get();
                                buxo d = MessagesTable.d();
                                d.z("getConversationParticipantIds");
                                d.h(new Function() { // from class: abtt
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        buxz buxzVar = (buxz) obj;
                                        entd entdVar = abtw.a;
                                        buxzVar.m(MessagesTable.BindData.this.C());
                                        buxzVar.ak(100, 117);
                                        return buxzVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                d.c(MessagesTable.c.c);
                                d.v(MessagesTable.c.c);
                                enip enipVar = (enip) d.b().D().map(new Function() { // from class: abtu
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        entd entdVar = abtw.a;
                                        String X = ((MessagesTable.BindData) obj).X();
                                        X.getClass();
                                        return X;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.b);
                                ((ensz) abtw.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "getConversationParticipantIds", 111, "TooManyParticipantsInOneOnOne.java")).J("Conversation %s had participants %s when evaluating message %s", bsehVar.C(), enipVar, bindData4.D());
                                if (enipVar.size() > 1) {
                                    abuy abuyVar2 = abtwVar2.d;
                                    abut abutVar = new abut();
                                    abutVar.d(epwn.TOO_MANY_PARTICIPANTS_IN_ONE_ON_ONE_CONVERSATION);
                                    ConversationIdType C = abtwVar2.e.C();
                                    C.getClass();
                                    abutVar.c(C);
                                    abutVar.b = Optional.of(abtwVar2.e.D().b());
                                    abuyVar2.b(abutVar.e());
                                    ensz enszVar2 = (ensz) abtw.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/TooManyParticipantsInOneOnOne", "evaluate", 64, "TooManyParticipantsInOneOnOne.java");
                                    MessagesTable.BindData bindData5 = abtwVar2.e;
                                    enszVar2.D("Conversation %s at message %s had too many participants", bindData5.C(), bindData5.D());
                                }
                            }
                        }
                    }, abtwVar.b).k(axnw.b(), abtwVar.c);
                }
            });
        }
    }
}
