package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytf implements cysw {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl");
    public static final cytm b;
    public static final RuntimeException c;
    public final Context d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final atix h;
    private final ffsk i;
    private final ffxx j;
    private final ffxx k;
    private final ffxx l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;

    static {
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        b = new cytm(engwVar, new cytl((byte[]) null));
        c = new RuntimeException("InvalidCdpAccess");
    }

    public cytf(Context context, ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, atix atixVar) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffxxVar3.getClass();
        ffbrVar2.getClass();
        ffbrVar7.getClass();
        this.d = context;
        this.i = ffskVar;
        this.j = ffxxVar;
        this.k = ffxxVar2;
        this.l = ffxxVar3;
        this.e = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.o = ffbrVar4;
        this.p = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = atixVar;
    }

    @Override // defpackage.cysw
    public final ffxx a() {
        return axsp.g(axrb.a(this.j, "ConversationProperties"), axrb.a(this.k, "Recipients"), axrb.a(this.l, "IsPenpalConversation"), axrb.a(((wsf) this.m.b()).d, "PhoneCallAction"), axrb.a(((xck) this.n.b()).n, "VideoCallAction"), axrb.a(((wrn) this.o.b()).h, "AddPeopleToGroupAction"), axrb.a(((wyu) this.p.b()).c, "SearchAction"), this.i, new cytd(this, null));
    }

    public final void b(ResolvedRecipient resolvedRecipient) {
        axol.k(this.i, null, new cyte(this, resolvedRecipient, null), 3);
    }
}
