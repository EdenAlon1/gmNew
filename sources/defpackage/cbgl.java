package defpackage;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.provider.ProxyProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbgl extends ContentProvider {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();
    private static final cpn c = new cpn();
    private static final emyl d = cfvl.w("enable_proxy_provider_audio_support");

    /* compiled from: PG */
    public interface a {
        cbar bH();
    }

    public static Uri a(Uri uri) {
        cbgm cbgmVar;
        cpn cpnVar = c;
        synchronized (cpnVar) {
            cbgmVar = (cbgm) cpnVar.get(uri);
        }
        if (cbgmVar == null) {
            return null;
        }
        return cbgmVar.a;
    }

    public static Uri b(Context context, Uri uri, String str, String str2, long j) {
        Uri.Builder scheme = new Uri.Builder().authority(cbgn.a(context)).scheme("content");
        String valueOf = String.valueOf(b.nextLong());
        String d2 = le.d(str2);
        if (!TextUtils.isEmpty(d2)) {
            valueOf = String.format("%s.%s", valueOf, d2);
        }
        scheme.appendPath(valueOf);
        Uri build = scheme.build();
        cpn cpnVar = c;
        synchronized (cpnVar) {
            cpnVar.put(build, new cbgm(uri, str2, str, j));
        }
        return build;
    }

    public static InputStream c(Context context, Uri uri) {
        enru enruVar = csuu.a;
        return "com.google.android.ims.rcsfileprovider".equals(uri.getAuthority()) ? eepn.b(context, uri, eepm.a("com.google.android.ims")) : csuu.z(uri) ? eepn.b(context, uri, eepm.a("com.android.providers.telephony")) : eepn.b(context, uri, eepm.c);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        cbgm cbgmVar;
        cpn cpnVar = c;
        synchronized (cpnVar) {
            cbgmVar = (cbgm) cpnVar.get(uri);
        }
        if (cbgmVar == null) {
            return null;
        }
        return cbgmVar.b;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Uri a2 = a(uri);
        if (a2 == null) {
            throw new FileNotFoundException(String.format("Invalid proxy uri : %s", uri.getPath()));
        }
        int a3 = csum.a(str);
        Context context = getContext();
        if (cbgi.k(a2, context)) {
            return ParcelFileDescriptor.open(cbgi.i(a2, context), a3);
        }
        if (((Boolean) ((cfup) d.get()).e()).booleanValue() && cbfw.a(a2)) {
            if (a3 != 268435456) {
                throw new FileNotFoundException("Read-only mode is required");
            }
            try {
                return ParcelFileDescriptor.fromFd((int) ContentUris.parseId(a2));
            } catch (IOException e) {
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create ParcelFileDescriptor from content URI: ".concat(a2.toString())).initCause(e));
            }
        }
        if (cblq.a(a2, context)) {
            context.getClass();
            String path = cblq.a(a2, context) ? a2.getPath() : null;
            if (path == null) {
                Objects.toString(a2);
                throw new FileNotFoundException("Unable get rich card file path from URI: ".concat(a2.toString()));
            }
            ParcelFileDescriptor open = ParcelFileDescriptor.open(cblq.b(context, path, a2.getQueryParameter("ext")), a3);
            open.getClass();
            return open;
        }
        Context context2 = getContext();
        context2.getClass();
        a aVar = (a) ekhw.a(context2, a.class);
        File file = new File(context2.getCacheDir(), "proxyscratchspace");
        if ((!file.isDirectory() || !file.exists()) && !file.mkdirs() && !file.exists()) {
            throw new FileNotFoundException(String.format("Failed to make directory for temp file for file %s", a2.getPath()));
        }
        String replace = String.format("%3s", emxe.b(uri.getLastPathSegment())).replace(' ', '_');
        try {
            File createTempFile = File.createTempFile(replace, null, file);
            aVar.bH().k(createTempFile);
            try {
                if (getCallingPackage() != null) {
                    getContext().grantUriPermission(getCallingPackage(), a2, 3);
                }
                InputStream c2 = c(getContext(), a2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        eoej.a(c2, fileOutputStream);
                        ParcelFileDescriptor open2 = ParcelFileDescriptor.open(createTempFile, a3);
                        if (!createTempFile.delete()) {
                            ensk i = ProxyProvider.a.i();
                            i.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/datamodel/provider/ProxyProvider$ProxyProviderInternal", "openTelephonyFile", 231, "ProxyProvider.java")).t("Failed to delete temp file for %s while returning file descriptor", a2.getPath());
                        }
                        fileOutputStream.close();
                        if (c2 != null) {
                            c2.close();
                        }
                        return open2;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException(String.format("Failed to copy to temp file for file %s", a2.getPath()));
                fileNotFoundException.initCause(e2);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException(String.format("Failed to create temp file for %s using %s", a2.getPath(), replace));
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        cbgm cbgmVar;
        int length;
        Uri uri2;
        cpn cpnVar = c;
        synchronized (cpnVar) {
            cbgmVar = (cbgm) cpnVar.get(uri);
        }
        if (((Boolean) ((cfup) d.get()).e()).booleanValue() && cbgmVar != null && (uri2 = cbgmVar.a) != null && cbfw.a(uri2)) {
            throw new UnsupportedOperationException("Query operation not supported for audio");
        }
        if (strArr == null || ((length = strArr.length) >= 2 && Arrays.asList(strArr).contains("_display_name") && Arrays.asList(strArr).contains("_size"))) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name", "_size"}, 2);
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            newRow.add(cbgmVar == null ? null : cbgmVar.c);
            newRow.add(cbgmVar != null ? Long.valueOf(cbgmVar.d) : null);
            return matrixCursor;
        }
        if (length > 0 && Arrays.asList(strArr).contains("_display_name")) {
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"_display_name"}, 1);
            matrixCursor2.newRow().add(cbgmVar != null ? cbgmVar.c : null);
            return matrixCursor2;
        }
        if (length <= 0 || !Arrays.asList(strArr).contains("_size")) {
            return null;
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{"_size"}, 1);
        matrixCursor3.newRow().add(cbgmVar != null ? Long.valueOf(cbgmVar.d) : null);
        return matrixCursor3;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
