package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.PermissionContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcds extends ejzn {
    final /* synthetic */ dcdk a;

    public dcds(dcdk dcdkVar) {
        this.a = dcdkVar;
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (PermissionContentItemView) LayoutInflater.from(this.a.e).inflate(R.layout.compose2o_permissions_item_view, viewGroup, false);
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ((PermissionContentItemView) view).setOnClickListener(new View.OnClickListener() { // from class: dcdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dcds.this.a.d.r();
            }
        });
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((PermissionContentItemView) view).setOnClickListener(null);
    }
}
