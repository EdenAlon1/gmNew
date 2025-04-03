package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvei {
    private static final List a;
    private static final int b;

    static {
        List g = ffdx.g(6, 2, 10, 8, 11, 7, 12);
        a = g;
        b = g.indexOf(2);
    }

    public static final int a(List list) {
        if (!ersy.a("bugle.enable_logging_video_reachability_for_groups", "bugle") || list.isEmpty()) {
            return 6;
        }
        int indexOf = a.indexOf(Integer.valueOf(((aqrv) ((ResolvedRecipient) list.get(0)).m()).d));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int indexOf2 = a.indexOf(Integer.valueOf(((aqrv) ((ResolvedRecipient) it.next()).m()).d));
            if (indexOf2 <= 0) {
                return 6;
            }
            int i = b;
            if ((indexOf2 == i || indexOf == i) && indexOf != indexOf2) {
                return 6;
            }
            indexOf = Math.min(indexOf2, indexOf);
        }
        return ((Number) a.get(indexOf)).intValue();
    }
}
