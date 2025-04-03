package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fru {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();

    public final frw a(frt frtVar) {
        return (frw) this.a.get(frtVar);
    }

    public final void b(frt frtVar) {
        frw frwVar = (frw) this.a.get(frtVar);
        if (frwVar != null) {
        }
        this.a.remove(frtVar);
    }
}
