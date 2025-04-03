package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvt extends ffhv implements ffjm {
    final /* synthetic */ String a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvt(ffgu ffguVar, String str) {
        super(2, ffguVar);
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xvt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return le.d(this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xvt xvtVar = new xvt(ffguVar, this.a);
        xvtVar.b = obj;
        return xvtVar;
    }
}
