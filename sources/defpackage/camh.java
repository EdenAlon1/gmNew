package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camh {
    public static final cskc a = cskc.f("BugleProtoData", camh.class);
    public final comc b;

    public camh(comy comyVar, String str) {
        comu c = comv.c();
        c.d(comb.ETOUFFEE_PHONE);
        c.g(str);
        c.f(camb.a);
        c.c(new Supplier() { // from class: camc
            @Override // java.util.function.Supplier
            public final Object get() {
                return new camg();
            }
        });
        c.b(true);
        this.b = comyVar.a(c.a());
    }

    public final elfl a() {
        return this.b.h().h(new emwl() { // from class: camf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = ((camb) obj).b;
                cama camaVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : cama.NOT_PROVISIONED_BUT_INITIALIZED : cama.NOT_PROVISIONED : cama.PROVISIONED : cama.UNSET;
                return camaVar == null ? cama.UNRECOGNIZED : camaVar;
            }
        }, erpp.a);
    }
}
