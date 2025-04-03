package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgj implements hjk {
    public final kgc a;
    public Handler b;
    public final hte c = new hte(new kgh(this));
    public boolean d = true;
    public final ffji e = new kgi(this);
    public final List f = new ArrayList();

    public kgj(kgc kgcVar) {
        this.a = kgcVar;
    }

    public final void a() {
        this.d = true;
    }

    @Override // defpackage.hjk
    public final void h() {
        this.c.e();
        this.c.a();
    }

    @Override // defpackage.hjk
    public final void i() {
        this.c.d();
    }

    @Override // defpackage.hjk
    public final void g() {
    }
}
