package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbgg extends ContentProvider {

    /* compiled from: PG */
    public interface a {
        cbar bH();
    }

    public static cbar c(Context context) {
        return ((a) ekhw.a(context, a.class)).bH();
    }

    protected abstract File a(String str, String str2);

    protected final cbar b() {
        return c(getContext());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        return (csum.g(path) && a(path, b().i(uri)).delete()) ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        if (csum.g(path)) {
            return ParcelFileDescriptor.open(a(path, b().i(uri)), csum.a(str));
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
