package defpackage;

import android.R;
import android.content.Intent;
import android.net.Uri;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emen extends ffhv implements ffjm {
    int a;
    final /* synthetic */ emeq b;
    final /* synthetic */ emge c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emen(emeq emeqVar, emge emgeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = emeqVar;
        this.c = emgeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emen) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            String stringExtra = ((EmotifyActivity) this.b.a.b()).getIntent().getStringExtra("image_uri");
            fflb fflbVar = new fflb();
            if (stringExtra != null) {
                fflbVar.a = Uri.parse(stringExtra);
            }
            emgi emgiVar = new emgi();
            fbae.e(emgiVar);
            cg cgVar = new cg(((EmotifyActivity) this.b.a.b()).a());
            cgVar.s(R.id.content, emgiVar);
            cgVar.c();
            emge emgeVar = this.c;
            final emeq emeqVar = this.b;
            emgeVar.v = new ffix() { // from class: emei
                @Override // defpackage.ffix
                public final Object invoke() {
                    emeq.this.a(0, new Intent());
                    return ffcu.a;
                }
            };
            Object b = emeqVar.a.b();
            b.getClass();
            acv.a((abe) b, new hpw(593959971, true, new emek(this.c)));
            if (((EmotifyActivity) this.b.a.b()).getIntent().getBooleanExtra("enable_edge_to_edge", false)) {
                Object b2 = this.b.a.b();
                b2.getClass();
                abh.a((abe) b2);
            }
            emge emgeVar2 = this.c;
            fgbq fgbqVar = new fgbq(emgeVar2.u);
            emem ememVar = new emem(emgeVar2, emgiVar, fflbVar, this.b);
            this.a = 1;
            if (fgbqVar.a(ememVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emen(this.b, this.c, ffguVar);
    }
}
