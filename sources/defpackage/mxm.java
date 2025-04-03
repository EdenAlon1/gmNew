package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxm {
    public final int a;
    public final mik[] b;
    public final mxf[] c;
    public final lsb d;
    public final Object e;

    public mxm(mik[] mikVarArr, mxf[] mxfVarArr, lsb lsbVar, Object obj) {
        int length = mikVarArr.length;
        lti.a(length == mxfVarArr.length);
        this.b = mikVarArr;
        this.c = (mxf[]) mxfVarArr.clone();
        this.d = lsbVar;
        this.e = obj;
        this.a = length;
    }

    public final boolean a(mxm mxmVar, int i) {
        if (mxmVar == null) {
            return false;
        }
        mik mikVar = this.b[i];
        mik mikVar2 = mxmVar.b[i];
        int i2 = lvf.a;
        return Objects.equals(mikVar, mikVar2) && Objects.equals(this.c[i], mxmVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
