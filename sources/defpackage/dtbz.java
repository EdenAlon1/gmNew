package defpackage;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbz {
    public final ffbz a;
    private final ffbz b;

    public dtbz(final Context context) {
        context.getClass();
        this.b = ffca.a(new ffix() { // from class: dtbx
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(context.getColor(R.color.compose_contrasting_text_highlight));
            }
        });
        this.a = ffca.a(new ffix() { // from class: dtby
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(context.getColor(R.color.compose_contrasting_text_non_highlight));
            }
        });
    }

    public final ForegroundColorSpan a() {
        return new ForegroundColorSpan(((Number) this.b.a()).intValue());
    }
}
