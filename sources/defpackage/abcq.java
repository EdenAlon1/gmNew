package defpackage;

import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abcr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abcq(abcr abcrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abcq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abcr abcrVar = this.b;
            this.a = 1;
            obj = fgbj.a(abcrVar.d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw engwVar = (engw) obj;
        if (!engwVar.isEmpty() && aojl.b(((ResolvedRecipient) engwVar.get(0)).g().n())) {
            abcr abcrVar2 = this.b;
            ((enrr) abcr.a.h().h("com/google/android/apps/messaging/conversation2/satellite/EndSatelliteDemoConversationStoppedListener", "tryToEndSatelliteSession", 62, "EndSatelliteDemoConversationStoppedListener.kt")).q("Force ending satellite demo with END_SATELLITE_SESSION intent.");
            Intent intent = new Intent();
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            intent.setPackage("com.google.android.apps.stargate");
            intent.setAction("com.google.android.apps.stargate.END_SATELLITE_SESSION");
            intent.putExtra("force_end_session", true);
            abcrVar2.b.sendBroadcast(intent);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abcq(this.b, ffguVar);
    }
}
