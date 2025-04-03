package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aev extends afc {
    public final HashMap a = new HashMap();

    @Override // defpackage.afc
    public final aey a(Object obj) {
        return (aey) this.a.get(obj);
    }

    @Override // defpackage.afc
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
