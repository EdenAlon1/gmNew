package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krc implements Runnable {
    final /* synthetic */ kru a;
    final /* synthetic */ Typeface b;

    public krc(kru kruVar, Typeface typeface) {
        this.a = kruVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
