package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adea {
    public final ffbr a;

    public adea(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(String str, int i) {
        epaq epaqVar = (epaq) epar.a.createBuilder();
        epaqVar.copyOnWrite();
        epar eparVar = (epar) epaqVar.instance;
        str.getClass();
        eparVar.b |= 1;
        eparVar.c = str;
        epaqVar.copyOnWrite();
        epar eparVar2 = (epar) epaqVar.instance;
        eparVar2.d = i - 1;
        eparVar2.b |= 2;
        epar eparVar3 = (epar) epaqVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.EXTERNAL_API_SERVICE_CALL_PENDING;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eparVar3.getClass();
        eolvVar2.aF = eparVar3;
        eolvVar2.d |= Integer.MIN_VALUE;
        ((akxl) this.a.b()).j(eoluVar);
    }

    public final void b(String str, int i) {
        epas epasVar = (epas) epat.a.createBuilder();
        epasVar.copyOnWrite();
        epat epatVar = (epat) epasVar.instance;
        str.getClass();
        epatVar.b |= 1;
        epatVar.c = str;
        epasVar.copyOnWrite();
        epat epatVar2 = (epat) epasVar.instance;
        epatVar2.d = i - 1;
        epatVar2.b |= 2;
        epat epatVar3 = (epat) epasVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.EXTERNAL_API_SERVICE_CALL_START;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epatVar3.getClass();
        eolvVar2.aD = epatVar3;
        eolvVar2.d |= 536870912;
        ((akxl) this.a.b()).j(eoluVar);
    }
}
