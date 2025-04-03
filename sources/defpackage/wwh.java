package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwh implements wqq {
    private final ffxx a;
    private final Set b;

    public wwh(Context context, final aigz aigzVar, final Conversation conversation) {
        context.getClass();
        aigzVar.getClass();
        conversation.getClass();
        String string = context.getString(R.string.action_help_and_feedback);
        string.getClass();
        this.a = new ffyg(new dlsr(string, null, false, true, !((Boolean) adwg.a.e()).booleanValue(), false, null, false, null, new ffix() { // from class: wwg
            @Override // defpackage.ffix
            public final Object invoke() {
                aigz.this.h(new aikx(null, conversation.j(), 1));
                return ffcu.a;
            }
        }, 998));
        this.b = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.a;
    }
}
