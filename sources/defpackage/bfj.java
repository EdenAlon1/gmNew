package defpackage;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfj extends bgw {
    public bfj(Map map) {
        super(map);
    }

    public static bfj a() {
        return new bfj(new ArrayMap());
    }

    public final void b(String str, Object obj) {
        this.b.put(str, obj);
    }
}
