package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class crjw extends ContentProvider {
    private static final cskc a = cskc.g("BugleDataModel", "ImageContentProvider");

    protected abstract Bitmap a(Uri uri);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete not supported");
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        return new String[]{"image/png"};
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "image/png";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert not supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (getContext() == null) {
            csjb b = a.b();
            b.I(getClass().getSimpleName());
            b.I("Could not create image, context is null.");
            b.l(uri);
            b.r();
            throw new FileNotFoundException();
        }
        Bitmap a2 = a(uri);
        File file = new File(getContext().getCacheDir(), String.valueOf(String.valueOf(UUID.randomUUID())).concat(".png"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (!a2.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
            csjb b2 = a.b();
            b2.I(getClass().getSimpleName());
            b2.I("Failed to generate image.");
            b2.l(uri);
            b2.r();
            throw new FileNotFoundException();
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        if (!file.delete()) {
            csjb b3 = a.b();
            b3.I(getClass().getSimpleName());
            b3.I("Failed to delete temp file.");
            b3.l(uri);
            b3.r();
        }
        return open;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("query not supported");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update not supported");
    }
}
