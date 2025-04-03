package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsl extends ehon {
    public final RectF x;

    public ehsl(ehow ehowVar, RectF rectF) {
        super(ehowVar);
        this.x = rectF;
    }

    @Override // defpackage.ehon, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = ehsn.b;
        ehsm ehsmVar = new ehsm(this);
        ehsmVar.invalidateSelf();
        return ehsmVar;
    }

    public ehsl(ehsl ehslVar) {
        super(ehslVar);
        this.x = ehslVar.x;
    }
}
