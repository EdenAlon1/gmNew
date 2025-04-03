package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqi extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public yqi(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yqi yqiVar = new yqi((ffgu) obj3);
        yqiVar.a = (aqvj) obj;
        yqiVar.b = (aqux) obj2;
        return yqiVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        boolean z = true;
        if (((aqvj) obj2).a() && (r0 == 0 || !r0.s())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
