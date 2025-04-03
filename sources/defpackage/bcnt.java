package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnt implements bcjz {
    private final /* synthetic */ bckl a = new bckl(bcmg.a, bcmo.a, bcnp.a, bcnu.b, null, bcnu.a, 1, 16);

    @Override // defpackage.bcjz
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.bcjz
    public final void b(dtyx dtyxVar) {
        this.a.b(null);
    }

    @Override // defpackage.bcjz
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.bcjz
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.bcjz
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.bcjz
    public final void g(int i, dtzj dtzjVar) {
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdh bqdhVar = bqea.c;
        bqdvVar.c(bqdhVar.c, bqdhVar.a);
        bqdvVar.d(new Function() { // from class: bcnq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.j.a);
                bqdzVar.c(0L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr2 = bbvc.a;
        bbuz bbuzVar = new bbuz(bbvc.a);
        bbuzVar.u();
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.u();
        bqdvVar2.d(new Function() { // from class: bcnr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.b.a);
                bqdzVar.d(2, 1);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(bqdvVar2.b(), bqea.c.c, bbvc.c.a);
        ((dtrd) i2).e = "message_id_map";
        bbuz bbuzVar2 = (bbuz) bbuzVar.j(i2);
        bqdv bqdvVar3 = new bqdv(bqea.a);
        bqdvVar3.u();
        bqdvVar3.d(new Function() { // from class: bcns
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.b.a);
                bqdzVar.d(2, 1);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i3 = dtvz.i(bqdvVar3.b(), bqea.c.c, bbvc.c.b);
        ((dtrd) i3).e = "replied_to_message_id_map";
        dtvy i4 = dtvz.i(((bbuz) bbuzVar2.j(i3)).b(), bbvc.c.a, bqea.c.c);
        ((dtrd) i4).e = "message_replies_map";
        bqdv bqdvVar4 = (bqdv) bqdvVar.j(i4);
        bqdvVar4.n(new dtzq("$V{J:message_id_map}", new Object[]{bqea.c.d}), "bugle_id");
        bcjs.a(bqdvVar4, bckf.j, 1L, 5);
    }

    @Override // defpackage.bcjz
    public final void e() {
    }
}
