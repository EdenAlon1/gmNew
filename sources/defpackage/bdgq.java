package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Iterator$EL;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgq {
    public static final ConversationIdType a = new ConversationIdType(-1);

    public static long a(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            return -1L;
        }
        return conversationIdType.a;
    }

    public static ConversationIdType b(String str) {
        if (str != null) {
            try {
                return new ConversationIdType(Long.parseLong(str));
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public static engw c(Iterable iterable) {
        int i = engw.d;
        final engr engrVar = new engr();
        Iterator$EL.forEachRemaining(iterable.iterator(), new Consumer() { // from class: bdgp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                engr.this.h(bdgq.b((String) obj));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return engrVar.g();
    }

    public static engw d(Collection collection) {
        return engw.n((Collection) Collection.EL.stream(collection).map(new bdgl()).collect(Collectors.toCollection(new bdgm())));
    }

    public static engw e(List list) {
        return engw.n((java.util.Collection) Collection.EL.stream(list).map(new bdgl()).collect(Collectors.toCollection(new bdgm())));
    }
}
