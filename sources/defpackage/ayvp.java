package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvp {
    public final AtomicBoolean a = new AtomicBoolean(true);
    private final Map b = new HashMap();

    public final synchronized Random a(String str) {
        if (this.a.get()) {
            return new Random();
        }
        int intValue = ((Integer) Map.EL.getOrDefault(this.b, str, 0)).intValue();
        this.b.put(str, Integer.valueOf(intValue + 1));
        return new Random(intValue);
    }
}
