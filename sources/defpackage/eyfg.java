package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfg extends eyfq implements eyht {
    public eyfg() {
        super(eyfh.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eyfh eyfhVar = (eyfh) this.instance;
        eyfh eyfhVar2 = eyfh.a;
        eygr eygrVar = eyfhVar.b;
        if (!eygrVar.c()) {
            eyfhVar.b = eyfy.mutableCopy(eygrVar);
        }
        eyfhVar.b.add(str);
    }
}
