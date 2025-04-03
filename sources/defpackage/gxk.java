package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxk {
    public static final int a(gxo gxoVar, int i, int i2) {
        if (!gxoVar.g) {
            return 0;
        }
        gxe gxeVar = gxoVar.b;
        int i3 = gxeVar.f - gxeVar.e;
        int size = gxoVar.c.size() + i3;
        int size2 = gxoVar.d.size() + i3;
        int b = ffln.b(gxoVar.b.c().c - (gxoVar.a() / 2.0f));
        if (i < size) {
            b = ffln.b(((gxe) gxoVar.c.get(Math.min(gxoVar.c.size() - 1, Math.max(0, (size - 1) - i)))).c().c - (gxoVar.a() / 2.0f));
        }
        if (i2 <= i3 + 1 || i < i2 - size2) {
            return b;
        }
        return ffln.b(((gxe) gxoVar.d.get(Math.min(gxoVar.d.size() - 1, Math.max(0, (i - i2) + size2)))).c().c - (gxoVar.a() / 2.0f));
    }
}
