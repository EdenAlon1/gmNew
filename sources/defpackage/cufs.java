package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cufs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cufu b;
    final /* synthetic */ erdl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufs(cufu cufuVar, erdl erdlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cufuVar;
        this.c = erdlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cufu cufuVar = this.b;
            erdl erdlVar = this.c;
            this.a = 1;
            if (cufuVar.a(erdlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufs(this.b, this.c, ffguVar);
    }
}
