package defpackage;

import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeps {
    public static String a(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        if (name.contains("..")) {
            for (File file = new File(name); file != null; file = file.getParentFile()) {
                if (file.getName().equals("..")) {
                    throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                }
            }
        }
        return name;
    }
}
