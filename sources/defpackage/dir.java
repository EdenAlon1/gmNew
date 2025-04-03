package defpackage;

import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dir extends dip {
    public dir(Magnifier magnifier) {
        super(magnifier);
    }

    @Override // defpackage.dip
    public final void c(long j, float f) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
