package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcnh implements bcjz {
    private final /* synthetic */ bckl a = new bckl(bcme.a, bcmm.a, bcne.a, bcni.b, null, bcni.a, 1, 16);

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
        bqdvVar.d(new Function() { // from class: bcnf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bqdzVar.f(bckf.k.a);
                bqdzVar.c(0L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bbru d = bcme.d();
        d.u();
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.u();
        bqdvVar2.d(new Function() { // from class: bcng
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
        dtvy i2 = dtvz.i(bqdvVar2.b(), bqea.c.c, bbrx.c.a);
        ((dtrd) i2).e = "message_id_map";
        dtvy i3 = dtvz.i(((bbru) d.j(i2)).b(), bbrx.c.a, bqea.c.c);
        ((dtrd) i3).e = "message_captions_map";
        bqdv bqdvVar3 = (bqdv) bqdvVar.j(i3);
        bqdvVar3.n(new dtzq("$V{J:message_id_map}", new Object[]{bqea.c.d}), "bugle_id");
        bcjs.a(bqdvVar3, bckf.k, 1L, 5);
    }

    @Override // defpackage.bcjz
    public final void e() {
    }
}
