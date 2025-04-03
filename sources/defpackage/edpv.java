package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edpv {
    public abstract void A(edpu edpuVar);

    public abstract void B(edpu edpuVar);

    public abstract void C(edpu edpuVar);

    @Deprecated
    public abstract void D(List list);

    @Deprecated
    public abstract void E(edpu edpuVar);

    public final edqc F() {
        edlu edluVar = (edlu) a();
        List list = edluVar.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                emxf.b(!TextUtils.isEmpty((String) it.next()), "Attributions must not contain null or empty values.");
            }
        }
        Integer num = edluVar.G;
        if (num != null) {
            emxf.j(enop.c(0, 4).a(num), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, num);
        }
        Double d = edluVar.K;
        if (d != null) {
            Double valueOf = Double.valueOf(1.0d);
            Double valueOf2 = Double.valueOf(5.0d);
            emxf.j(enop.c(valueOf, valueOf2).a(d), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, d);
        }
        Integer num2 = edluVar.X;
        if (num2 != null) {
            enop enopVar = enop.a;
            emxf.f(new enop(new ener(0), eneo.a).a(num2), "User Ratings Total must not be < 0, but was: %s.", num2);
        }
        if (list != null) {
            c(engw.n(list));
        }
        List list2 = edluVar.C;
        if (list2 != null) {
            m(engw.n(list2));
        }
        List list3 = edluVar.E;
        if (list3 != null) {
            n(engw.n(list3));
        }
        List list4 = edluVar.W;
        if (list4 != null) {
            D(engw.n(list4));
        }
        List list5 = edluVar.M;
        if (list5 != null) {
            r(engw.n(list5));
        }
        List list6 = edluVar.D;
        if (list6 != null) {
            q(engw.n(list6));
        }
        return a();
    }

    public abstract edqc a();

    public abstract void b(edpu edpuVar);

    public abstract void c(List list);

    public abstract void d(edpu edpuVar);

    public abstract void e(edpu edpuVar);

    public abstract void f(edpu edpuVar);

    public abstract void g(edpu edpuVar);

    public abstract void h(edpu edpuVar);

    public abstract void i(edpu edpuVar);

    public abstract void j(edpu edpuVar);

    public abstract void k(edpu edpuVar);

    public abstract void l(edpu edpuVar);

    public abstract void m(List list);

    public abstract void n(List list);

    public abstract void o(edpu edpuVar);

    public abstract void p(edpu edpuVar);

    public abstract void q(List list);

    public abstract void r(List list);

    public abstract void s(edpu edpuVar);

    public abstract void t(edpu edpuVar);

    public abstract void u(edpu edpuVar);

    public abstract void v(edpu edpuVar);

    public abstract void w(edpu edpuVar);

    public abstract void x(edpu edpuVar);

    public abstract void y(edpu edpuVar);

    public abstract void z(edpu edpuVar);
}
