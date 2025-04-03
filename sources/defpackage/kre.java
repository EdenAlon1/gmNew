package defpackage;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kre {
    private final kru a;
    private final Executor b;

    public kre(kru kruVar, Executor executor) {
        this.a = kruVar;
        this.b = executor;
    }

    final void a(krp krpVar) {
        int i = krpVar.b;
        if (i != 0) {
            this.b.execute(new krd(this.a, i));
        } else {
            Typeface typeface = krpVar.a;
            this.b.execute(new krc(this.a, typeface));
        }
    }
}
