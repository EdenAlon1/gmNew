package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alsi {
    private final ffbr a;
    private final ffbr b;

    public alsi(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a(ephx ephxVar) {
        if (!((alwa) this.b.b()).b()) {
            ((alwa) this.b.b()).a();
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_REPORT_ISSUE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        ephxVar.getClass();
        eolvVar2.an = ephxVar;
        eolvVar2.d |= 64;
        ((akxl) this.a.b()).j(eoluVar);
    }
}
