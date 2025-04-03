package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqyx implements adf, ffke {
    final /* synthetic */ dqyz a;

    public dqyx(dqyz dqyzVar) {
        this.a = dqyzVar;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dqyz dqyzVar = this.a;
        Uri uri = (Uri) obj;
        adak adakVar = dqyzVar.i;
        if (adakVar != null) {
            adakVar.a(drav.c);
        }
        if (uri != null) {
            ffqy.d(dqyzVar.c, null, null, new dqyy(dqyzVar, uri, null), 3);
            return;
        }
        ((enrr) dqyz.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl", "onActivityResult", 146, "EmotifyButtonControllerImpl.kt")).q("No Emotify result returned.");
        adak adakVar2 = dqyzVar.i;
        if (adakVar2 != null) {
            adakVar2.d(drat.a);
        }
        drau drauVar = dqyzVar.d;
        if (drauVar != null) {
            drauVar.a();
        }
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(1, this.a, dqyz.class, "onActivityResult", "onActivityResult(Landroid/net/Uri;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof adf) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
