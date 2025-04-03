package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiw implements qil {
    public final Path.FillType a;
    public final String b;
    public final qhv c;
    public final qhy d;
    public final boolean e;
    private final boolean f;

    public qiw(String str, boolean z, Path.FillType fillType, qhv qhvVar, qhy qhyVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = qhvVar;
        this.d = qhyVar;
        this.e = z2;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qdy(qdbVar, qjeVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}
