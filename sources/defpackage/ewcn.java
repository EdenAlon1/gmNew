package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcn extends eyfq implements eyht {
    public ewcn() {
        super(ewco.a);
    }

    public final void a(eyee eyeeVar) {
        copyOnWrite();
        ewco ewcoVar = (ewco) this.instance;
        ewco ewcoVar2 = ewco.a;
        eyeeVar.getClass();
        eygr eygrVar = ewcoVar.b;
        if (!eygrVar.c()) {
            ewcoVar.b = eyfy.mutableCopy(eygrVar);
        }
        ewcoVar.b.add(eyeeVar);
    }
}
