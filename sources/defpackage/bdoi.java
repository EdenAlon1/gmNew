package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdoi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bdol b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdoi(bdol bdolVar, MessageCoreData messageCoreData, MessageIdType messageIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bdolVar;
        this.c = messageCoreData;
        this.d = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdoi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bdol bdolVar = this.b;
            MessageCoreData messageCoreData = this.c;
            MessageIdType messageIdType = this.d;
            this.a = 1;
            Object a = ffra.a(ekxi.a(bdolVar.c), new bdog(null, bdolVar, messageCoreData, messageIdType), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return new Integer(this.b.b().size());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bdoi(this.b, this.c, this.d, ffguVar);
    }
}
