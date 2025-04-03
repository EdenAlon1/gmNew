package defpackage;

import android.widget.Toast;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dadk implements ejlr<Void, Void> {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public dadk(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Toast.makeText(this.a.e.getContext(), "Wrote flags to /d/d/c.g.a.a.m/cache/autorampflags.txt", 1).show();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        Toast.makeText(this.a.e.getContext(), "Error writing flags to file", 1).show();
        ensk j = DebugGServiceKeysFragment.a.j();
        j.Y(ente.a, "BugleDiagnostics");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/debug/DebugGServiceKeysFragment$2", "onFailure", '_', "DebugGServiceKeysFragment.java")).q("Error writing flags to file");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
