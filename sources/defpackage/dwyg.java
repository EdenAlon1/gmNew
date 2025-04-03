package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwyg {
    public static final enru a = enru.c("com/google/android/libraries/mdi/download/debug/DebugUtil");

    public static ListenableFuture a(final String str, Context context, Executor executor) {
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 62, "DebugUtil.java")).t("Work Info for tag %s", str);
        pte pteVar = (pte) pqr.a(context);
        WorkDatabase workDatabase = pteVar.e;
        qbc qbcVar = pteVar.m;
        workDatabase.getClass();
        qbcVar.getClass();
        return elfr.e(elfr.j(qap.a(workDatabase, qbcVar, new qam(str)), new emwl() { // from class: dwyb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    ((enrr) ((enrr) dwyg.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 73, "DebugUtil.java")).q("No WorkInfo Found");
                    return null;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((enrr) ((enrr) dwyg.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 70, "DebugUtil.java")).t("Work Info: %s", (pqq) it.next());
                }
                return null;
            }
        }, executor), Exception.class, new emwl() { // from class: dwyc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ((enrr) ((enrr) dwyg.a.i()).g((Exception) obj)).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 83, "DebugUtil.java")).t("Failed to get work info for tag %s", str);
                return null;
            }
        }, executor);
    }
}
