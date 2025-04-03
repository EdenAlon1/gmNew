package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgn implements bdnu {
    public final ffbr a;
    private final ffsk b;

    public ajgn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = ffbrVar2;
        this.b = ffskVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aoku, java.lang.Object] */
    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        elfl c;
        messageCoreData.getClass();
        Object e = ((cfup) ctjd.ak.get()).e();
        e.getClass();
        if (((Boolean) e).booleanValue() && messageCoreData.cX() && !messageCoreData.ag().isEmpty() && messageCoreData.ag().get().A()) {
            c = axol.c(this.b, ffhe.a, ffsm.a, new ajgm(this, messageCoreData, null));
            axnw.h(c);
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
