package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzyb {
    public final Context a;
    public final Optional b;

    public bzyb(Context context, Optional optional) {
        this.a = context;
        this.b = optional;
    }

    public final Drawable a(int i) {
        if (i == 40 && bzwd.f()) {
            Drawable drawable = this.a.getDrawable(R.drawable.ic_e2ee_send_icon);
            drawable.getClass();
            return drawable;
        }
        Drawable drawable2 = this.a.getDrawable(R.drawable.ic_compose_send);
        drawable2.getClass();
        return drawable2;
    }
}
