package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advy implements advh {
    private final Context a;
    private final engw b;

    public advy(Context context, engw engwVar) {
        this.a = context;
        this.b = engwVar;
    }

    @Override // defpackage.advh
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.advh
    public final eoik b() {
        return eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_LOST;
    }

    @Override // defpackage.advh
    public final String c() {
        return this.a.getString(R.string.message_lost_text);
    }
}
