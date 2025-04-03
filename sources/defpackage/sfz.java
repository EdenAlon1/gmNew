package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfz {
    public static final enru a = enru.c("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver");
    public final Context b;
    public final csuo c;
    private final cbar d;

    public sfz(Context context, csuo csuoVar, cbar cbarVar) {
        this.b = context;
        this.c = csuoVar;
        this.d = cbarVar;
    }

    public static Uri a(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean n = le.n(str);
        String str2 = i >= 29 ? "external_primary" : "external";
        return n ? MediaStore.Images.Media.getContentUri(str2) : le.A(str) ? MediaStore.Video.Media.getContentUri(str2) : le.f(str) ? MediaStore.Audio.Media.getContentUri(str2) : MediaStore.Files.getContentUri(str2);
    }

    private static boolean d(String str) {
        return str != null && str.endsWith("/*");
    }

    public final String b(String str) {
        if (le.n(str)) {
            return new File(Environment.DIRECTORY_PICTURES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (le.A(str)) {
            return new File(Environment.DIRECTORY_MOVIES, this.b.getResources().getString(R.string.app_name)).getPath();
        }
        if (!le.f(str)) {
            return Environment.DIRECTORY_DOWNLOADS;
        }
        return new File(Environment.DIRECTORY_MUSIC, this.b.getResources().getString(R.string.app_name)).getPath();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String, java.lang.String[]] */
    public final void c(List list) {
        String i;
        ContentResolver contentResolver;
        ContentValues contentValues;
        String str;
        ?? r6;
        Uri uri;
        Uri uri2;
        ContentResolver contentResolver2 = this.b.getContentResolver();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sfw sfwVar = (sfw) it.next();
            String str2 = sfwVar.b;
            if (TextUtils.isEmpty(le.d(str2)) || d(str2)) {
                String type = contentResolver2.getType(sfwVar.a);
                if (TextUtils.isEmpty(type) || d(type)) {
                    Uri uri3 = sfwVar.a;
                    if (this.d.l(uri3) && (i = this.d.i(uri3)) != null) {
                        if (d(str2)) {
                            str2 = str2.substring(0, str2.length() - 1);
                        }
                        if (str2.endsWith("/")) {
                            String concat = String.valueOf(str2).concat(i);
                            if (!TextUtils.isEmpty(le.d(concat))) {
                                str2 = concat;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(type) && !d(type)) {
                    str2 = type;
                }
            }
            Uri a2 = a(str2);
            ContentValues contentValues2 = new ContentValues();
            String str3 = sfwVar.e;
            if (str3 == null && (str3 = csum.c(sfwVar.d)) == null) {
                str3 = this.c.b(str2);
            }
            contentValues2.put("_display_name", str3);
            contentValues2.put("mime_type", str2);
            Iterator it2 = it;
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues2.put("relative_path", b(str2));
                contentValues2.put("is_pending", (Integer) 1);
            }
            try {
                uri2 = contentResolver2.insert(a2, contentValues2);
                contentResolver = contentResolver2;
                uri = a2;
                contentValues = contentValues2;
                str = "is_pending";
                r6 = 0;
            } catch (Exception e) {
                ensk i2 = a.i();
                i2.Y(ente.a, "BugleStorage");
                contentResolver = contentResolver2;
                contentValues = contentValues2;
                str = "is_pending";
                r6 = 0;
                ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 76, "ScopedStorageAttachmentSaver.java")).L("Error when inserting display name: %s of type: %s with relative path: %s into: %s Exception: %s", contentValues2.get("_display_name"), contentValues2.get("mime_type"), Build.VERSION.SDK_INT >= 29 ? contentValues2.get("relative_path") : "Pre Q, no relative path", a2, e.getMessage());
                uri = a2;
                uri2 = null;
            }
            if (uri2 != null) {
                sfwVar.c = uri2;
                csuu.r(this.b, sfwVar.a, uri2);
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.clear();
                    contentValues.put(str, (Integer) 0);
                    try {
                        this.b.getContentResolver().update(uri2, contentValues, r6, r6);
                    } catch (SQLiteConstraintException | IllegalStateException e2) {
                        ensk i3 = a.i();
                        i3.Y(ente.a, "BugleStorage");
                        ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/attachment/ScopedStorageAttachmentSaver", "saveMediaAttachments", 98, "ScopedStorageAttachmentSaver.java")).D("Error when trying to set pending state of: %s Exception: %s", uri, e2.getMessage());
                    }
                }
            }
            it = it2;
            contentResolver2 = contentResolver;
        }
    }
}
