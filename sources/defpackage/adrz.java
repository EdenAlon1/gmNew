package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrz extends cpdo {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ errl c;

    public adrz(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("GrowthKitStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        final ffbr ffbrVar = this.a;
        final ffbr ffbrVar2 = this.b;
        return elfo.f(new Runnable() { // from class: adry
            @Override // java.lang.Runnable
            public final void run() {
                ((dvva) ffbr.this.b()).a();
                ((adsd) ffbrVar2.b()).a(2);
            }
        }, this.c);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
