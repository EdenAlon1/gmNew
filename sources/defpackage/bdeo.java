package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdeo {
    private final ffbr a;

    public bdeo(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final bcyk a(ConversationIdType conversationIdType) {
        bcrs bcrsVar;
        ekzz f = eleg.f("ConversationListItemCoreDatabaseOperations#getExistingConversation");
        try {
            bejf bejfVar = (bejf) ((bfkf) bejc.a(conversationIdType).o()).cS();
            if (bejfVar != null) {
                bcrsVar = (bcrs) this.a.b();
                bcrsVar.S(bejfVar);
            } else {
                bcrsVar = null;
            }
            f.close();
            return bcrsVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List b(final long j) {
        ekzz f = eleg.f("ConversationListItemCoreDatabaseOperations#getExistingConversationsAfterTimestamp");
        try {
            ArrayList arrayList = new ArrayList();
            bfkk m = bfks.n().a().m();
            m.z("getExistingConversationsAfterTimestamp");
            m.e(new Function() { // from class: bden
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bfkp bfkpVar = (bfkp) obj;
                    bfkpVar.aq(new dtwe("conversations.sort_timestamp", 9, Long.valueOf(j)));
                    return bfkpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bfkf bfkfVar = (bfkf) m.b().o();
            while (bfkfVar.moveToNext()) {
                try {
                    bcrs bcrsVar = (bcrs) this.a.b();
                    bcrsVar.T(bfkfVar);
                    arrayList.add(bcrsVar);
                } finally {
                }
            }
            bfkfVar.close();
            f.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
