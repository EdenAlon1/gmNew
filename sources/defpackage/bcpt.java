package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bcpt extends bcpu {
    private static final AtomicLong a = new AtomicLong(System.currentTimeMillis() * 1000);
    private String b;
    private bcpr c;
    private boolean d;

    @Override // defpackage.bcpu
    public final bcpr a() {
        bcpr bcprVar;
        if (!g() || (bcprVar = this.c) == null) {
            throw new IllegalStateException(String.format("isBound=%s data==null=%s when getData()", Boolean.valueOf(g()), Boolean.valueOf(this.c == null)));
        }
        return bcprVar;
    }

    @Override // defpackage.bcpu
    public final String b() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("not bound when getBindingId");
    }

    public void c(bcpr bcprVar) {
        if (this.c != null || bcprVar.i()) {
            throw new IllegalStateException("already bound when binding to ".concat(bcprVar.toString()));
        }
        String hexString = Long.toHexString(a.getAndIncrement());
        this.b = hexString;
        this.c = bcprVar;
        bcprVar.ga(hexString);
        this.d = true;
    }

    @Override // defpackage.bcpu
    public final void d() {
        if (g()) {
            return;
        }
        throw new IllegalStateException("not bound; wasBound = " + this.d);
    }

    @Override // defpackage.bcpu
    public final void e(bcpr bcprVar) {
        if (!g()) {
            throw new IllegalStateException("not bound; wasBound = " + this.d);
        }
        if (bcprVar == this.c) {
            return;
        }
        throw new IllegalStateException("not bound to correct data " + bcprVar.toString() + " vs " + String.valueOf(this.c));
    }

    public final void f() {
        String str;
        bcpr bcprVar = this.c;
        if (bcprVar == null || (str = this.b) == null || !bcprVar.j(str)) {
            throw new IllegalStateException("not bound when unbind");
        }
        this.c.g(this.b);
        this.c = null;
        this.b = null;
    }

    @Override // defpackage.bcpu
    public final boolean g() {
        String str;
        bcpr bcprVar = this.c;
        return (bcprVar == null || (str = this.b) == null || !bcprVar.j(str)) ? false : true;
    }
}
