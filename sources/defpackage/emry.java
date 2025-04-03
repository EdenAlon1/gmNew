package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emry extends eyfq implements eyht {
    public emry() {
        super(emrz.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        emrz emrzVar = (emrz) this.instance;
        emrz emrzVar2 = emrz.a;
        eygi eygiVar = emrzVar.b;
        if (!eygiVar.c()) {
            emrzVar.b = eyfy.mutableCopy(eygiVar);
        }
        eydl.addAll(iterable, emrzVar.b);
    }
}
