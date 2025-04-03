package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhj extends eyfq implements eyht {
    public emhj() {
        super(emhk.a);
    }

    public final void a(emhl emhlVar) {
        copyOnWrite();
        emhk emhkVar = (emhk) this.instance;
        emhm emhmVar = (emhm) emhlVar.build();
        emhk emhkVar2 = emhk.a;
        emhmVar.getClass();
        eygr eygrVar = emhkVar.b;
        if (!eygrVar.c()) {
            emhkVar.b = eyfy.mutableCopy(eygrVar);
        }
        emhkVar.b.add(emhmVar);
    }
}
