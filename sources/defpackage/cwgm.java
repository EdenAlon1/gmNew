package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cwgm extends ffju implements ffjn {
    public cwgm(Object obj) {
        super(3, obj, cwgn.class, "transformToRowUiData", "transformToRowUiData(Ljava/lang/String;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/suggestion/ProfileSuggestionUiData;", 4);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final String str = (String) obj;
        final cwir cwirVar = (cwir) obj2;
        final cwgn cwgnVar = (cwgn) this.b;
        ffbz a = ffca.a(new ffix() { // from class: cwgk
            @Override // defpackage.ffix
            public final Object invoke() {
                cwgn cwgnVar2 = cwgn.this;
                aoku p = ((aolr) cwgnVar2.c.b()).p(str);
                if (!((ersq) ((atlr) cwgnVar2.j).a.b()).a("bugle.new_conversation_from_typing_uses_normalized_number") || !p.s()) {
                    return p;
                }
                String l = p.l();
                if (l != null) {
                    return ((aolr) cwgnVar2.c.b()).d(((djrk) cwgnVar2.h.b()).a(l));
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        cwgp cwgpVar = null;
        if (cwgnVar.f.l(str)) {
            aoku b = cwgn.b(a);
            b.getClass();
            if (!cwirVar.b(b) && (!((attl) cwgnVar.i.b()).a() || !cwgn.b(a).b().isPresent())) {
                final aoku b2 = cwgn.b(a);
                b2.getClass();
                final cjvk a2 = ((cjvl) cwgnVar.e.b()).a(cjwc.a);
                final fflb fflbVar = new fflb();
                Runnable runnable = new Runnable() { // from class: cwgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        dngx dngpVar;
                        cwgn.a.m("Creating profile UI response");
                        aqkh aqkhVar = a2;
                        aqkhVar.d();
                        cjvk cjvkVar = (cjvk) aqkhVar;
                        Uri uri = cjvkVar.h.a;
                        cwgn cwgnVar2 = cwgnVar;
                        if (uri == null) {
                            uri = crjm.k(cwgnVar2.b);
                            uri.getClass();
                        }
                        Uri uri2 = uri;
                        aoku aokuVar = b2;
                        cwir cwirVar2 = cwirVar;
                        if (cwirVar2.d.e()) {
                            dnyo dnyoVar = new dnyo(new dnwn(uri2, null, null, null, null, 30), null, 0, null, 0.0f, null, 62);
                            String string = cwgnVar2.b.getString(R.string.phone_number_suggestion_prefix);
                            cjvt cjvtVar = cjvkVar.g;
                            Object b3 = cjze.b(cjvtVar.c, cjvtVar.e, cjwi.PROFILE_PEOPLE_SHARING_SOURCE);
                            if (b3 == null) {
                                b3 = aokuVar.H(true);
                                b3.getClass();
                            }
                            String format = String.format("%s %s", Arrays.copyOf(new Object[]{string, b3}, 2));
                            format.getClass();
                            dngpVar = new dngv(dnyoVar, format, String.valueOf(aokuVar.m(true)), cwirVar2.b(aokuVar), null, ((cwfz) cwgnVar2.d.b()).b(aqkhVar, aokuVar, cwirVar2), null, 80);
                        } else {
                            dnyo dnyoVar2 = new dnyo(new dnwn(uri2, null, null, null, null, 30), null, 0, null, 0.0f, null, 62);
                            String string2 = cwgnVar2.b.getString(R.string.phone_number_suggestion_prefix);
                            cjvt cjvtVar2 = cjvkVar.g;
                            Object b4 = cjze.b(cjvtVar2.c, cjvtVar2.e, cjwi.PROFILE_PEOPLE_SHARING_SOURCE);
                            if (b4 == null) {
                                b4 = aokuVar.H(true);
                                b4.getClass();
                            }
                            String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{string2, b4}, 2));
                            format2.getClass();
                            dngpVar = new dngp(dnyoVar2, format2, String.valueOf(aokuVar.m(true)), null, ((cwfz) cwgnVar2.d.b()).b(aqkhVar, aokuVar, cwirVar2), null, 88);
                        }
                        fflb.this.a = new cwfb("phone_number", dngpVar);
                    }
                };
                String[] strArr = new String[0];
                elho elhoVar = cwgnVar.g;
                ekzm c = elho.c();
                if (c != null) {
                    try {
                        elhoVar.b(runnable, strArr);
                    } finally {
                        ekyf.a(c);
                    }
                } else {
                    elhoVar.b(runnable, strArr);
                }
                cwgpVar = (cwgp) fflbVar.a;
            }
        }
        return new cwgi(cwgpVar);
    }
}
