package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aapd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aapg b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aapd(aapg aapgVar, Uri uri, String str, long j, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aapgVar;
        this.c = uri;
        this.d = str;
        this.e = j;
        this.f = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aapd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aapg aapgVar = this.b;
            ailj ailjVar = new ailj(this.c, this.d, this.e, this.f);
            this.a = 1;
            obj = aapgVar.f.f(ailjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ainw ainwVar = (ainw) obj;
        ((enrr) aapg.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$openLegacyMediaViewer$1", "invokeSuspend", 407, "VideoBubbleUiAdapter.kt")).t("Video bubble MediaViewer result: %s", ainwVar);
        if (ainwVar != null) {
            this.b.a(ainwVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aapd(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
