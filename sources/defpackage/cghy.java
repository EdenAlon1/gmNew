package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cghy implements cghx {
    private final alxl a;

    public cghy(alxl alxlVar) {
        alxlVar.getClass();
        this.a = alxlVar;
    }

    @Override // defpackage.cghx
    public final Object a() {
        return ffcu.a;
    }

    @Override // defpackage.cghx
    public final Object b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alye c = this.a.a(new BugleConversationId((ConversationIdType) it.next()), alxk.MINIMAL).c();
            engw c2 = ((apce) c.j()).c();
            ArrayList arrayList = new ArrayList(ffdx.n(c2, 10));
            Iterator<E> it2 = c2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((alyv) it2.next()).b());
            }
            c.q(engq.a(arrayList));
        }
        return ffcu.a;
    }
}
