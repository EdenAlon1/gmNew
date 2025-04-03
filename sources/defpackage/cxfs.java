package defpackage;

import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.cxfr;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfs implements ellh {
    final /* synthetic */ cxfr a;

    public cxfs(cxfr cxfrVar) {
        this.a = cxfrVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        cxfr.b bVar = (cxfr.b) ellfVar;
        Integer num = (Integer) bVar.a.getTag(R.id.sim_message_index_tag);
        int intValue = num == null ? -1 : num.intValue();
        cxfr cxfrVar = this.a;
        cxfrVar.b(intValue);
        if (!((asvh) cxfrVar.j.b()).a()) {
            View view = bVar.a;
            if (num != null) {
                crnx.k(view, cxfrVar.c.B().getString(R.string.action_selected));
            }
        }
        cxfj cxfjVar = cxfrVar.c;
        cwpv cwpvVar = (cwpv) cxfjVar.G();
        ActionMode.Callback callback = cxfrVar.l;
        View view2 = cxfjVar.Q;
        view2.getClass();
        cwpvVar.ab(callback, view2, null);
        return elli.a;
    }
}
