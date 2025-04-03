package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzmo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmo(bznk bznkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            comc n = this.b.n();
            this.a = 1;
            obj = n.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new Integer(((bzma) obj).o);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzmo(this.b, ffguVar);
    }
}
