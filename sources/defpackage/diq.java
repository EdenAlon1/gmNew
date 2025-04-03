package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diq implements dio {
    public static final diq a = new diq();

    private diq() {
    }

    @Override // defpackage.dio
    public final boolean a() {
        return false;
    }

    @Override // defpackage.dio
    public final /* bridge */ /* synthetic */ dip b(View view, boolean z, long j, float f, float f2, boolean z2, jzn jznVar, float f3) {
        return new dip(new Magnifier(view));
    }
}
