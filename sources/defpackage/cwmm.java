package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmm {
    private final Map a;

    public cwmm(Map map) {
        map.getClass();
        this.a = map;
    }

    public final Optional a() {
        for (cwmn cwmnVar : cwmn.values()) {
            cwmo cwmoVar = (cwmo) this.a.get(cwmnVar);
            Optional a = cwmoVar != null ? cwmoVar.a() : null;
            if (a != null && a.isPresent()) {
                return a;
            }
        }
        return Optional.empty();
    }
}
