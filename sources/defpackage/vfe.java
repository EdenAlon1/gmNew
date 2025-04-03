package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfe {
    public static final engw a;
    public static final engw b;
    private static final enhk c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(cmrv.LIKE, Integer.valueOf(R.string.reaction_like_content_description));
        enhdVar.k(cmrv.LOVE, Integer.valueOf(R.string.reaction_love_content_description));
        enhdVar.k(cmrv.LAUGH, Integer.valueOf(R.string.reaction_laugh_content_description));
        enhdVar.k(cmrv.SURPRISED, Integer.valueOf(R.string.reaction_surprised_content_description));
        enhdVar.k(cmrv.SAD, Integer.valueOf(R.string.reaction_sad_content_description));
        enhdVar.k(cmrv.ANGRY, Integer.valueOf(R.string.reaction_angry_content_description));
        enhdVar.k(cmrv.DISLIKE, Integer.valueOf(R.string.reaction_dislike_content_description));
        enhdVar.k(cmrv.QUESTIONING, Integer.valueOf(R.string.reaction_questioning_content_description));
        enhdVar.k(cmrv.CRYING_FACE, Integer.valueOf(R.string.reaction_crying_face_content_description));
        enhdVar.k(cmrv.POUTING_FACE, Integer.valueOf(R.string.reaction_pouting_face_content_description));
        enhdVar.k(cmrv.RED_HEART, Integer.valueOf(R.string.reaction_red_heart_content_description));
        c = enhdVar.c();
        a = engw.x(cmrv.LIKE, cmrv.RED_HEART, cmrv.LAUGH, cmrv.SURPRISED, cmrv.CRYING_FACE, cmrv.POUTING_FACE, cmrv.DISLIKE);
        b = engw.w(cmrv.LIKE, cmrv.RED_HEART, cmrv.LAUGH, cmrv.SURPRISED, cmrv.CRYING_FACE, cmrv.POUTING_FACE);
    }

    public static String a(Resources resources, cmrv cmrvVar) {
        enhk enhkVar = c;
        emxf.f(enhkVar.containsKey(cmrvVar), "Could not get content description for reaction type=%s", cmrvVar);
        Integer num = (Integer) enhkVar.get(cmrvVar);
        num.getClass();
        return resources.getString(num.intValue());
    }
}
