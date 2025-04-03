package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxq {
    private final Context a;
    private final ablq b;

    public sxq(Context context, ablq ablqVar) {
        context.getClass();
        ablqVar.getClass();
        this.a = context;
        this.b = ablqVar;
    }

    public final Object a(String str, Boolean bool, Boolean bool2, ffix ffixVar, ffgu ffguVar) {
        if (bool == null && bool2 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object a = this.b.a(ffixVar == null ? new ablt(b(str, bool, bool2), null, false, 0, null, 125) : new ablt(b(str, bool, bool2), this.a.getString(R.string.snack_bar_undo), false, 0, ffixVar, 57), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public final String b(String str, Boolean bool, Boolean bool2) {
        int i;
        str.getClass();
        if (bool != null && bool2 != null) {
            i = bool.booleanValue() ? R.string.blocked_and_reported_toast_message : R.string.unblock_and_report_not_spam_snackbar_message;
        } else if (bool != null) {
            i = bool.booleanValue() ? R.string.blocked_toast_message : R.string.unblock_snackbar_message;
        } else {
            bool2.getClass();
            i = bool2.booleanValue() ? R.string.report_spam_snackbar_message : R.string.report_not_spam_snackbar_message;
        }
        String string = this.a.getString(i, str);
        string.getClass();
        return string;
    }
}
