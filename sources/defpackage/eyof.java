package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyof extends eyfq implements eyht {
    public eyof() {
        super(eyog.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eyog eyogVar = (eyog) this.instance;
        eyog eyogVar2 = eyog.a;
        eygr eygrVar = eyogVar.b;
        if (!eygrVar.c()) {
            eyogVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, eyogVar.b);
    }
}
