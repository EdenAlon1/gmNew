package defpackage;

import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfd implements vfc {
    private static final enhk a;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(cmrv.LIKE, "anim_reaction_like.json");
        enhdVar.k(cmrv.LOVE, "anim_reaction_love.json");
        enhdVar.k(cmrv.LAUGH, "anim_reaction_laugh.json");
        enhdVar.k(cmrv.SURPRISED, "anim_reaction_surprised.json");
        enhdVar.k(cmrv.SAD, "anim_reaction_sad.json");
        enhdVar.k(cmrv.ANGRY, "anim_reaction_angry.json");
        enhdVar.k(cmrv.DISLIKE, "anim_reaction_dislike.json");
        enhdVar.k(cmrv.QUESTIONING, "anim_reaction_questioning.json");
        enhdVar.k(cmrv.CRYING_FACE, "anim_reaction_crying_face.json");
        enhdVar.k(cmrv.POUTING_FACE, "anim_reaction_pouting_face.json");
        enhdVar.k(cmrv.RED_HEART, "anim_reaction_red_heart.json");
        a = enhdVar.c();
    }

    @Override // defpackage.vfc
    public final cwqp a(IllustrationViewStub illustrationViewStub, cmrv cmrvVar) {
        illustrationViewStub.e();
        enhk enhkVar = a;
        emxf.a(enhkVar.containsKey(cmrvVar));
        String str = (String) enhkVar.get(cmrvVar);
        str.getClass();
        illustrationViewStub.a = str;
        cwqp cwqpVar = (cwqp) illustrationViewStub.c();
        if (cmrvVar == cmrv.QUESTIONING) {
            cwqpVar.setScaleX(1.7f);
            cwqpVar.setScaleY(1.7f);
        }
        cwqpVar.requestLayout();
        cwqpVar.d();
        return cwqpVar;
    }

    @Override // defpackage.vfc
    public final void b(cwqp cwqpVar) {
        if (cwqpVar.o()) {
            return;
        }
        cwqpVar.d();
    }
}
