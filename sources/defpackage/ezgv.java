package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezgv extends eyfq implements eyht {
    public ezgv() {
        super(ezgw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ezgw ezgwVar = (ezgw) this.instance;
        ezgw ezgwVar2 = ezgw.a;
        ezgwVar.a();
        eydl.addAll(iterable, ezgwVar.b);
    }

    public final void b(String str) {
        copyOnWrite();
        ezgw ezgwVar = (ezgw) this.instance;
        ezgw ezgwVar2 = ezgw.a;
        ezgwVar.a();
        ezgwVar.b.add(str);
    }
}
