package defpackage;

import android.net.Uri;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lt {
    public static final byte[] a = "from-data".getBytes();
    public static final byte[] b = "attachment".getBytes();
    public static final byte[] c = "inline".getBytes();
    public Uri e = null;
    public eyee f = null;
    public final SparseArray d = new SparseArray();

    public final int a() {
        Integer num = (Integer) this.d.get(129);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final Uri b() {
        return this.e;
    }

    public final eyee c() {
        return this.f;
    }

    public final void d(int i) {
        this.d.put(129, Integer.valueOf(i));
    }

    public final void e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-disposition");
        }
        this.d.put(197, bArr);
    }

    public final void f(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            throw new IllegalArgumentException("Content-Id may not be null or empty.");
        }
        if (length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[length - 1]) == '>') {
            this.d.put(192, bArr);
            return;
        }
        byte[] bArr2 = new byte[length + 2];
        bArr2[0] = 60;
        bArr2[length + 1] = 62;
        System.arraycopy(bArr, 0, bArr2, 1, length);
        this.d.put(192, bArr2);
    }

    public final void g(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-location");
        }
        this.d.put(142, bArr);
    }

    public final void h(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-type");
        }
        this.d.put(145, bArr);
    }

    public final void i(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.f = eyee.x(bArr);
    }

    public final void j(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.d.put(152, bArr);
    }

    public final void k(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null content-id");
        }
        this.d.put(151, bArr);
    }

    public final byte[] l() {
        return (byte[]) this.d.get(192);
    }

    public final byte[] m() {
        return (byte[]) this.d.get(142);
    }

    public final byte[] n() {
        return (byte[]) this.d.get(145);
    }

    public final byte[] o() {
        return (byte[]) this.d.get(152);
    }

    public final byte[] p() {
        return (byte[]) this.d.get(151);
    }
}
