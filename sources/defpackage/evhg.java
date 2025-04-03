package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhg implements fecw {
    public final evhd[] a;

    public evhg(evhd... evhdVarArr) {
        this.a = evhdVarArr;
    }

    @Override // defpackage.fecw
    public final fect a(fecu fecuVar, febo feboVar, fecv fecvVar) {
        fecvVar.getClass();
        fdyn k = fdyn.k();
        k.getClass();
        for (char c = 0; c <= 0; c = 1) {
            evhd evhdVar = this.a[0];
            k = k.l(evhdVar.c, new AtomicReference()).l(evhdVar.d, new AtomicReference());
            if (feboVar.h(evhdVar.a)) {
                k = k.l(evhdVar.b, feboVar.b(evhdVar.a));
            }
        }
        evhf evhfVar = new evhf(fecuVar, this, k);
        fdyn a = k.a();
        try {
            return new fdyo(fecvVar.a(evhfVar, feboVar), k);
        } finally {
            k.f(a);
        }
    }

    public final void b(febo feboVar, fdyn fdynVar, boolean z) {
        evhd evhdVar = this.a[0];
        Parcelable parcelable = (Parcelable) ((AtomicReference) (z ? evhdVar.c : evhdVar.d).b(fdynVar)).getAndSet(null);
        if (parcelable != null) {
            feboVar.g(evhdVar.a, parcelable);
        }
    }
}
