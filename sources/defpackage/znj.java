package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znj extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ lkj b;
    final /* synthetic */ zqy c;
    final /* synthetic */ zmz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znj(boolean z, lkj lkjVar, zqy zqyVar, zmz zmzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = lkjVar;
        this.c = zqyVar;
        this.d = zmzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a && this.b.a(lkj.RESUMED)) {
            this.d.n.invoke(this.c);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new znj(this.a, this.b, this.c, this.d, ffguVar);
    }
}
