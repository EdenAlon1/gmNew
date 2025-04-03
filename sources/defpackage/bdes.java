package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdes {
    public final ffbr a;
    public final ffbr b;
    private final dtuu c;

    public bdes(dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = dtuuVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a(final ConversationIdType conversationIdType, final ConversationIdType conversationIdType2, final byyt byytVar) {
        csix.h();
        this.c.d("ConversationMergeDatabaseOperations#mergeMessagesInConversations", new Runnable() { // from class: bdep
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("mergeMessagesInConversations-messages");
                ConversationIdType conversationIdType3 = conversationIdType2;
                buxrVar.n(conversationIdType3);
                final ConversationIdType conversationIdType4 = conversationIdType;
                buxrVar.Y(new Function() { // from class: bdeq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buxz buxzVar = (buxz) obj;
                        buxzVar.m(ConversationIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                buxrVar.b().e();
                String[] strArr2 = PartsTable.a;
                bwdi bwdiVar = new bwdi();
                bwdiVar.ap("mergeMessagesInConversations-parts");
                bwdiVar.k(conversationIdType3);
                bwdiVar.D(new Function() { // from class: bder
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
                bwdiVar.b().e();
                bdes bdesVar = bdes.this;
                ((cgpv) bdesVar.b.b()).d(conversationIdType4, 0L);
                ((bdfl) bdesVar.a.b()).a(conversationIdType3, true, byytVar);
            }
        });
    }
}
