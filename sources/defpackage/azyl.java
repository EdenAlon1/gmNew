package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azyl {
    public final emyl a;

    public azyl(final comy comyVar) {
        this.a = emys.a(new emyl() { // from class: azyi
            @Override // defpackage.emyl
            public final Object get() {
                comu c = comv.c();
                c.d(comb.DB_METADATA);
                c.f(cbfv.a);
                c.c(new Supplier() { // from class: azyh
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new azyk();
                    }
                });
                return comy.this.a(c.a());
            }
        });
    }
}
