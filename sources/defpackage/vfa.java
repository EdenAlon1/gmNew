package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfa {
    public static final ejui a = new ejtz("REACTIONS_PROMO_DATA");
    public final Executor b;
    public final comc c;
    public final ejvp d;

    public vfa(Executor executor, ffbr ffbrVar, ejvp ejvpVar) {
        this.b = executor;
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.REACTIONS_PROMO_DATA);
        c.f(ves.a);
        c.c(new Supplier() { // from class: vew
            @Override // java.util.function.Supplier
            public final Object get() {
                return new vfb();
            }
        });
        this.c = comyVar.a(c.a());
        this.d = ejvpVar;
    }
}
