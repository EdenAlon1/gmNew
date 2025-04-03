package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cp extends cs {
    private final boolean b;
    private boolean c;
    private eh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(hi hiVar, boolean z) {
        super(hiVar);
        hiVar.getClass();
        this.b = z;
    }

    public final eh a(Context context) {
        if (this.c) {
            return this.d;
        }
        hi hiVar = this.a;
        eh a = ej.a(context, hiVar.a, hiVar.h == 2, this.b);
        this.d = a;
        this.c = true;
        return a;
    }
}
