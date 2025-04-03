package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyp {
    public final ffix a;
    public final ffix b;
    public final coq c;
    public final coq d;
    public boolean e;
    private final ffji f;

    public hyp(ffji ffjiVar, ffix ffixVar, ffix ffixVar2) {
        this.f = ffjiVar;
        this.a = ffixVar;
        this.b = ffixVar2;
        int i = cpj.a;
        this.c = new coq((byte[]) null);
        this.d = new coq((byte[]) null);
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public final void a(coq coqVar, Object obj) {
        if (coqVar.g(obj)) {
            b();
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.f.invoke(new hyo(this));
        this.e = true;
    }
}
