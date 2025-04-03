package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fay {
    public jzn a;
    public jpg b;
    private jlm c;
    private jpo d;
    private jse e;
    private int f;
    private boolean g;
    private int h;
    private List i;
    private jmc k;
    private kah l;
    private long j = faw.a;
    private int m = -1;
    private int n = -1;

    public /* synthetic */ fay(jlm jlmVar, jpo jpoVar, jse jseVar, int i, boolean z, int i2, List list) {
        this.c = jlmVar;
        this.d = jpoVar;
        this.e = jseVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = list;
    }

    static /* synthetic */ jlz f(fay fayVar, long j, kah kahVar) {
        int i = fayVar.f;
        jmc b = fayVar.b(kahVar);
        return new jlz(b, fax.b(j, fayVar.g, i, b.a()), fax.a(fayVar.g, i, fayVar.h), i);
    }

    private final void h() {
        this.k = null;
        this.b = null;
        this.n = -1;
        this.m = -1;
    }

    public final int a(int i, kah kahVar) {
        int i2 = this.m;
        int i3 = this.n;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long d = jzl.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        float f = f(this, d, kahVar).e;
        int f2 = ffmk.f(evx.a(f), jzk.c(d));
        this.m = i;
        this.n = f2;
        return f2;
    }

    public final jmc b(kah kahVar) {
        jmc jmcVar = this.k;
        if (jmcVar == null || kahVar != this.l || jmcVar.c()) {
            this.l = kahVar;
            jlm jlmVar = this.c;
            jpo b = jpp.b(this.d, kahVar);
            jzn jznVar = this.a;
            jznVar.getClass();
            jse jseVar = this.e;
            List list = this.i;
            if (list == null) {
                list = ffel.a;
            }
            jmcVar = new jmc(jlmVar, b, list, jznVar, jseVar);
        }
        this.k = jmcVar;
        return jmcVar;
    }

    public final jpg c() {
        jpg jpgVar = this.b;
        if (jpgVar != null) {
            return jpgVar;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final jpg d(kah kahVar, long j, jlz jlzVar) {
        float min = Math.min(jlzVar.a.a(), jlzVar.d);
        jlm jlmVar = this.c;
        jpo jpoVar = this.d;
        List list = this.i;
        if (list == null) {
            list = ffel.a;
        }
        int i = this.h;
        boolean z = this.g;
        int i2 = this.f;
        jzn jznVar = this.a;
        jznVar.getClass();
        return new jpg(new jpf(jlmVar, jpoVar, list, i, z, i2, jznVar, kahVar, this.e, j), jlzVar, jzl.e(j, (evx.a(min) << 32) | (evx.a(jlzVar.e) & 4294967295L)));
    }

    public final void e(jzn jznVar) {
        jzn jznVar2 = this.a;
        long a = jznVar != null ? faw.a(jznVar) : faw.a;
        if (jznVar2 == null) {
            this.a = jznVar;
            this.j = a;
        } else if (jznVar == null || !faw.c(this.j, a)) {
            this.a = jznVar;
            this.j = a;
            h();
        }
    }

    public final void g(jlm jlmVar, jpo jpoVar, jse jseVar, int i, boolean z, int i2, List list) {
        this.c = jlmVar;
        this.d = jpoVar;
        this.e = jseVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = list;
        h();
    }
}
