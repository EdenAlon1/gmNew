package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sgc extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ sgd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgc(MessageCoreData messageCoreData, sgd sgdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = messageCoreData;
        this.e = sgdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffnf ffnfVar;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            Object obj3 = this.b;
            obj2 = this.a;
            ffci.b(obj);
            ffnfVar = obj3;
        } else {
            ffci.b(obj);
            ffng ffngVar = new ffng(ffdx.as(this.d.ab()), true, new ffji() { // from class: sga
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj4;
                    boolean z = false;
                    if (messagePartCoreData.ba() && messagePartCoreData.t() != null && (messagePartCoreData.M().b & 2) == 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            sgd sgdVar = this.e;
            ffnf ffnfVar2 = new ffnf(ffngVar);
            obj2 = sgdVar;
            ffnfVar = ffnfVar2;
        }
        while (ffnfVar.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ffnfVar.next();
            ((enrr) sgd.a.h().h("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener$queueForAmplitude$1", "invokeSuspend", 95, "AmplitudeTriggerListener.kt")).t("Triggering automatic AudioLevels calculation of message part %s.", messagePartCoreData.aa());
            sgd sgdVar2 = (sgd) obj2;
            ffhd a = ekxi.a(sgdVar2.b);
            sgb sgbVar = new sgb(null, messagePartCoreData, sgdVar2);
            this.a = obj2;
            this.b = ffnfVar;
            this.c = 1;
            if (ffra.a(a, sgbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sgc(this.d, this.e, ffguVar);
    }
}
