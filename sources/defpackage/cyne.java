package defpackage;

import android.widget.TextView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyne {
    private final fazb a;

    public cyne(fazb fazbVar) {
        this.a = fazbVar;
    }

    public final void a(TextView textView, int i) {
        if (textView == null || ((Optional) this.a.b()).isEmpty()) {
            return;
        }
        textView.setTextSize(0, textView.getContext().getResources().getDimension(i) * ((cync) ((Optional) this.a.b()).get()).g());
    }
}
