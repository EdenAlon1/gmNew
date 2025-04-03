package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglf extends eyfq implements eyht {
    public fglf() {
        super(fglg.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fglg fglgVar = (fglg) this.instance;
        fglg fglgVar2 = fglg.a;
        eygr eygrVar = fglgVar.c;
        if (!eygrVar.c()) {
            fglgVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fglgVar.c);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        fglg fglgVar = (fglg) this.instance;
        fglg fglgVar2 = fglg.a;
        eygr eygrVar = fglgVar.d;
        if (!eygrVar.c()) {
            fglgVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fglgVar.d);
    }
}
