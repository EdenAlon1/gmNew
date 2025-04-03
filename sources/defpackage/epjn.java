package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjn extends eyfq implements eyht {
    public epjn() {
        super(epjq.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        epjq epjqVar = (epjq) this.instance;
        epjq epjqVar2 = epjq.a;
        eygr eygrVar = epjqVar.i;
        if (!eygrVar.c()) {
            epjqVar.i = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(iterable, epjqVar.i);
    }
}
