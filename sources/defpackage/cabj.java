package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabj {
    private static final cskc c = cskc.g("BugleEtouffee", "IdVerificationCache");
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    final boolean a(bdhg bdhgVar) {
        Integer num = (Integer) bzwd.w.e();
        Integer num2 = (Integer) bzwd.x.e();
        synchronized (this.a) {
            if (this.b.size() > num2.intValue()) {
                c.r("Cache is too large. Clear it.");
                this.b.clear();
            }
            Integer num3 = (Integer) this.b.get(bdhgVar);
            if (num3 == null) {
                num3 = 0;
            }
            if (num3.intValue() >= num.intValue()) {
                return false;
            }
            this.b.put(bdhgVar, Integer.valueOf(num3.intValue() + 1));
            return true;
        }
    }
}
