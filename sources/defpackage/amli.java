package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amli implements aqge {
    public final amon a;
    private final ffsk b;
    private final int c;
    private final beci d;

    public amli(ffsk ffskVar, becj becjVar, amon amonVar, int i) {
        this.b = ffskVar;
        this.a = amonVar;
        this.c = i;
        this.d = becjVar.a(amon.b(d()).b(), "getTopConversations");
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        aqgdVar.getClass();
        return this.d.f(new ctbf() { // from class: amlf
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "TopConversationsSupplier::register", "TopConversationsSupplier::callback", "TopConversationsSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        ekzz f = eleg.f("TopConversationsSupplier#getTopConversations");
        try {
            c = axol.c(this.b, ffhe.a, ffsm.a, new amlh(this, null));
            f.b(c);
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final bsol d() {
        Object apply;
        bsob e = bsom.e();
        e.z("topConversationsInner");
        e.g(new Function() { // from class: amld
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bskp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.A(0);
        e.x(this.c);
        e.i(new Function() { // from class: amle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.c(byyt.UNARCHIVED);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskp bskpVar = bsom.c;
        e.e(new bsny(bskpVar.r, false), new bsny(bskpVar.a, false));
        String[] strArr = bvin.a;
        bvik bvikVar = new bvik(bvin.a);
        apply = new Function() { // from class: amlg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new bvib[]{((bvia) obj).a};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bvin.c);
        bvikVar.c((bvib[]) apply);
        bsol bsolVar = new bsol();
        bsolVar.as(new dtzq("$V{J:parent_disallowed_join_tag} ISNULL", new Object[]{bvin.c.a}));
        e.h(bsolVar);
        dtvy i = dtvz.i(bvikVar.b(), bvin.c.a, bsom.c.a);
        ((dtrd) i).e = "parent_disallowed_join_tag";
        e.F(i);
        bsol bsolVar2 = new bsol();
        bsolVar2.s(e.b());
        return bsolVar2;
    }
}
