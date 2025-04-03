package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bznn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznq b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bznn(bznq bznqVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznqVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bznn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = ((bzme) this.b.c.b()).b();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((bzea) this.b.a.b()).v(ezlk.b(((bzma) obj).p), (String) ((cgvp) this.b.b.b()).a.get(), this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bznn(this.b, this.c, ffguVar);
    }
}
