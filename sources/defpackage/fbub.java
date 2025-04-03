package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbub extends eyfq implements eyht {
    public fbub() {
        super(fbuc.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fbuc fbucVar = (fbuc) this.instance;
        fbuc fbucVar2 = fbuc.a;
        eygr eygrVar = fbucVar.c;
        if (!eygrVar.c()) {
            fbucVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fbucVar.c);
    }
}
