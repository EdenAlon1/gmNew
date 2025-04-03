package defpackage;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akyl extends akyh {
    private final Map a = new ConcurrentHashMap();

    @Override // defpackage.akyh
    public final boolean a(alan alanVar) {
        alal b = alal.b(alanVar.b);
        if (b == null) {
            b = alal.LOG_SPEC_UNSPECIFIED;
        }
        return ((Boolean) Map.EL.putIfAbsent(this.a, b, true)) == null;
    }
}
