package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abce {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/replies/ReplyMessageExtensionsKt");
    private static final IllegalArgumentException c = new IllegalArgumentException("Unsupported reply snippet content type");

    public static final dofr a(alxr alxrVar, Context context) {
        dofr c2;
        alxrVar.getClass();
        appj g = alxrVar.g();
        if (g instanceof appw) {
            alxz c3 = alxrVar.c();
            if (c3 != null) {
                dofr c4 = ffkj.e(c3.b().toString(), ((appw) g).c()) ? c(c3, b(alxrVar.d(), context)) : null;
                if (c4 != null) {
                    return c4;
                }
            }
            String b2 = b(alxrVar.d(), context);
            String c5 = ((appw) g).c();
            c5.getClass();
            return new dofp(b2, c5);
        }
        if (g instanceof apqd) {
            apqd apqdVar = (apqd) g;
            alxz c6 = alxrVar.c();
            String b3 = b(alxrVar.d(), context);
            if (apqdVar instanceof apps) {
                return (c6 == null || (c2 = c(c6, b3)) == null) ? new dofp(b3, ((apps) apqdVar).m()) : c2;
            }
            if (le.n(apqdVar.b())) {
                String string = context.getString(R.string.reply_snippet_image_attachment_text);
                string.getClass();
                return new dofp(b3, string, new dofv(apqdVar.e()));
            }
            if (!le.A(apqdVar.b())) {
                throw c;
            }
            String string2 = context.getString(R.string.reply_snippet_video_attachment_text);
            string2.getClass();
            return new dofp(b3, string2, new dofx(apqdVar.e()));
        }
        if (g instanceof apmt) {
            String formatElapsedTime = DateUtils.formatElapsedTime(((apmt) g).h().getSeconds());
            formatElapsedTime.getClass();
            String string3 = context.getString(R.string.reply_snippet_audio_attachment_text);
            string3.getClass();
            return new dofp(formatElapsedTime, string3, new dofu(dmzz.cT));
        }
        if (g instanceof apph) {
            apph apphVar = (apph) g;
            String b4 = b(alxrVar.d(), context);
            String h = apphVar.h();
            int ordinal = zwf.a(apphVar.b()).ordinal();
            return new dofp(b4, h, new dofu(ordinal != 0 ? ordinal != 1 ? dmzz.aM : dmzz.Q : dmzz.aN));
        }
        if (g instanceof ufr) {
            String b5 = b(alxrVar.d(), context);
            String string4 = context.getString(R.string.reply_snippet_file_attachment_text);
            string4.getClass();
            return new dofp(b5, string4, new dofu(dmzz.aM));
        }
        ensk j = b.j();
        j.Y(ente.a, "BugleReplies");
        enrr enrrVar = (enrr) j;
        enrrVar.W(1, TimeUnit.MINUTES);
        ((enrr) enrrVar.g(c).h("com/google/android/apps/messaging/conversation2/replies/ReplyMessageExtensionsKt", "toReplyContent", 57, "ReplyMessageExtensions.kt")).q("Unsupported Content Type for reply");
        String b6 = b(alxrVar.d(), context);
        String string5 = context.getString(R.string.reply_snippet_unsupported_content_type_description);
        string5.getClass();
        return new dofp(b6, string5);
    }

    public static final String b(alya alyaVar, Context context) {
        if (alyaVar instanceof alxp) {
            String x = ((alxp) alyaVar).a().x(true);
            x.getClass();
            return x;
        }
        if (alyaVar instanceof alyn) {
            String string = context.getString(R.string.reply_snippet_self_participant_header);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.reply_snippet_unknown_sender_header);
        string2.getClass();
        return string2;
    }

    private static final dofr c(alxz alxzVar, String str) {
        Uri a2;
        if (alxzVar.h() || alxzVar.g() || (a2 = alxzVar.a()) == null) {
            return null;
        }
        String f = alxzVar.f();
        f.getClass();
        return new dofp(str, f, new dofv(a2));
    }
}
