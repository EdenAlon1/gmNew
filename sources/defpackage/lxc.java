package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lxc extends enfj {
    private final Map a;

    public lxc(Map map) {
        this.a = map;
    }

    @Override // defpackage.enfj
    protected final Map b() {
        return this.a;
    }

    @Override // defpackage.enfj, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // defpackage.enfj, java.util.Map
    public final boolean containsValue(Object obj) {
        return enju.m(new enmk(entrySet().iterator()), obj);
    }

    @Override // defpackage.enfj, java.util.Map
    public final Set entrySet() {
        return enpw.h(super.entrySet(), new emxg() { // from class: lxa
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // defpackage.enfj, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && ennc.m(this, obj);
    }

    @Override // defpackage.enfj, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // defpackage.enfj, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfj, java.util.Map
    public final int hashCode() {
        return enpw.a(entrySet());
    }

    @Override // defpackage.enfj, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // defpackage.enfj, java.util.Map
    public final Set keySet() {
        return enpw.h(super.keySet(), new emxg() { // from class: lxb
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // defpackage.enfj, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
