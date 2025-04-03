package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eui {
    public static final void a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            dwv.c(a.x(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        dwv.c("minLines 1 must be less than or equal to maxLines 0");
    }
}
