package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bigl {
    public static final /* synthetic */ int a = 0;
    private static final String b = g("%PARTS_JOIN_TIMESTAMP_CHECK%");
    private static final String c = g("%REPORTS_JOIN_TIMESTAMP_CHECK%");
    private static final String d = bnlv.b.a.toString() + " = " + MessagesTable.c.a.toString();
    private final Set e;

    public bigl(Set set) {
        this.e = set;
    }

    private static String g(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static void h(bjji bjjiVar) {
        if (aewg.h()) {
            buar a2 = buaw.a();
            a2.c(buaw.c.c);
            a2.d(new Function() { // from class: bigh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buav buavVar = (buav) obj;
                    int i = bigl.a;
                    buavVar.c(MessagesTable.c.a);
                    return buavVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjjiVar.n(a2.b(), "label_subquery_expression");
            if (aewg.i()) {
                buar a3 = buaw.a();
                a3.c(buaw.c.f);
                a3.d(new Function() { // from class: bigi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buav buavVar = (buav) obj;
                        int i = bigl.a;
                        buavVar.c(MessagesTable.c.a);
                        return buavVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bjjiVar.n(a3.b(), "intent_subquery_expression");
            }
        }
    }

    private final void i(bjji bjjiVar) {
        bjjiVar.o("REPLIES_VIEW_JOIN", this.e.contains(bpzj.a) ? d : "0");
    }

    private final bifz j() {
        bifz a2 = bige.a();
        a2.z("+queryConversationMessagesInternalOptimized");
        a2.o(b, "1");
        a2.o(c, "1");
        if (aewg.h()) {
            buar a3 = buaw.a();
            a3.c(buaw.c.c);
            a3.d(new Function() { // from class: bigf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buav buavVar = (buav) obj;
                    int i = bigl.a;
                    buavVar.c(MessagesTable.c.a);
                    return buavVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.n(a3.b(), "label_subquery_expression");
            if (aewg.i()) {
                buar a4 = buaw.a();
                a4.c(buaw.c.f);
                a4.d(new Function() { // from class: bigg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buav buavVar = (buav) obj;
                        int i = bigl.a;
                        buavVar.c(MessagesTable.c.a);
                        return buavVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.n(a4.b(), "intent_subquery_expression");
            }
        }
        a2.o("REPLIES_VIEW_JOIN", this.e.contains(bpzj.a) ? d : "0");
        return a2;
    }

    @Deprecated
    public final bjji a() {
        bjji a2 = bjjn.a();
        a2.z("+getBasicQuery");
        a2.o(b, "1");
        a2.o(c, "1");
        bjjm bjjmVar = new bjjm();
        bjjmVar.g(16);
        bjjmVar.g(3);
        bjjmVar.d();
        a2.e(bjjmVar);
        a2.r();
        h(a2);
        i(a2);
        return a2;
    }

    @Deprecated
    public final bjji b(boolean z, boolean z2, ConversationIdType conversationIdType, dtyq dtyqVar) {
        bjji c2 = c(z, z2, conversationIdType);
        c2.r();
        String[] strArr = bjjn.a;
        bjjm bjjmVar = new bjjm();
        bjjmVar.aq(new dtru("messages._id", 3, dtyqVar));
        c2.e(bjjmVar);
        return c2;
    }

    public final bjji c(boolean z, boolean z2, ConversationIdType conversationIdType) {
        bjji a2 = bjjn.a();
        a2.z("+queryConversationMessagesInternal");
        a2.o(b, "1");
        a2.o(c, "1");
        bjjm bjjmVar = new bjjm();
        bjjmVar.g(16);
        if (!conversationIdType.b()) {
            bjjmVar.b(conversationIdType);
        }
        if (z) {
            bjjmVar.g(3);
        }
        if (z2) {
            duav[] duavVarArr = new bjjm[2];
            bjjm bjjmVar2 = new bjjm();
            bjjmVar2.d();
            duavVarArr[0] = bjjmVar2;
            duav bjjmVar3 = new bjjm();
            int intValue = bjjn.c().intValue();
            if (intValue < 46020) {
                dtub.w("reacted_message_id", intValue);
            }
            bjjmVar3.aq(new dtrx("message_reactions.reacted_message_id", 6));
            duavVarArr[1] = bjjmVar3;
            bjjmVar.ar(duavVarArr);
            a2.r();
        } else {
            bjjmVar.d();
        }
        a2.e(bjjmVar);
        h(a2);
        i(a2);
        return a2;
    }

    public final bifz d(dtyq dtyqVar) {
        bifz j = j();
        String[] strArr = bige.a;
        bigd bigdVar = new bigd();
        bigdVar.b(dtyqVar);
        j.c(bigdVar);
        return j;
    }

    public final bifz e(MessageIdType[] messageIdTypeArr) {
        bifz j = j();
        String[] strArr = bige.a;
        bigd bigdVar = new bigd();
        bigdVar.aq(new dtrw("messages._id", 3, bigd.at((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bigb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bdhb.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bigc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        j.c(bigdVar);
        return j;
    }

    public final bifz f(final boolean z, buxo buxoVar) {
        bifz j = j();
        buxoVar.h(new Function() { // from class: bigk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = bigl.a;
                buxzVar.ap(16);
                if (z) {
                    buxzVar.ap(3);
                }
                buxzVar.B(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bige.a;
        bigd bigdVar = new bigd();
        buxoVar.c(MessagesTable.c.a);
        bigdVar.b(buxoVar.b());
        j.c(bigdVar);
        return j;
    }
}
