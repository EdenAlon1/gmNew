package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkk extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkk(ffgu ffguVar, ctko ctkoVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((ctiz) this.a.e.b()).a(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctkk ctkkVar = new ctkk(ffguVar, this.a, this.b);
        ctkkVar.c = obj;
        return ctkkVar;
    }
}
