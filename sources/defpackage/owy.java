package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owy {
    public final owv a;
    private final oxc b;

    public owy(oxc oxcVar) {
        this.b = oxcVar;
        this.a = new owv(oxcVar);
    }

    public final void a() {
        this.b.a();
    }

    public final void b(Bundle bundle) {
        oxc oxcVar = this.b;
        if (!oxcVar.d) {
            oxcVar.a();
        }
        if (oxcVar.a.P().a().a(lkj.STARTED)) {
            lkj a = oxcVar.a.P().a();
            Objects.toString(a);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(a)));
        }
        if (oxcVar.f) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            if (!bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                throw new IllegalArgumentException("No saved state was found associated with the key 'androidx.lifecycle.BundlableSavedStateRegistry.key'.");
            }
            bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 == null) {
                throw new IllegalStateException("The saved state value associated with the key 'androidx.lifecycle.BundlableSavedStateRegistry.key' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
            }
        }
        oxcVar.e = bundle2;
        oxcVar.f = true;
    }

    public final void c(Bundle bundle) {
        Bundle a = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        oxc oxcVar = this.b;
        Bundle bundle2 = oxcVar.e;
        if (bundle2 != null) {
            a.putAll(bundle2);
        }
        synchronized (oxcVar.b) {
            for (Map.Entry entry : oxcVar.c.entrySet()) {
                a.putBundle((String) entry.getKey(), ((owu) entry.getValue()).a());
            }
        }
        if (a.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", a);
    }
}
