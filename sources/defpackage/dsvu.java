package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvu {
    public final HashMap a = new HashMap();
    private final dsur b;

    public dsvu(dsur dsurVar) {
        this.b = dsurVar;
    }

    public final dsvy a(ffsk ffskVar, final dsvw dsvwVar) {
        HashMap hashMap = this.a;
        String str = dsvwVar.a.b;
        Uri parse = Uri.parse(str);
        Object obj = hashMap.get(str);
        if (obj == null) {
            drnl drnlVar = dsvwVar.a;
            dswx dswxVar = (dswx) this.b.a.b();
            dswxVar.getClass();
            dsuq dsuqVar = new dsuq(dswxVar, ffskVar, drnlVar);
            hashMap.put(str, dsuqVar);
            obj = dsuqVar;
        }
        String str2 = dsvwVar.c;
        ffui.c(((fggf) ffskVar).a).hZ(new ffji() { // from class: dsvt
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                dsvu dsvuVar = dsvu.this;
                HashMap hashMap2 = dsvuVar.a;
                dsvw dsvwVar2 = dsvwVar;
                dsuq dsuqVar2 = (dsuq) hashMap2.get(dsvwVar2.a.b);
                if (dsuqVar2 != null) {
                    ((enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 140, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release releasing");
                    dsuqVar2.e();
                    ExoPlayer exoPlayer = dsuqVar2.h;
                    if (exoPlayer != null) {
                        exoPlayer.ae();
                    }
                    dsuqVar2.f = false;
                    dsuqVar2.c.f(false);
                    dsuqVar2.h = null;
                    ((enrr) dsuq.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 148, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release released");
                }
                dsvuVar.a.remove(dsvwVar2.a.b);
                return ffcu.a;
            }
        });
        drnl drnlVar2 = dsvwVar.a;
        ffix ffixVar = dsvwVar.b;
        boolean z = dsvwVar.e;
        return new dsvy(parse, (dsuq) obj, str2, drnlVar2.c, drnlVar2.d, dsvwVar.d, ffixVar, z);
    }
}
