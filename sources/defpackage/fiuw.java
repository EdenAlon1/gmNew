package defpackage;

import java.io.DataInput;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiuw {
    final fiuu a;
    final String b;
    final int c;

    public fiuw(fiuu fiuuVar, String str, int i) {
        this.a = fiuuVar;
        this.b = str;
        this.c = i;
    }

    static fiuw c(DataInput dataInput) {
        return new fiuw(new fiuu((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) fiux.a(dataInput)), dataInput.readUTF(), (int) fiux.a(dataInput));
    }

    public final long a(long j, int i, int i2) {
        fiuu fiuuVar = this.a;
        char c = fiuuVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        fist fistVar = fist.o;
        long a = fiuuVar.a(fistVar, fistVar.i.e(fistVar.i.h(fistVar.m.h(j3, fiuuVar.b), 0), Math.min(fiuuVar.f, 86399999)));
        if (fiuuVar.d != 0) {
            a = fiuuVar.c(fistVar, a);
            if (a <= j3) {
                a = fiuuVar.c(fistVar, fiuuVar.a(fistVar, fistVar.m.h(fistVar.n.e(a, 1), fiuuVar.b)));
            }
        } else if (a <= j3) {
            a = fiuuVar.a(fistVar, fistVar.n.e(a, 1));
        }
        return fistVar.i.e(fistVar.i.h(a, 0), fiuuVar.f) - j2;
    }

    public final long b(long j, int i, int i2) {
        fiuu fiuuVar = this.a;
        char c = fiuuVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        fist fistVar = fist.o;
        long b = fiuuVar.b(fistVar, fistVar.i.e(fistVar.i.h(fistVar.m.h(j3, fiuuVar.b), 0), fiuuVar.f));
        if (fiuuVar.d != 0) {
            b = fiuuVar.c(fistVar, b);
            if (b >= j3) {
                b = fiuuVar.c(fistVar, fiuuVar.b(fistVar, fistVar.m.h(fistVar.n.e(b, -1), fiuuVar.b)));
            }
        } else if (b >= j3) {
            b = fiuuVar.b(fistVar, fistVar.n.e(b, -1));
        }
        return fistVar.i.e(fistVar.i.h(b, 0), fiuuVar.f) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fiuw) {
            fiuw fiuwVar = (fiuw) obj;
            if (this.c == fiuwVar.c && this.b.equals(fiuwVar.b) && this.a.equals(fiuwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
