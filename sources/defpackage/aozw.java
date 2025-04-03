package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aozw {
    private final boolean a;

    public aozw(boolean z) {
        this.a = z;
    }

    static final void b(buxz buxzVar, BugleConversationId bugleConversationId) {
        buxzVar.B(false);
        engr engrVar = new engr();
        engrVar.h(3);
        engrVar.h(16);
        if (aslz.a()) {
            engrVar.h(235);
            engrVar.h(237);
            engrVar.h(216);
            engrVar.h(219);
            engrVar.h(238);
            engrVar.h(236);
            engrVar.h(215);
            engrVar.h(214);
            engrVar.h(223);
            engrVar.h(224);
            engrVar.h(222);
            engrVar.h(233);
            engrVar.h(234);
            engrVar.h(252);
            engrVar.h(208);
        }
        buxzVar.an(engrVar.g());
        buxzVar.m(bugleConversationId.a);
    }

    static final void c(buxz buxzVar, final aott aottVar) {
        if (aottVar.d()) {
            buxzVar.b(new Function() { // from class: aozn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return apam.a.d.a((buxz) obj, Long.valueOf(aott.this.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((buxz) a).w(aottVar2.a());
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((buxz) a).q(new MessageIdType(aottVar2.a()));
                    ((duav) a).as(new dtzq("$V{J:parts} <= $V", new Object[]{PartsTable.d.a, Long.valueOf(aottVar2.b())}));
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            buxzVar.b(new Function() { // from class: aozq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return apam.a.d.a((buxz) obj, Long.valueOf(aott.this.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((buxz) a).x(aottVar2.a());
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    static final void d(buxz buxzVar, final aott aottVar) {
        if (aottVar.d()) {
            buxzVar.b(new Function() { // from class: aozs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return apam.a.f.a((buxz) obj, Long.valueOf(aott.this.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((buxz) a).s(aottVar2.a());
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((buxz) a).q(new MessageIdType(aottVar2.a()));
                    ((duav) a).as(new dtzq("$V{J:parts} >= $V", new Object[]{PartsTable.d.a, Long.valueOf(aottVar2.b())}));
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            buxzVar.b(new Function() { // from class: aozv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return apam.a.f.a((buxz) obj, Long.valueOf(aott.this.c()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: aozm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ffjm ffjmVar = apam.a.e;
                    aott aottVar2 = aott.this;
                    Object a = ffjmVar.a((buxz) obj, Long.valueOf(aottVar2.c()));
                    ((duav) a).aq(new dtwe("messages._id", 9, Long.valueOf(aottVar2.a())));
                    return a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
    }

    final buxo a(buxo buxoVar) {
        if (!this.a) {
            return buxoVar;
        }
        bwdf c = PartsTable.c();
        c.z("fanOutWhenFlatteningIfNeeded");
        c.f(new Function() { // from class: aozl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bwat) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(c.b(), PartsTable.d.b, MessagesTable.c.a).g());
        return buxoVar;
    }
}
