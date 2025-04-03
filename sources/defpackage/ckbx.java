package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ckbx {
    public static final ckbx i = j(-1, -1).a();

    public static ckbw j(int i2, int i3) {
        ckaw ckawVar = new ckaw();
        ckawVar.a = i2;
        byte b = ckawVar.e;
        ckawVar.b = i3;
        ckawVar.e = (byte) (b | 3);
        ckawVar.d(byzl.UNKNOWN);
        ckawVar.b(-2);
        ckawVar.f = 1;
        return ckawVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract Uri d();

    public abstract byzl e();

    public abstract ckbw f();

    public abstract eqxi g();

    public abstract Optional h();

    public abstract int i();

    public final ckbx k(Uri uri) {
        ckbw f = f();
        ((ckaw) f).c = uri;
        return f.a();
    }

    public final ckbx l(byzl byzlVar) {
        ckbw f = f();
        f.d(byzlVar);
        return f.a();
    }
}
