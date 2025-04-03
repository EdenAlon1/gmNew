package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzo {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final fazb d;
    private final ffbr e;
    private final avkk f;

    public ckzo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar, ffbr ffbrVar4, avkk avkkVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = fazbVar;
        this.e = ffbrVar4;
        this.f = avkkVar;
    }

    private final void c(eomn eomnVar, eqyl eqylVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aa = eqylVar.h;
        eopqVar.c |= 2097152;
        eopq eopqVar2 = (eopq) eoopVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eopqVar2.getClass();
        eolvVar.l = eopqVar2;
        eolvVar.b |= 4;
        eolt eoltVar = eolt.BUGLE_GROUP;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eolvVar2.j = eoltVar.dk;
        eolvVar2.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eomnVar.getClass();
        eolvVar3.C = eomnVar;
        eolvVar3.b |= 4194304;
        akxlVar.j(eoluVar);
    }

    private final eomj d() {
        eomj eomjVar = (eomj) eomn.a.createBuilder();
        eomjVar.copyOnWrite();
        eomn eomnVar = (eomn) eomjVar.instance;
        eomnVar.c = 12;
        eomnVar.b |= 1;
        eoqk a = ((akyw) this.d.b()).a(((ckby) this.c.b()).a(ckcf.u));
        eomjVar.copyOnWrite();
        eomn eomnVar2 = (eomn) eomjVar.instance;
        eomnVar2.e = a;
        eomnVar2.b |= 4;
        eqwf a2 = ((ckgv) this.e.b()).a();
        eomjVar.copyOnWrite();
        eomn eomnVar3 = (eomn) eomjVar.instance;
        eomnVar3.f = a2.N;
        eomnVar3.b |= 8;
        return eomjVar;
    }

    public final void a(ConversationIdType conversationIdType, int i) {
        String b = emxe.b(((ckds) this.b.b()).q(conversationIdType));
        eomj d = d();
        d.copyOnWrite();
        eomn eomnVar = (eomn) d.instance;
        eomn eomnVar2 = eomn.a;
        eomnVar.b |= 32;
        eomnVar.h = b;
        d.copyOnWrite();
        eomn eomnVar3 = (eomn) d.instance;
        eomnVar3.d = 1;
        eomnVar3.b |= 2;
        eqfl eqflVar = (eqfl) eqfo.a.createBuilder();
        eqflVar.copyOnWrite();
        eqfo eqfoVar = (eqfo) eqflVar.instance;
        eqfoVar.c = i - 1;
        eqfoVar.b |= 1;
        d.copyOnWrite();
        eomn eomnVar4 = (eomn) d.instance;
        eqfo eqfoVar2 = (eqfo) eqflVar.build();
        eqfoVar2.getClass();
        eomnVar4.l = eqfoVar2;
        eomnVar4.b |= 4096;
        c((eomn) d.build(), this.f.a());
    }

    public final void b(String str, int i) {
        eomj d = d();
        d.copyOnWrite();
        eomn eomnVar = (eomn) d.instance;
        eomn eomnVar2 = eomn.a;
        eomnVar.b |= 32;
        eomnVar.h = str;
        d.copyOnWrite();
        eomn eomnVar3 = (eomn) d.instance;
        eomnVar3.d = 1;
        eomnVar3.b |= 2;
        eqfl eqflVar = (eqfl) eqfo.a.createBuilder();
        eqflVar.copyOnWrite();
        eqfo eqfoVar = (eqfo) eqflVar.instance;
        eqfoVar.d = i - 1;
        eqfoVar.b |= 2;
        d.copyOnWrite();
        eomn eomnVar4 = (eomn) d.instance;
        eqfo eqfoVar2 = (eqfo) eqflVar.build();
        eqfoVar2.getClass();
        eomnVar4.l = eqfoVar2;
        eomnVar4.b |= 4096;
        c((eomn) d.build(), this.f.a());
    }
}
