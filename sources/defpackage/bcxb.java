package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bcxb {
    public abstract bcxc a();

    public abstract eohh b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract String e();

    public abstract void f(int i);

    public abstract void g(long j);

    public abstract void h(long j);

    public abstract void i(int i);

    public abstract void j(long j);

    public abstract void k(byza byzaVar);

    public abstract void l(boolean z);

    public abstract void m(byzh byzhVar);

    public abstract void n(boolean z);

    public abstract void o(eohh eohhVar);

    public abstract void p(long j);

    public abstract void q(int i);

    public final bcxc r() {
        eohh b = b();
        l(((Boolean) c().orElse(Boolean.valueOf(b == eohh.FILE_CHOOSER))).booleanValue());
        Boolean bool = (Boolean) d().orElse(Boolean.valueOf(b == eohh.CAMERA || b == eohh.MINI_CAMERA || b == eohh.FULLSCREEN_CAMERA));
        n(bool.booleanValue());
        String e = e();
        emxf.m(!bool.booleanValue() || le.n(e) || le.A(e), "saveToExternalStorageValue but part is not image or video: ".concat(String.valueOf(e)));
        return a();
    }
}
