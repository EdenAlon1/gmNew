package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpe implements ddow {
    private final Context a;

    public ddpe(Context context, aswf aswfVar) {
        context.getClass();
        aswfVar.getClass();
        this.a = context;
    }

    @Override // defpackage.ddow
    public final elfl a() {
        String string = this.a.getString(R.string.unread_filter_name);
        string.getClass();
        String[] strArr = bgmn.a;
        bgmm bgmmVar = new bgmm();
        int intValue = bgmn.c().intValue();
        if (intValue < 59220) {
            dtub.w("marked_as_unread", intValue);
        }
        bgmmVar.aq(new dtwe("conversations.marked_as_unread", 1, 1));
        bgmm bgmmVar2 = new bgmm();
        bgmmVar2.as(new dtzq("$R > 0", new Object[]{"unread_message_count"}));
        bgmm bgmmVar3 = new bgmm();
        bgmmVar3.ar(bgmmVar, bgmmVar2);
        String[] strArr2 = bfkq.a;
        bfkp bfkpVar = new bfkp();
        int intValue2 = bfkq.d().intValue();
        if (intValue2 < 59220) {
            dtub.w("marked_as_unread", intValue2);
        }
        bfkpVar.aq(new dtwe("conversations.marked_as_unread", 1, 1));
        bfkp bfkpVar2 = new bfkp();
        bfkpVar2.as(new dtzq("$R > 0", new Object[]{"unread_message_count"}));
        bfkp bfkpVar3 = new bfkp();
        int intValue3 = bfkq.d().intValue();
        if (intValue3 < 60740) {
            dtub.w("unread_count", intValue3);
        }
        bfkpVar3.aq(new dtwe("conversations.unread_count", 7, 0));
        bfkp bfkpVar4 = new bfkp();
        bfkpVar4.ar(bfkpVar, bfkpVar2);
        elfl e = elfo.e(new cbsx(R.drawable.unread, string, bgmmVar3, bfkpVar4, true, 12, cbsy.b));
        e.getClass();
        return e;
    }
}
