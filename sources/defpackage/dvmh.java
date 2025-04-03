package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvmh extends dvki {
    static final emwl a = new dvlt();
    static final emwd b = new dvma();

    @Override // defpackage.dvki
    public final void a(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 16) != 0) {
            evxi evxiVar = ewabVar.j;
            if (evxiVar == null) {
                evxiVar = evxi.a;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            evxiVar.getClass();
            ewabVar2.j = evxiVar;
            ewabVar2.b |= 16;
        }
    }

    @Override // defpackage.dvki
    public final void b(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 1) != 0) {
            faul faulVar = ewabVar.e;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            faulVar.getClass();
            ewabVar2.e = faulVar;
            ewabVar2.b |= 1;
        }
    }

    @Override // defpackage.dvki
    public final void c(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 8) != 0) {
            String str = ewabVar.h;
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            str.getClass();
            ewabVar2.b |= 8;
            ewabVar2.h = str;
        }
    }

    @Override // defpackage.dvki
    public final void d(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if (ewabVar.c == 1) {
            String str = (String) ewabVar.d;
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            str.getClass();
            ewabVar2.c = 1;
            ewabVar2.d = str;
        }
    }

    @Override // defpackage.dvki
    public final void e(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if (ewabVar.c == 8) {
            String str = (String) ewabVar.d;
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            str.getClass();
            ewabVar2.c = 8;
            ewabVar2.d = str;
        }
    }

    @Override // defpackage.dvki
    public final void f(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 4) != 0) {
            String str = ewabVar.g;
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            str.getClass();
            ewabVar2.b |= 4;
            ewabVar2.g = str;
        }
    }

    @Override // defpackage.dvki
    public final void g(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        eygr eygrVar = ((ewab) emwlVar.apply(eyasVar)).i;
        evzxVar.copyOnWrite();
        ewab ewabVar = (ewab) evzxVar.instance;
        ewabVar.a();
        eydl.addAll(eygrVar, ewabVar.i);
    }

    @Override // defpackage.dvki
    public final void h(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 64) != 0) {
            int a2 = evzt.a(ewabVar.l);
            if (a2 == 0) {
                a2 = 1;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            ewabVar2.l = a2 - 1;
            ewabVar2.b |= 64;
        }
    }

    @Override // defpackage.dvki
    public final void i(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if ((ewabVar.b & 2) != 0) {
            faul faulVar = ewabVar.f;
            if (faulVar == null) {
                faulVar = faul.a;
            }
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            faulVar.getClass();
            ewabVar2.f = faulVar;
            ewabVar2.b |= 2;
        }
    }

    @Override // defpackage.dvki
    public final void j(eybm eybmVar, evzx evzxVar) {
        emwl emwlVar = a;
        eyas eyasVar = eybmVar.c;
        if (eyasVar == null) {
            eyasVar = eyas.a;
        }
        ewab ewabVar = (ewab) emwlVar.apply(eyasVar);
        if (ewabVar.c == 9) {
            Integer num = (Integer) ewabVar.d;
            num.intValue();
            evzxVar.copyOnWrite();
            ewab ewabVar2 = (ewab) evzxVar.instance;
            ewabVar2.c = 9;
            ewabVar2.d = num;
        }
    }
}
