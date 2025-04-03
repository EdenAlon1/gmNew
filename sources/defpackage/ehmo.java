package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmo extends ehmv {
    private final Typeface a;
    private final ehmn b;
    private boolean c;

    public ehmo(ehmn ehmnVar, Typeface typeface) {
        this.a = typeface;
        this.b = ehmnVar;
    }

    private final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.ehmv
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.ehmv
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}
