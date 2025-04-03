package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emhn extends eyfq implements eyht {
    public emhn() {
        super(emho.a);
    }

    public final void a(emhp emhpVar) {
        copyOnWrite();
        emho emhoVar = (emho) this.instance;
        emhr emhrVar = (emhr) emhpVar.build();
        emho emhoVar2 = emho.a;
        emhrVar.getClass();
        eygr eygrVar = emhoVar.b;
        if (!eygrVar.c()) {
            emhoVar.b = eyfy.mutableCopy(eygrVar);
        }
        emhoVar.b.add(emhrVar);
    }
}
