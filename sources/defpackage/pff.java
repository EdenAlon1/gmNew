package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pff extends pfg {
    public pff() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    }

    @Override // defpackage.pfg
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
