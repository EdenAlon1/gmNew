package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dis implements dio {
    public static final dis a = new dis();

    private dis() {
    }

    @Override // defpackage.dio
    public final boolean a() {
        return true;
    }

    @Override // defpackage.dio
    public final /* bridge */ /* synthetic */ dip b(View view, boolean z, long j, float f, float f2, boolean z2, jzn jznVar, float f3) {
        Magnifier build;
        if (z) {
            return new dir(new Magnifier(view));
        }
        long eq = jznVar.eq(j);
        float em = jznVar.em(f);
        float em2 = jznVar.em(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (eq != 9205357640488583168L) {
            builder.setSize(ffln.b(Float.intBitsToFloat((int) (eq >> 32))), ffln.b(Float.intBitsToFloat((int) (eq & 4294967295L))));
        }
        if (!Float.isNaN(em)) {
            builder.setCornerRadius(em);
        }
        if (!Float.isNaN(em2)) {
            builder.setElevation(em2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        build = builder.build();
        return new dir(build);
    }
}
