package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edtk implements erqj {
    final /* synthetic */ erge a;
    final /* synthetic */ edtl b;

    public edtk(edtl edtlVar, erge ergeVar) {
        this.a = ergeVar;
        this.b = edtlVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        if (!str.isEmpty()) {
            erge ergeVar = this.a;
            ezoh ezohVar = (ezoh) ezoi.a.createBuilder();
            ezohVar.copyOnWrite();
            ezoi ezoiVar = (ezoi) ezohVar.instance;
            str.getClass();
            ezoiVar.b |= 4;
            ezoiVar.c = str;
            ergeVar.copyOnWrite();
            ergj ergjVar = (ergj) ergeVar.instance;
            ezoi ezoiVar2 = (ezoi) ezohVar.build();
            ergj ergjVar2 = ergj.a;
            ezoiVar2.getClass();
            ergjVar.p = ezoiVar2;
            ergjVar.c |= 2;
        }
        this.b.b(this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.b.b(this.a);
    }
}
