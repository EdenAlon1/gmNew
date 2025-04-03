package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgki implements eivn, eivo {
    public final ejgc a;
    public final eixo b;
    public final errl c;

    public cgki(ejgc ejgcVar, eixo eixoVar, errl errlVar) {
        this.a = ejgcVar;
        this.b = eixoVar;
        this.c = errlVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(final eivr eivrVar) {
        return elfl.g(this.a.a(eivrVar)).i(new eroh() { // from class: cgkg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eisx eisxVar = (eisx) obj;
                if (eisxVar == null) {
                    return elfo.e(null);
                }
                final eivr eivrVar2 = eivrVar;
                cgki cgkiVar = cgki.this;
                return elfl.g(cgkiVar.b.c(eisxVar)).h(eldl.a(new emwl() { // from class: cgkh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        if (((eixn) obj2).b().k.equals("pseudonymous")) {
                            return null;
                        }
                        eisx eisxVar2 = eisxVar;
                        ((eiwu) eivr.this).a.putExtra("use_default_account_selector", true);
                        return eisxVar2;
                    }
                }), cgkiVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        return this.a.b(eisxVar);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
