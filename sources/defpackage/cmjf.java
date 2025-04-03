package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjf implements bdod {
    private final ffbr a;
    private final auol b;

    public cmjf(ffbr ffbrVar, auol auolVar) {
        ffbrVar.getClass();
        auolVar.getClass();
        this.a = ffbrVar;
        this.b = auolVar;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final void h(MessageCoreData messageCoreData) {
        String aA = messageCoreData.aA();
        if (aA == null) {
            return;
        }
        ekzz f = eleg.f("DeleteOnOutgoingMessageInsertionListener#onInsertInTransaction");
        try {
            cmjj R = messageCoreData.R();
            if (R == null) {
                ffig.a(f, null);
            } else {
                ((cmje) this.a.b()).a(R.b, aA);
                ffig.a(f, null);
            }
        } finally {
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return this.b.a();
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
