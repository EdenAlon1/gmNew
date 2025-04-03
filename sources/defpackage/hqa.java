package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqa extends hoj implements Map, hno {
    private hqb f;

    public hqa(hqb hqbVar) {
        super(hqbVar);
        this.f = hqbVar;
    }

    @Override // defpackage.hoj, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof hfw) {
            return super.containsKey((hfw) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof hld) {
            return super.containsValue((hld) obj);
        }
        return false;
    }

    @Override // defpackage.hoj, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof hfw) {
            return (hld) super.get((hfw) obj);
        }
        return null;
    }

    @Override // defpackage.hoj, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof hfw) ? obj2 : (hld) Map.CC.$default$getOrDefault(this, (hfw) obj, (hld) obj2);
    }

    @Override // defpackage.hoj
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final hqb a() {
        hoy hoyVar = this.b;
        hqb hqbVar = this.f;
        if (hoyVar != hqbVar.b) {
            this.a = new hpl();
            hqbVar = new hqb(hoyVar, this.e);
        }
        this.f = hqbVar;
        return hqbVar;
    }

    @Override // defpackage.hoj, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof hfw) {
            return (hld) super.remove((hfw) obj);
        }
        return null;
    }
}
