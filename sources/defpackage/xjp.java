package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xjp extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public xjp(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        xjp xjpVar = new xjp((ffgu) obj4);
        xjpVar.a = (arae) obj;
        xjpVar.b = (alyx) obj2;
        xjpVar.c = (String) obj3;
        return xjpVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arae, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r4 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        obj2.getClass();
        return new xlh(r4, (alyx) obj2, (String) obj3);
    }
}
