package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fegj implements fevq {
    private InputStream a;
    protected final fefu b;
    protected final fdxd c;
    final int d;
    protected fegx e;
    protected fevo f;
    protected fevr g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private fegh n = fegh.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public fegj(fefu fefuVar, fdxd fdxdVar, int i) {
        this.b = fefuVar;
        this.c = fdxdVar;
        this.d = i;
    }

    private final void f(Status status, Status status2, boolean z) {
        if (p()) {
            return;
        }
        boolean z2 = this.n != fegh.UNINITIALIZED;
        m(fegh.CLOSED);
        if (z2) {
            this.f.m();
        }
        if (!z) {
            fefu fefuVar = this.b;
            int i = this.d;
            try {
                fegy c = fegy.c();
                try {
                    c.a().writeInt(0);
                    feho.c(c.a(), feho.a(c.a(), status) | 8);
                    fefuVar.s(i, c);
                    c.close();
                } finally {
                }
            } catch (StatusException e) {
                fefu.e.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            a(status2);
        }
        o();
    }

    private final void q() {
        fegi fegiVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (fegiVar = (fegi) this.j.get(i)) != null) {
                i++;
                if (fegiVar.d) {
                    this.i = i;
                    t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        return this.a != null || this.i > 0;
    }

    private final boolean s() {
        return this.k && this.h >= this.l;
    }

    private final void t() {
        fevo fevoVar = this.f;
        fevoVar.getClass();
        fevoVar.f();
        this.f.g();
        this.o++;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public abstract void d(int i, Parcel parcel);

    public boolean e() {
        return false;
    }

    @Override // defpackage.fevq
    public final synchronized InputStream g() {
        fegb fegbVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p <= 0 || !r()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                fegi fegiVar = (fegi) this.j.remove(0);
                int i2 = fegiVar.c;
                InputStream inputStream2 = fegiVar.a;
                fegbVar = new fegb(fegiVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((fegi) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                fegbVar = new fegb(bArr, i3);
            }
            this.h += i;
            q();
            inputStream = fegbVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (s() && !p()) {
                m(fegh.ALL_MESSAGES_DELIVERED);
                j();
                return null;
            }
        }
        return inputStream;
    }

    final void h(Status status) {
        f(status, status, false);
    }

    final void i(Status status) {
        f(Status.c, status, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            fegh r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            fevr r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            fevr r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.r()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.s()
            if (r1 == 0) goto L70
        L37:
            fegh r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.r()
            if (r1 == 0) goto L5a
            r4.r = r0
            fevr r1 = r4.g
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            fegh r1 = defpackage.fegh.ALL_MESSAGES_DELIVERED
            r4.m(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            fegh r1 = defpackage.fegh.SUFFIX_DELIVERED
            r4.m(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fegj.j():void");
    }

    final synchronized void k(Parcel parcel) {
        if (p()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (feho.d(readInt, 8)) {
                Status b = feho.b(readInt, parcel);
                f(b, b, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean d = feho.d(readInt, 1);
            boolean d2 = feho.d(readInt, 2);
            boolean d3 = feho.d(readInt, 4);
            if (d) {
                c(readInt, parcel);
                m(fegh.PREFIX_DELIVERED);
            }
            if (d2) {
                if ((readInt & 64) != 0) {
                    throw Status.i.withDescription("Parcelable messages not allowed").asException();
                }
                int readInt3 = parcel.readInt();
                byte[] c = fegc.c(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(c);
                }
                int i = readInt & 128;
                boolean z = i == 0;
                if (this.j == null) {
                    if (this.o == 0 && i == 0 && readInt2 == this.h) {
                        emxf.l(this.a == null);
                        this.a = new fegb(c);
                        t();
                    } else {
                        this.j = new ArrayList(16);
                    }
                }
                fegi fegiVar = new fegi(c, readInt3, z);
                int i2 = readInt2 - this.h;
                if (i2 < this.j.size()) {
                    this.j.set(i2, fegiVar);
                    q();
                } else if (i2 > this.j.size()) {
                    do {
                        this.j.add(null);
                    } while (i2 > this.j.size());
                    this.j.add(fegiVar);
                } else {
                    this.j.add(fegiVar);
                    q();
                }
            }
            if (d3) {
                d(readInt, parcel);
                this.l = readInt2;
                this.k = true;
            }
            int i3 = this.h;
            if (readInt2 == i3) {
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    this.h = i3 + 1;
                } else if (!d2 && !d3) {
                    arrayList.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            fevo fevoVar = this.f;
            if (fevoVar != null && dataSize != 0) {
                fevoVar.b(dataSize);
                this.f.h();
                this.m = 0;
            }
            j();
        } catch (StatusException e) {
            h(e.a);
        }
    }

    final void l(fegx fegxVar, fevr fevrVar) {
        this.e = fegxVar;
        this.f = fegxVar.f;
        this.g = fevrVar;
        if (p()) {
            return;
        }
        m(fegh.INITIALIZED);
    }

    protected final void m(fegh feghVar) {
        fegh feghVar2 = this.n;
        int ordinal = feghVar.ordinal();
        if (ordinal == 1) {
            emxf.r(feghVar2 == fegh.UNINITIALIZED, "%s -> %s", feghVar2, feghVar);
        } else if (ordinal == 2) {
            emxf.r(feghVar2 == fegh.INITIALIZED || feghVar2 == fegh.UNINITIALIZED, "%s -> %s", feghVar2, feghVar);
        } else if (ordinal == 3) {
            emxf.r(feghVar2 == fegh.PREFIX_DELIVERED, "%s -> %s", feghVar2, feghVar);
        } else if (ordinal == 4) {
            emxf.r(feghVar2 == fegh.ALL_MESSAGES_DELIVERED, "%s -> %s", feghVar2, feghVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.n = feghVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    final void o() {
        this.b.p(this);
    }

    protected final boolean p() {
        return this.n == fegh.CLOSED;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String valueOf = String.valueOf(this.n);
        boolean r = r();
        fevr fevrVar = this.g;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(r);
        sb.append("/Lis=");
        sb.append(fevrVar != null);
        sb.append("]");
        return sb.toString();
    }
}
