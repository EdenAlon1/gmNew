package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elvd extends elvr {
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    @Override // defpackage.elvr, defpackage.elpd
    public final /* bridge */ /* synthetic */ Object a() {
        return new elve(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.elvr
    public final void b(String str) {
        this.b = Optional.of(str);
    }

    @Override // defpackage.elvr
    public final void c(elvv elvvVar) {
        this.d = Optional.of(elvvVar);
    }

    @Override // defpackage.elvr
    public final void d(int i) {
        this.c = Optional.of(Integer.valueOf(i));
    }

    @Override // defpackage.elvr
    public final void e(elya elyaVar) {
        this.a = Optional.of(elyaVar);
    }
}
