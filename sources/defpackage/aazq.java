package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ aoax c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazq(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = aoaxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aazq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl z = ((alye) this.b.l.b()).z(((aoat) this.c).c());
            z.getClass();
            this.a = 1;
            if (fgfz.c(z, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aazq(this.b, this.c, ffguVar);
    }
}
