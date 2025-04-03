package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyg {
    public static final apxz a(aqux aquxVar, Context context, fjay fjayVar) {
        String string = context.getString(R.string.you_name);
        string.getClass();
        return new apxz(string, aquxVar.c(), false, aquxVar, fjayVar, null, null, 96);
    }

    public static final apya b(apyv apyvVar, List list, boolean z) {
        return new apya(apyvVar, list.size(), z, engq.a(list));
    }

    public static final apya c(apya apyaVar, aqux aquxVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : apyaVar.d) {
            aqux aquxVar2 = ((apxz) obj).c;
            if (aquxVar2 == null || !aquxVar2.w(aquxVar.g())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return b(apyaVar.a, arrayList, false);
    }
}
