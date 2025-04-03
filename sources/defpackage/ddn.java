package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dwl b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddn(dwn dwnVar, dwl dwlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dwnVar;
        this.b = dwlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dwn dwnVar = this.c;
            dwl dwlVar = this.b;
            this.a = 1;
            if (dwnVar.a(dwlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddn(this.c, this.b, ffguVar);
    }
}
