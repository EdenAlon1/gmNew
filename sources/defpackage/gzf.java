package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzf extends ffhv implements ffjn {
    int a;
    final /* synthetic */ gzh b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzf(gzh gzhVar, ffjm ffjmVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = gzhVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new gzf(this.b, this.c, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gzh gzhVar = this.b;
            ffjm ffjmVar = this.c;
            this.a = 1;
            if (ffjmVar.a(gzhVar.a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
