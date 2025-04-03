package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhl {
    public static dyhl a;
    private final Map b;

    public dyhl(Map map) {
        this.b = map;
    }

    public static dyhl a() {
        dyhl dyhlVar = a;
        if (dyhlVar != null) {
            return dyhlVar;
        }
        dyhr.c("IntentHelper", "No instance available, call initialize first.");
        throw new IllegalArgumentException("No instance available, please call initialize first.");
    }

    public final String b(int i) {
        return (String) this.b.get(Integer.valueOf(i));
    }
}
