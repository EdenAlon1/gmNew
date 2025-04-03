package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpk extends ebrr {
    public ebvw a;
    public ebpe b;
    private ebrz d;
    private eayr e;
    private ExecutorService f;
    private eawd g;
    private ebtw h;
    private dwch i;
    private final emxc j = emux.a;

    @Override // defpackage.ebrr
    public final dwch a() {
        dwch dwchVar = this.i;
        if (dwchVar != null) {
            return dwchVar;
        }
        throw new IllegalStateException("Property \"vePrimitives\" has not been set");
    }

    @Override // defpackage.ebrr
    public final ebpe b() {
        ebpe ebpeVar = this.b;
        if (ebpeVar != null) {
            return ebpeVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    @Override // defpackage.ebrr
    public final ebrs c() {
        eayr eayrVar;
        ExecutorService executorService;
        eawd eawdVar;
        ebtw ebtwVar;
        dwch dwchVar;
        ebvw ebvwVar;
        ebpe ebpeVar;
        ebrz ebrzVar = this.d;
        if (ebrzVar != null && (eayrVar = this.e) != null && (executorService = this.f) != null && (eawdVar = this.g) != null && (ebtwVar = this.h) != null && (dwchVar = this.i) != null && (ebvwVar = this.a) != null && (ebpeVar = this.b) != null) {
            return new ebpl(ebrzVar, eayrVar, executorService, eawdVar, ebtwVar, dwchVar, ebvwVar, ebpeVar, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" limitedAvailableAccountsModel");
        }
        if (this.e == null) {
            sb.append(" internalAccountsModel");
        }
        if (this.f == null) {
            sb.append(" backgroundExecutor");
        }
        if (this.g == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.h == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (this.i == null) {
            sb.append(" vePrimitives");
        }
        if (this.a == null) {
            sb.append(" visualElements");
        }
        if (this.b == null) {
            sb.append(" accountLayer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebrr
    public final emxc d() {
        ExecutorService executorService = this.f;
        return executorService == null ? emux.a : emxc.j(executorService);
    }

    @Override // defpackage.ebrr
    public final emxc e() {
        ebtw ebtwVar = this.h;
        return ebtwVar == null ? emux.a : emxc.j(ebtwVar);
    }

    @Override // defpackage.ebrr
    public final void f(eawd eawdVar) {
        this.g = eawdVar;
    }

    @Override // defpackage.ebrr
    public final void g(ExecutorService executorService) {
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.f = executorService;
    }

    @Override // defpackage.ebrr
    public final void h(eayr eayrVar) {
        this.e = eayrVar;
    }

    @Override // defpackage.ebrr
    public final void i(ebrz ebrzVar) {
        this.d = ebrzVar;
    }

    @Override // defpackage.ebrr
    public final void j(ebtw ebtwVar) {
        this.h = ebtwVar;
    }

    @Override // defpackage.ebrr
    public final void k(dwch dwchVar) {
        if (dwchVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        this.i = dwchVar;
    }

    @Override // defpackage.ebrr
    public final void l(ebvw ebvwVar) {
        this.a = ebvwVar;
    }
}
