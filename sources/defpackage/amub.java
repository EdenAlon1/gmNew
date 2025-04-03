package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amub {
    private final ffbr a;

    public amub(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(int i, int i2, int i3) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_CONVERSATION_READ_STATUS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqtk eqtkVar = (eqtk) eqtn.a.createBuilder();
        eqtkVar.copyOnWrite();
        eqtn eqtnVar = (eqtn) eqtkVar.instance;
        eqtnVar.d = i2 - 1;
        eqtnVar.b |= 2;
        eqtkVar.copyOnWrite();
        eqtn eqtnVar2 = (eqtn) eqtkVar.instance;
        eqtnVar2.c = i - 1;
        eqtnVar2.b |= 1;
        eqtkVar.copyOnWrite();
        eqtn eqtnVar3 = (eqtn) eqtkVar.instance;
        eqtnVar3.b |= 4;
        eqtnVar3.e = i3;
        eqtn eqtnVar4 = (eqtn) eqtkVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqtnVar4.getClass();
        eolvVar2.bE = eqtnVar4;
        eolvVar2.g |= 256;
        akxlVar.j(eoluVar);
    }
}
