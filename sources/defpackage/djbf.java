package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbf extends djea {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();

    @Override // defpackage.djea
    public final djeb a() {
        return new djbg(this.a, this.b);
    }

    @Override // defpackage.djea
    public final void b(dkjt dkjtVar) {
        this.a = Optional.of(dkjtVar);
    }

    @Override // defpackage.djea
    public final void c(dkkj dkkjVar) {
        this.b = Optional.of(dkkjVar);
    }
}
