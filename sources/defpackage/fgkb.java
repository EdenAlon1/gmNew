package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkb extends eyfq implements eyht {
    public fgkb() {
        super(fgkc.a);
    }

    public final void a(String str) {
        copyOnWrite();
        fgkc fgkcVar = (fgkc) this.instance;
        fgkc fgkcVar2 = fgkc.a;
        str.getClass();
        eygr eygrVar = fgkcVar.c;
        if (!eygrVar.c()) {
            fgkcVar.c = eyfy.mutableCopy(eygrVar);
        }
        fgkcVar.c.add(str);
    }
}
