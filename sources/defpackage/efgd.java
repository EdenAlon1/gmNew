package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgd {
    public static final void a(efif efifVar, HashMap hashMap) {
        String b = efifVar.b();
        emxf.f(!hashMap.containsKey(b), "There is already a factory registered for the ID %s", b);
        hashMap.put(b, efifVar);
    }
}
