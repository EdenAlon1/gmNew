package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdoh extends ffhv implements ffjm {
    final /* synthetic */ bdod a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdoh(ffgu ffguVar, bdod bdodVar, MessageCoreData messageCoreData, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = bdodVar;
        this.b = messageCoreData;
        this.c = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdoh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bdoh bdohVar = new bdoh(ffguVar, this.a, this.b, this.c);
        bdohVar.d = obj;
        return bdohVar;
    }
}
