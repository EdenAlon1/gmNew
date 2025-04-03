package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aamm extends ffkh implements ffji {
    public aamm(Object obj) {
        super(1, obj, aamn.class, "navigateToLink", "navigateToLink(Landroid/net/Uri;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        aamn aamnVar = (aamn) this.g;
        ((enrr) aamn.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter", "navigateToLink", 213, "LinkPreviewUiAdapter.kt")).q("Preview clicked; opening browser");
        aamnVar.b.h(new aile(uri));
        return ffcu.a;
    }
}
