package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bznj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bznj(bznk bznkVar, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bznj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bznk bznkVar = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a = 1;
        Object s = bznkVar.s(i2, i3, this);
        return s == ffhhVar ? ffhhVar : s;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bznj(this.b, this.c, this.d, ffguVar);
    }
}
