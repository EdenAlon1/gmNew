package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zmz b;
    final /* synthetic */ zkp c;
    final /* synthetic */ eey d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znw(zmz zmzVar, zkp zkpVar, eey eeyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zmzVar;
        this.c = zkpVar;
        this.d = eeyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((znw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zmz zmzVar = this.b;
            znv znvVar = new znv(this.c, zmzVar, this.d, null);
            this.a = 1;
            if (ffyk.b(zmzVar.c, znvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new znw(this.b, this.c, this.d, ffguVar);
    }
}
