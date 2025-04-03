package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eruo extends eyfq implements eyht {
    public eruo() {
        super(erur.a);
    }

    public final void a(String str) {
        copyOnWrite();
        erur erurVar = (erur) this.instance;
        erur erurVar2 = erur.a;
        str.getClass();
        eygr eygrVar = erurVar.s;
        if (!eygrVar.c()) {
            erurVar.s = eyfy.mutableCopy(eygrVar);
        }
        erurVar.s.add(str);
    }

    public final void b(esal esalVar) {
        copyOnWrite();
        erur erurVar = (erur) this.instance;
        erur erurVar2 = erur.a;
        esalVar.getClass();
        erurVar.a();
        erurVar.r.add(esalVar);
    }
}
