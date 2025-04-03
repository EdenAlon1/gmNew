package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcea extends eyfq implements eyht {
    public fcea() {
        super(fceb.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        fceb fcebVar = (fceb) this.instance;
        fceb fcebVar2 = fceb.a;
        fcebVar.a();
        eydl.addAll(iterable, fcebVar.b);
    }

    public final void b(fcdx fcdxVar) {
        copyOnWrite();
        fceb fcebVar = (fceb) this.instance;
        fceb fcebVar2 = fceb.a;
        fcdxVar.getClass();
        fcebVar.a();
        fcebVar.b.add(fcdxVar);
    }
}
