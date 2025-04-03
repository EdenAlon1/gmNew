package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aljz extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public aljz(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aljz) c((alkd) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alkc alkcVar = (alkc) ((alkd) this.a).toBuilder();
        alkcVar.getClass();
        alkcVar.copyOnWrite();
        alkd alkdVar = (alkd) alkcVar.instance;
        alkdVar.b |= 1;
        alkdVar.c = true;
        return alke.a(alkcVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aljz aljzVar = new aljz(ffguVar);
        aljzVar.a = obj;
        return aljzVar;
    }
}
