package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnru b;
    final /* synthetic */ aoku c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrq(cnru cnruVar, aoku aokuVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnruVar;
        this.c = aokuVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cnru cnruVar = this.b;
        aoku aokuVar = this.c;
        MessageCoreData messageCoreData = this.d;
        this.a = 1;
        Object a = cnruVar.a(aokuVar, messageCoreData, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnrq(this.b, this.c, this.d, ffguVar);
    }
}
