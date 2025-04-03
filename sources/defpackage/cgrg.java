package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrg extends eyfq implements eyht {
    public cgrg() {
        super(cgrh.a);
    }

    public final void a(String str) {
        copyOnWrite();
        cgrh cgrhVar = (cgrh) this.instance;
        cgrh cgrhVar2 = cgrh.a;
        str.getClass();
        eygr eygrVar = cgrhVar.b;
        if (!eygrVar.c()) {
            cgrhVar.b = eyfy.mutableCopy(eygrVar);
        }
        cgrhVar.b.add(str);
    }
}
