package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusp {
    public static final euse a = new euse() { // from class: euso
        @Override // defpackage.eusa
        public final void a(Object obj, Object obj2) {
            throw new eusb("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final void a(Class cls, euse euseVar, Map map, Map map2) {
        map.put(cls, euseVar);
        map2.remove(cls);
    }
}
