package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fegx {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final fefu d;
    public final int e;
    public final fevo f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public fegx(fefu fefuVar, int i, fevo fevoVar) {
        this.d = fefuVar;
        this.e = i;
        this.f = fevoVar;
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        if (i3 == 1) {
            emxf.l(i2 == 1);
        } else if (i3 == 2) {
            emxf.l(i2 == 2);
        } else if (i3 == 3) {
            emxf.l(i2 == 3);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel);

    protected abstract int b(Parcel parcel);

    final void d(InputStream inputStream) {
        e();
        Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.b == null) {
                this.b = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void e() {
        this.a = true;
    }

    protected final void f() {
        this.g = true;
    }

    final void g() {
        int a;
        int i;
        while (true) {
            int i2 = this.k;
            int i3 = i2 - 1;
            InputStream inputStream = null;
            if (i2 == 0) {
                throw null;
            }
            boolean z = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2 || !this.g) {
                        return;
                    }
                } else if (!i() && !this.g) {
                    return;
                }
            } else if (!this.a) {
                return;
            }
            if (!h()) {
                return;
            }
            try {
                try {
                    fegy c = fegy.c();
                    try {
                        int i4 = 0;
                        c.a().writeInt(0);
                        Parcel a2 = c.a();
                        int i5 = this.h;
                        this.h = i5 + 1;
                        a2.writeInt(i5);
                        int i6 = this.k;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            a = a(c.a()) | 1;
                            c(2);
                            if (!i() && !this.g) {
                                feho.c(c.a(), a);
                                int dataSize = c.a().dataSize();
                                this.d.s(this.e, c);
                                this.f.c(dataSize);
                                this.f.k();
                                c.close();
                            }
                        } else if (i7 == 1) {
                            a = 0;
                        } else {
                            if (i7 != 2) {
                                throw new AssertionError();
                            }
                            a = i4 | 4 | b(c.a());
                            c(4);
                            feho.c(c.a(), a);
                            int dataSize2 = c.a().dataSize();
                            this.d.s(this.e, c);
                            this.f.c(dataSize2);
                            this.f.k();
                            c.close();
                        }
                        if (this.i == 0) {
                            inputStream = this.b;
                        } else {
                            Queue queue = this.c;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i8 = a | 2;
                            Parcel a3 = c.a();
                            if (inputStream instanceof fegz) {
                                this.j = ((fegz) inputStream).a(a3);
                                i = 64;
                                z = false;
                            } else {
                                byte[] b = fegc.b();
                                try {
                                    int read = inputStream.read(b);
                                    if (read <= 0) {
                                        a3.writeInt(0);
                                    } else {
                                        a3.writeInt(read);
                                        a3.writeByteArray(b, 0, read);
                                        this.j += read;
                                        if (read == b.length) {
                                            i = 128;
                                        }
                                    }
                                    z = false;
                                    i = 0;
                                } finally {
                                    fegc.a(b);
                                }
                            }
                            if (!z) {
                                inputStream.close();
                                int i9 = this.i;
                                this.i = i9 + 1;
                                if (i9 > 0) {
                                    Queue queue2 = this.c;
                                    queue2.getClass();
                                    queue2.poll();
                                }
                                this.f.i();
                                this.f.j();
                                this.j = 0;
                            }
                            i4 = i8 | i;
                        } else {
                            emxf.l(this.g);
                            i4 = a;
                        }
                        if (!this.g || i()) {
                            a = i4;
                            feho.c(c.a(), a);
                            int dataSize22 = c.a().dataSize();
                            this.d.s(this.e, c);
                            this.f.c(dataSize22);
                            this.f.k();
                            c.close();
                        } else {
                            c(3);
                            a = i4 | 4 | b(c.a());
                            c(4);
                            feho.c(c.a(), a);
                            int dataSize222 = c.a().dataSize();
                            this.d.s(this.e, c);
                            this.f.c(dataSize222);
                            this.f.k();
                            c.close();
                        }
                    } catch (Throwable th) {
                        try {
                            c.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw Status.o.d(e).asException();
                }
            } catch (StatusException e2) {
                c(5);
                throw e2;
            }
        }
    }

    final boolean h() {
        return this.d.v();
    }

    protected final boolean i() {
        Queue queue = this.c;
        return queue != null ? !queue.isEmpty() : this.b != null && this.i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.k;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.i + "]";
    }
}
