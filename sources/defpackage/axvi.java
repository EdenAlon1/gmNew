package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axvj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axvi(axvj axvjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axvjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axvi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axvh axvhVar = (axvh) this.b.b.b();
            this.a = 1;
            if (axvhVar.c(true, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axvi(this.b, ffguVar);
    }
}
