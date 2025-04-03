package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqyy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqyz b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqyy(dqyz dqyzVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqyzVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqyy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqyz dqyzVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            obj = dqyzVar.b.b(uri, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Uri uri2 = this.c;
        if (obj == null) {
            Objects.toString(uri2);
            throw new IllegalStateException("Can't create sticker from ".concat(uri2.toString()));
        }
        dqzc dqzcVar = (dqzc) obj;
        ((enrr) dqyz.a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl$onActivityResult$1", "invokeSuspend", 140, "EmotifyButtonControllerImpl.kt")).t("Received Emotify result: %s", this.c.toString());
        adak adakVar = this.b.i;
        if (adakVar != null) {
            adakVar.d(drat.c);
        }
        drau drauVar = this.b.d;
        if (drauVar != null) {
            drauVar.a();
        }
        ffix ffixVar = this.b.f;
        if (ffixVar == null) {
            ffkj.c("draftController");
            ffixVar = null;
        }
        ((dqls) ffixVar.invoke()).b.e(dqzcVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqyy(this.b, this.c, ffguVar);
    }
}
