package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqp implements cyqk {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl");
    public final Conversation b;
    public final ffsk c;
    public final ffbr d;
    public final ejvb e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final Context j;
    private final ffxx k;
    private final ffxx l;
    private final ffsk m;
    private final ffxx n;
    private final ffxx o;
    private final String p;

    public cyqp(Context context, ffxx ffxxVar, ffxx ffxxVar2, ffsk ffskVar, ffxx ffxxVar3, Conversation conversation, ffxx ffxxVar4, ffsk ffskVar2, ffbr ffbrVar, ejvb ejvbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffskVar.getClass();
        ffxxVar3.getClass();
        conversation.getClass();
        ffskVar2.getClass();
        ejvbVar.getClass();
        ffbrVar2.getClass();
        this.j = context;
        this.k = ffxxVar;
        this.l = ffxxVar2;
        this.m = ffskVar;
        this.n = ffxxVar3;
        this.b = conversation;
        this.o = ffxxVar4;
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.e = ejvbVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        String string = context.getString(R.string.more_about_rcs_chats);
        string.getClass();
        this.p = string;
    }

    @Override // defpackage.cyqk
    public final ffxx a() {
        ffxx ffxxVar = this.o;
        ffxx ffxxVar2 = this.n;
        return axsp.i(axrb.a(this.k, "ConversationProperties"), axrb.a(ffxxVar2, "ComposeConstraints"), axrb.a(ffxxVar, "ActiveSelfIdentity"), this.l, this.m, new cyqn(this, null));
    }

    public final cyqq b() {
        return new cyqq(2, this.j.getString(R.string.encryption_status_details_off, this.p));
    }
}
