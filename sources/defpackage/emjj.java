package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjj extends eyfq implements eyht {
    public emjj() {
        super(emjk.a);
    }

    public final void a(emjn emjnVar) {
        copyOnWrite();
        emjk emjkVar = (emjk) this.instance;
        emjo emjoVar = (emjo) emjnVar.build();
        emjk emjkVar2 = emjk.a;
        emjoVar.getClass();
        eygr eygrVar = emjkVar.b;
        if (!eygrVar.c()) {
            emjkVar.b = eyfy.mutableCopy(eygrVar);
        }
        emjkVar.b.add(emjoVar);
    }
}
