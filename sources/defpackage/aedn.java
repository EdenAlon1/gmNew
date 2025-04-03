package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedn implements ellh {
    final /* synthetic */ aedh a;

    public aedn(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        aedh aedhVar = this.a;
        aehm aehmVar = (aehm) ellfVar;
        if (!((Optional) aedhVar.o.b()).isEmpty()) {
            eisx eisxVar = aedhVar.al;
            adzz adzzVar = aedhVar.b;
            eisxVar.getClass();
            aehmVar.getClass();
            aeml aemlVar = new aeml();
            fbae.e(aemlVar);
            ekky.b(aemlVar, eisxVar);
            int[] iArr = new int[2];
            aehmVar.a.getLocationOnScreen(iArr);
            Bundle C = aemlVar.C();
            C.putString("conversation_id", aehmVar.b.b.b());
            C.putIntArray("starting_coordinate", iArr);
            cg cgVar = new cg(adzzVar.I());
            cgVar.x(R.id.mini_cdp_fragment, aemlVar, "HOME_MINICDP_FRAGMENT");
            cgVar.c();
        }
        return elli.a;
    }
}
