package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnl extends eyfq implements eyht {
    public clnl() {
        super(clnm.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        clnm clnmVar = (clnm) this.instance;
        clnm clnmVar2 = clnm.a;
        eygr eygrVar = clnmVar.e;
        if (!eygrVar.c()) {
            clnmVar.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, clnmVar.e);
    }
}
