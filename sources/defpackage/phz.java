package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phz extends pib {
    public final int a;

    public phz(int i) {
        super(a.h(i, "dimension in pixel:"));
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("Pixel value must be a positive integer.");
        }
    }
}
