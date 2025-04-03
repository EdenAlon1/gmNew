package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwt implements dbxc {
    private final Context a;

    public dbwt(Context context) {
        this.a = context;
    }

    @Override // defpackage.dbxc
    public final Drawable a(Object obj) {
        ehdh h = ehdh.h(this.a, R.xml.chip);
        h.p(obj.toString());
        h.setBounds(0, 0, h.getIntrinsicWidth(), h.getIntrinsicHeight());
        return h;
    }

    @Override // defpackage.dbxc
    public final boolean d(Object obj) {
        return true;
    }

    @Override // defpackage.dbxc
    public final void b() {
    }

    @Override // defpackage.dbxc
    public final void c(View view) {
    }
}
