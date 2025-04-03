package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmx {
    public final Map a;
    public final Map b;
    private final Context c;

    public wmx(Context context) {
        context.getClass();
        this.c = context;
        this.a = ffew.f(new ffcf(context.getString(R.string.rephrase_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE), new ffcf(context.getString(R.string.shakespeare_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE), new ffcf(context.getString(R.string.fellow_kid_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID), new ffcf(context.getString(R.string.excited_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED), new ffcf(context.getString(R.string.rhyme_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES), new ffcf(context.getString(R.string.formal_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL), new ffcf(context.getString(R.string.concise_tone), eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE));
        esgx esgxVar = esgx.TONE_UNSPECIFIED;
        eqtg eqtgVar = eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED;
        this.b = ffew.f(new ffcf(esgx.TONE_REPHRASE, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_REPHRASE), new ffcf(esgx.TONE_SHAKESPEARE, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_SHAKESPEARE), new ffcf(esgx.TONE_CHILL, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FELLOW_KID), new ffcf(esgx.TONE_EXCITED, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_EXCITED), new ffcf(esgx.TONE_RHYMES, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_RHYMES), new ffcf(esgx.TONE_FORMAL, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_FORMAL), new ffcf(esgx.TONE_CONCISE, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_CONCISE), new ffcf(esgxVar, eqtgVar), new ffcf(esgx.UNRECOGNIZED, eqtgVar));
    }
}
