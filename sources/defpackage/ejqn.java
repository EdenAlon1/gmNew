package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqn {
    static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    public static final /* synthetic */ int c = 0;

    static enip a(Set set) {
        cmj cmjVar = new cmj(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                cmjVar.add(str.substring(13));
            }
        }
        return enip.o(cmjVar);
    }

    public static String b(String str) {
        return "TikTokWorker#".concat(str);
    }

    public static String c(WorkerParameters workerParameters) {
        return (String) enjk.l(a(workerParameters.c));
    }

    static void d(ejoi ejoiVar) {
        ejnu ejnuVar = (ejnu) ejoiVar;
        enqu listIterator = ejnuVar.i.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (a.matcher(str).matches()) {
                throw new ejoy(a.a(str, "Tag ", " is reserved by AccountWorkManager."));
            }
        }
        enqu listIterator2 = ejnuVar.i.listIterator();
        while (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            if (b.matcher(str2).matches()) {
                throw new ejoy(a.a(str2, "Tag ", " is reserved by TikTokWorkManager."));
            }
        }
    }
}
