package defpackage;

import j$.util.Map;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersq {
    private final Map a;
    private final ersv b;

    public ersq(Map map, ersv ersvVar) {
        this.a = map;
        this.b = ersvVar;
    }

    public final boolean a(String str) {
        boolean booleanValue = ((Boolean) ((ffbr) Map.EL.getOrDefault(this.a, str, new ffbr() { // from class: ersp
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return false;
            }
        })).b()).booleanValue();
        if (this.b.e()) {
            Optional b = this.b.b(str);
            if (b.isPresent()) {
                return ((Boolean) b.orElseThrow()).booleanValue();
            }
        }
        return booleanValue;
    }
}
