package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgbc extends cpdo {
    private final ffbr a;
    private final errl b;

    public cgbc(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("FirebaseInitStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        final ffbr ffbrVar = this.a;
        ffbrVar.getClass();
        return elfo.g(new Callable() { // from class: cgbb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (cgba) ffbr.this.b();
            }
        }, this.b);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return false;
    }
}
