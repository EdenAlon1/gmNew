package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwy extends eyfq implements eyht {
    public clwy() {
        super(clwz.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        clwz clwzVar = (clwz) this.instance;
        clwz clwzVar2 = clwz.a;
        eygr eygrVar = clwzVar.b;
        if (!eygrVar.c()) {
            clwzVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clwzVar.b);
    }
}
