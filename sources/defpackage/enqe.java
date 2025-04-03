package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enqe extends enfk {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ enqf b;

    public enqe(enqf enqfVar, Map.Entry entry) {
        this.a = entry;
        this.b = enqfVar;
    }

    @Override // defpackage.enfk
    protected final Map.Entry b() {
        return this.a;
    }

    @Override // defpackage.enfk, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return enqr.a((Collection) this.a.getValue(), this.b.a.g);
    }

    @Override // defpackage.enfk, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.a;
    }
}
