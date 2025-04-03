package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgc implements rge {
    private final qxf a;
    private final rge b;
    private final rge c;

    public rgc(qxf qxfVar, rge rgeVar, rge rgeVar2) {
        this.a = qxfVar;
        this.b = rgeVar;
        this.c = rgeVar2;
    }

    @Override // defpackage.rge
    public final qwv a(qwv qwvVar, qtu qtuVar) {
        Drawable drawable = (Drawable) qwvVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(rcp.f(((BitmapDrawable) drawable).getBitmap(), this.a), qtuVar);
        }
        if (drawable instanceof rfp) {
            return this.c.a(qwvVar, qtuVar);
        }
        return null;
    }
}
