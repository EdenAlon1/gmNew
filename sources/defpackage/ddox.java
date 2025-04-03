package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddox implements ddow {
    private final Context a;

    public ddox(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.ddow
    public final elfl a() {
        String string = this.a.getString(R.string.known_contacts_filter_name);
        string.getClass();
        String[] strArr = bgmn.a;
        bgmm bgmmVar = new bgmm();
        bgmm[] bgmmVarArr = new bgmm[2];
        bgmm bgmmVar2 = new bgmm();
        bgmmVar2.aq(new dtrx("one_on_one_participant.lookup_key", 6));
        bgmmVarArr[0] = bgmmVar2;
        bgmm bgmmVar3 = new bgmm();
        int intValue = bgmn.c().intValue();
        if (intValue < 12001) {
            dtub.w("participant_type", intValue);
        }
        bgmmVar3.aq(new dtwe("one_on_one_participant.participant_type", 2, 0));
        bgmmVarArr[1] = bgmmVar3;
        bgmmVar.ar(bgmmVarArr);
        bgmm bgmmVar4 = new bgmm();
        bgmmVar4.aq(new dtwe("conversations.participant_count", 7, 1));
        bgmm bgmmVar5 = new bgmm();
        bgmmVar5.ar(bgmmVar, bgmmVar4);
        String[] strArr2 = bfkq.a;
        bfkp bfkpVar = new bfkp();
        bfkp[] bfkpVarArr = new bfkp[2];
        bfkp bfkpVar2 = new bfkp();
        bfkpVar2.aq(new dtrx("one_on_one_participant.lookup_key", 6));
        bfkpVarArr[0] = bfkpVar2;
        bfkp bfkpVar3 = new bfkp();
        int intValue2 = bfkq.d().intValue();
        if (intValue2 < 12001) {
            dtub.w("participant_type", intValue2);
        }
        bfkpVar3.aq(new dtwe("one_on_one_participant.participant_type", 2, 0));
        bfkpVarArr[1] = bfkpVar3;
        bfkpVar.ar(bfkpVarArr);
        bfkp bfkpVar4 = new bfkp();
        bfkpVar4.aq(new dtwe("conversations.participant_count", 7, 1));
        bfkp bfkpVar5 = new bfkp();
        bfkpVar5.ar(bfkpVar, bfkpVar4);
        elfl e = elfo.e(new cbsx(R.drawable.quantum_gm_ic_account_circle_vd_theme_24, string, bgmmVar5, bfkpVar5, true, 13, cbsy.c));
        e.getClass();
        return e;
    }
}
