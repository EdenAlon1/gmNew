package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avyq extends ffhv implements ffjm {
    final /* synthetic */ avzh a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avyq(ffgu ffguVar, avzh avzhVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = avzhVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avyq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(((bdmq) this.a.d.b()).T(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avyq avyqVar = new avyq(ffguVar, this.a, this.b);
        avyqVar.c = obj;
        return avyqVar;
    }
}
