package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epep extends eyfq implements eyht {
    public epep() {
        super(epeq.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Iterable iterable) {
        copyOnWrite();
        epeq epeqVar = (epeq) this.instance;
        epeq epeqVar2 = epeq.a;
        eygi eygiVar = epeqVar.m;
        if (!eygiVar.c()) {
            epeqVar.m = eyfy.mutableCopy(eygiVar);
        }
        enqv it = ((engw) iterable).iterator();
        while (it.hasNext()) {
            epeqVar.m.h(((epdz) it.next()).e);
        }
    }
}
