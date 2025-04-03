package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eah extends hvh implements ixi {
    public hun a;

    public eah(hun hunVar) {
        this.a = hunVar;
    }

    @Override // defpackage.ixi
    public final /* bridge */ /* synthetic */ Object eb(Object obj) {
        ebl eblVar = obj instanceof ebl ? (ebl) obj : null;
        if (eblVar == null) {
            eblVar = new ebl(null);
        }
        int i = dza.b;
        eblVar.c = new dyx(this.a);
        return eblVar;
    }
}
