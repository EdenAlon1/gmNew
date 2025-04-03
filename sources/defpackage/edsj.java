package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edsj implements edkr {
    public static edsi r(String str, List list) {
        edrg edrgVar = new edrg();
        edrgVar.c = (byte) (edrgVar.c | 1);
        edrgVar.d(list);
        edrgVar.e(new ArrayList());
        if (str == null) {
            throw new NullPointerException("Null textQuery");
        }
        edrgVar.b = str;
        edrgVar.c = (byte) (edrgVar.c | 6);
        return edrgVar;
    }

    public abstract String b();

    public abstract List c();

    public abstract List d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();
}
