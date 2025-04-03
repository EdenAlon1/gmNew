package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmb extends ehlw {
    public final ehlz a;
    public final ehma b;
    public Drawable c;

    public ehmb(Context context, ehlc ehlcVar, ehlz ehlzVar, ehma ehmaVar) {
        super(context, ehlcVar);
        this.a = ehlzVar;
        this.b = ehmaVar;
        ehmaVar.j = this;
    }

    private final boolean a() {
        return this.k != null && ehkw.a(this.i.getContentResolver()) == 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehmb.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.ehlw
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (a() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && z3) {
            this.b.d();
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.ehlw, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
