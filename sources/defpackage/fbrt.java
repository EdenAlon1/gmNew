package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrt extends eyfq implements eyht {
    public fbrt() {
        super(fbru.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fbru fbruVar = (fbru) this.instance;
        fbru fbruVar2 = fbru.a;
        eygr eygrVar = fbruVar.c;
        if (!eygrVar.c()) {
            fbruVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fbruVar.c);
    }
}
