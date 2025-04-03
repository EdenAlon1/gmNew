package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kso {
    public static void a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Objects.toString(file2);
            Log.e("AtomicFile", "Failed to delete file which is a directory ".concat(String.valueOf(file2)));
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", a.j(file2, file, "Failed to rename ", " to "));
    }

    public static boolean b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void c(File file, File file2, File file3) {
        file.delete();
        file2.delete();
        file3.delete();
    }
}
