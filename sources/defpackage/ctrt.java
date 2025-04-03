package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrt {
    public static final buxo a(final ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.b(new Function() { // from class: ctrr
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
        }, new Function() { // from class: ctrs
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
        d.h(new Function() { // from class: ctrj
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

    public static final buxo b(final ConversationIdType conversationIdType, int i) {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.b(new Function() { // from class: ctrk
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
        }, new Function() { // from class: ctrl
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
        d.z("createLatestSuggestableMessagesQuery");
        d.h(new Function() { // from class: ctrm
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
        bwdf c = PartsTable.c();
        c.z("createLatestSuggestableMessagesQuery");
        c.h(new Function() { // from class: ctrn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                bwdmVar.i(ConversationIdType.this);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bwdm bwdmVar = new bwdm();
        bwdmVar.g("text%");
        c.g(bwdmVar);
        c.v(PartsTable.d.b);
        buxo buxoVar = (buxo) d.j(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a));
        buxoVar.d(new buxl(MessagesTable.c.i, false));
        buxoVar.x(i);
        return buxoVar;
    }

    public static final bvhc c(ConversationIdType conversationIdType, final fbri fbriVar, final fbre fbreVar) {
        conversationIdType.getClass();
        final buxo a = a(conversationIdType);
        bvhd a2 = bvhn.a();
        a2.z("createSmartSuggestionsQuery");
        a2.d(new Function() { // from class: ctro
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                Function function = new Function() { // from class: ctri
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((buum) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                buxo buxoVar = buxo.this;
                buxoVar.f(function);
                bvhmVar.aq(new dtru("p2p_suggestions.target_message_id", 1, buxoVar.b()));
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.d(new Function() { // from class: ctrp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvhm bvhmVar = (bvhm) obj;
                fbri fbriVar2 = fbri.this;
                if (fbriVar2 != null) {
                    bvhmVar.e(fbriVar2);
                }
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.d(new Function() { // from class: ctrq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fbre fbreVar2 = fbre.this;
                bvhm bvhmVar = (bvhm) obj;
                if (fbreVar2 != null) {
                    int intValue = bvhn.c().intValue();
                    if (intValue < 53080) {
                        dtub.w("consumption_state", intValue);
                    }
                    bvhmVar.aq(new dtwe("p2p_suggestions.consumption_state", 1, Integer.valueOf(fbreVar2.a())));
                }
                return bvhmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b();
    }
}
