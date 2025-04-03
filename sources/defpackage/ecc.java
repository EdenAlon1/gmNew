package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecc extends hvh implements ixi {
    public hus a;

    public ecc(hus husVar) {
        this.a = husVar;
    }

    @Override // defpackage.ixi
    public final /* bridge */ /* synthetic */ Object eb(Object obj) {
        ebl eblVar = obj instanceof ebl ? (ebl) obj : null;
        if (eblVar == null) {
            eblVar = new ebl(null);
        }
        int i = dza.b;
        eblVar.c = new dyz(this.a);
        return eblVar;
    }
}
