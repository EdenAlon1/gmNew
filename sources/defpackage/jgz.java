package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jgz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgdj b;
    final /* synthetic */ jfa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgz(fgdj fgdjVar, jfa jfaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgdjVar;
        this.c = jfaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jgz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgdj fgdjVar = this.b;
            jgy jgyVar = new jgy(this.c);
            this.a = 1;
            if (fgdjVar.a(jgyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jgz(this.b, this.c, ffguVar);
    }
}
