package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpc {
    private static final enru a = enru.c("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static dtpd a(File file) {
        dtpd dtpdVar;
        if (file.isDirectory()) {
            return dtpd.d;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    dtpdVar = dtpe.a(bArr, eoej.d(fileInputStream, bArr, 62));
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (IOException | ParseException e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).t("Failed to read SchedStat for thread %s", file.getName());
            dtpdVar = dtpd.d;
        }
        return dtpdVar;
    }

    public static List b(List list) {
        dtpd dtpdVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList(list.size());
        byte[] bArr = new byte[62];
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/task/" + ((Integer) it.next()).intValue() + "/schedstat"));
                    try {
                        dtpdVar = dtpe.a(bArr, eoej.d(fileInputStream, bArr, 62));
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | ParseException unused) {
                    dtpdVar = dtpd.d;
                }
                arrayList.add(dtpdVar);
            }
            return arrayList;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
