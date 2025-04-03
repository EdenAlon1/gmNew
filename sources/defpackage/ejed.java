package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejed implements eivn, eivo {
    private final ejeg a;
    private final eiyk b;

    public ejed(ejeg ejegVar, eiyk eiykVar) {
        this.a = ejegVar;
        this.b = eiykVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        return this.a.a();
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        return this.b.a(eisxVar);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
