package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clau extends clay {
    public Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.clay
    public final clba a() {
        return new clav(this.a, this.b);
    }

    @Override // defpackage.clay
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.clay
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.clay
    public final void d(claz clazVar) {
        this.b = Optional.of(clazVar);
    }
}
