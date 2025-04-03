package defpackage;

import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csum {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/file/FileUtil");
    public final cqoh a;
    private final ffbr c;
    private final ffbr d;

    public csum(cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = cqohVar;
        this.c = ffbrVar2;
        this.d = ffbrVar;
    }

    public static int a(String str) {
        if (TextUtils.equals(str, "r")) {
            return VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        return 603979776;
    }

    public static String c(Uri uri) {
        String lastPathSegment;
        if (uri != null && csuu.v(uri) && (lastPathSegment = uri.getLastPathSegment()) != null && lastPathSegment.lastIndexOf(46) >= 0) {
            return lastPathSegment;
        }
        return null;
    }

    public static String d(String str, String str2) {
        return str.length() + str2.length() > 127 ? str.substring(0, 127 - str2.length()) : str;
    }

    public static boolean g(String str) {
        for (int i = str.startsWith("/"); i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '-' && !Character.isDigit(charAt) && !Character.isAlphabetic(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean h(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return parentFile.exists() || parentFile.mkdirs();
        }
        return false;
    }

    public static synchronized File i(File file, String str, String str2) {
        String concat;
        synchronized (csum.class) {
            String b2 = emxe.b(str);
            if (str2 != null) {
                int lastIndexOf = str2.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    b2 = str2.substring(lastIndexOf + 1);
                    str2 = str2.substring(0, lastIndexOf);
                }
                String concat2 = b2.length() == 0 ? "" : ".".concat(String.valueOf(b2));
                File file2 = new File(file, String.valueOf(d(str2, concat2)).concat(concat2));
                if (!file2.exists()) {
                    file2.createNewFile();
                    return file2;
                }
            }
            String concat3 = !emxe.c(b2) ? ".".concat(String.valueOf(b2)) : "";
            String uuid = UUID.randomUUID().toString();
            if (emxe.c(str2)) {
                concat = String.valueOf(uuid).concat(concat3);
            } else {
                String str3 = "_" + uuid + concat3;
                concat = String.valueOf(d(str2, str3)).concat(str3);
            }
            File file3 = new File(file, concat);
            if (file3.createNewFile()) {
                return file3;
            }
            ensk i = b.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "createNewFileUsingUuid", 122, "FileUtil.java")).D("Could not create a file for file name = %s because a file already exists with name = %s", str2, concat);
            return null;
        }
    }

    private static boolean k(File file, File file2) {
        try {
            File canonicalFile = file.getCanonicalFile();
            for (File canonicalFile2 = file2.getCanonicalFile(); canonicalFile2 != null; canonicalFile2 = canonicalFile2.getParentFile()) {
                if (canonicalFile.equals(canonicalFile2)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            ensk i = b.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/file/FileUtil", "isSameOrSubDirectory", (char) 328, "FileUtil.java")).q("Error while accessing file");
            return false;
        }
    }

    public final Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!csuu.v(uri)) {
            return uri;
        }
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            return Uri.parse("file://" + new File(path).getCanonicalFile().getCanonicalPath());
        } catch (IOException unused) {
            return uri;
        }
    }

    public final boolean e(File file) {
        return k(Environment.getDataDirectory(), file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if (k(android.os.Environment.getDataDirectory(), r0.toFile()) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.content.Context r10, android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csum.f(android.content.Context, android.net.Uri):boolean");
    }

    public final void j(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    file.delete();
                    return;
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j(file2);
                }
            }
            file.delete();
        }
    }
}
