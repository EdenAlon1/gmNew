package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erll extends enfk {
    final /* synthetic */ Map.Entry a;

    public erll(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.enfk
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.enfk, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }

    @Override // defpackage.enfk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        getKey();
        obj.getClass();
        return this.a.setValue(obj);
    }
}
