package defpackage;

import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ide extends ibq {
    private Shader a;
    private long b = 9205357640488583168L;

    @Override // defpackage.ibq
    public final void a(long j, ict ictVar, float f) {
        Shader shader = this.a;
        if (shader == null || !iar.f(this.b, j)) {
            if (iar.g(j)) {
                shader = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shader = b(j);
                this.a = shader;
                this.b = j;
            }
        }
        long g = ictVar.g();
        long j2 = ibw.a;
        if (!ffcp.a(g, j2)) {
            ictVar.k(j2);
        }
        if (!ffkj.e(((iba) ictVar).c, shader)) {
            ictVar.n(shader);
        }
        if (ictVar.a() == f) {
            return;
        }
        ictVar.i(f);
    }

    public abstract Shader b(long j);
}
