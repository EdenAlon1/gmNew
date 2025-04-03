package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apdq extends ffhv implements ffjm {
    final /* synthetic */ MessageId a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apdq(ffgu ffguVar, MessageId messageId) {
        super(2, ffguVar);
        this.a = messageId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apdq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageId messageId = this.a;
        if (!(messageId instanceof CoreBugleMessageId)) {
            if (!(messageId instanceof CoreBuglePartialMessageId)) {
                throw new IllegalArgumentException("Unhandled MessageId type.");
            }
            PartsTable.BindData a = PartsTable.a(String.valueOf(((CoreBuglePartialMessageId) messageId).b));
            if (a == null) {
                throw new IllegalStateException("row not found");
            }
            if (!le.f(a.H()) || a.t() == null) {
                throw new IllegalArgumentException("No audio part for given BuglePartialMessageId.");
            }
            return a;
        }
        bwdf c = PartsTable.c();
        c.z("AudioMessageTranscriberImpl#getAudioPartFromMessageId");
        c.h(new apds(this.a));
        engw y = c.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            PartsTable.BindData bindData = (PartsTable.BindData) next;
            if (le.f(bindData.H()) && bindData.t() != null) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        throw new IllegalArgumentException("No support for CoreBugleMessageId without exactly one audio part.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apdq apdqVar = new apdq(ffguVar, this.a);
        apdqVar.b = obj;
        return apdqVar;
    }
}
