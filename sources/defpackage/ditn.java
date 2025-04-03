package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.UUID;
import java.util.function.Function;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditn {
    public static final diyy a = dizd.a(151923431);

    public static long a(Uri uri, ContentResolver contentResolver) {
        Throwable th;
        InputStream inputStream;
        long j = -1;
        if (((Boolean) a.a()).booleanValue()) {
            Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query == null) {
                return -1L;
            }
            int columnIndex = query.getColumnIndex("_size");
            if (columnIndex >= 0) {
                query.moveToFirst();
                j = query.getLong(columnIndex);
            }
            query.close();
            return j;
        }
        try {
            try {
                inputStream = contentResolver.openInputStream(uri);
                try {
                    if (inputStream == null) {
                        throw new IllegalStateException("Input stream is null");
                    }
                    long available = inputStream.available();
                    l(inputStream);
                    return available;
                } catch (Throwable th2) {
                    th = th2;
                    l(inputStream);
                    throw th;
                }
            } catch (IOException e) {
                dkty.i(e, "Unable to get file size for %s", uri);
                return -1L;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static Uri b(Context context, String str, File file, djqt djqtVar) {
        Optional d = d(djqtVar);
        if (d.isEmpty()) {
            throw new IOException("Unable to create target file for file name: ".concat(String.valueOf(str)));
        }
        File file2 = (File) d.get();
        if (!file.renameTo(file2)) {
            throw new IOException("Unable to rename temp file to final file name");
        }
        dkty.c("Temp file: %s renamed to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        if ("com.google.android.ims".equals(context.getPackageName())) {
            Uri a2 = FileProvider.a(context, "com.google.android.ims.rcsfileprovider", file2);
            context.grantUriPermission("com.google.android.apps.messaging", a2, 67);
            return a2;
        }
        if (!"com.google.android.apps.messaging".equals(context.getPackageName())) {
            dkty.u("CS lib should be either running in bugle or cs.apk!", new Object[0]);
        }
        return FileProvider.a(context, "com.google.android.rcs.service.fileprovider", file2);
    }

    public static Duration c(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Retry-After");
        if (firstHeader == null) {
            return Duration.ZERO;
        }
        String trim = firstHeader.getValue().trim();
        try {
            return Duration.ofSeconds(Integer.parseInt(trim));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid retry after value: ".concat(String.valueOf(trim)), e);
        }
    }

    public static Optional d(djqt djqtVar) {
        String uuid = UUID.randomUUID().toString();
        String d = djqtVar.d();
        int i = 0;
        if (TextUtils.isEmpty(d)) {
            dkty.q("Unable to obtain default target directory for %s", uuid);
            return Optional.empty();
        }
        if (!h(d)) {
            dkty.q("Unable to create default target directory %s", d);
            return Optional.empty();
        }
        File file = new File(d);
        File file2 = new File(file, uuid);
        while (file2.exists()) {
            i++;
            file2 = new File(file, "(" + i + ")" + uuid);
        }
        return Optional.of(file2);
    }

    public static String e(String str) {
        if (!djae.n()) {
            return "";
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static String f(HttpRequestBase httpRequestBase) {
        return !djae.n() ? "" : (String) Optional.ofNullable(httpRequestBase).map(new Function() { // from class: ditl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((HttpRequestBase) obj).getURI();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: ditm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((URI) obj).getHost();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("");
    }

    public static String g(Uri uri, String str) {
        String scheme = uri.getScheme();
        if ("file".equals(scheme)) {
            return uri.getLastPathSegment();
        }
        if (!"content".equals(scheme) && !"android.resource".equals(scheme)) {
            throw new IllegalArgumentException("Illegal URI for RCS file transfer: ".concat(String.valueOf(String.valueOf(uri))));
        }
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("ext");
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(str)) {
            queryParameter = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        return TextUtils.isEmpty(queryParameter) ? lastPathSegment : a.w(queryParameter, lastPathSegment, ".");
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static FileTransferServiceResult[] i(int i, String str) {
        return new FileTransferServiceResult[]{new FileTransferServiceResult(0L, null, i, str)};
    }

    public static LocationSharingResult[] j(int i, String str) {
        return new LocationSharingResult[]{new LocationSharingResult(0L, null, i, str)};
    }

    public static int k(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 70454) {
            if (str.equals("GET")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 79599) {
            if (hashCode == 2461856 && str.equals("POST")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("PUT")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return 2;
        }
        if (c != 1) {
            return c != 2 ? 1 : 4;
        }
        return 3;
    }

    private static void l(Closeable closeable) {
        if (closeable != null) {
            closeable.close();
        }
    }
}
