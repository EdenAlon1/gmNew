package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzm implements rap, qzp {
    private final Context a;

    public qzm(Context context) {
        this.a = context;
    }

    @Override // defpackage.qzp
    public final Class a() {
        return Drawable.class;
    }

    @Override // defpackage.rap
    public final rao b(rax raxVar) {
        return new qzq(this.a, this);
    }

    @Override // defpackage.qzp
    public final /* bridge */ /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        Context context = this.a;
        return rfd.a(context, context, i, theme);
    }

    @Override // defpackage.qzp
    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }
}
