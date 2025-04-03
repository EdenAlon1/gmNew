package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azam {
    private final enhk a;

    public azam(Map map) {
        this.a = enhk.j(map);
    }

    public final elfl a(azan azanVar, int i, aoku aokuVar) {
        emxf.f(this.a.containsKey(azanVar), "No mapping for %s CapabilitiesGetter", azanVar);
        azal azalVar = (azal) this.a.get(azanVar);
        azalVar.getClass();
        return azalVar.a(i, aokuVar);
    }
}
