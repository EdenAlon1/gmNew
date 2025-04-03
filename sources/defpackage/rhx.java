package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rhx implements Cloneable {
    private int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Drawable o;
    public int p;
    public Resources.Theme t;
    public boolean u;
    public boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float b = 1.0f;
    public qvx c = qvx.e;
    public qqe d = qqe.NORMAL;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public qtp l = rjl.b;
    public boolean n = true;
    public qtu q = new qtu();
    public Map r = new rjs();
    public Class s = Object.class;
    public boolean v = true;

    private final rhx a(rdi rdiVar, qty qtyVar) {
        return c(rdiVar, qtyVar, false);
    }

    private final rhx b(rdi rdiVar, qty qtyVar) {
        return c(rdiVar, qtyVar, true);
    }

    private final rhx c(rdi rdiVar, qty qtyVar, boolean z) {
        rhx ab = z ? ab(rdiVar, qtyVar) : O(rdiVar, qtyVar);
        ab.v = true;
        return ab;
    }

    private static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }

    public rhx A() {
        return ab(rdi.d, new rcv());
    }

    public rhx B(Class cls) {
        if (this.u) {
            return clone().B(cls);
        }
        rkf.f(cls);
        this.s = cls;
        this.a |= 4096;
        ah();
        return this;
    }

    public rhx C() {
        return V(rdl.d, false);
    }

    public rhx D(qvx qvxVar) {
        if (this.u) {
            return clone().D(qvxVar);
        }
        rkf.f(qvxVar);
        this.c = qvxVar;
        this.a |= 4;
        ah();
        return this;
    }

    public rhx E() {
        if (this.u) {
            return clone().E();
        }
        this.r.clear();
        int i = this.a;
        this.m = false;
        this.n = false;
        this.a = (i & (-133121)) | 65536;
        this.v = true;
        ah();
        return this;
    }

    public rhx F(rdi rdiVar) {
        qtt qttVar = rdi.h;
        rkf.f(rdiVar);
        return V(qttVar, rdiVar);
    }

    public rhx G(int i) {
        if (this.u) {
            return clone().G(i);
        }
        this.f = i;
        int i2 = this.a | 32;
        this.e = null;
        this.a = i2 & (-17);
        ah();
        return this;
    }

    public rhx H(Drawable drawable) {
        if (this.u) {
            return clone().H(drawable);
        }
        this.e = drawable;
        int i = this.a | 16;
        this.f = 0;
        this.a = i & (-33);
        ah();
        return this;
    }

    public rhx I(Drawable drawable) {
        if (this.u) {
            return clone().I(drawable);
        }
        this.o = drawable;
        int i = this.a | 8192;
        this.p = 0;
        this.a = i & (-16385);
        ah();
        return this;
    }

    public rhx J() {
        return b(rdi.c, new rdq());
    }

    public rhx K(long j) {
        return V(rev.a, Long.valueOf(j));
    }

    public rhx L() {
        return O(rdi.e, new rct());
    }

    public rhx M() {
        return a(rdi.d, new rcu());
    }

    public rhx N() {
        return a(rdi.c, new rdq());
    }

    final rhx O(rdi rdiVar, qty qtyVar) {
        if (this.u) {
            return clone().O(rdiVar, qtyVar);
        }
        F(rdiVar);
        return aa(qtyVar, false);
    }

    public rhx P(int i) {
        return Q(i, i);
    }

    public rhx Q(int i, int i2) {
        if (this.u) {
            return clone().Q(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        ah();
        return this;
    }

    public rhx R(int i) {
        if (this.u) {
            return clone().R(i);
        }
        this.h = i;
        int i2 = this.a | 128;
        this.g = null;
        this.a = i2 & (-65);
        ah();
        return this;
    }

    public rhx S(Drawable drawable) {
        if (this.u) {
            return clone().S(drawable);
        }
        this.g = drawable;
        int i = this.a | 64;
        this.h = 0;
        this.a = i & (-129);
        ah();
        return this;
    }

    public rhx T(qqe qqeVar) {
        if (this.u) {
            return clone().T(qqeVar);
        }
        rkf.f(qqeVar);
        this.d = qqeVar;
        this.a |= 8;
        ah();
        return this;
    }

    final rhx U(qtt qttVar) {
        if (this.u) {
            return clone().U(qttVar);
        }
        this.q.b.remove(qttVar);
        ah();
        return this;
    }

    public rhx V(qtt qttVar, Object obj) {
        if (this.u) {
            return clone().V(qttVar, obj);
        }
        rkf.f(qttVar);
        rkf.f(obj);
        this.q.d(qttVar, obj);
        ah();
        return this;
    }

    public rhx W(qtp qtpVar) {
        if (this.u) {
            return clone().W(qtpVar);
        }
        rkf.f(qtpVar);
        this.l = qtpVar;
        this.a |= 1024;
        ah();
        return this;
    }

    public rhx X(Resources.Theme theme) {
        if (this.u) {
            return clone().X(theme);
        }
        this.t = theme;
        if (theme != null) {
            this.a |= 32768;
            return V(rfh.a, theme);
        }
        this.a &= -32769;
        return U(rfh.a);
    }

    public rhx Y(qty qtyVar) {
        return aa(qtyVar, true);
    }

    public rhx Z(qty... qtyVarArr) {
        int length = qtyVarArr.length;
        if (length > 1) {
            return aa(new qtq(qtyVarArr), true);
        }
        if (length == 1) {
            return Y(qtyVarArr[0]);
        }
        ah();
        return this;
    }

    final rhx aa(qty qtyVar, boolean z) {
        if (this.u) {
            return clone().aa(qtyVar, z);
        }
        rdo rdoVar = new rdo(qtyVar, z);
        ac(Bitmap.class, qtyVar, z);
        ac(Drawable.class, rdoVar, z);
        ac(BitmapDrawable.class, rdoVar, z);
        ac(rfp.class, new rfs(qtyVar), z);
        ah();
        return this;
    }

    final rhx ab(rdi rdiVar, qty qtyVar) {
        if (this.u) {
            return clone().ab(rdiVar, qtyVar);
        }
        F(rdiVar);
        return Y(qtyVar);
    }

    final rhx ac(Class cls, qty qtyVar, boolean z) {
        if (this.u) {
            return clone().ac(cls, qtyVar, z);
        }
        rkf.f(cls);
        rkf.f(qtyVar);
        this.r.put(cls, qtyVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.v = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        ah();
        return this;
    }

    public final boolean ad(int i) {
        return d(this.a, i);
    }

    public final boolean ae() {
        return rkh.p(this.k, this.j);
    }

    public rhx af() {
        if (this.u) {
            return clone().af();
        }
        this.z = false;
        this.a |= 524288;
        ah();
        return this;
    }

    public rhx ag() {
        if (this.u) {
            return clone().ag();
        }
        this.w = true;
        this.a |= 1048576;
        ah();
        return this;
    }

    protected final void ah() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public rhx ai() {
        if (this.u) {
            return clone().ai();
        }
        this.i = false;
        this.a |= 256;
        ah();
        return this;
    }

    public void aj() {
        this.x = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof rhx) {
            rhx rhxVar = (rhx) obj;
            if (Float.compare(rhxVar.b, this.b) == 0 && this.f == rhxVar.f && rkh.l(this.e, rhxVar.e) && this.h == rhxVar.h && rkh.l(this.g, rhxVar.g)) {
                int i = rhxVar.p;
                if (rkh.l(this.o, rhxVar.o) && this.i == rhxVar.i && this.j == rhxVar.j && this.k == rhxVar.k && this.m == rhxVar.m && this.n == rhxVar.n) {
                    boolean z = rhxVar.y;
                    boolean z2 = rhxVar.z;
                    if (this.c.equals(rhxVar.c) && this.d == rhxVar.d && this.q.equals(rhxVar.q) && this.r.equals(rhxVar.r) && this.s.equals(rhxVar.s) && rkh.l(this.l, rhxVar.l) && rkh.l(this.t, rhxVar.t)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        float f = this.b;
        char[] cArr = rkh.a;
        return rkh.f(this.t, rkh.f(this.l, rkh.f(this.s, rkh.f(this.r, rkh.f(this.q, rkh.f(this.d, rkh.f(this.c, rkh.e(0, rkh.e(0, rkh.e(this.n ? 1 : 0, rkh.e(this.m ? 1 : 0, rkh.e(this.k, rkh.e(this.j, rkh.e(this.i ? 1 : 0, rkh.f(this.o, rkh.e(0, rkh.f(this.g, rkh.e(this.h, rkh.f(this.e, rkh.e(this.f, rkh.e(Float.floatToIntBits(f), 17)))))))))))))))))))));
    }

    public rhx q(rhx rhxVar) {
        if (this.u) {
            return clone().q(rhxVar);
        }
        int i = rhxVar.a;
        if (d(i, 2)) {
            this.b = rhxVar.b;
        }
        if (d(i, 262144)) {
            boolean z = rhxVar.y;
            this.y = false;
        }
        if (d(i, 1048576)) {
            this.w = rhxVar.w;
        }
        if (d(i, 4)) {
            this.c = rhxVar.c;
        }
        if (d(i, 8)) {
            this.d = rhxVar.d;
        }
        if (d(i, 16)) {
            this.e = rhxVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (d(rhxVar.a, 32)) {
            this.f = rhxVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (d(rhxVar.a, 64)) {
            this.g = rhxVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (d(rhxVar.a, 128)) {
            this.h = rhxVar.h;
            this.g = null;
            this.a &= -65;
        }
        int i2 = rhxVar.a;
        if (d(i2, 256)) {
            this.i = rhxVar.i;
        }
        if (d(i2, 512)) {
            this.k = rhxVar.k;
            this.j = rhxVar.j;
        }
        if (d(i2, 1024)) {
            this.l = rhxVar.l;
        }
        if (d(i2, 4096)) {
            this.s = rhxVar.s;
        }
        if (d(i2, 8192)) {
            this.o = rhxVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (d(rhxVar.a, 16384)) {
            int i3 = rhxVar.p;
            this.p = 0;
            this.o = null;
            this.a &= -8193;
        }
        int i4 = rhxVar.a;
        if (d(i4, 32768)) {
            this.t = rhxVar.t;
        }
        if (d(i4, 65536)) {
            this.n = rhxVar.n;
        }
        if (d(i4, 131072)) {
            this.m = rhxVar.m;
        }
        if (d(i4, 2048)) {
            this.r.putAll(rhxVar.r);
            this.v = rhxVar.v;
        }
        if (d(rhxVar.a, 524288)) {
            boolean z2 = rhxVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.r.clear();
            int i5 = this.a;
            this.m = false;
            this.a = i5 & (-133121);
            this.v = true;
        }
        this.a |= rhxVar.a;
        this.q.c(rhxVar.q);
        ah();
        return this;
    }

    @Override // 
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public rhx clone() {
        try {
            rhx rhxVar = (rhx) super.clone();
            qtu qtuVar = new qtu();
            rhxVar.q = qtuVar;
            qtuVar.c(this.q);
            rjs rjsVar = new rjs();
            rhxVar.r = rjsVar;
            rjsVar.putAll(this.r);
            rhxVar.x = false;
            rhxVar.u = false;
            return rhxVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public rhx x() {
        if (this.x && !this.u) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.u = true;
        aj();
        return this;
    }

    public rhx y() {
        return ab(rdi.e, new rct());
    }

    public rhx z() {
        return b(rdi.d, new rcu());
    }
}
