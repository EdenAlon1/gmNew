package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upr extends upz {
    public boolean a;
    public int d;

    public upr(Context context, cqoh cqohVar, czic czicVar) {
        super(czicVar, cqohVar);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.conversation_compose_message_placeholder_default_height);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a ? 1 : 0;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ((uqe) wrVar).s.getLayoutParams().height = this.d;
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return -5L;
    }

    @Override // defpackage.upz
    protected final int m(int i) {
        return R.layout.conversation_compose_message_placeholder;
    }
}
