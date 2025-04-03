package defpackage;

import android.os.Bundle;
import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyv {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public Long e;
    public int f;
    public Bundle g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public int o;

    public final SetAsterismConsentRequest a() {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("Invalid AsterismClient.");
        }
        if (i3 != 2 && ((i2 = this.o) == 1 || i2 == 2 || i2 == 3 || i2 == 5)) {
            throw new IllegalStateException("Invalid AsterismClient or ConsentVersion - RCS-only ConsentVersion is only for RCS.");
        }
        int i4 = this.o;
        if ((i3 != 2 || (i4 != 2 && i4 != 3 && i4 != 5)) && (i = this.c) != 1 && i != 2) {
            throw new IllegalStateException("Invalid FlowContext.");
        }
        int i5 = this.f;
        if (i5 != 1 && i5 != 2) {
            throw new IllegalStateException("Invalid ConsentValue.");
        }
        int i6 = this.h;
        return new SetAsterismConsentRequest(this.a, i3, this.c, this.d, this.e, i5, this.g, (i6 == 0 || i6 == 1 || i6 == 2) ? i6 : 3, this.i, this.j, this.k, null, null, this.l, this.m, this.n, i4, 0, 0);
    }
}
