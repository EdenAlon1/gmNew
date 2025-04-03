package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyu extends dizc {
    public final ConcurrentMap a;
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diyu() {
        super("cslib_phenotype__");
        diyt diytVar = diyv.a;
        this.a = new ConcurrentHashMap();
        diyt diytVar2 = diyt.OFF;
        this.b = diytVar.c;
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.n(this.a.values());
    }
}
