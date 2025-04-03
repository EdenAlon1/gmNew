package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzc implements Comparable {
    public final nzh a;
    public final Bundle b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final int f;

    public nzc(nzh nzhVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.a = nzhVar;
        this.b = bundle;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(nzc nzcVar) {
        nzcVar.getClass();
        if (this.c) {
            if (!nzcVar.c) {
                return 1;
            }
        } else if (nzcVar.c) {
            return -1;
        }
        int i = this.d - nzcVar.d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = this.b;
        if (bundle != null && nzcVar.b == null) {
            return 1;
        }
        if (bundle == null && nzcVar.b != null) {
            return -1;
        }
        if (bundle != null) {
            Bundle bundle2 = nzcVar.b;
            int size = bundle.size();
            bundle2.getClass();
            int size2 = size - bundle2.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        if (this.e) {
            if (!nzcVar.e) {
                return 1;
            }
        } else if (nzcVar.e) {
            return -1;
        }
        return this.f - nzcVar.f;
    }
}
