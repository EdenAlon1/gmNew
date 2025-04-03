package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dl implements llh {
    final /* synthetic */ dn a;

    public dl(dn dnVar) {
        this.a = dnVar;
    }

    @Override // defpackage.llh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((lkr) obj) != null) {
            dn dnVar = this.a;
            if (dnVar.c) {
                View N = dnVar.N();
                if (N.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (this.a.d != null) {
                    if (fr.af(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + this.a.d);
                    }
                    this.a.d.setContentView(N);
                }
            }
        }
    }
}
