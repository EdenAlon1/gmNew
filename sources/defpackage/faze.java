package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faze {
    private final Map a;

    public faze(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(fbax.a(((enoz) map).d + ((enoz) map2).d));
            linkedHashMap.putAll(map2);
            for (Map.Entry entry : ((enhk) map).entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        this.a = map2;
    }

    public final void a(Object obj) {
        if (b(obj)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }

    public final boolean b(Object obj) {
        ffbr ffbrVar = (ffbr) this.a.get(obj.getClass().getName());
        if (ffbrVar == null) {
            return false;
        }
        fazc fazcVar = (fazc) ffbrVar.b();
        try {
            faze a = fazcVar.a();
            fazcVar.getClass();
            a.getClass();
            a.a(obj);
            return true;
        } catch (ClassCastException e) {
            throw new fazd(String.format("%s does not implement AndroidInjector.Factory<%s>", fazcVar.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }
}
