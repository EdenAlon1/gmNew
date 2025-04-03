package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujw extends ffhv implements ffjm {
    final /* synthetic */ cuke a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cujw(ffgu ffguVar, cuke cukeVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = cukeVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cujw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aztg f = ((bdtd) this.a.e.b()).f(this.b.v());
        if (f != null) {
            return (aoku) fflm.b(f.b());
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cujw cujwVar = new cujw(ffguVar, this.a, this.b);
        cujwVar.c = obj;
        return cujwVar;
    }
}
