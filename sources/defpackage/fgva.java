package defpackage;

import java.text.DateFormat;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgva {
    private final Map a = new WeakHashMap();
    private final DateFormat b;

    public fgva(DateFormat dateFormat) {
        this.b = dateFormat;
    }

    public final DateFormat a() {
        DateFormat dateFormat = (DateFormat) this.a.get(Thread.currentThread());
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.b.clone();
        this.a.put(Thread.currentThread(), dateFormat2);
        return dateFormat2;
    }
}
