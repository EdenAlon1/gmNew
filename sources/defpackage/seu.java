package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seu implements eivn, eivo {
    private final Optional a;
    private final eiyk b;
    private final ejeg c;

    public seu(Optional optional, eiyk eiykVar, ejeg ejegVar) {
        eiykVar.getClass();
        this.a = optional;
        this.b = eiykVar;
        this.c = ejegVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        this.a.isPresent();
        return this.c.a();
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        eisxVar.getClass();
        return this.b.a(eisxVar);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
