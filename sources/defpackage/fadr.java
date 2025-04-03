package defpackage;

import j$.nio.file.FileSystems;
import j$.nio.file.Files;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fadr {
    public static void a(File file) {
        if (file != null) {
            b(file);
        }
    }

    private static void b(File file) {
        File[] listFiles;
        if (file.isDirectory()) {
            if (!Files.isSymbolicLink(FileSystems.getDefault().getPath(file.getPath(), new String[0])) && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    b(file2);
                }
            }
        }
        file.delete();
    }
}
