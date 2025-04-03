package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajca {
    private static final enru c = enru.c("com/google/android/apps/messaging/penpal/conversation/GeminiSmartSuggestionDatabaseOperations");
    public final cqoh a;
    public final ffbr b;
    private final Context d;

    public ajca(Context context, cqoh cqohVar, ffbr ffbrVar) {
        context.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        this.d = context;
        this.a = cqohVar;
        this.b = ffbrVar;
    }

    static /* synthetic */ fbxa b(String str) {
        return c(str, null);
    }

    private static final fbxa c(String str, String str2) {
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        fbwzVar.getClass();
        fbxb fbxbVar = (fbxb) fbxc.a.createBuilder();
        fbxbVar.getClass();
        fbrp.b(str, fbxbVar);
        fbxbVar.copyOnWrite();
        fbxc fbxcVar = (fbxc) fbxbVar.instance;
        fbxcVar.b |= 1;
        if (str2 != null) {
            str = str2;
        }
        fbxcVar.d = str;
        fbro.d(fbrp.a(fbxbVar), fbwzVar);
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        fbwxVar.getClass();
        fbrn.b(fbri.BARD, fbwxVar);
        fbro.c(fbrn.a(fbwxVar), fbwzVar);
        return fbro.a(fbwzVar);
    }

    public final void a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        List g;
        ((enrr) c.e().h("com/google/android/apps/messaging/penpal/conversation/GeminiSmartSuggestionDatabaseOperations", "insertSuggestions", 53, "GeminiSmartSuggestionDatabaseOperations.kt")).D("#addBardSuggestions messageId=%s, conversationId=%s", messageIdType, conversationIdType);
        ctqh ctqhVar = (ctqh) this.b.b();
        if (((Boolean) ((cfup) ctjd.at.get()).e()).booleanValue()) {
            String string = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_1);
            string.getClass();
            String string2 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_2);
            string2.getClass();
            String string3 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_3);
            string3.getClass();
            String string4 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_4);
            string4.getClass();
            String string5 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_5);
            string5.getClass();
            String string6 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_6);
            string6.getClass();
            String string7 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_7);
            string7.getClass();
            String string8 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_8);
            string8.getClass();
            String string9 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_9);
            string9.getClass();
            String string10 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_10);
            string10.getClass();
            String string11 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_11);
            string11.getClass();
            String string12 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_12);
            string12.getClass();
            String string13 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_13);
            string13.getClass();
            String string14 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_14);
            string14.getClass();
            String string15 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_15);
            string15.getClass();
            String string16 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_16);
            string16.getClass();
            String string17 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_17);
            string17.getClass();
            String string18 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_18);
            string18.getClass();
            String string19 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_19);
            string19.getClass();
            String string20 = this.d.getString(R.string.penpal_sept_2024_starter_suggestion_20);
            string20.getClass();
            g = ffdx.c(ffdx.g(b(string), b(string2), b(string3), b(string4), b(string5), b(string6), b(string7), b(string8), b(string9), b(string10), b(string11), b(string12), b(string13), b(string14), b(string15), b(string16), b(string17), b(string18), b(string19), b(string20)));
        } else if (((Boolean) ((cfup) ctjd.as.get()).e()).booleanValue()) {
            String string21 = this.d.getString(R.string.penpal_funny_lyrics_suggestion_v2);
            string21.getClass();
            String string22 = this.d.getString(R.string.penpal_short_story_suggestion_v2);
            string22.getClass();
            String string23 = this.d.getString(R.string.penpal_funny_animal_jobs_suggestion_v2);
            string23.getClass();
            String string24 = this.d.getString(R.string.penpal_would_you_rather_suggestion_v2);
            string24.getClass();
            String string25 = this.d.getString(R.string.penpal_dinner_suggestion_v2);
            string25.getClass();
            String string26 = this.d.getString(R.string.penpal_ice_breaker_suggestion_v2);
            string26.getClass();
            String string27 = this.d.getString(R.string.penpal_message_draft_suggestion_v2);
            string27.getClass();
            String string28 = this.d.getString(R.string.penpal_surprise_party_suggestion_v2);
            string28.getClass();
            g = ffdx.g(c(string21, this.d.getString(R.string.penpal_funny_lyrics_prompt)), c(string22, this.d.getString(R.string.penpal_short_story_prompt)), c(string23, this.d.getString(R.string.penpal_funny_animal_jobs_prompt)), c(string24, this.d.getString(R.string.penpal_would_you_rather_prompt)), c(string25, this.d.getString(R.string.penpal_dinner_prompt)), c(string26, this.d.getString(R.string.penpal_ice_breaker_prompt)), c(string27, this.d.getString(R.string.penpal_message_darft_prompt)), c(string28, this.d.getString(R.string.penpal_surprise_party_prompt)));
        } else {
            String string29 = this.d.getString(R.string.penpal_message_draft_suggestion_v2);
            string29.getClass();
            String string30 = this.d.getString(R.string.penpal_dinner_suggestion_v2);
            string30.getClass();
            String string31 = this.d.getString(R.string.penpal_conversation_starters_suggestion_v2);
            string31.getClass();
            String string32 = this.d.getString(R.string.penpal_movie_night_suggestion_v2);
            string32.getClass();
            String string33 = this.d.getString(R.string.penpal_joke_suggestion_v2);
            string33.getClass();
            String string34 = this.d.getString(R.string.penpal_workout_suggestion_v2);
            string34.getClass();
            g = ffdx.g(c(string29, this.d.getString(R.string.penpal_message_darft_prompt)), c(string30, this.d.getString(R.string.penpal_dinner_prompt)), c(string31, this.d.getString(R.string.penpal_conversation_starters_prompt)), c(string32, this.d.getString(R.string.penpal_movie_night_prompt)), c(string33, this.d.getString(R.string.penpal_joke_prompt)), c(string34, this.d.getString(R.string.penpal_workout_prompt)));
        }
        ctqhVar.l(g, conversationIdType, messageIdType, this.a.f().toEpochMilli());
    }
}
