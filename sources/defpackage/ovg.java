package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovg extends ovi {
    public int[] a;
    public long[] b;
    public double[] c;
    public String[] d;
    public byte[][] e;
    private Cursor i;

    public ovg(oxi oxiVar, String str) {
        super(oxiVar, str);
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new String[0];
        this.e = new byte[0][];
    }

    private final Cursor n() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        oxe.b(21, "no row");
        throw new ffbx();
    }

    private final void o(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] copyOf = Arrays.copyOf(iArr, i3);
            copyOf.getClass();
            this.a = copyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] copyOf2 = Arrays.copyOf(jArr, i3);
                copyOf2.getClass();
                this.b = copyOf2;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] copyOf3 = Arrays.copyOf(dArr, i3);
                copyOf3.getClass();
                this.c = copyOf3;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.d;
            if (strArr.length < i3) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i3);
                copyOf4.getClass();
                this.d = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.e;
        if (bArr.length < i3) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i3);
            copyOf5.getClass();
            this.e = (byte[][]) copyOf5;
        }
    }

    private final void p() {
        if (this.i == null) {
            this.i = this.f.a(new ovf(this));
        }
    }

    private static final void q(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            oxe.b(25, "column index out of range");
            throw new ffbx();
        }
    }

    @Override // defpackage.oxf
    public final int a() {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.oxf
    public final long b(int i) {
        k();
        Cursor n = n();
        q(n, i);
        return n.getLong(i);
    }

    @Override // defpackage.oxf
    public final String c(int i) {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        q(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.oxf, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            k();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new String[0];
            this.e = new byte[0][];
            h();
        }
        m();
    }

    @Override // defpackage.oxf
    public final String d(int i) {
        k();
        Cursor n = n();
        q(n, i);
        String string = n.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.oxf
    public final void e(int i, long j) {
        k();
        o(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.oxf
    public final void f(int i) {
        k();
        o(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.oxf
    public final void g(int i, String str) {
        str.getClass();
        k();
        o(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.oxf
    public final void h() {
        k();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.oxf
    public final boolean i(int i) {
        k();
        Cursor n = n();
        q(n, i);
        return n.isNull(i);
    }

    @Override // defpackage.oxf
    public final boolean j() {
        k();
        p();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
