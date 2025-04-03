package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujv extends ffhv implements ffjm {
    final /* synthetic */ cuke a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujv(ffgu ffguVar, cuke cukeVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = cukeVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((bdrr) this.a.b.b()).b(this.b.aA());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cujv cujvVar = new cujv(ffguVar, this.a, this.b);
        cujvVar.c = obj;
        return cujvVar;
    }
}
