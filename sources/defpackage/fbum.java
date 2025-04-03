package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbum extends eyfq implements eyht {
    public fbum() {
        super(fbun.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fbun fbunVar = (fbun) this.instance;
        fbun fbunVar2 = fbun.a;
        eygr eygrVar = fbunVar.f;
        if (!eygrVar.c()) {
            fbunVar.f = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, fbunVar.f);
    }
}
