package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escf extends eyfq implements eyht {
    public escf() {
        super(escg.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        escg escgVar = (escg) this.instance;
        escg escgVar2 = escg.a;
        eygr eygrVar = escgVar.d;
        if (!eygrVar.c()) {
            escgVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, escgVar.d);
    }
}
