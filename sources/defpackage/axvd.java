package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axvd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvd(axvh axvhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axvhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axvh axvhVar = this.b;
            this.a = 1;
            if (axvhVar.d(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axvd(this.b, ffguVar);
    }
}
