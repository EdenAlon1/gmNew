package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzg extends cxqi {
    public final ffbr f;
    public final czzc g;

    public czzg(ffbr ffbrVar, ekyo ekyoVar, Context context, czzc czzcVar) {
        super(context, ekyoVar);
        this.f = ffbrVar;
        this.g = czzcVar;
    }

    @Override // defpackage.cxqi
    public final /* bridge */ /* synthetic */ wr F(Context context, ViewGroup viewGroup) {
        VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) LayoutInflater.from(context).inflate(R.layout.people_list_item_view_m2, viewGroup, false);
        czzf czzfVar = new czzf(this, vCardAttachmentView);
        vCardAttachmentView.l(czzfVar);
        return czzfVar;
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        bfkf bfkfVar;
        if (!this.a || (bfkfVar = this.d) == null || bfkfVar.isClosed() || !this.d.moveToPosition(i)) {
            return 0L;
        }
        return this.d.u().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cxqi
    public final /* bridge */ /* synthetic */ void m(wr wrVar, Cursor cursor) {
        czzf czzfVar = (czzf) wrVar;
        czzfVar.s.T(cursor);
        ((VCardAttachmentView) czzfVar.a).j(czzfVar.t);
    }
}
