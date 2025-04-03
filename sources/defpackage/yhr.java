package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yhr implements ygz, xhv {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final alye d;
    public final ydb e;
    public final abcp f;
    public final xyd g;
    public final ffbr h;
    private final ffhd i;
    private final fgdj j;

    public yhr(Context context, ffhd ffhdVar, ffsk ffskVar, alye alyeVar, ydb ydbVar, abcp abcpVar, xyd xydVar, ffbr ffbrVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        alyeVar.getClass();
        ydbVar.getClass();
        abcpVar.getClass();
        ffbrVar.getClass();
        this.b = context;
        this.i = ffhdVar;
        this.c = ffskVar;
        this.d = alyeVar;
        this.e = ydbVar;
        this.f = abcpVar;
        this.g = xydVar;
        this.h = ffbrVar;
        ffxx a2 = ffyy.a(new yhi(ydbVar.a));
        yhf yhfVar = new yhf(null, this);
        int i = fgau.a;
        yhl yhlVar = new yhl(new fgen(yhfVar, a2), this);
        int i2 = fgcz.a;
        this.j = fgbn.b(yhlVar, ffskVar, fgcy.b, null);
    }

    @Override // defpackage.xhv
    public final Object a(MessageId messageId, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.i), new yhd(null, this, messageId), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.ygz
    public final fgdj b() {
        return this.j;
    }

    public final void c() {
        xhu a2 = this.e.a(new ffji() { // from class: yha
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhu.c(xhuVar, null, null, null, false, null, null, false, 0, 1007);
            }
        });
        ensk f = a.f();
        f.Y(ente.a, "BugleComposeRow2");
        ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/replies/DraftReplyUiAdapterImpl", "removeReplyToSync", 123, "DraftReplyUiAdapterImpl.kt")).t("Removed reply to %s", a2.e);
    }
}
