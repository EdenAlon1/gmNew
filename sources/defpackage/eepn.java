package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepn {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor a(Context context, Uri uri, String str, eepm eepmVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = g(uri);
        String scheme = g.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(g, str);
        }
        if ("content".equals(scheme)) {
            if (!m(context, g, f(str), eepmVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(g, str);
            o(openAssetFileDescriptor);
            return openAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(g, str);
        o(openAssetFileDescriptor2);
        try {
            l(context, openAssetFileDescriptor2.getParcelFileDescriptor(), g, eepmVar);
            return openAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            j(openAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            j(openAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static InputStream b(Context context, Uri uri, eepm eepmVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = g(uri);
        String scheme = g.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(g);
        }
        if ("content".equals(scheme)) {
            if (!m(context, g, 1, eepmVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            InputStream openInputStream = contentResolver.openInputStream(g);
            o(openInputStream);
            return openInputStream;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(g.getPath()).getCanonicalFile()), "r");
            try {
                l(context, openFileDescriptor, g, eepmVar);
                return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
            } catch (FileNotFoundException e) {
                k(openFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                k(openFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    public static OutputStream c(Context context, Uri uri, eepm eepmVar) {
        AssetFileDescriptor a2 = a(context, uri, "w", eepmVar);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.createOutputStream();
        } catch (IOException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Unable to create stream");
            fileNotFoundException.initCause(e);
            j(a2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static AssetFileDescriptor d(Context context, Uri uri) {
        return a(context, uri, "r", eepm.a);
    }

    public static AssetFileDescriptor e(Context context, Uri uri, CancellationSignal cancellationSignal, eepm eepmVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = g(uri);
        String scheme = g.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(g, "r", cancellationSignal);
        }
        if ("content".equals(scheme)) {
            if (!m(context, g, f("r"), eepmVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(g, "r", cancellationSignal);
            o(openAssetFileDescriptor);
            return openAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(g, "r", cancellationSignal);
        try {
            l(context, openAssetFileDescriptor2.getParcelFileDescriptor(), g, eepmVar);
            return openAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            j(openAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            j(openAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    private static int f(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == 114) {
            if (str.equals("r")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 119) {
            if (str.equals("w")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3653) {
            if (str.equals("rw")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode == 3786) {
            if (str.equals("wa")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode != 3805) {
            if (hashCode == 113359 && str.equals("rwt")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (str.equals("wt")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return 1;
        }
        if (c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4 || c2 == 5) {
            return 2;
        }
        throw new IllegalArgumentException();
    }

    private static Uri g(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static String h(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void i(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(lstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (fstat.st_dev != lstat.st_dev || fstat.st_ino != lstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void j(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void k(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(final android.content.Context r6, android.os.ParcelFileDescriptor r7, android.net.Uri r8, defpackage.eepm r9) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r8 = r8.getPath()
            r0.<init>(r8)
            java.lang.String r8 = r0.getCanonicalPath()
            i(r7, r8)
            java.lang.String r7 = "/proc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            java.lang.String r7 = "/data/misc/"
            boolean r7 = r8.startsWith(r7)
            if (r7 != 0) goto Ld1
            eepm r7 = defpackage.eepm.a
            boolean r7 = r9.e
            if (r7 != 0) goto Ld1
            engw r7 = r9.g
            r0 = r7
            enou r0 = (defpackage.enou) r0
            int r0 = r0.c
            r1 = 0
            r2 = r1
        L2f:
            r3 = 1
            if (r2 >= r0) goto L4f
            java.lang.Object r4 = r7.get(r2)
            eepg r4 = (defpackage.eepg) r4
            boolean r5 = r9.d
            int r4 = r4.a()
            int r5 = r4 + (-1)
            if (r4 == 0) goto L4d
            int r2 = r2 + 1
            if (r5 == 0) goto L4b
            if (r5 == r3) goto L49
            goto L2f
        L49:
            r7 = 2
            goto L50
        L4b:
            r7 = r3
            goto L50
        L4d:
            r6 = 0
            throw r6
        L4f:
            r7 = 3
        L50:
            int r7 = r7 + (-1)
            if (r7 == 0) goto Ld0
            if (r7 == r3) goto Ld1
            java.io.File r7 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m98m(r6)
            if (r7 == 0) goto L67
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L77
            goto L75
        L67:
            java.io.File r7 = android.os.Environment.getDataDirectory()
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L77
        L75:
            r1 = r3
            goto Lcc
        L77:
            android.content.Context r7 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r6)
            if (r7 == 0) goto L8e
            java.io.File r7 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m98m(r7)
            if (r7 == 0) goto L8e
            java.lang.String r7 = h(r7)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L8e
            goto L75
        L8e:
            eeph r7 = new eeph
            r7.<init>()
            java.io.File[] r7 = n(r7)
            int r0 = r7.length
            r2 = r1
        L99:
            if (r2 >= r0) goto Lad
            r4 = r7[r2]
            if (r4 == 0) goto Laa
            java.lang.String r4 = h(r4)
            boolean r4 = r8.startsWith(r4)
            if (r4 == 0) goto Laa
            goto L75
        Laa:
            int r2 = r2 + 1
            goto L99
        Lad:
            eepi r7 = new eepi
            r7.<init>()
            java.io.File[] r6 = n(r7)
            int r7 = r6.length
            r0 = r1
        Lb8:
            if (r0 >= r7) goto Lcc
            r2 = r6[r0]
            if (r2 == 0) goto Lc9
            java.lang.String r2 = h(r2)
            boolean r2 = r8.startsWith(r2)
            if (r2 == 0) goto Lc9
            goto L75
        Lc9:
            int r0 = r0 + 1
            goto Lb8
        Lcc:
            boolean r6 = r9.d
            if (r1 != r6) goto Ld1
        Ld0:
            return
        Ld1:
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Can't open file: "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eepn.l(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, eepm):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m(Context context, Uri uri, int i, eepm eepmVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                eepm eepmVar2 = eepm.a;
                return !eepmVar.d;
            }
        }
        eepq eepqVar = new eepq(uri, resolveContentProvider, authority);
        eepm eepmVar3 = eepm.a;
        engw engwVar = eepmVar.f;
        int i3 = ((enou) engwVar).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            int a2 = ((eepr) engwVar.get(i4)).a(context, eepqVar, eepmVar.d) - 1;
            i4++;
            if (a2 == 0) {
                i2 = 1;
                break;
            }
            if (a2 == 1) {
                i2 = 2;
                break;
            }
        }
        int i5 = i2 - 1;
        if (i5 == 0) {
            return true;
        }
        if (i5 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return eepmVar.d;
        }
        if (eepmVar.d) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && resolveContentProvider.exported) {
            String[] strArr = c;
            int length = strArr.length;
            for (int i6 = 0; i6 < 2; i6++) {
                if (strArr[i6].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = d;
            int length2 = strArr2.length;
            for (int i7 = 0; i7 < 3; i7++) {
                if (strArr2[i7].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = b;
            for (int i8 = 0; i8 < 7; i8++) {
                String str = strArr3[i8];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] n(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void o(Object obj) {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
