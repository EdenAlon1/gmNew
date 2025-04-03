package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxt {
    private int a;
    private int b;
    private int c;
    private mxn[] d;

    public mxt() {
        lti.a(true);
        lti.a(true);
        this.c = 0;
        this.d = new mxn[100];
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized mxn b() {
        mxn mxnVar;
        this.b++;
        int i = this.c;
        if (i > 0) {
            mxn[] mxnVarArr = this.d;
            int i2 = i - 1;
            this.c = i2;
            mxnVar = mxnVarArr[i2];
            lti.f(mxnVar);
            this.d[this.c] = null;
        } else {
            mxnVar = new mxn(new byte[65536]);
            int i3 = this.b;
            mxn[] mxnVarArr2 = this.d;
            int length = mxnVarArr2.length;
            if (i3 > length) {
                this.d = (mxn[]) Arrays.copyOf(mxnVarArr2, length + length);
                return mxnVar;
            }
        }
        return mxnVar;
    }

    public final synchronized void c(mxn mxnVar) {
        mxn[] mxnVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        mxnVarArr[i] = mxnVar;
        this.b--;
        notifyAll();
    }

    public final synchronized void d() {
        e(0);
    }

    public final synchronized void e(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            f();
        }
    }

    public final synchronized void f() {
        int max = Math.max(0, lvf.c(this.a, 65536) - this.b);
        int i = this.c;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.d, max, i, (Object) null);
        this.c = max;
    }

    public final synchronized void g(muv muvVar) {
        while (muvVar != null) {
            mxn[] mxnVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            mxn mxnVar = muvVar.c;
            lti.f(mxnVar);
            mxnVarArr[i] = mxnVar;
            this.b--;
            muvVar = muvVar.d;
            if (muvVar == null || muvVar.c == null) {
                muvVar = null;
            }
        }
        notifyAll();
    }
}
