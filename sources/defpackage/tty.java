package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tty {
    private final Context a;

    public tty(Context context) {
        context.getClass();
        this.a = context;
    }

    public final String a(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        String b = cuxh.b(((ambh) list.get(0)).b);
        int i = ((enou) list).c;
        if (i <= 1) {
            b.getClass();
            return b;
        }
        String string = this.a.getResources().getString(R.string.contact_has_multiple_destinations_phone, b, String.valueOf(i - 1));
        string.getClass();
        return string;
    }
}
