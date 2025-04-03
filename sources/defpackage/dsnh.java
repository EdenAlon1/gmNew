package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnh {
    public static final boolean a(WindowInsetsAnimation windowInsetsAnimation) {
        int typeMask;
        int ime;
        typeMask = windowInsetsAnimation.getTypeMask();
        ime = WindowInsets.Type.ime();
        return (typeMask & ime) != 0;
    }
}
