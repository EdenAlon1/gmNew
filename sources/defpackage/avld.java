package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avld {
    public final avuh a;
    public final avtu b;
    public final avla c;
    private final ffbr d;
    private final fazb e;
    private final ffbr f;
    private final csjk g;
    private final avkk h;

    public avld(ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, csjk csjkVar, avkk avkkVar, avuh avuhVar, avtu avtuVar, avla avlaVar) {
        this.d = ffbrVar;
        this.e = fazbVar;
        this.f = ffbrVar2;
        this.g = csjkVar;
        this.h = avkkVar;
        this.a = avuhVar;
        this.b = avtuVar;
        this.c = avlaVar;
    }

    public final eomj a(String str) {
        eomj eomjVar = (eomj) eomn.a.createBuilder();
        eomjVar.copyOnWrite();
        eomn eomnVar = (eomn) eomjVar.instance;
        str.getClass();
        eomnVar.b |= 32;
        eomnVar.h = str;
        eoqk a = ((akyw) this.e.b()).a(((ckby) this.f.b()).a(ckcf.h));
        eomjVar.copyOnWrite();
        eomn eomnVar2 = (eomn) eomjVar.instance;
        eomnVar2.e = a;
        eomnVar2.b |= 4;
        eqwf d = ((ckge) this.g.a()).d();
        eomjVar.copyOnWrite();
        eomn eomnVar3 = (eomn) eomjVar.instance;
        eomnVar3.f = d.N;
        eomnVar3.b |= 8;
        return eomjVar;
    }

    public final void b(String str, awud awudVar, axad axadVar) {
        awuc b = awuc.b(awudVar.c);
        if (b == null) {
            b = awuc.UNKNOWN_STATUS;
        }
        eqwy eqwyVar = (eqwy) this.c.fP(b);
        avtu avtuVar = this.b;
        awua b2 = awua.b(awudVar.d);
        if (b2 == null) {
            b2 = awua.UNKNOWN_CAUSE;
        }
        e(str, 2, eqwyVar, (eqww) avtuVar.fP(b2), axadVar);
    }

    public final void c(String str, eqww eqwwVar, axad axadVar) {
        e(str, 2, eqwy.CHAT_API_FAILED_PERMANENTLY, eqwwVar, axadVar);
    }

    public final void d(eomn eomnVar) {
        akxl akxlVar = (akxl) this.d.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        eqyl a = this.h.a();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.aa = a.h;
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

    public final void e(String str, int i, eqwy eqwyVar, eqww eqwwVar, axad axadVar) {
        eomj a = a(str);
        a.copyOnWrite();
        eomn eomnVar = (eomn) a.instance;
        eomn eomnVar2 = eomn.a;
        eomnVar.c = 14;
        eomnVar.b |= 1;
        a.copyOnWrite();
        eomn eomnVar3 = (eomn) a.instance;
        eomnVar3.d = 2;
        eomnVar3.b = 2 | eomnVar3.b;
        eqrk eqrkVar = (eqrk) eqrm.a.createBuilder();
        fjay fjayVar = (fjay) this.a.m().fP(axadVar);
        eqrkVar.copyOnWrite();
        eqrm eqrmVar = (eqrm) eqrkVar.instance;
        fjayVar.getClass();
        eqrmVar.c = fjayVar;
        eqrmVar.b |= 1;
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.e = i - 1;
        eqxkVar.b |= 4;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.g = eqwyVar.f;
        eqxkVar2.b |= 16;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar3 = (eqxk) eqxjVar.instance;
        eqxkVar3.f = eqwwVar.C;
        eqxkVar3.b |= 8;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar4 = (eqxk) eqxjVar.build();
        eqxkVar4.getClass();
        eqxiVar.c = eqxkVar4;
        eqxiVar.b |= 1;
        eqrkVar.copyOnWrite();
        eqrm eqrmVar2 = (eqrm) eqrkVar.instance;
        eqxi eqxiVar2 = (eqxi) eqxhVar.build();
        eqxiVar2.getClass();
        eqrmVar2.e = eqxiVar2;
        eqrmVar2.b |= 4;
        a.copyOnWrite();
        eomn eomnVar4 = (eomn) a.instance;
        eqrm eqrmVar3 = (eqrm) eqrkVar.build();
        eqrmVar3.getClass();
        eomnVar4.m = eqrmVar3;
        eomnVar4.b |= 8192;
        d((eomn) a.build());
    }

    public final void f(String str, int i, int i2, axad axadVar) {
        eomj a = a(str);
        a.copyOnWrite();
        eomn eomnVar = (eomn) a.instance;
        eomn eomnVar2 = eomn.a;
        eomnVar.c = 13;
        eomnVar.b |= 1;
        eomk eomkVar = (eomk) eoml.a.createBuilder();
        eomkVar.copyOnWrite();
        eoml eomlVar = (eoml) eomkVar.instance;
        eomlVar.b |= 2;
        eomlVar.d = i;
        a.copyOnWrite();
        eomn eomnVar3 = (eomn) a.instance;
        eoml eomlVar2 = (eoml) eomkVar.build();
        eomlVar2.getClass();
        eomnVar3.g = eomlVar2;
        eomnVar3.b |= 16;
        eqrk eqrkVar = (eqrk) eqrm.a.createBuilder();
        eqrkVar.copyOnWrite();
        eqrm eqrmVar = (eqrm) eqrkVar.instance;
        eqrmVar.d = i2 - 1;
        eqrmVar.b |= 2;
        fjay fjayVar = (fjay) this.a.m().fP(axadVar);
        eqrkVar.copyOnWrite();
        eqrm eqrmVar2 = (eqrm) eqrkVar.instance;
        fjayVar.getClass();
        eqrmVar2.c = fjayVar;
        eqrmVar2.b |= 1;
        a.copyOnWrite();
        eomn eomnVar4 = (eomn) a.instance;
        eqrm eqrmVar3 = (eqrm) eqrkVar.build();
        eqrmVar3.getClass();
        eomnVar4.m = eqrmVar3;
        eomnVar4.b |= 8192;
        d((eomn) a.build());
    }
}
