package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvz {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter");
    public final ffsk b;
    public final ffhd c;
    public final ffbr d;
    public final yvj e;
    public final AudioManager f;
    public final ctud g;
    public final aigz h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffxx l;
    public final ffbr m;
    public final fgcq n;
    public final zqv o;
    private final ffbz p;

    public yvz(ffsk ffskVar, ffhd ffhdVar, ffbr ffbrVar, yvj yvjVar, AudioManager audioManager, ctud ctudVar, aigz aigzVar, zqv zqvVar, @ares ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffxx ffxxVar, ffbr ffbrVar5, fgcq fgcqVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        audioManager.getClass();
        ctudVar.getClass();
        aigzVar.getClass();
        zqvVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffskVar;
        this.c = ffhdVar;
        this.d = ffbrVar;
        this.e = yvjVar;
        this.f = audioManager;
        this.g = ctudVar;
        this.h = aigzVar;
        this.o = zqvVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffxxVar;
        this.m = ffbrVar5;
        this.n = fgcqVar;
        this.p = ffca.a(new ffix() { // from class: yvk
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((ywq) yvz.this.d.b()).b().c;
            }
        });
    }

    public final dtik a() {
        return (dtik) this.p.a();
    }

    public final void b(Context context, int i) {
        Toast.makeText(context, context.getString(i), 0).show();
    }

    public final Object c(Context context, int i, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.c), new yvl(null, this, context, i), ffguVar);
    }
}
