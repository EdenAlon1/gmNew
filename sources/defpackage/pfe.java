package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfe extends pfg {
    public pfe(String str, String str2) {
        super(str, str2);
    }

    @Override // defpackage.pfg
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
