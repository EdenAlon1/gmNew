package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqf {
    public static eisx a(Set set) {
        Iterator it = set.iterator();
        Integer num = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("account_id_")) {
                emxf.m(num == null, "Account ID already found. This work is tagged for two accounts.");
                num = Integer.valueOf(Integer.parseInt(str.replace("account_id_", "")));
            }
        }
        if (num == null || num.intValue() == -1) {
            throw new IllegalArgumentException("Input set had no valid account in it.");
        }
        return eisx.b(num.intValue());
    }

    public static eisx b(WorkerParameters workerParameters) {
        return a(workerParameters.c);
    }

    static String c(eisx eisxVar) {
        emxf.a(true);
        emxf.a(eisxVar.a() != -1);
        return "account_id_" + eisxVar.a();
    }
}
