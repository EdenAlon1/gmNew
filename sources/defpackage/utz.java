package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class utz implements ffji {
    final /* synthetic */ uuy a;

    public utz(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ea eaVar = this.a.e;
        if (eaVar == null) {
            return -1;
        }
        Context z = eaVar.z();
        z.getClass();
        return Integer.valueOf(z.getResources().getDisplayMetrics().heightPixels);
    }
}
