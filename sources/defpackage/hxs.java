package defpackage;

import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.draw.DrawWithContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxs {
    public static final hvi a(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new DrawBehindElement(ffjiVar));
    }

    public static final hvi b(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new DrawWithCacheElement(ffjiVar));
    }

    public static final hvi c(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new DrawWithContentElement(ffjiVar));
    }
}
