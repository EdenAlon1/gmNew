package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbr {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());

    public final Object a(Object obj) {
        return this.a.get(obj);
    }
}
