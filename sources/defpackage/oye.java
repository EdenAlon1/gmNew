package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oye implements oxo {
    private final SQLiteProgram a;

    public oye(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.oxo
    public final void c(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.oxo
    public final void d(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.oxo
    public final void e(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.oxo
    public final void f(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.oxo
    public final void g(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }
}
