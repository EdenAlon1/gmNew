package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zom extends ffhv implements ffjm {
    final /* synthetic */ zmz a;
    final /* synthetic */ zqy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zom(zmz zmzVar, zqy zqyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zmzVar;
        this.b = zqyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zom) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.q.invoke(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zom(this.a, this.b, ffguVar);
    }
}
