package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgoc extends eyfq implements eyht {
    public fgoc() {
        super(fgom.a);
    }

    public final void a(fgon fgonVar) {
        copyOnWrite();
        fgom fgomVar = (fgom) this.instance;
        fgox fgoxVar = (fgox) fgonVar.build();
        fgom fgomVar2 = fgom.a;
        fgoxVar.getClass();
        eygr eygrVar = fgomVar.k;
        if (!eygrVar.c()) {
            fgomVar.k = eyfy.mutableCopy(eygrVar);
        }
        fgomVar.k.add(fgoxVar);
    }
}
