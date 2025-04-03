package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoh implements eog {
    private final int a = 1;

    @Override // defpackage.eog
    public final int a(int i, int i2) {
        long j = i;
        return ffmk.i(i2, (int) ffmk.j(j - 1, 0L), (int) ffmk.k(1 + j, 2147483647L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eoh)) {
            return false;
        }
        int i = ((eoh) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }
}
