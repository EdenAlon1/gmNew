package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbw {
    public final ejog a;
    public final boolean b;

    public ejbw() {
        this(false, 3);
    }

    public /* synthetic */ ejbw(boolean z, int i) {
        ejnw ejnwVar = (i & 1) != 0 ? new ejnw(5L, TimeUnit.MINUTES) : null;
        boolean z2 = (i & 2) == 0;
        ejnwVar.getClass();
        this.a = ejnwVar;
        this.b = z | (!z2);
    }
}
