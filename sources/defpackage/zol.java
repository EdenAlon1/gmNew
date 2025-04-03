package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zol extends ffhv implements ffjm {
    final /* synthetic */ olu a;
    final /* synthetic */ zmz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zol(olu oluVar, zmz zmzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = oluVar;
        this.b = zmzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zol) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.b().e) {
            this.b.r.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zol(this.a, this.b, ffguVar);
    }
}
