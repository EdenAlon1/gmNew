package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkl extends ffhv implements ffjm {
    final /* synthetic */ ctqh a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkl(ffgu ffguVar, ctqh ctqhVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = ctqhVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessageIdType B = this.b.B();
        B.getClass();
        return this.a.j(B);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctkl ctklVar = new ctkl(ffguVar, this.a, this.b);
        ctklVar.c = obj;
        return ctklVar;
    }
}
