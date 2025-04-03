package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyz extends alzl {
    public Optional a = Optional.empty();
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();

    @Override // defpackage.alzl
    public final alzm a() {
        return new alza(this.a, this.b, this.c);
    }

    @Override // defpackage.alzl
    public final void b(alzo alzoVar) {
        this.b = Optional.of(alzoVar);
    }

    @Override // defpackage.alzl
    public final void c(alzp alzpVar) {
        this.c = Optional.of(alzpVar);
    }
}
