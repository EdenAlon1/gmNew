package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgd implements bdns, bdnt, bdod {
    public static final enru a = enru.c("com/google/android/apps/messaging/audio/amplitude/AmplitudeTriggerListener");
    public final ffhd b;
    public final sgp c;
    private final ffsk d;
    private final ffbr e;

    public sgd(ffsk ffskVar, ffhd ffhdVar, sgp sgpVar, @aret ffbr ffbrVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        this.d = ffskVar;
        this.b = ffhdVar;
        this.c = sgpVar;
        this.e = ffbrVar;
    }

    private final void k(MessageCoreData messageCoreData) {
        if (j()) {
            axol.k(this.d, null, new sgc(messageCoreData, this, null), 3);
        }
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        k(messageCoreData);
    }

    @Override // defpackage.bdod
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        k(messageCoreData);
    }

    @Override // defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        k(messageCoreData);
    }

    @Override // defpackage.bdod
    public final boolean j() {
        Object b = this.e.b();
        b.getClass();
        return ((Boolean) b).booleanValue();
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
