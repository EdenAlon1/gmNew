package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvi extends eyfq implements eyht {
    public epvi() {
        super(epvj.a);
    }

    public final void a(epvv epvvVar) {
        copyOnWrite();
        epvj epvjVar = (epvj) this.instance;
        epvw epvwVar = (epvw) epvvVar.build();
        epvj epvjVar2 = epvj.a;
        epvwVar.getClass();
        eygr eygrVar = epvjVar.g;
        if (!eygrVar.c()) {
            epvjVar.g = eyfy.mutableCopy(eygrVar);
        }
        epvjVar.g.add(epvwVar);
    }
}
