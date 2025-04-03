package defpackage;

import android.app.Activity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eklg {
    private final eg a;
    private final Set b;
    private boolean c = false;

    public eklg(Activity activity, Set set) {
        this.a = (eg) activity;
        this.b = set;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        enqu listIterator = ((enpd) this.b).listIterator();
        while (listIterator.hasNext()) {
            this.a.P().c((lkq) listIterator.next());
        }
        this.c = true;
    }
}
