package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apfj implements aqge {
    public final ffsk a;
    public final becj b;
    public final Optional c;
    public final cjdj d;
    public final cjdi e;
    public final BugleConversationId f;
    public ctbx g;
    public final ctbl h;
    private final ffsk j;
    private final ctbk k;
    private final ffbz l = ffca.a(new ffix() { // from class: apez
        @Override // defpackage.ffix
        public final Object invoke() {
            btvs a = btvy.a();
            a.z("createNudgeClassificationsQuery");
            final apfj apfjVar = apfj.this;
            a.c(new Function() { // from class: apex
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btvx btvxVar = (btvx) obj;
                    buxo e = apfj.e(apfj.this.f.a);
                    e.f(new Function() { // from class: apfb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((buum) obj2).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    btvxVar.e(e.b());
                    return btvxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a.c(new Function() { // from class: apey
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btvx btvxVar = (btvx) obj;
                    btvxVar.b(fbrc.NUDGE_CLASSIFICATION);
                    return btvxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return a.b();
        }
    });
    public final ffbz i = ffca.a(new ffix() { // from class: apfa
        @Override // defpackage.ffix
        public final Object invoke() {
            return apfj.e(apfj.this.f.a).b();
        }
    });

    public apfj(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, Optional optional, cjdj cjdjVar, cjdi cjdiVar, BugleConversationId bugleConversationId) {
        this.a = ffskVar;
        this.j = ffskVar2;
        this.k = ctbkVar;
        this.b = becjVar;
        this.c = optional;
        this.d = cjdjVar;
        this.e = cjdiVar;
        this.f = bugleConversationId;
        this.h = ctbkVar.a(new apfg(this));
    }

    public static final buxo e(final ConversationIdType conversationIdType) {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.b(new Function() { // from class: apfc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                buxzVar2.al();
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: apfd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar2 = (buxz) obj;
                buxzVar2.ag();
                return buxzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxz buxzVar2 = new buxz();
        buxzVar2.an(axuh.b);
        buxz buxzVar3 = new buxz();
        buxzVar3.B(false);
        buxo d = MessagesTable.d();
        d.z("createLatestSuggestableMessageQuery");
        d.h(new Function() { // from class: apfe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar4 = (buxz) obj;
                buxzVar4.m(ConversationIdType.this);
                return buxzVar4;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.g(buxzVar);
        d.g(buxzVar2);
        d.g(buxzVar3);
        d.d(new buxl(MessagesTable.c.i, false));
        d.x(1);
        return d;
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.h.a(new ctbf() { // from class: apev
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "ClassificationObservableSupplier::register", "ClassificationObservableSupplier::callback", "ClassificationObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new apff(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final btvr d() {
        return (btvr) this.l.a();
    }
}
