package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Objects;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedy implements dedv {
    public static final entd a = entd.c("BugleVideoTrimmer");
    public final cbar b;
    public final csuo c;
    private final ejtr d;
    private final errl e;

    public dedy(ejtr ejtrVar, errl errlVar, cbar cbarVar, csuo csuoVar) {
        this.d = ejtrVar;
        this.e = errlVar;
        this.b = cbarVar;
        this.c = csuoVar;
    }

    @Override // defpackage.dedv
    public final elfl a(final Context context, final Uri uri) {
        if (this.b.l(uri)) {
            emxf.a(this.b.l(uri));
            return elfo.g(new Callable() { // from class: dedw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dedy dedyVar = dedy.this;
                    cbar cbarVar = dedyVar.b;
                    Uri uri2 = uri;
                    File g = cbarVar.g(uri2);
                    if (g == null || !g.exists()) {
                        ((ensz) ((ensz) dedy.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getInternalFileInfo", 182, "VideoTrimmerStorageImpl.java")).t("getInternalFileInfo - Could not retrieve file size. InputUri=%s", uri2);
                        return null;
                    }
                    Context context2 = context;
                    long length = g.length();
                    Uri b = cbgl.b(context2, uri2, dedyVar.c.b("video/*"), "video/*", length);
                    if (((Boolean) dedt.f.e()).booleanValue()) {
                        ((ensz) ((ensz) dedy.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getInternalFileInfo", BasePaymentResult.ERROR_REQUEST_FAILED, "VideoTrimmerStorageImpl.java")).A("getInternalFileInfo - FileSize=%d, ProxyProviderUri=%s", length, b);
                    }
                    return new FileInfoResult(b.toString(), length);
                }
            }, this.e);
        }
        dedj dedjVar = new dedj(uri, null, null);
        if (Objects.equals(uri.getAuthority(), "com.android.providers.media.documents")) {
            List i = emye.b(':').i(DocumentsContract.getDocumentId(uri));
            String str = (String) i.get(0);
            dedjVar = new dedj(Objects.equals(str, "image") ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : Objects.equals(str, "video") ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : Objects.equals(str, "audio") ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : uri, "_id=?", new String[]{(String) i.get(1)});
        }
        return new elfj(this.d.b(dedjVar.a, new String[]{"_size", "_data"}, dedjVar.b, dedjVar.c, null)).f(new erow() { // from class: dedx
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                Cursor cursor = (Cursor) obj;
                entd entdVar = dedy.a;
                cursor.getClass();
                Uri uri2 = uri;
                try {
                    int columnIndex = cursor.getColumnIndex("_size");
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                    cursor.moveToFirst();
                    if (((Boolean) dedt.f.e()).booleanValue()) {
                        ((ensz) ((ensz) dedy.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 110, "VideoTrimmerStorageImpl.java")).L("getFileInfo - (DATA: column_name=%s, index=%d), (SIZE: column_name=%s, index=%d), InputUri=%s", "_data", Integer.valueOf(columnIndexOrThrow), "_size", Integer.valueOf(columnIndex), uri2);
                    }
                    String string = cursor.getString(columnIndexOrThrow);
                    if (string == null) {
                        ((ensz) ((ensz) dedy.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 127, "VideoTrimmerStorageImpl.java")).L("getFileInfo - Could not get the file path. (DATA: column_name=%s, index=%d), (SIZE: column_name=%s, index=%d), InputUri=%s", "_data", Integer.valueOf(columnIndexOrThrow), "_size", Integer.valueOf(columnIndex), uri2);
                        return null;
                    }
                    long j = cursor.getLong(columnIndex);
                    if (j <= 0) {
                        ((ensz) ((ensz) dedy.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 139, "VideoTrimmerStorageImpl.java")).J("getFileInfo - Could not get file size. InputUri=%s, FileSize=%d, FilePath=%s", uri2, Long.valueOf(j), string);
                        return null;
                    }
                    Context context2 = context;
                    File file = new File(string);
                    String concat = String.valueOf(context2.getPackageName()).concat(".fileprovider");
                    try {
                        Uri a2 = FileProvider.a(context2, concat, file);
                        if (((Boolean) dedt.f.e()).booleanValue()) {
                            ((ensz) ((ensz) dedy.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 159, "VideoTrimmerStorageImpl.java")).A("getFileInfo - FileSize=%d, FileProviderUri=%s", j, a2);
                        }
                        if (a2 != null) {
                            return new FileInfoResult(a2.toString(), j);
                        }
                        ((ensz) ((ensz) dedy.a.j()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 163, "VideoTrimmerStorageImpl.java")).J("getFileInfo - Could not get file provider uri. InputUri=%s, FileSize=%d, FilePath=%s", uri2, Long.valueOf(j), string);
                        return null;
                    } catch (IllegalArgumentException e) {
                        ((ensz) ((ensz) ((ensz) dedy.a.j()).g(e)).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 152, "VideoTrimmerStorageImpl.java")).K("getFileInfo - Could not get file provider uri. InputUri=%s, FileSize=%d, FilePath=%s, Authority=%s", uri2, Long.valueOf(j), string, concat);
                        return null;
                    }
                } catch (RuntimeException e2) {
                    ((ensz) ((ensz) dedy.a.h()).h("com/google/android/apps/messaging/videotrimmer/VideoTrimmerStorageImpl", "getFileInfo", 121, "VideoTrimmerStorageImpl.java")).D("getFileInfo - Failed for InputUri=%s with exception: %s", uri2, e2.getMessage());
                }
            }
        }, this.e).h();
    }
}
