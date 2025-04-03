package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhl extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        return super.delete(uri, str, strArr);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        return super.getType(uri);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        return super.insert(uri, contentValues);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        return super.openFile(uri, str);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (atxf.a()) {
            throw new UnsupportedOperationException("RCS FileTransferProvider is not implemented.");
        }
        contentValues.getClass();
        return super.update(uri, contentValues, str, strArr);
    }
}
