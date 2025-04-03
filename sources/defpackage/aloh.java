package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aloh extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ aloj b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aloh(aloj alojVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alojVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aloh) c((alnz) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alnz alnzVar = (alnz) this.a;
        alqf alqfVar = (alqf) this.b.b.b();
        int t = ((ctyz) this.b.d.b()).t();
        emau.a(ffsl.b(ekxi.a(alqfVar.b.hT())), alqfVar.c, new alpx(null, alqfVar, ((eisz) this.c).a, t == 4));
        if (alnzVar.c == ((eisz) this.c).a) {
            return alnzVar;
        }
        if ((alnzVar.b & 1) != 0) {
            ((aloo) this.b.c.b()).b(alnzVar.c);
        }
        alqf alqfVar2 = (alqf) this.b.b.b();
        eisx eisxVar = this.c;
        emau.a(ffsl.b(ekxi.a(alqfVar2.b.hT())), alqfVar2.c, new alqd(null, alqfVar2, ((eisz) eisxVar).a, alqfVar2.d.a()));
        eisx eisxVar2 = this.c;
        alny alnyVar = (alny) alnzVar.toBuilder();
        alnyVar.getClass();
        alnyVar.copyOnWrite();
        alnz alnzVar2 = (alnz) alnyVar.instance;
        alnzVar2.b |= 1;
        alnzVar2.c = ((eisz) eisxVar2).a;
        return alok.a(alnyVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aloh alohVar = new aloh(this.b, this.c, ffguVar);
        alohVar.a = obj;
        return alohVar;
    }
}
