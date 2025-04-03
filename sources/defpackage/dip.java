package defpackage;

import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dip {
    public final Magnifier a;

    public dip(Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        int width;
        int height;
        width = this.a.getWidth();
        height = this.a.getHeight();
        return (width << 32) | (height & 4294967295L);
    }

    public final void b() {
        this.a.dismiss();
    }

    public void c(long j, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
