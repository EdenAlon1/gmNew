package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethw extends etgr {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final ethv d;

    public ethw(int i, ethv ethvVar) {
        this.a = i;
        this.d = ethvVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != ethv.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ethw)) {
            return false;
        }
        ethw ethwVar = (ethw) obj;
        if (ethwVar.a == this.a) {
            int i = ethwVar.b;
            int i2 = ethwVar.c;
            if (ethwVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ethw.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
