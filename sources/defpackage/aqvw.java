package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqvw {
    public static final aqvv a(Optional optional) {
        if (optional.isEmpty()) {
            return null;
        }
        String o = ((bxtp) optional.get()).o();
        Uri m = ((bxtp) optional.get()).m();
        if (o == null && m == null) {
            return null;
        }
        if (m == null) {
            m = Uri.EMPTY;
        }
        if (o == null) {
            o = "";
        }
        m.getClass();
        return new aqvv(o, m);
    }
}
