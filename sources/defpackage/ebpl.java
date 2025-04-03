package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpl extends ebrs {
    public final ebrz a;
    public final eayr b;
    public final eawd c;
    public final ebtw d;
    public final ebvw e;
    public final ebpe f;
    private final ExecutorService g;
    private final dwch h;
    private final emxc i;

    public ebpl(ebrz ebrzVar, eayr eayrVar, ExecutorService executorService, eawd eawdVar, ebtw ebtwVar, dwch dwchVar, ebvw ebvwVar, ebpe ebpeVar, emxc emxcVar) {
        this.a = ebrzVar;
        this.b = eayrVar;
        this.g = executorService;
        this.c = eawdVar;
        this.d = ebtwVar;
        this.h = dwchVar;
        this.e = ebvwVar;
        this.f = ebpeVar;
        this.i = emxcVar;
    }

    @Override // defpackage.ebrs
    public final dwch a() {
        return this.h;
    }

    @Override // defpackage.ebrs
    public final eawd b() {
        return this.c;
    }

    @Override // defpackage.ebrs
    public final eayr c() {
        return this.b;
    }

    @Override // defpackage.ebrs
    public final ebpe d() {
        return this.f;
    }

    @Override // defpackage.ebrs
    public final ebrz e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebrs) {
            ebrs ebrsVar = (ebrs) obj;
            if (this.a.equals(ebrsVar.e()) && this.b.equals(ebrsVar.c()) && this.g.equals(ebrsVar.i()) && this.c.equals(ebrsVar.b()) && this.d.equals(ebrsVar.f()) && this.h.equals(ebrsVar.a()) && this.e.equals(ebrsVar.g()) && this.f.equals(ebrsVar.d()) && this.i.equals(ebrsVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ebrs
    public final ebtw f() {
        return this.d;
    }

    @Override // defpackage.ebrs
    public final ebvw g() {
        return this.e;
    }

    @Override // defpackage.ebrs
    public final emxc h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.ebrs
    public final ExecutorService i() {
        return this.g;
    }

    public final String toString() {
        return "ExpressSignInManager{limitedAvailableAccountsModel=" + this.a.toString() + ", internalAccountsModel=" + this.b.toString() + ", backgroundExecutor=" + this.g.toString() + ", avatarImageLoader=" + this.c.toString() + ", oneGoogleEventLogger=" + this.d.toString() + ", vePrimitives=" + this.h.toString() + ", visualElements=" + this.e.toString() + ", accountLayer=" + this.f.toString() + ", appIdentifier=Optional.absent()}";
    }
}
