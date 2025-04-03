package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txt {
    public static bsdl a(final ConversationIdType conversationIdType) {
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("createOneOnOneParticipantIdsQuery");
        bsdmVar.e(new Function() { // from class: txn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bscz) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.f(new Function() { // from class: txo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsdq bsdqVar = (bsdq) obj;
                final ConversationIdType conversationIdType2 = ConversationIdType.this;
                bsdqVar.b(conversationIdType2);
                String[] strArr2 = bsdr.a;
                bsdm bsdmVar2 = new bsdm(bsdr.a);
                bsdmVar2.z("createIsOneOnOneConversationExpression");
                bsdmVar2.f(new Function() { // from class: txm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar2 = (bsdq) obj2;
                        bsdqVar2.b(ConversationIdType.this);
                        return bsdqVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdqVar.as(new dtzq("($V)=1", new Object[]{bsdmVar2.b().u()}));
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsdmVar.b();
    }

    public static bvvl b(final ConversationIdType conversationIdType) {
        bvvn e = ParticipantsTable.e();
        e.z("createRbmBotDestinationQuery");
        e.f(new Function() { // from class: txp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bvtg) obj).f;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.h(new Function() { // from class: txq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.w(-2);
                bvvwVar.t(1);
                bvvwVar.l(txt.a(ConversationIdType.this));
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return e.b();
    }
}
