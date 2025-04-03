package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class celv implements bdod {
    private final arep a;
    private final cemf b;

    public celv(arep arepVar, babf babfVar, cemf cemfVar) {
        arepVar.getClass();
        babfVar.getClass();
        this.a = arepVar;
        this.b = cemfVar;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final void h(MessageCoreData messageCoreData) {
        if (messageCoreData.V() != csgg.CMS_RESTORE_IN_PROGRESS) {
            return;
        }
        cemf cemfVar = this.b;
        int d = babf.d();
        cemk cemkVar = (cemk) ceml.a.createBuilder();
        cemkVar.getClass();
        cemkVar.copyOnWrite();
        ((ceml) cemkVar.instance).b = d;
        long a = MessageIdType.a(messageCoreData.B());
        cemkVar.copyOnWrite();
        ((ceml) cemkVar.instance).c = a;
        eyfy build = cemkVar.build();
        build.getClass();
        axnw.h(((cevh) cemfVar.a.b()).a(ceyr.g("finish_cms_restore_after_message_insertion", (ceml) build)).b());
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return this.a.a();
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
