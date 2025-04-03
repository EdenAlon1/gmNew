package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqb extends hoh implements Map, hnp, hgb {
    public static final hqb d = new hqb(hoy.a, 0);

    public hqb(hoy hoyVar, int i) {
        super(hoyVar, i);
    }

    @Override // defpackage.hgb
    public final Object a(hfw hfwVar) {
        return hgc.b(this, hfwVar);
    }

    @Override // defpackage.hoh, defpackage.hnp
    public final /* synthetic */ hno b() {
        return new hqa(this);
    }

    @Override // defpackage.hoh, defpackage.ffdg, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof hfw) {
            return super.containsKey((hfw) obj);
        }
        return false;
    }

    @Override // defpackage.ffdg, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof hld) {
            return super.containsValue((hld) obj);
        }
        return false;
    }

    @Override // defpackage.hoh
    /* renamed from: e */
    public final /* synthetic */ hoj b() {
        return new hqa(this);
    }

    @Override // defpackage.hoh, defpackage.ffdg, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof hfw) {
            return (hld) super.get((hfw) obj);
        }
        return null;
    }

    @Override // defpackage.ffdg, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof hfw) ? obj2 : (hld) Map.CC.$default$getOrDefault(this, (hfw) obj, (hld) obj2);
    }

    public final hqb i(hfw hfwVar, hld hldVar) {
        hox d2 = this.b.d(hfwVar.hashCode(), hfwVar, hldVar, 0);
        if (d2 == null) {
            return this;
        }
        return new hqb(d2.a, this.c + d2.b);
    }
}
