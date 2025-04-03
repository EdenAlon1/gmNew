package defpackage;

import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class lli implements lkp {
    private final Object a;
    private final ljr b;

    public lli(Object obj) {
        this.a = obj;
        this.b = ljt.a.b(obj.getClass());
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        ljr ljrVar = this.b;
        List list = (List) ljrVar.a.get(lkiVar);
        Object obj = this.a;
        ljr.a(list, lkrVar, lkiVar, obj);
        ljr.a((List) ljrVar.a.get(lki.ON_ANY), lkrVar, lkiVar, obj);
    }
}
