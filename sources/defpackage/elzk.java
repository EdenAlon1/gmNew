package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzk extends eyfq implements eyht {
    public elzk() {
        super(elzl.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        elzl elzlVar = (elzl) this.instance;
        elzl elzlVar2 = elzl.a;
        eygr eygrVar = elzlVar.e;
        if (!eygrVar.c()) {
            elzlVar.e = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, elzlVar.e);
    }
}
