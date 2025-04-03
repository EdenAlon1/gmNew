package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czkq {
    public final baae a;

    public czkq(baae baaeVar) {
        this.a = baaeVar;
    }

    public final void a(RecyclerView recyclerView) {
        vx vxVar = recyclerView.o;
        emxf.l(vxVar instanceof LinearLayoutManager);
        vxVar.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) vxVar;
        int N = linearLayoutManager.N();
        ArrayList<bcse> arrayList = new ArrayList();
        for (int L = linearLayoutManager.L(); L <= N; L++) {
            wr j = recyclerView.j(L, false);
            if (j != null) {
                View view = j.a;
                if (view instanceof ConversationMessageView) {
                    arrayList.add(((ConversationMessageView) view).e);
                }
            }
        }
        baae baaeVar = this.a;
        recyclerView.getContext();
        long epochMilli = baaeVar.d.f().toEpochMilli();
        ArrayList arrayList2 = new ArrayList();
        HashSet<MessageIdType> hashSet = new HashSet(baaeVar.b.keySet());
        baaeVar.a.lock();
        try {
            for (bcse bcseVar : arrayList) {
                if (!hashSet.remove(bcseVar.u())) {
                    baaeVar.b.put(bcseVar.u(), new baad(bcseVar.U(), epochMilli));
                    if (!baaeVar.c) {
                        baaeVar.c = true;
                        baaeVar.b();
                    }
                }
            }
            for (MessageIdType messageIdType : hashSet) {
                baad baadVar = (baad) baaeVar.b.get(messageIdType);
                if (baadVar != null && baadVar.c == 2) {
                    arrayList2.add(baadVar);
                }
                baaeVar.b.remove(messageIdType);
            }
            baaeVar.a.unlock();
            baaeVar.a(arrayList2);
        } catch (Throwable th) {
            baaeVar.a.unlock();
            throw th;
        }
    }
}
