package org.chromium.base.memory;

import android.os.Debug;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            Log.i("cn_JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e.getMessage());
            return false;
        }
    }
}
