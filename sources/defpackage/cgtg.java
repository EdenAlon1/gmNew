package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgtg {
    final /* synthetic */ cgtj b;
    private cgth c = null;
    private cgth d = null;
    int a = 0;

    public cgtg(cgtj cgtjVar) {
        this.b = cgtjVar;
    }

    final cgti a() {
        cgtj cgtjVar = this.b;
        cgti cgtiVar = new cgti(cgtjVar);
        cgtiVar.a = cgtjVar.b;
        cgtiVar.b = this.a;
        return cgtiVar;
    }

    final void b() {
        cgth cgthVar = this.d;
        cgthVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = cgthVar.a;
        int i = cgthVar.b;
        byteArrayOutputStream.getClass();
        this.b.c(byteArrayOutputStream.toByteArray(), i);
        this.d = null;
    }

    final void c() {
        if (this.d != null) {
            throw new RuntimeException("BUG: Invalid copy() before newbuf()");
        }
        cgth cgthVar = new cgth();
        cgtj cgtjVar = this.b;
        cgthVar.a = cgtjVar.a;
        cgthVar.b = cgtjVar.b;
        cgthVar.c = this.c;
        this.c = cgthVar;
        this.a++;
        cgtjVar.a = new ByteArrayOutputStream();
        this.b.b = 0;
    }

    final void d() {
        cgtj cgtjVar = this.b;
        ByteArrayOutputStream byteArrayOutputStream = cgtjVar.a;
        int i = cgtjVar.b;
        cgth cgthVar = this.c;
        cgthVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream2 = cgthVar.a;
        byteArrayOutputStream2.getClass();
        cgtjVar.a = byteArrayOutputStream2;
        cgtjVar.b = cgthVar.b;
        this.d = cgthVar;
        this.c = cgthVar.c;
        this.a--;
        cgth cgthVar2 = this.d;
        cgthVar2.a = byteArrayOutputStream;
        cgthVar2.b = i;
    }
}
