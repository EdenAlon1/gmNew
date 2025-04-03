package defpackage;

import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cuag implements cuaf {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cuag(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.cuaf
    public final int a() {
        Optional e = e();
        if (djaq.n()) {
            return 1;
        }
        if (djaq.d() && !e.isEmpty()) {
            return ((djtp) e.get()).o().mDefaultSharingMethod;
        }
        return -1;
    }

    @Override // defpackage.cuaf
    public final int b() {
        return csmk.c(e());
    }

    @Override // defpackage.cuaf
    public final int c() {
        return csmk.d(e());
    }

    @Override // defpackage.cuaf
    public final int d() {
        return csmk.e(e());
    }

    @Override // defpackage.cuaf
    public final Optional e() {
        return ((djry) this.a.b()).m();
    }

    @Override // defpackage.cuaf
    public final String f() {
        Optional e = e();
        return e.isEmpty() ? "" : ((csmk) this.c.b()).b((djtp) e.get());
    }

    @Override // defpackage.cuaf
    public final String g() {
        return (String) ((dked) this.b.b()).c().orElse("");
    }
}
