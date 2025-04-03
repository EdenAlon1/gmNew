package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oho extends ffhv implements ffjm {
    int a;
    final /* synthetic */ oia b;
    final /* synthetic */ okz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oho(oia oiaVar, okz okzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oiaVar;
        this.c = okzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oho) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxr ffxrVar = new ffxr(this.b.h);
            ohn ohnVar = new ohn(this.c);
            this.a = 1;
            if (ffxrVar.a(ohnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oho(this.b, this.c, ffguVar);
    }
}
