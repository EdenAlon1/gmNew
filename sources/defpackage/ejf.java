package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ejg ejgVar, Object obj, int i, Object obj2, hfd hfdVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(1439843069);
        if (i4 == 0) {
            i3 = (true != b.D(ejgVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.D(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b.D(obj2) ? 1024 : 2048;
        }
        if (b.J((i3 & 1171) != 1170, i3 & 1)) {
            obj.e(obj2, hpx.d(980966366, new ejd(ejgVar, i, obj2), b), b);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new eje(ejgVar, obj, i, obj2, i2);
        }
    }
}
