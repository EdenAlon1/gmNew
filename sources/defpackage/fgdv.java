package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgdv {
    private int a;
    private fgfo b;
    public fgdx[] d;
    public int e;

    public final fgdj b() {
        fgfo fgfoVar;
        synchronized (this) {
            fgfoVar = this.b;
            if (fgfoVar == null) {
                fgfoVar = new fgfo(this.e);
                this.b = fgfoVar;
            }
        }
        return fgfoVar;
    }

    protected abstract fgdx j();

    protected abstract fgdx[] m();

    protected final fgdx n() {
        fgdx fgdxVar;
        fgfo fgfoVar;
        synchronized (this) {
            fgdx[] fgdxVarArr = this.d;
            if (fgdxVarArr == null) {
                fgdxVarArr = m();
                this.d = fgdxVarArr;
            } else {
                int i = this.e;
                int length = fgdxVarArr.length;
                if (i >= length) {
                    Object[] copyOf = Arrays.copyOf(fgdxVarArr, length + length);
                    copyOf.getClass();
                    fgdxVarArr = (fgdx[]) copyOf;
                    this.d = fgdxVarArr;
                }
            }
            int i2 = this.a;
            do {
                fgdxVar = fgdxVarArr[i2];
                if (fgdxVar == null) {
                    fgdxVar = j();
                    fgdxVarArr[i2] = fgdxVar;
                }
                i2++;
                if (i2 >= fgdxVarArr.length) {
                    i2 = 0;
                }
            } while (!fgdxVar.a(this));
            this.a = i2;
            this.e++;
            fgfoVar = this.b;
        }
        if (fgfoVar != null) {
            fgfoVar.p(1);
        }
        return fgdxVar;
    }

    protected final void o(fgdx fgdxVar) {
        fgfo fgfoVar;
        int i;
        ffgu[] b;
        synchronized (this) {
            int i2 = this.e - 1;
            this.e = i2;
            fgfoVar = this.b;
            if (i2 == 0) {
                this.a = 0;
            }
            fgdxVar.getClass();
            b = fgdxVar.b(this);
        }
        for (ffgu ffguVar : b) {
            if (ffguVar != null) {
                ffguVar.w(ffcu.a);
            }
        }
        if (fgfoVar != null) {
            fgfoVar.p(-1);
        }
    }
}
