package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqj extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public yqj(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yqj yqjVar = new yqj((ffgu) obj3);
        yqjVar.a = (cnpk) obj;
        yqjVar.b = (aqux) obj2;
        return yqjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        boolean z = true;
        if (((cnpk) obj2).b() && (r0 == 0 || !r0.s())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
