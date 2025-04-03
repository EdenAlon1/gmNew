package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alof extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ aloj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alof(aloj alojVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alof) c((alnz) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alnz alnzVar = (alnz) this.a;
        if ((alnzVar.b & 1) == 0) {
            return alnzVar;
        }
        ((aloo) this.b.c.b()).b(alnzVar.c);
        alny alnyVar = (alny) alnzVar.toBuilder();
        alnyVar.getClass();
        alnyVar.copyOnWrite();
        alnz alnzVar2 = (alnz) alnyVar.instance;
        alnzVar2.b &= -2;
        alnzVar2.c = 0;
        return alok.a(alnyVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alof alofVar = new alof(this.b, ffguVar);
        alofVar.a = obj;
        return alofVar;
    }
}
