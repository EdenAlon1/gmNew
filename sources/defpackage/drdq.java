package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drdq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drds b;
    final /* synthetic */ drcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drdq(drds drdsVar, drcr drcrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drdsVar;
        this.c = drcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drdq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                dree a = this.b.a();
                String str = this.c.a;
                this.a = 1;
                if (a.e(str, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (IllegalStateException e) {
            ((enrr) ((enrr) drds.a.i()).g(e).h("com/google/android/libraries/compose/gif/ui/screen/GifScreen$registerMediaUsage$1", "invokeSuspend", 61, "GifScreen.kt")).p(e);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drdq(this.b, this.c, ffguVar);
    }
}
