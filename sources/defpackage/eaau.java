package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaau implements dzyb {
    public static final enhk a = enhk.o("tel", 1, "mailto", 2, "http", 3, "https", 3);
    public final dzhn b;
    public final Set c = new HashSet();
    public final engw d;
    private final dzpt e;
    private final dzja f;

    public eaau(dzpt dzptVar, dzja dzjaVar, dzhn dzhnVar) {
        new HashSet();
        int i = engw.d;
        this.d = enou.a;
        this.e = dzptVar;
        this.f = dzjaVar;
        this.b = dzhnVar;
    }

    @Override // defpackage.dzyb
    public final void a() {
        d(124);
    }

    public final dzhl b(int i) {
        dzhl r = dzhm.r();
        r.g(i);
        r.n(this.f.c().f());
        r.o(this.f.d().E());
        r.d(this.e);
        return r;
    }

    public final void c(int i) {
        this.b.b(b(i).a());
    }

    public final void d(int i) {
        this.b.b(b(i).a());
    }
}
