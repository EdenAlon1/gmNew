package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yvu extends ffkh implements ffji {
    public yvu(Object obj) {
        super(1, obj, yvz.class, "onSwipeUp", "onSwipeUp(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        yvz yvzVar = (yvz) this.g;
        ensk e = yvz.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeUp", 184, "VoiceInputUiAdapter.kt")).q("Voice input swipe up");
        ywq ywqVar = (ywq) yvzVar.d.b();
        if (!ywqVar.i()) {
            ywqVar.k = 4;
            axol.k(yvzVar.b, yvzVar.c, new yvy(yvzVar, context, null), 2);
            ywqVar.g();
        }
        return ffcu.a;
    }
}
