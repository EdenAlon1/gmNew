package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjs {
    private final qbx a;

    public qjs(qbx qbxVar) {
        this.a = qbxVar;
    }

    public static String c(String str, qjr qjrVar, boolean z) {
        String replaceAll = str.replaceAll("\\W+", "");
        String str2 = qjrVar.c;
        if (z) {
            str2 = ".temp".concat(String.valueOf(str2));
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    public final File a() {
        File file = new File(this.a.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b(String str, InputStream inputStream, qjr qjrVar) {
        File file = new File(a(), c(str, qjrVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
