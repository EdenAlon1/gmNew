package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enku extends enfe implements Serializable {
    private static final long serialVersionUID = 3;
    final enlh a;
    final enlh b;
    final emwj c;
    final int d;
    transient ConcurrentMap e;

    public enku(enlh enlhVar, enlh enlhVar2, emwj emwjVar, int i, ConcurrentMap concurrentMap) {
        this.a = enlhVar;
        this.b = enlhVar2;
        this.c = emwjVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.enfe, defpackage.enfj
    protected final /* synthetic */ Map b() {
        return this.e;
    }

    @Override // defpackage.enfe
    protected final ConcurrentMap c() {
        return this.e;
    }

    @Override // defpackage.enfj, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.e;
    }
}
