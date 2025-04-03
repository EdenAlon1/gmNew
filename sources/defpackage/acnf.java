package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnf implements eivn, eivo {
    public static final cskc a = cskc.g("Bugle", "SatellitePairedAccountSelector");
    private final acmx b;
    private final errl c;

    public acnf(acmx acmxVar, errl errlVar) {
        this.b = acmxVar;
        this.c = errlVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        return this.b.a().h(new emwl() { // from class: acne
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    acnf.a.p("No stored account is present");
                    return null;
                }
                csjb c = acnf.a.c();
                c.I("Loading stored account");
                c.A("accountId", optional.get());
                c.r();
                return (eisx) optional.get();
            }
        }, this.c);
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        a.p("Using selection");
        return elfo.e(null);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
