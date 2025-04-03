package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azh {
    static File a() {
        try {
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e) {
            throw new avl("Failed to create temp file.", e);
        }
    }

    static void b(File file, avg avgVar) {
        try {
            try {
                OutputStream outputStream = avgVar.a;
                if (outputStream != null) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, read);
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } finally {
                file.delete();
            }
        } catch (IOException unused) {
            throw new avl("Failed to write to OutputStream.", null);
        }
    }
}
