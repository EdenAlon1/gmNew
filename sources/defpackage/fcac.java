package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcac extends eyfq implements eyht {
    public fcac() {
        super(fcad.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fcad fcadVar = (fcad) this.instance;
        fcad fcadVar2 = fcad.a;
        eygr eygrVar = fcadVar.d;
        if (!eygrVar.c()) {
            fcadVar.d = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fcadVar.d);
    }
}
