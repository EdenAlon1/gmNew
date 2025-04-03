package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqj {
    public static final dnry a(zvp zvpVar, int i, int i2) {
        dnry b = zvpVar.b();
        if (i2 == 1) {
            return b;
        }
        if (i == 0) {
            dnry dnryVar = dnry.c;
            return (b == dnryVar || b == dnry.d) ? dnryVar : dnry.b;
        }
        if (i < i2 - 1) {
            return dnry.c;
        }
        dnry dnryVar2 = dnry.c;
        return (b == dnryVar2 || b == dnry.b) ? dnryVar2 : dnry.d;
    }
}
