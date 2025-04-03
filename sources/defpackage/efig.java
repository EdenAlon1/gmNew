package defpackage;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efig {
    public static IOException a(efbm efbmVar, Uri uri, IOException iOException, String str) {
        try {
            efdw efdwVar = new efdw();
            efdwVar.c();
            File file = (File) efbmVar.c(uri, efdwVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? c(file, iOException, str) : c(file, iOException, str) : file.canWrite() ? c(file, iOException, str) : c(file, iOException, str) : file.canRead() ? file.canWrite() ? c(file, iOException, str) : c(file, iOException, str) : file.canWrite() ? c(file, iOException, str) : c(file, iOException, str) : c(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static IOException b(File file, IOException iOException, String str) {
        String concat;
        try {
            concat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                concat = concat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException c(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? b(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : parentFile.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : parentFile.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : b(file, iOException, str);
    }
}
