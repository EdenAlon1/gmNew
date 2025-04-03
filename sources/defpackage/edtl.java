package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtl implements edtm {
    private static final Integer a = 79508299;
    private final detu b;
    private final dwdl c;

    public edtl(detu detuVar, dwdl dwdlVar) {
        this.b = detuVar;
        this.c = dwdlVar;
    }

    @Override // defpackage.edtm
    public final void a(erge ergeVar) {
        erqt.r(this.c.a(), new edtk(this, ergeVar), erpp.a);
    }

    public final void b(erge ergeVar) {
        ergj ergjVar = (ergj) ergeVar.build();
        epmx epmxVar = (epmx) epmz.a.createBuilder();
        epmxVar.copyOnWrite();
        epmz epmzVar = (epmz) epmxVar.instance;
        epmzVar.c = 1;
        epmzVar.b = 1 | epmzVar.b;
        epmxVar.copyOnWrite();
        epmz epmzVar2 = (epmz) epmxVar.instance;
        ergjVar.getClass();
        epmzVar2.d = ergjVar;
        epmzVar2.b |= 2;
        this.b.a(new deto((epmz) epmxVar.build(), new detp(a)));
    }
}
