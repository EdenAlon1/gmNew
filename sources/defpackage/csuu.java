package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.provider.Telephony;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Predicate$CC;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuu {
    private final Context g;
    private final csun h;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/file/UriUtil");
    public static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("sms", "mms", "smsto", "mmsto")));
    private static final Set d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("android.resource", "content", "file", "bugle")));
    private static final Set e = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private static final enip f = enip.r("com.google.android.apps.messaging", "com.google.android.libraries.compose");
    public static final Uri c = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "directory_file_enterprise");

    public csuu(Context context, csun csunVar) {
        this.g = context;
        this.h = csunVar;
    }

    public static boolean A(Uri uri) {
        return uri.toString().startsWith(Telephony.Sms.CONTENT_URI.toString());
    }

    public static boolean B(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.toLowerCase(Locale.US).startsWith("http");
    }

    public static boolean C(Uri uri) {
        if (uri == null) {
            return false;
        }
        return e.contains(emxe.b(uri.getScheme()).toLowerCase(Locale.US)) && !TextUtils.isEmpty(uri.getHost());
    }

    public static boolean D(String str) {
        return !TextUtils.isEmpty(str) && C(Uri.parse(str));
    }

    private static Object E(Context context, Uri uri, String str, csut csutVar, String str2, String[] strArr) {
        int columnIndex;
        Cursor query = context.getContentResolver().query(uri, new String[]{str}, str2, strArr, null);
        if (query != null) {
            try {
                if (query.moveToFirst() && (columnIndex = query.getColumnIndex(str)) >= 0) {
                    Object a2 = csutVar.a(query, columnIndex);
                    query.close();
                    return a2;
                }
            } finally {
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
    }

    public static long a(Context context, Uri uri) {
        try {
            Long l = (Long) l(context, uri, "_size", new csuq());
            if (l != null) {
                return l.longValue();
            }
            return 0L;
        } catch (SecurityException e2) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileSizeFromUri", 843, "UriUtil.java")).t("Unable to extract file size from uri: %s", cskt.b(uri.toString()));
            return 0L;
        }
    }

    public static long c(Context context, Uri uri) {
        ctee cteeVar = new ctee(context);
        try {
            if (uri == null) {
                ensk h = a.h();
                h.Y(ente.a, "Bugle");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 431, "UriUtil.java")).q("Unable to extract duration from media file. Uri is null");
                return 0L;
            }
            try {
                cteeVar.c(uri);
                return cteeVar.d(0L);
            } catch (IOException | SecurityException e2) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMediaDurationMs", 439, "UriUtil.java")).t("Unable to extract duration from media file: %s", cskt.b(uri.toString()));
                return 0L;
            }
        } finally {
            cteeVar.b();
        }
    }

    public static long d(Context context, String str, String... strArr) {
        Long l = (Long) E(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "date_modified", new csuq(), str, strArr);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri e(android.content.Context r10, java.io.InputStream r11, android.net.Uri r12) {
        /*
            java.lang.String r1 = "Bugle"
            defpackage.csix.h()
            r2 = 0
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.io.OutputStream r10 = r10.openOutputStream(r12)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            if (r10 != 0) goto L11
            return r2
        L11:
            defpackage.eoej.a(r11, r10)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L86
            r10.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1f
            r10.close()     // Catch: java.io.IOException -> L3c
            return r12
        L1b:
            r0 = move-exception
            r11 = r0
            goto Lb2
        L1f:
            r0 = move-exception
            r6 = r0
            enru r11 = defpackage.csuu.a     // Catch: java.lang.Throwable -> L1b
            ensk r0 = r11.i()     // Catch: java.lang.Throwable -> L1b
            ensn r11 = defpackage.ente.a     // Catch: java.lang.Throwable -> L1b
            r0.Y(r11, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r3 = "copyContent"
            java.lang.String r5 = "UriUtil.java"
            java.lang.String r1 = "error trying to flush the outputStream"
            r4 = 603(0x25b, float:8.45E-43)
            defpackage.a.p(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b
            r10.close()     // Catch: java.io.IOException -> L3c
        L3c:
            return r12
        L3d:
            r0 = move-exception
            r11 = r0
            goto L48
        L40:
            r0 = move-exception
            r10 = r0
            r11 = r10
            goto L89
        L44:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = r2
        L48:
            r9 = r11
            enru r11 = defpackage.csuu.a     // Catch: java.lang.Throwable -> L86
            ensk r3 = r11.i()     // Catch: java.lang.Throwable -> L86
            ensn r11 = defpackage.ente.a     // Catch: java.lang.Throwable -> L86
            r3.Y(r11, r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r6 = "copyContent"
            java.lang.String r8 = "UriUtil.java"
            java.lang.String r4 = "Error while copying content "
            r7 = 596(0x254, float:8.35E-43)
            defpackage.a.p(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L85
            r10.flush()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L6a
        L66:
            r10.close()     // Catch: java.io.IOException -> L85
            goto L85
        L6a:
            r0 = move-exception
            r9 = r0
            enru r11 = defpackage.csuu.a     // Catch: java.lang.Throwable -> L1b
            ensk r3 = r11.i()     // Catch: java.lang.Throwable -> L1b
            ensn r11 = defpackage.ente.a     // Catch: java.lang.Throwable -> L1b
            r3.Y(r11, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r6 = "copyContent"
            java.lang.String r8 = "UriUtil.java"
            java.lang.String r4 = "error trying to flush the outputStream"
            r7 = 603(0x25b, float:8.45E-43)
            defpackage.a.p(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1b
            goto L66
        L85:
            return r2
        L86:
            r0 = move-exception
            r11 = r0
            r2 = r10
        L89:
            if (r2 == 0) goto Lb6
            r2.flush()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L96
        L8e:
            r2.close()     // Catch: java.io.IOException -> Lb6
            goto Lb6
        L92:
            r0 = move-exception
            r10 = r0
            r11 = r10
            goto Lb1
        L96:
            r0 = move-exception
            r9 = r0
            enru r10 = defpackage.csuu.a     // Catch: java.lang.Throwable -> L92
            ensk r3 = r10.i()     // Catch: java.lang.Throwable -> L92
            ensn r10 = defpackage.ente.a     // Catch: java.lang.Throwable -> L92
            r3.Y(r10, r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/file/UriUtil"
            java.lang.String r6 = "copyContent"
            java.lang.String r8 = "UriUtil.java"
            java.lang.String r4 = "error trying to flush the outputStream"
            r7 = 603(0x25b, float:8.45E-43)
            defpackage.a.p(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L92
            goto L8e
        Lb1:
            r10 = r2
        Lb2:
            r10.close()     // Catch: java.io.IOException -> Lb5
        Lb5:
            throw r11
        Lb6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csuu.e(android.content.Context, java.io.InputStream, android.net.Uri):android.net.Uri");
    }

    public static Uri f(Context context, String str) {
        return g(context, "drawable", str);
    }

    public static Uri g(Context context, String str, String str2) {
        return new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath(str).appendPath(str2).build();
    }

    public static Uri h(String str) {
        if (str == null) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri i(android.content.Context r18, android.net.Uri r19, java.io.File r20, java.lang.String r21, java.lang.String r22, defpackage.csum r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csuu.i(android.content.Context, android.net.Uri, java.io.File, java.lang.String, java.lang.String, csum):android.net.Uri");
    }

    public static Uri j(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static Object l(Context context, Uri uri, String str, csut csutVar) {
        return E(context, uri, str, csutVar, null, null);
    }

    public static String m(Context context, Uri uri) {
        String n;
        try {
            String str = (String) l(context, uri, "_display_name", new csur());
            if (str == null && (n = n(context, uri)) != null) {
                str = csum.c(Uri.parse(a.t(n, "file://")));
            }
            if (str != null) {
                return new File(str).getName();
            }
            return null;
        } catch (SecurityException e2) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "extractFileNameFromUri", 825, "UriUtil.java")).t("Unable to extract file name from uri: %s", cskt.b(uri.toString()));
            return null;
        }
    }

    public static String n(Context context, Uri uri) {
        return (String) l(context, uri, "_data", new csur());
    }

    public static String o(Uri uri) {
        if (uri != null && v(uri)) {
            return uri.getPath();
        }
        return null;
    }

    @Deprecated
    static String p(Uri uri) {
        return aslv.a() ? uri.toString().contains("content://mms") ? "com.android.providers.telephony" : uri.toString().contains("contacts") ? "com.android.providers.contacts" : uri.toString().contains("content://com.google.android.gms.people.gal.provider/people_photo") ? "com.google.android.gms" : "com.android.providers." : uri.toString().contains("content://mms") ? "telephony" : uri.toString().contains("contacts") ? "contacts" : "";
    }

    public static String q(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && !v(uri)) {
            if (scheme.equals("content")) {
                return context.getContentResolver().getType(uri);
            }
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString()));
        } catch (Exception unused) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getMimeTypeFromUri", 333, "UriUtil.java")).t("getMimeTypeFromUri failed on: %s", cskt.b(uri.toString()));
            return null;
        }
    }

    public static void r(Context context, Uri uri, Uri uri2) {
        InputStream inputStream = null;
        try {
            try {
                if (w(uri)) {
                    inputStream = context.getContentResolver().openInputStream(uri);
                } else if (B(uri)) {
                    inputStream = new BufferedInputStream(new URL(uri.toString()).openConnection().getInputStream());
                }
                if (inputStream != null) {
                    e(context, inputStream, uri2);
                } else {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", 487, "UriUtil.java")).q("Could not open sourceUri.");
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        ensk j2 = a.j();
                        j2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 496, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            } catch (Exception e3) {
                ensk j3 = a.j();
                j3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j3).g(e3)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 490, "UriUtil.java")).q("Error while retrieving media.");
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        ensk j4 = a.j();
                        j4.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) j4).g(e4)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 496, "UriUtil.java")).q("Error trying to close the inputStream.");
                    }
                }
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                inputStream.close();
                throw th;
            } catch (IOException e5) {
                ensk j5 = a.j();
                j5.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j5).g(e5)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "persistContent", (char) 496, "UriUtil.java")).q("Error trying to close the inputStream.");
                throw th;
            }
        }
    }

    public static boolean t(Uri uri) {
        return TextUtils.equals(uri.getScheme(), "android.resource");
    }

    @Deprecated
    public static boolean u(final Uri uri) {
        if (auyn.a()) {
            return csup.a(uri);
        }
        if ("content".equals(uri.getScheme())) {
            return Collection.EL.stream(f).noneMatch(new Predicate() { // from class: csus
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return csuu.y(uri, (String) obj);
                }
            });
        }
        return false;
    }

    public static boolean v(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "file");
    }

    public static boolean w(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.equals(scheme, "android.resource") || TextUtils.equals(scheme, "content") || v(uri);
    }

    public static boolean x(Uri uri) {
        return d.contains(uri.getScheme());
    }

    @Deprecated
    public static boolean y(Uri uri, String str) {
        if (auyn.a()) {
            return csup.c(uri, str);
        }
        String authority = uri.getAuthority();
        return TextUtils.equals("content", uri.getScheme()) && authority != null && authority.startsWith(str);
    }

    public static boolean z(Uri uri) {
        return uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString());
    }

    public final long b(Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                AssetFileDescriptor openAssetFileDescriptor = this.g.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 667, "UriUtil.java")).t("Failed to open asset for length of %s", cskt.b(uri.toString()));
                    return 0L;
                }
                long length = openAssetFileDescriptor.getLength();
                try {
                    openAssetFileDescriptor.close();
                    return length;
                } catch (IOException unused) {
                    ensk j2 = a.j();
                    j2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 681, "UriUtil.java")).t("Failed to close afd for %s", cskt.b(uri.toString()));
                    return length;
                }
            } catch (FileNotFoundException e2) {
                ensk j3 = a.j();
                j3.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j3).g(e2)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 674, "UriUtil.java")).t("Failed to query length of %s", cskt.b(uri.toString()));
                if (0 == 0) {
                    return 0L;
                }
                try {
                    assetFileDescriptor.close();
                    return 0L;
                } catch (IOException unused2) {
                    ensk j4 = a.j();
                    j4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 681, "UriUtil.java")).t("Failed to close afd for %s", cskt.b(uri.toString()));
                    return 0L;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                    ensk j5 = a.j();
                    j5.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getContentLength", 681, "UriUtil.java")).t("Failed to close afd for %s", cskt.b(uri.toString()));
                }
            }
            throw th;
        }
    }

    @Deprecated
    public final InputStream k(Uri uri) {
        InputStream b2;
        boolean I;
        boolean I2;
        boolean I3;
        eepm a2;
        String str = "com.android.providers.";
        if (!auyn.a()) {
            if (u(uri)) {
                b2 = eepn.b(this.g, uri, eepm.a(aslv.a() ? p(uri) : "com.android.providers.".concat(p(uri))));
            } else {
                b2 = eepn.b(this.g, uri, eepm.c);
            }
            if (b2 != null) {
                return b2;
            }
            throw new FileNotFoundException("Could not open uri for upload: ".concat(String.valueOf(String.valueOf(uri))));
        }
        csun csunVar = this.h;
        uri.getClass();
        if (csup.a(uri)) {
            String uri2 = uri.toString();
            uri2.getClass();
            I = ffpc.I(uri2, "content://mms", false);
            if (I) {
                str = "com.android.providers.telephony";
            } else {
                String uri3 = uri.toString();
                uri3.getClass();
                I2 = ffpc.I(uri3, "contacts", false);
                if (I2) {
                    str = "com.android.providers.contacts";
                } else {
                    String uri4 = uri.toString();
                    uri4.getClass();
                    I3 = ffpc.I(uri4, "content://com.google.android.gms.people.gal.provider/people_photo", false);
                    if (I3) {
                        str = "com.google.android.gms";
                    }
                }
            }
            a2 = eepm.a(str);
        } else {
            a2 = eepm.c;
        }
        InputStream b3 = eepn.b(csunVar.a, uri, a2);
        b3.getClass();
        return b3;
    }

    public final boolean s(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Iterator it = emye.b(',').g("video/3gpp,video/3gp,video/3g2,video/3gpp2").iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
