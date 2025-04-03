package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exgb extends eyfq implements eyht {
    public exgb() {
        super(exgc.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        exgc exgcVar = (exgc) this.instance;
        exgc exgcVar2 = exgc.a;
        exgcVar.a();
        eydl.addAll(iterable, exgcVar.c);
    }

    public final void b(exfv exfvVar) {
        copyOnWrite();
        exgc exgcVar = (exgc) this.instance;
        exfw exfwVar = (exfw) exfvVar.build();
        exgc exgcVar2 = exgc.a;
        exfwVar.getClass();
        exgcVar.a();
        exgcVar.c.add(exfwVar);
    }

    public final void c(exfw exfwVar) {
        copyOnWrite();
        exgc exgcVar = (exgc) this.instance;
        exgc exgcVar2 = exgc.a;
        exfwVar.getClass();
        exgcVar.a();
        exgcVar.c.add(exfwVar);
    }
}
