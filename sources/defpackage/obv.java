package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obv implements nxs {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ nyj b;

    public obv(WeakReference weakReference, nyj nyjVar) {
        this.a = weakReference;
        this.b = nyjVar;
    }

    @Override // defpackage.nxs
    public final void a(nzh nzhVar, Bundle bundle) {
        nzhVar.getClass();
        ehku ehkuVar = (ehku) this.a.get();
        if (ehkuVar == null) {
            this.b.m.remove(this);
            return;
        }
        if (nzhVar instanceof oav) {
            return;
        }
        ehki ehkiVar = ehkuVar.a;
        ehkiVar.getClass();
        int size = ehkiVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ehkiVar.getItem(i);
            if (obw.a(nzhVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
