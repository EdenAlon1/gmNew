package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgra extends eyfq implements eyht {
    public cgra() {
        super(cgrb.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cgrb cgrbVar = (cgrb) this.instance;
        cgrb cgrbVar2 = cgrb.a;
        cgrbVar.a();
        eydl.addAll(iterable, cgrbVar.c);
    }

    public final void b(String str) {
        copyOnWrite();
        cgrb cgrbVar = (cgrb) this.instance;
        cgrb cgrbVar2 = cgrb.a;
        str.getClass();
        cgrbVar.a();
        cgrbVar.c.add(str);
    }
}
