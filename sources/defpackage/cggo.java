package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggo {
    public final ffbr a;

    public cggo(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public static final boolean a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        efbd.b();
        String[] strArr = bvin.a;
        bvik bvikVar = new bvik(bvin.a);
        bvikVar.z("ParentDisallowedConversationDatabaseOperations#isConversationMarkedAsAllowed");
        bvim bvimVar = new bvim();
        bvimVar.b(conversationIdType);
        bvikVar.k(new bvil(bvimVar));
        return bvikVar.b().V();
    }

    public static final void b(ConversationIdType conversationIdType) {
        efbd.b();
        String[] strArr = bvin.a;
        bvig bvigVar = new bvig();
        bvigVar.f("ParentDisallowedConversationDatabaseOperations#markConversationAsAllowed");
        bvim bvimVar = new bvim();
        bvimVar.b(conversationIdType);
        bvigVar.a(bvimVar);
        bvigVar.d();
    }

    public static final void c(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        efbd.b();
        String[] strArr = bvin.a;
        bvhw bvhwVar = new bvhw();
        bvhwVar.b(conversationIdType);
        bvht a = bvhwVar.a();
        final dtve a2 = bvin.a();
        dtub.b(bvin.a(), "parent_disallowed_conversations", a, new Function() { // from class: bvhq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dtve.this.T("parent_disallowed_conversations", (ContentValues) obj, 4));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bvhr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
