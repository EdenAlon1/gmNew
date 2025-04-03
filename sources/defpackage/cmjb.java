package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjb implements cmgr {
    private cmip a = cmip.TOGGLE_STATE_UNSPECIFIED;
    private final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    public cmjb() {
        new LinkedHashMap();
    }

    @Override // defpackage.cmgr
    public final cmip a() {
        return this.a;
    }

    @Override // defpackage.cmgr
    public final cmis b(djrm djrmVar) {
        return (cmis) Map.EL.getOrDefault(this.b, djrmVar, cmis.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    }

    @Override // defpackage.cmgr
    public final ejxi c() {
        return new cmiz();
    }

    @Override // defpackage.cmgr
    public final ejxi d(lkk lkkVar) {
        lkkVar.getClass();
        return new cmja();
    }

    @Override // defpackage.cmgr
    public final elfl e(djrm djrmVar) {
        this.c.put(djrmVar, Integer.valueOf(((Number) Map.EL.getOrDefault(this.c, djrmVar, 0)).intValue() + 1));
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.cmgr
    public final elfl f(djrm djrmVar, cmis cmisVar) {
        cmisVar.getClass();
        l(djrmVar, cmisVar);
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.cmgr
    public final elfl g(cmip cmipVar) {
        cmipVar.getClass();
        m(cmipVar);
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.cmgr
    public final elfl h(cmip cmipVar) {
        cmipVar.getClass();
        m(cmipVar);
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.cmgr
    public final Object i(ffgu ffguVar) {
        return this.a;
    }

    @Override // defpackage.cmgr
    public final void j() {
        Collection values = this.b.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((cmis) it.next()) == cmis.PER_SIM_TOGGLE_STATE_ENABLED) {
                    return;
                }
            }
        }
        this.a = cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED;
    }

    @Override // defpackage.cmgr
    public final void l(djrm djrmVar, cmis cmisVar) {
        cmisVar.getClass();
        this.b.put(djrmVar, cmisVar);
    }

    @Override // defpackage.cmgr
    public final void m(cmip cmipVar) {
        cmipVar.getClass();
        this.a = cmipVar;
    }

    @Override // defpackage.cmgr
    public final boolean n() {
        return this.a.equals(cmip.TOGGLE_STATE_ENABLED);
    }

    @Override // defpackage.cmgr
    public final void k() {
    }
}
