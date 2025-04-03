package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bcsq {
    public final bigl a;
    private final ffbr b;

    public bcsq(bigl biglVar, ffbr ffbrVar) {
        this.a = biglVar;
        this.b = ffbrVar;
    }

    public final bjjg a(ConversationIdType conversationIdType, int i) {
        bjji a = this.a.a();
        String[] strArr = bjjn.a;
        bjjm bjjmVar = new bjjm();
        bjjmVar.b(conversationIdType);
        a.e(bjjmVar);
        if (i > 0) {
            a.x(i);
        }
        a.z("getConversationMessagesQuery");
        return a.b();
    }

    public final bjjg b(final MessageIdType messageIdType) {
        bjji a;
        if (((atkw) this.b.b()).a()) {
            a = this.a.a();
            a.z("+getMessageByIdQueryModified");
            a.f(new Function() { // from class: bcsi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjjm bjjmVar = (bjjm) obj;
                    bjjmVar.c(MessageIdType.this);
                    return bjjmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a.x(1);
        } else {
            a = this.a.a();
            a.z("+getMessageByIdQuery");
            a.f(new Function() { // from class: bcsj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjjm bjjmVar = (bjjm) obj;
                    bjjmVar.c(MessageIdType.this);
                    return bjjmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a.v(bjjn.c.a);
            a.c(new bjjf(bjjn.c.d, false));
        }
        return a.b();
    }

    public final bjji c(boolean z, bmpr bmprVar) {
        return this.a.b(z, false, bdgq.a, bmprVar);
    }

    public final bjji d(ConversationIdType conversationIdType, int i, int i2) {
        return e(conversationIdType, i, i2, false);
    }

    public final bjji e(ConversationIdType conversationIdType, int i, int i2, boolean z) {
        dtyq b;
        if (z) {
            bmwn g = blyg.g(conversationIdType, i);
            g.d(new Function() { // from class: bcsn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmwp bmwpVar = (bmwp) obj;
                    bmwpVar.b();
                    return bmwpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            g.c(new bmwk(bmwq.b.b));
            g.x(i);
            g.A(i2);
            b = g.b();
        } else {
            bmpt e = blyg.e(conversationIdType, i);
            e.d(new Function() { // from class: bcso
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmpx bmpxVar = (bmpx) obj;
                    bmpxVar.c();
                    return bmpxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.c(new bmpq(bmpy.b.b));
            e.x(i);
            e.A(i2);
            b = e.b();
        }
        return this.a.b(true, z, conversationIdType, b);
    }

    public final bjji f(ConversationIdType conversationIdType, int i, int i2) {
        return e(conversationIdType, i, i2, true);
    }

    public final bjjg g(MessageIdType[] messageIdTypeArr) {
        bjji c = this.a.c(true, false, bdgq.a);
        String[] strArr = bjjn.a;
        bjjm bjjmVar = new bjjm();
        bjjmVar.aq(new dtrw("messages._id", 3, bjjm.at((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bjjk
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
        }).collect(Collectors.toCollection(new Supplier() { // from class: bjjl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        c.e(bjjmVar);
        c.r();
        return c.b();
    }
}
