package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlv {
    public static final mlv a;
    public final int b;
    public final int c;
    public final enip d;

    static {
        mlv mlvVar;
        if (lvf.a >= 33) {
            enin eninVar = new enin();
            for (int i = 1; i <= 10; i++) {
                eninVar.c(Integer.valueOf(lvf.h(i)));
            }
            mlvVar = new mlv(2, eninVar.g());
        } else {
            mlvVar = new mlv(2, 10);
        }
        a = mlvVar;
    }

    public mlv(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlv)) {
            return false;
        }
        mlv mlvVar = (mlv) obj;
        if (this.b == mlvVar.b && this.c == mlvVar.c) {
            enip enipVar = this.d;
            enip enipVar2 = mlvVar.d;
            int i = lvf.a;
            if (Objects.equals(enipVar, enipVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        enip enipVar = this.d;
        return (((this.b * 31) + this.c) * 31) + (enipVar == null ? 0 : enipVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + String.valueOf(this.d) + "]";
    }

    public mlv(int i, Set set) {
        this.b = i;
        enip o = enip.o(set);
        this.d = o;
        enqu listIterator = o.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) listIterator.next()).intValue()));
        }
        this.c = i2;
    }
}
