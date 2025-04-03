package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjs {
    private static final AtomicInteger a = new AtomicInteger(0);

    public static final int a() {
        return a.addAndGet(1);
    }

    public static final hvi b(hvi hviVar, ffji ffjiVar) {
        return hviVar.a(new ClearAndSetSemanticsElement(ffjiVar));
    }

    public static final hvi c(hvi hviVar, boolean z, ffji ffjiVar) {
        return hviVar.a(new AppendedSemanticsElement(z, ffjiVar));
    }
}
