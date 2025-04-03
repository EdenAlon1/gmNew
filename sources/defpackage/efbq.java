package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbq {
    public static File a(Context context) {
        Context createDeviceProtectedStorageContext;
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return b(createDeviceProtectedStorageContext).getParentFile();
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }
}
