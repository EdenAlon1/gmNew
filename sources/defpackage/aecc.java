package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aecc implements vz {
    final /* synthetic */ aedh a;

    public aecc(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.vz
    public final void c(View view) {
        aedh.b(this.a.b).setImportantForAccessibility(1);
    }

    @Override // defpackage.vz
    public final void d(View view) {
        if (aedh.b(this.a.b).getChildCount() == 0) {
            aedh.b(this.a.b).setImportantForAccessibility(2);
        }
    }
}
