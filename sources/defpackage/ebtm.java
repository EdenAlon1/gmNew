package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebtm implements eawd {
    private final Context a;
    private final eave b;
    private final ejgo c;

    public ebtm(ejgo ejgoVar, Context context, eave eaveVar) {
        this.c = ejgoVar;
        this.a = context;
        this.b = eaveVar;
    }

    @Override // defpackage.eawd
    public final void a(Object obj, ImageView imageView) {
        rig b = rig.b();
        emxc a = ebsy.a(imageView);
        if (a.g()) {
            b = (rig) b.P(((Integer) a.c()).intValue());
        }
        ((qqo) this.c.a.f(obj == null ? null : ebtq.c(obj, this.b)).q(b).I(ebsx.a(this.a))).v(imageView);
    }
}
