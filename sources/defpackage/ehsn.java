package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehsn extends ehop {
    public static final /* synthetic */ int b = 0;
    public ehsl a;

    public ehsn(ehsl ehslVar) {
        super(ehslVar);
        this.a = ehslVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.x.left && f2 == this.a.x.top && f3 == this.a.x.right && f4 == this.a.x.bottom) {
            return;
        }
        this.a.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.ehop, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new ehsl(this.a);
        return this;
    }
}
