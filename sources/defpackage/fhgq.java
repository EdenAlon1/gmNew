package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgq extends fhgz {
    public static final fhgn a;
    public static final fhgn b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private final fhmx f;
    private final fhgn g;
    private final List h;
    private final fhgn i;
    private long j;

    static {
        Pattern pattern = fhgn.a;
        a = fhgm.a("multipart/mixed");
        fhgm.a("multipart/alternative");
        fhgm.a("multipart/digest");
        fhgm.a("multipart/parallel");
        b = fhgm.a("multipart/form-data");
        c = new byte[]{58, 32};
        d = new byte[]{13, 10};
        e = new byte[]{45, 45};
    }

    public fhgq(fhmx fhmxVar, fhgn fhgnVar, List list) {
        fhgnVar.getClass();
        this.f = fhmxVar;
        this.g = fhgnVar;
        this.h = list;
        this.i = fhgm.a(fhgnVar + "; boundary=" + fhmxVar.e());
        this.j = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long e(fhmu fhmuVar, boolean z) {
        fhmt fhmtVar;
        if (z) {
            fhmuVar = new fhmt();
            fhmtVar = fhmuVar;
        } else {
            fhmtVar = 0;
        }
        int size = this.h.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            fhgp fhgpVar = (fhgp) this.h.get(i);
            fhgh fhghVar = fhgpVar.a;
            fhgz fhgzVar = fhgpVar.b;
            fhmuVar.getClass();
            fhmuVar.Y(e);
            fhmuVar.K(this.f);
            fhmuVar.Y(d);
            int a2 = fhghVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                fhmuVar.aa(fhghVar.c(i2));
                fhmuVar.Y(c);
                fhmuVar.aa(fhghVar.d(i2));
                fhmuVar.Y(d);
            }
            fhgn b2 = fhgzVar.b();
            if (b2 != null) {
                fhmuVar.aa("Content-Type: ");
                fhmuVar.aa(b2.c);
                fhmuVar.Y(d);
            }
            long a3 = fhgzVar.a();
            if (a3 != -1) {
                fhmuVar.aa("Content-Length: ");
                fhmuVar.s(a3).Y(d);
            } else if (z) {
                fhmtVar.getClass();
                fhmtVar.A();
                return -1L;
            }
            byte[] bArr = d;
            fhmuVar.Y(bArr);
            if (z) {
                j += a3;
            } else {
                fhgzVar.c(fhmuVar);
            }
            fhmuVar.Y(bArr);
        }
        fhmuVar.getClass();
        byte[] bArr2 = e;
        fhmuVar.Y(bArr2);
        fhmuVar.K(this.f);
        fhmuVar.Y(bArr2);
        fhmuVar.Y(d);
        if (!z) {
            return j;
        }
        fhmtVar.getClass();
        long j2 = j + fhmtVar.b;
        fhmtVar.A();
        return j2;
    }

    @Override // defpackage.fhgz
    public final long a() {
        long j = this.j;
        if (j != -1) {
            return j;
        }
        long e2 = e(null, true);
        this.j = e2;
        return e2;
    }

    @Override // defpackage.fhgz
    public final fhgn b() {
        return this.i;
    }

    @Override // defpackage.fhgz
    public final void c(fhmu fhmuVar) {
        e(fhmuVar, false);
    }
}
