package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amqw b;
    final /* synthetic */ EmergencyConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqt(amqw amqwVar, EmergencyConversation emergencyConversation, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amqwVar;
        this.c = emergencyConversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amqw amqwVar = this.b;
            EmergencyConversation emergencyConversation = this.c;
            this.a = 1;
            if (amqwVar.H(emergencyConversation, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqt(this.b, this.c, ffguVar);
    }
}
