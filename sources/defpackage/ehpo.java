package defpackage;

import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpo {
    final int a;
    public final ehow b;
    final int[][] c;
    final ehow[] d;

    public ehpo(ehpn ehpnVar) {
        this.a = ehpnVar.a;
        this.b = ehpnVar.b;
        this.c = ehpnVar.c;
        this.d = ehpnVar.d;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
