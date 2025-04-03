package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqr {
    public final ffbr a;

    public sqr(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(int i) {
        eqjy eqjyVar = (eqjy) eqjz.a.createBuilder();
        eqjyVar.copyOnWrite();
        eqjz eqjzVar = (eqjz) eqjyVar.instance;
        eqjzVar.c = i - 1;
        eqjzVar.b |= 1;
        eqjz eqjzVar2 = (eqjz) eqjyVar.build();
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_SYSTEM_BACKUP_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqjzVar2.getClass();
        eolvVar2.bJ = eqjzVar2;
        eolvVar2.g |= 32768;
        akxlVar.k(eoluVar, epyw.BUGLE_SYSTEM_BACKUP_EVENT);
    }
}
