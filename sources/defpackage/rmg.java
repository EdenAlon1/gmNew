package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rmg implements Cloneable {
    public Float A;
    public rmq B;
    public Float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public long a = 0;
    public rmq b;
    public Float c;
    public rmq d;
    public Float e;
    public rlr f;
    public Float g;
    public rlr[] h;
    public rlr i;
    public Float j;
    public rli k;
    public List l;
    public rlr m;
    public Integer n;
    public Boolean o;
    public rlf p;
    public String q;
    public String r;
    public String s;
    public Boolean t;
    public Boolean u;
    public rmq v;
    public Float w;
    public String x;
    public String y;
    public rmq z;

    protected rmg() {
    }

    public static rmg a() {
        rmg rmgVar = new rmg();
        rmgVar.a = -1L;
        rmgVar.b = rli.a;
        rmgVar.D = 1;
        Float valueOf = Float.valueOf(1.0f);
        rmgVar.c = valueOf;
        rmgVar.d = null;
        rmgVar.e = valueOf;
        rmgVar.f = new rlr(1.0f);
        rmgVar.E = 1;
        rmgVar.F = 1;
        rmgVar.g = Float.valueOf(4.0f);
        rmgVar.h = null;
        rmgVar.i = new rlr(0.0f);
        rmgVar.j = valueOf;
        rmgVar.k = rli.a;
        rmgVar.l = null;
        rmgVar.m = new rlr(12.0f, 7);
        rmgVar.n = 400;
        rmgVar.G = 1;
        rmgVar.H = 1;
        rmgVar.I = 1;
        rmgVar.J = 1;
        rmgVar.o = true;
        rmgVar.p = null;
        rmgVar.q = null;
        rmgVar.r = null;
        rmgVar.s = null;
        rmgVar.t = Boolean.TRUE;
        rmgVar.u = Boolean.TRUE;
        rmgVar.v = rli.a;
        rmgVar.w = valueOf;
        rmgVar.x = null;
        rmgVar.K = 1;
        rmgVar.y = null;
        rmgVar.z = null;
        rmgVar.A = valueOf;
        rmgVar.B = null;
        rmgVar.C = valueOf;
        rmgVar.L = 1;
        return rmgVar;
    }

    protected final Object clone() {
        try {
            rmg rmgVar = (rmg) super.clone();
            rlr[] rlrVarArr = this.h;
            if (rlrVarArr != null) {
                rmgVar.h = (rlr[]) rlrVarArr.clone();
            }
            return rmgVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
