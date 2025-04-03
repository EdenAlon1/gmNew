package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uty implements ffix {
    final /* synthetic */ uuy a;

    public uty(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ea eaVar = this.a.e;
        if (eaVar == null) {
            return -1;
        }
        Context z = eaVar.z();
        z.getClass();
        return Integer.valueOf(z.getResources().getConfiguration().orientation);
    }
}
