package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqn extends eyfq implements eyht {
    public fgqn() {
        super(fgqo.a);
    }

    public final void a(int i) {
        copyOnWrite();
        fgqo fgqoVar = (fgqo) this.instance;
        fgqo fgqoVar2 = fgqo.a;
        eygi eygiVar = fgqoVar.c;
        if (!eygiVar.c()) {
            fgqoVar.c = eyfy.mutableCopy(eygiVar);
        }
        fgqoVar.c.h(i);
    }

    public final void b(int i) {
        copyOnWrite();
        fgqo fgqoVar = (fgqo) this.instance;
        fgqo fgqoVar2 = fgqo.a;
        eygi eygiVar = fgqoVar.b;
        if (!eygiVar.c()) {
            fgqoVar.b = eyfy.mutableCopy(eygiVar);
        }
        fgqoVar.b.h(i);
    }
}
