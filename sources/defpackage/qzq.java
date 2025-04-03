package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzq implements rao {
    private final Context a;
    private final qzp b;

    public qzq(Context context, qzp qzpVar) {
        this.a = context.getApplicationContext();
        this.b = qzpVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) qtuVar.b(rfh.a);
        return new ran(new rjn(num), new qzo(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num.intValue()));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
