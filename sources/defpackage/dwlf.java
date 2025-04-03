package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlf {
    public static final Comparator a = new Comparator() { // from class: dwle
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            bArr.getClass();
            bArr2.getClass();
            int length = bArr.length;
            int length2 = bArr2.length;
            if (length != length2) {
                return length - length2;
            }
            for (int i = 0; i < length; i++) {
                byte b = bArr[i];
                byte b2 = bArr2[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }
    };

    public static final dwlg a(ContentResolver contentResolver, String str, String str2, CancellationSignal cancellationSignal) {
        Cursor cursor;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        build.getClass();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        build2.getClass();
        try {
            cursor = contentResolver.query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{str}, null, cancellationSignal);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                            Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            int i3 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                            if (columnIndex6 != -1) {
                                z = true;
                                if (cursor.getInt(columnIndex6) == 1) {
                                    arrayList2.add(new dwlg(withAppendedId, i2, i3, z, i));
                                }
                            }
                            z = false;
                            arrayList2.add(new dwlg(withAppendedId, i2, i3, z, i));
                        }
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return (dwlg) ffdx.K(arrayList);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
