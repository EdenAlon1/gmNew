package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emrx extends eyfq implements eyht {
    public emrx() {
        super(emsa.a);
    }

    public final void a(emrz emrzVar) {
        copyOnWrite();
        emsa emsaVar = (emsa) this.instance;
        emsa emsaVar2 = emsa.a;
        emrzVar.getClass();
        eygr eygrVar = emsaVar.b;
        if (!eygrVar.c()) {
            emsaVar.b = eyfy.mutableCopy(eygrVar);
        }
        emsaVar.b.add(emrzVar);
    }
}
