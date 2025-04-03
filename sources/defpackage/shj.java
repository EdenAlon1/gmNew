package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shj implements bdns, bdnt {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffsk d;

    public shj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.c = ffbrVar2;
        this.b = ffbrVar3;
        this.d = ffskVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        MessagePartCoreData G;
        if (((ctml) this.c.b()).j() && (G = messageCoreData.G()) != null && G.ba()) {
            axol.m(this.d, new shi(this, messageCoreData, null));
        }
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
