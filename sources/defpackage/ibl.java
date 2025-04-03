package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibl extends ibx {
    public final int a;
    private final long c;

    public ibl(long j, int i) {
        super(Build.VERSION.SDK_INT >= 29 ? new BlendModeColorFilter(iby.b(j), iat.a(i)) : new PorterDuffColorFilter(iby.b(j), iat.b(i)));
        this.c = j;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibl)) {
            return false;
        }
        long j = this.c;
        ibl iblVar = (ibl) obj;
        long j2 = iblVar.c;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ibk.b(this.a, iblVar.a);
    }

    public final int hashCode() {
        long j = ibw.a;
        return (ffco.a(this.c) * 31) + this.a;
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) ibw.g(this.c)) + ", blendMode=" + ((Object) ibk.a(this.a)) + ')';
    }
}
