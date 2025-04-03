package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvor implements bdnu {
    private static final enru a = enru.c("com/google/android/apps/messaging/spam/spatula/SpatulaOnRcsMessageReceivedListener");
    private final ffbr b;

    public cvor(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        ((enrr) a.e().h("com/google/android/apps/messaging/spam/spatula/SpatulaOnRcsMessageReceivedListener", "beforeMessageInserted", 41, "SpatulaOnRcsMessageReceivedListener.kt")).q("Spatula beforeMessageInserted");
        if (cubs.f() && le.n(messageCoreData.al())) {
            ((cutu) this.b.b()).a();
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
