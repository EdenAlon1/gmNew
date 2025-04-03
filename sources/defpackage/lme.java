package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lme implements owu {
    public Bundle a;
    private final owv b;
    private boolean c;
    private final ffbz d;

    public lme(owv owvVar, lmy lmyVar) {
        this.b = owvVar;
        this.d = ffca.a(new lmd(lmyVar));
    }

    private final lmf c() {
        return (lmf) this.d.a();
    }

    @Override // defpackage.owu
    public final Bundle a() {
        Bundle a = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            a.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((llv) entry.getValue()).a().a();
            if (!a2.isEmpty()) {
                a.putBundle(str, a2);
            }
        }
        this.c = false;
        return a;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        Bundle a = this.b.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle a2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            a2.putAll(bundle);
        }
        if (a != null) {
            a2.putAll(a);
        }
        this.a = a2;
        this.c = true;
        c();
    }
}
