package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmb implements acls {
    public final errl a;
    public final comc b;
    public final fazb c;
    private final ejvb d;
    private final ffbr e;

    public acmb(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ejvb ejvbVar, fazb fazbVar) {
        this.a = errlVar;
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.SATELLITE_DATA_KEY);
        c.f(acme.a);
        c.c(new Supplier() { // from class: acma
            @Override // java.util.function.Supplier
            public final Object get() {
                return new aclt();
            }
        });
        this.b = comyVar.a(c.a());
        this.e = ffbrVar2;
        this.d = ejvbVar;
        this.c = fazbVar;
    }

    @Override // defpackage.acls
    public final ejuh a() {
        return new ejuy(this.d, new eros() { // from class: aclz
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                acmb acmbVar = acmb.this;
                return new erph(!Collection.EL.stream((Set) acmbVar.c.b()).allMatch(new Predicate() { // from class: aclu
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((bzhr) obj).c();
                    }
                }) ? elfo.e(Integer.valueOf(acmd.STANDALONE.a())) : !acmbVar.d() ? elfo.e(Integer.valueOf(acmd.STANDALONE.a())) : acmbVar.b.h().h(new emwl() { // from class: aclx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((acme) obj).b);
                    }
                }, acmbVar.a));
            }
        }, "SWITCH_DITTO_SCREEN_KEY");
    }

    @Override // defpackage.acls
    public final elfl b() {
        return !d() ? elfo.e(acmd.STANDALONE) : this.b.h().h(new emwl() { // from class: acly
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acmd b = acmd.b(((acme) obj).b);
                return b == null ? acmd.UNRECOGNIZED : b;
            }
        }, this.a);
    }

    @Override // defpackage.acls
    public final elfl c(final acmd acmdVar) {
        return !d() ? elfo.e(null) : this.b.j(new emwl() { // from class: aclv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acmc acmcVar = (acmc) ((acme) obj).toBuilder();
                acmcVar.copyOnWrite();
                ((acme) acmcVar.instance).b = acmd.this.a();
                return (acme) acmcVar.build();
            }
        }).h(new emwl() { // from class: aclw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public final boolean d() {
        return ((acpf) this.e.b()).a();
    }
}
