package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ido extends ide {
    private final List b;
    private final long a = 9205357640488583168L;
    private final List c = null;

    public ido(List list) {
        this.b = list;
    }

    @Override // defpackage.ide
    public final Shader b(long j) {
        List list = this.b;
        long b = ias.b(j);
        ibh.a(list, null);
        return new SweepGradient(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (4294967295L & b)), ibh.b(list), (float[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ido)) {
            return false;
        }
        ido idoVar = (ido) obj;
        long j = idoVar.a;
        if (!iak.i(9205357640488583168L, 9205357640488583168L) || !ffkj.e(this.b, idoVar.b)) {
            return false;
        }
        List list = idoVar.c;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((iaj.a(9205357640488583168L) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.b + ", stops=null)";
    }
}
