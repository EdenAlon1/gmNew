package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryl extends eyfq implements eyht {
    public eryl() {
        super(erym.a);
    }

    public final void a(erur erurVar) {
        copyOnWrite();
        erym erymVar = (erym) this.instance;
        erym erymVar2 = erym.a;
        erurVar.getClass();
        eygr eygrVar = erymVar.c;
        if (!eygrVar.c()) {
            erymVar.c = eyfy.mutableCopy(eygrVar);
        }
        erymVar.c.add(erurVar);
    }
}
