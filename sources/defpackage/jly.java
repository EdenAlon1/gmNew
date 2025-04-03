package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jly extends ffkk implements ffji {
    final /* synthetic */ icv a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jly(icv icvVar, int i, int i2) {
        super(1);
        this.a = icvVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jmg jmgVar = (jmg) obj;
        jmf jmfVar = jmgVar.a;
        int e = jmgVar.e(this.b);
        int e2 = jmgVar.e(this.c);
        if (e < 0 || e > e2 || e2 > ((jlf) jmfVar).c.length()) {
            jwo.b("start(" + e + ") or end(" + e2 + ") is out of range [0.." + ((jlf) jmfVar).c.length() + "], or start > end!");
        }
        Path path = new Path();
        jqh jqhVar = ((jlf) jmfVar).b;
        jqhVar.e.getSelectionPath(e, e2, path);
        if (jqhVar.g != 0 && !path.isEmpty()) {
            path.offset(0.0f, jqhVar.g);
        }
        icv icvVar = this.a;
        ibc ibcVar = new ibc(path);
        float f = jmgVar.f;
        ibcVar.n((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        icvVar.q(ibcVar);
        return ffcu.a;
    }
}
