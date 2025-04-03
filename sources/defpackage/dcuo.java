package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcuo implements ellh {
    final /* synthetic */ dcty a;

    public dcuo(dcty dctyVar) {
        this.a = dctyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        dcty dctyVar = this.a;
        if (!((ersq) ((aueh) dctyVar.af).a.b()).a("bugle.enable_fix_for_media_viewer_see_in_chat") || dctyVar.N != null) {
            dcur dcurVar = dctyVar.Y;
            if (dcurVar != null) {
                dcurVar.e = 4;
            }
            MediaViewerItem mediaViewerItem = dctyVar.N;
            if (dctyVar.m.a) {
                ayfg ayfgVar = dctyVar.f;
                eg G = dctyVar.H.G();
                G.getClass();
                ayfgVar.r(G, mediaViewerItem.d(), mediaViewerItem.c(), mediaViewerItem.b());
            } else {
                dctyVar.f.s(dctyVar.H.z(), mediaViewerItem.d(), mediaViewerItem.c(), mediaViewerItem.b());
            }
        }
        return elli.a;
    }
}
