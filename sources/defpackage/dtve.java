package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dtve {
    @Deprecated
    void A(String str, Runnable runnable);

    @Deprecated
    void D(Uri uri);

    @Deprecated
    void E(Uri uri, String str);

    void F(String str, Runnable runnable);

    void G(boolean z);

    @Deprecated
    boolean I();

    boolean J(dtsr dtsrVar);

    boolean K(dtsr dtsrVar);

    boolean L(dtsr dtsrVar);

    boolean M(dtsr dtsrVar, int i);

    boolean N(dtsr dtsrVar);

    dtzf P();

    dtuj Q(dtui dtuiVar);

    long R(String str, ContentValues contentValues);

    long S(String str, ContentValues contentValues);

    long T(String str, ContentValues contentValues, int i);

    void Y(String str, Runnable runnable, dtuz dtuzVar);

    int a(String str, String str2, String[] strArr, dtvj dtvjVar);

    int b(SQLiteStatement sQLiteStatement);

    int c(SQLiteStatement sQLiteStatement, dtui dtuiVar);

    int d(dtsr dtsrVar);

    int e(String str, ContentValues contentValues, String str2, String[] strArr, duan duanVar);

    long f(String str, String str2, String[] strArr);

    Cursor g(String str, String[] strArr);

    Cursor h(String str, String[] strArr, dtza dtzaVar);

    Cursor i(String str, String[] strArr, dtza dtzaVar, CancellationSignal cancellationSignal);

    SQLiteDatabase j();

    dttz l();

    elfl o();

    Object p(emyl emylVar);

    @Deprecated
    Object q(emyl emylVar);

    @Deprecated
    Object r(String str, emyl emylVar);

    @Deprecated
    Object s(dtui dtuiVar, emyl emylVar, dtvd dtvdVar);

    void w();

    void y(String str);

    void z(String str, Object[] objArr);
}
