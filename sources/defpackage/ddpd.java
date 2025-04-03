package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpd implements ddow {
    private final Context a;

    public ddpd(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.ddow
    public final elfl a() {
        String string = this.a.getString(R.string.unknown_contacts_filter_name);
        string.getClass();
        String[] strArr = bgmn.a;
        bgmm bgmmVar = new bgmm();
        bgmmVar.aq(new dtrx("one_on_one_participant.lookup_key", 5));
        bgmmVar.aq(new dtwe("conversations.participant_count", 1, 1));
        int intValue = bgmn.c().intValue();
        if (intValue < 12001) {
            dtub.w("participant_type", intValue);
        }
        bgmmVar.aq(new dtwe("one_on_one_participant.participant_type", 1, 0));
        String[] strArr2 = bfkq.a;
        bfkp bfkpVar = new bfkp();
        bfkpVar.aq(new dtrx("one_on_one_participant.lookup_key", 5));
        bfkpVar.aq(new dtwe("conversations.participant_count", 1, 1));
        int intValue2 = bfkq.d().intValue();
        if (intValue2 < 12001) {
            dtub.w("participant_type", intValue2);
        }
        bfkpVar.aq(new dtwe("one_on_one_participant.participant_type", 1, 0));
        elfl e = elfo.e(new cbsx(R.drawable.quantum_gm_ic_no_accounts_vd_theme_24, string, bgmmVar, bfkpVar, true, 14, cbsy.d));
        e.getClass();
        return e;
    }
}
