package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqst {
    private static final Map a = ffew.g(new ffcf("smileys_and_emotion", new dqss(R.string.emoji_standard_category_smileys_and_emotion, R.drawable.ic_emoji_standard_category_smileys_and_emotion)), new ffcf("people", new dqss(R.string.emoji_standard_category_people, R.drawable.ic_emoji_standard_category_people)), new ffcf("animals_and_nature", new dqss(R.string.emoji_standard_category_animals_and_nature, R.drawable.ic_emoji_standard_category_animals_and_nature)), new ffcf("food_and_drink", new dqss(R.string.emoji_standard_category_food_and_drink, R.drawable.ic_emoji_standard_category_food_and_drink)), new ffcf("travel_and_places", new dqss(R.string.emoji_standard_category_travel_and_places, R.drawable.ic_emoji_standard_category_travel_and_places)), new ffcf("activities", new dqss(R.string.emoji_standard_category_activities, R.drawable.ic_emoji_standard_category_activities)), new ffcf("objects", new dqss(R.string.emoji_standard_category_objects, R.drawable.ic_emoji_standard_category_objects)), new ffcf("symbols", new dqss(R.string.emoji_standard_category_symbols, R.drawable.ic_emoji_standard_category_symbols)), new ffcf("flags", new dqss(R.string.emoji_standard_category_flags, R.drawable.ic_emoji_standard_category_flags)));

    public static final dqss a(dqog dqogVar) {
        dqogVar.getClass();
        Map map = a;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = dqogVar.a.toLowerCase(locale);
        lowerCase.getClass();
        dqss dqssVar = (dqss) map.get(ffpc.q(ffpc.q(lowerCase, " ", "_"), "&", "and"));
        if (dqssVar != null) {
            return dqssVar;
        }
        throw new IllegalStateException("No resource defined for " + dqogVar.a + "!");
    }
}
