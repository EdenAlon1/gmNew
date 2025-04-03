package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amtl b;
    final /* synthetic */ amfx c;
    final /* synthetic */ axad d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtj(amtl amtlVar, amfx amfxVar, axad axadVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amtlVar;
        this.c = amfxVar;
        this.d = axadVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amtj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object e;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amtl amtlVar = this.b;
        amfx amfxVar = this.c;
        axad axadVar = this.d;
        String str = this.e;
        this.a = 1;
        e = amtlVar.e(amfxVar, axadVar, str, null, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amtj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
