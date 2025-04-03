package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgti {
    public int a;
    public int b;
    final /* synthetic */ cgtj c;

    public cgti(cgtj cgtjVar) {
        this.c = cgtjVar;
    }

    final int a() {
        int i = this.b;
        cgtj cgtjVar = this.c;
        if (i == cgtjVar.c.a) {
            return cgtjVar.b - this.a;
        }
        throw new RuntimeException("BUG: Invalid call to getLength()");
    }
}
