package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoeo {
    public static final eoci a = new eoci() { // from class: eoem
        @Override // defpackage.eoci
        public final Iterable b(Object obj) {
            File[] listFiles;
            File file = (File) obj;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                return DesugarCollections.unmodifiableList(Arrays.asList(listFiles));
            }
            int i = engw.d;
            return enou.a;
        }
    };

    public static void a(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static byte[] b(File file) {
        file.getClass();
        return eoen.a(file);
    }
}
