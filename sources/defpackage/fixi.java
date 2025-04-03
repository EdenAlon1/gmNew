package defpackage;

import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.SocketException;
import java.util.EventListener;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fixi implements EventListener {
    final fizj[] a;
    final int[] b;
    final Object[] c;
    final int d;
    int e;
    boolean f;
    final fiyh g;
    fiyh h;
    Throwable i;
    fixi j;

    public fixi(fixj fixjVar, fiyh fiyhVar) {
        List list = fixjVar.a;
        fizj[] fizjVarArr = (fizj[]) list.toArray(new fizj[list.size()]);
        this.a = fizjVarArr;
        int length = fizjVarArr.length;
        this.b = new int[length];
        this.c = new Object[length];
        this.d = fixjVar.b;
        this.g = fiyhVar;
    }

    public final void a(Object obj, Exception exc) {
        int length;
        Throwable th;
        if (fiyy.a("verbose")) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("ExtendedResolver: got ");
            stringBuffer.append(exc);
            printStream.println(stringBuffer.toString());
        }
        synchronized (this) {
            this.e--;
            if (this.f) {
                return;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                Object[] objArr = this.c;
                length = objArr.length;
                if (i >= length || objArr[i] == obj) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == length) {
                return;
            }
            int i2 = this.b[i];
            if (i2 == 1 && i < this.a.length - 1) {
                z = true;
            }
            if (exc instanceof InterruptedIOException) {
                if (i2 < this.d) {
                    b(i);
                }
                if (this.i == null) {
                    this.i = exc;
                }
            } else if (!(exc instanceof SocketException) || (th = this.i) == null || (th instanceof InterruptedIOException)) {
                this.i = exc;
            }
            if (this.f) {
                return;
            }
            if (z) {
                b(i + 1);
            }
            if (this.f) {
                return;
            }
            if (this.e == 0) {
                this.f = true;
                if (this.j == null) {
                    notifyAll();
                    return;
                }
                Throwable th2 = this.i;
                if (!(th2 instanceof Exception)) {
                    this.i = new RuntimeException(th2.getMessage());
                }
                this.j.a(this, (Exception) this.i);
            }
        }
    }

    public final void b(int i) {
        int[] iArr = this.b;
        iArr[i] = iArr[i] + 1;
        this.e++;
        try {
            this.c[i] = this.a[i].c(this.g, this);
        } catch (Throwable th) {
            synchronized (this) {
                this.i = th;
                this.f = true;
                if (this.j == null) {
                    notifyAll();
                }
            }
        }
    }

    public final void c(fiyh fiyhVar) {
        if (fiyy.a("verbose")) {
            System.err.println("ExtendedResolver: received message");
        }
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.h = fiyhVar;
            this.f = true;
            fixi fixiVar = this.j;
            if (fixiVar == null) {
                notifyAll();
            } else {
                fixiVar.c(fiyhVar);
            }
        }
    }
}
