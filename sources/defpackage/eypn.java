package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eypn extends eyfq implements eyht {
    public eypn() {
        super(eypo.a);
    }

    public final void a(eync eyncVar) {
        copyOnWrite();
        eypo eypoVar = (eypo) this.instance;
        eypo eypoVar2 = eypo.a;
        eyncVar.getClass();
        eygr eygrVar = eypoVar.b;
        if (!eygrVar.c()) {
            eypoVar.b = eyfy.mutableCopy(eygrVar);
        }
        eypoVar.b.add(eyncVar);
    }

    public final void b(eync eyncVar) {
        copyOnWrite();
        eypo eypoVar = (eypo) this.instance;
        eypo eypoVar2 = eypo.a;
        eyncVar.getClass();
        eygr eygrVar = eypoVar.c;
        if (!eygrVar.c()) {
            eypoVar.c = eyfy.mutableCopy(eygrVar);
        }
        eypoVar.c.add(eyncVar);
    }
}
