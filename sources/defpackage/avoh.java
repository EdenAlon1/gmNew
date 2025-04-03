package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avoh extends eyfq implements eyht {
    public avoh() {
        super(avoi.a);
    }

    public final void a(avok avokVar) {
        copyOnWrite();
        avoi avoiVar = (avoi) this.instance;
        avoi avoiVar2 = avoi.a;
        avokVar.getClass();
        eygr eygrVar = avoiVar.b;
        if (!eygrVar.c()) {
            avoiVar.b = eyfy.mutableCopy(eygrVar);
        }
        avoiVar.b.add(avokVar);
    }
}
