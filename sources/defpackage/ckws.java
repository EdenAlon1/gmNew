package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckws extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckwt b;
    final /* synthetic */ ceuw c;
    final /* synthetic */ ckww d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckws(ckwt ckwtVar, ceuw ceuwVar, ckww ckwwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckwtVar;
        this.c = ceuwVar;
        this.d = ckwwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckws) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cktz cktzVar = (cktz) this.b.h.b();
        ckwt ckwtVar = this.b;
        ceuw ceuwVar = this.c;
        ckww ckwwVar = this.d;
        ecda ecdaVar = ckwt.b;
        ecda ecdaVar2 = ckwt.c;
        ckwr ckwrVar = new ckwr(ckwtVar, ceuwVar, ckwwVar, null);
        this.a = 1;
        Object a = cktzVar.a(ecdaVar, ecdaVar2, ckwrVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckws(this.b, this.c, this.d, ffguVar);
    }
}
