package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwo implements bdod {
    private final alwf a;

    public alwo(alwf alwfVar) {
        alwfVar.getClass();
        this.a = alwfVar;
    }

    @Override // defpackage.bdod
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (((Boolean) ((cfup) alwj.c.get()).e()).booleanValue()) {
            this.a.b();
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        Object e = ((cfup) alwj.c.get()).e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
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
