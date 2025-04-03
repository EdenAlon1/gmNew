package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgvu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgwa b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgvu(cgwa cgwaVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgwaVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgvu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cgwa cgwaVar = this.b;
            eisx eisxVar = this.c;
            this.a = 1;
            if (cgwaVar.a(eisxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgvu(this.b, this.c, ffguVar);
    }
}
