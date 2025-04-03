package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class set implements eivn, eivo {
    public final ejgc a;
    public final ejfv b;
    public elfl c;

    public set(ejgc ejgcVar, ejfv ejfvVar) {
        ejgcVar.getClass();
        this.a = ejgcVar;
        this.b = ejfvVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final /* bridge */ /* synthetic */ ListenableFuture a(eivr eivrVar) {
        elfl elflVar = this.c;
        if (elflVar != null) {
            return elflVar;
        }
        elfl g = elfl.g(this.a.a(eivrVar));
        g.getClass();
        return g;
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        eisxVar.getClass();
        return this.a.b(eisxVar);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
