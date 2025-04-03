package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaeb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaee b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaeb(aaee aaeeVar, Uri uri, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaeeVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaeb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aaee aaeeVar = this.b;
            Uri a = bcqc.a(aaeeVar.b, amic.a(aaeeVar.e.d()));
            if (a != null) {
                aaee aaeeVar2 = this.b;
                ailj ailjVar = new ailj(2, this.c, this.d, a, 16);
                this.a = 1;
                obj = aaeeVar2.h.f(ailjVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        ainw ainwVar = (ainw) obj;
        ensk h = aaee.a.h();
        h.Y(ente.a, "BugleImage");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$openLegacyMediaViewer$1", "invokeSuspend", 607, "ImageBubbleUiAdapter.kt")).t("Image bubble MediaViewer result: %s", ainwVar);
        if (ainwVar != null) {
            this.b.b(ainwVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaeb(this.b, this.c, this.d, ffguVar);
    }
}
