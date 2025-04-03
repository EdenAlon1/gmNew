package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsm extends ehsn {
    public ehsm(ehsl ehslVar) {
        super(ehslVar);
    }

    @Override // defpackage.ehop
    protected final void J(Canvas canvas) {
        if (this.a.x.isEmpty()) {
            super.J(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.x);
        super.J(canvas);
        canvas.restore();
    }
}
