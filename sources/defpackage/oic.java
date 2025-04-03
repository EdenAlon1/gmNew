package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oic extends ffhv implements ffjm {
    final /* synthetic */ oie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oic(oie oieVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = oieVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oic) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        oie oieVar = this.a;
        oieVar.h.b(new Integer(oieVar.f));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oic(this.a, ffguVar);
    }
}
