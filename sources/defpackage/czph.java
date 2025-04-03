package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.conversation.richcard.ConversationRichCardView;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czph implements rif {
    final /* synthetic */ Uri a;
    final /* synthetic */ RichCardMediaAttachmentView b;

    public czph(RichCardMediaAttachmentView richCardMediaAttachmentView, Uri uri) {
        this.a = uri;
        this.b = richCardMediaAttachmentView;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        csjb e = RichCardMediaAttachmentView.a.e();
        e.I("Rich card media loading failed for resource");
        e.A("resource", this.a);
        e.r();
        RichCardMediaAttachmentView richCardMediaAttachmentView = this.b;
        if (richCardMediaAttachmentView.j == null) {
            return false;
        }
        cbly cblyVar = (cbly) richCardMediaAttachmentView.f.b();
        cblw cblwVar = (cblw) cblx.a.createBuilder();
        String uri = this.a.toString();
        cblwVar.copyOnWrite();
        cblx cblxVar = (cblx) cblwVar.instance;
        uri.getClass();
        cblxVar.b = uri;
        String b = ((ConversationRichCardView) this.b.j).g.u().b();
        cblwVar.copyOnWrite();
        cblx cblxVar2 = (cblx) cblwVar.instance;
        b.getClass();
        cblxVar2.c = b;
        ((cevh) cblyVar.a.b()).g(ceyr.g("rich_card_media_uri_cleanup", (cblx) cblwVar.build()));
        return false;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        this.b.i = this.a;
        return false;
    }
}
