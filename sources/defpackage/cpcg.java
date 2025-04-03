package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcg extends ffhv implements ffjm {
    final /* synthetic */ cpck a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpcg(ffgu ffguVar, cpck cpckVar, String str) {
        super(2, ffguVar);
        this.a = cpckVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpcg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = cpck.d;
        return this.a.a.f(cgue.c(this.b, ewgz.CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpcg cpcgVar = new cpcg(ffguVar, this.a, this.b);
        cpcgVar.c = obj;
        return cpcgVar;
    }
}
