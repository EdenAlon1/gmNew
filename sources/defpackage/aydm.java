package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydm extends eyfq implements eyht {
    public aydm() {
        super(aydn.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        aydn aydnVar = (aydn) this.instance;
        aydn aydnVar2 = aydn.a;
        eygr eygrVar = aydnVar.c;
        if (!eygrVar.c()) {
            aydnVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, aydnVar.c);
    }
}
