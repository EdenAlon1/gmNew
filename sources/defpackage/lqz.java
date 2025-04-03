package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqz {
    public static final lqz a = new lqz(new lqy());
    public final Integer A;
    public final engw B;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    @Deprecated
    public final Integer k;
    public final Boolean l;

    @Deprecated
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final CharSequence t;
    public final CharSequence u;
    public final CharSequence v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
        lvf.N(8);
        lvf.N(9);
        lvf.N(10);
        lvf.N(11);
        lvf.N(12);
        lvf.N(13);
        lvf.N(14);
        lvf.N(15);
        lvf.N(16);
        lvf.N(17);
        lvf.N(18);
        lvf.N(19);
        lvf.N(20);
        lvf.N(21);
        lvf.N(22);
        lvf.N(23);
        lvf.N(24);
        lvf.N(25);
        lvf.N(26);
        lvf.N(27);
        lvf.N(28);
        lvf.N(29);
        lvf.N(30);
        lvf.N(31);
        lvf.N(32);
        lvf.N(33);
        lvf.N(34);
        lvf.N(1000);
    }

    public lqz(lqy lqyVar) {
        Boolean bool = lqyVar.k;
        Integer num = lqyVar.j;
        Integer num2 = lqyVar.y;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            bool.getClass();
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        } else {
            num = null;
        }
        this.b = lqyVar.a;
        this.c = lqyVar.b;
        this.d = lqyVar.c;
        this.e = lqyVar.d;
        this.f = lqyVar.e;
        this.g = lqyVar.f;
        this.h = lqyVar.g;
        this.i = lqyVar.h;
        this.j = lqyVar.i;
        this.k = num;
        this.l = bool;
        Integer num3 = lqyVar.l;
        this.m = num3;
        this.n = num3;
        this.o = lqyVar.m;
        this.p = lqyVar.n;
        this.q = lqyVar.o;
        this.r = lqyVar.p;
        this.s = lqyVar.q;
        this.t = lqyVar.r;
        this.u = lqyVar.s;
        this.v = lqyVar.t;
        this.w = lqyVar.u;
        this.x = lqyVar.v;
        this.y = lqyVar.w;
        this.z = lqyVar.x;
        this.A = num2;
        this.B = lqyVar.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lqz lqzVar = (lqz) obj;
            CharSequence charSequence = this.b;
            CharSequence charSequence2 = lqzVar.b;
            int i = lvf.a;
            if (Objects.equals(charSequence, charSequence2) && Objects.equals(this.c, lqzVar.c) && Objects.equals(this.d, lqzVar.d) && Objects.equals(this.e, lqzVar.e) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(this.f, lqzVar.f) && Objects.equals(null, null) && Objects.equals(null, null) && Objects.equals(null, null) && Arrays.equals(this.g, lqzVar.g) && Objects.equals(this.h, lqzVar.h) && Objects.equals(null, null) && Objects.equals(this.i, lqzVar.i) && Objects.equals(this.j, lqzVar.j) && Objects.equals(this.k, lqzVar.k) && Objects.equals(this.l, lqzVar.l) && Objects.equals(null, null) && Objects.equals(this.n, lqzVar.n) && Objects.equals(this.o, lqzVar.o) && Objects.equals(this.p, lqzVar.p) && Objects.equals(this.q, lqzVar.q) && Objects.equals(this.r, lqzVar.r) && Objects.equals(this.s, lqzVar.s) && Objects.equals(this.t, lqzVar.t) && Objects.equals(this.u, lqzVar.u) && Objects.equals(this.v, lqzVar.v) && Objects.equals(this.w, lqzVar.w) && Objects.equals(this.x, lqzVar.x) && Objects.equals(this.y, lqzVar.y) && Objects.equals(null, null) && Objects.equals(this.z, lqzVar.z) && Objects.equals(this.A, lqzVar.A) && Objects.equals(this.B, lqzVar.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, this.k, this.l, null, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, null, this.z, this.A, true, this.B});
    }
}
