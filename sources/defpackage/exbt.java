package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbt {
    public final View a;
    public final int b;
    private final int c;
    private final Context d;

    public exbt(Context context, int i) {
        context.getClass();
        this.d = context;
        this.b = i;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_overflow_side_padding);
        this.a = a(null);
    }

    public static final boolean b(exby exbyVar) {
        return exbyVar != null && exbyVar.a() == R.id.smartAction;
    }

    public final View a(exby exbyVar) {
        View b = exbv.b(this.d, exbyVar, this.b, b(exbyVar));
        int i = this.c;
        b.setPadding(i, 0, i, 0);
        return b;
    }
}
