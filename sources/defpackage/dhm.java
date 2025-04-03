package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhm {
    public static final jku a = new jku("MagnifierPositionInRoot");

    public static /* synthetic */ boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static /* synthetic */ hvi b(hvi hviVar, ffji ffjiVar, ffji ffjiVar2, dio dioVar) {
        return a() ? new MagnifierElement(ffjiVar, ffjiVar2, dioVar) : hviVar;
    }
}
