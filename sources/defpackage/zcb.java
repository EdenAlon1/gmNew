package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcb {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker");
    public final ConversationId b;
    public final alxl c;
    public final cqoh d;
    public final abam e;
    public final fgdj f;
    public final fgdj g;
    private final ffxx h;
    private final ffsk i;
    private final Context j;
    private final boolean k;
    private final dwjy l;
    private final ffxx m;
    private final ffxx n;

    public zcb(ffxx ffxxVar, ffxx ffxxVar2, ConversationId conversationId, ffsk ffskVar, Context context, alxl alxlVar, cqoh cqohVar, abam abamVar) {
        ffxxVar.getClass();
        ffxxVar2.getClass();
        conversationId.getClass();
        ffskVar.getClass();
        context.getClass();
        alxlVar.getClass();
        cqohVar.getClass();
        abamVar.getClass();
        this.h = ffxxVar2;
        this.b = conversationId;
        this.i = ffskVar;
        this.j = context;
        this.c = alxlVar;
        this.d = cqohVar;
        this.e = abamVar;
        boolean b = dwgx.b();
        this.k = b;
        hik hikVar = dopp.a;
        dwjy dwjyVar = (dwjy) new dopd().a(context, Boolean.valueOf(b));
        this.l = dwjyVar;
        new dooz().a(Boolean.valueOf(dskj.e(context)), dwjyVar, Boolean.valueOf(b));
        zbv zbvVar = new zbv(ffyy.a(new zbs(ffxxVar2)));
        this.m = zbvVar;
        int i = fgcz.a;
        this.f = fgbn.b(zbvVar, ffskVar, fgcy.b, null);
        ffxx a2 = ffyy.a(new zby(ffxxVar));
        this.n = a2;
        this.g = fgbn.b(new fgch(a2, zbvVar, new zbz(this, null)), ffskVar, fgcy.b, new dopd());
    }
}
