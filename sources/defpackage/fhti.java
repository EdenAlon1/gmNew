package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhti {
    public static int a(int i) {
        char c = (char) i;
        int i2 = (c | (c << '\b')) & 16711935;
        int i3 = (i2 | (i2 << 4)) & 252645135;
        int i4 = (i3 | (i3 << 2)) & 858993459;
        return (i4 | (i4 + i4)) & 1431655765;
    }
}
