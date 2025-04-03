package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsg implements zrz {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl");
    public final zqx b;
    public final Set c;
    public final aawr d;
    private final ffsk e;
    private final ffhd f;
    private final int g;

    public zsg(ffsk ffskVar, ffhd ffhdVar, zqx zqxVar, aawr aawrVar, apvw apvwVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        zqxVar.getClass();
        aawrVar.getClass();
        apvwVar.getClass();
        this.e = ffskVar;
        this.f = ffhdVar;
        this.b = zqxVar;
        this.d = aawrVar;
        int a2 = apvwVar.a();
        int c = apvwVar.c();
        int i = a2 + c + c;
        this.g = i;
        this.c = enpw.i();
        ffwp.a(i, 0, 6);
        axol.k(ffskVar, ffhdVar, new zsf(this, null), 2);
    }

    @Override // defpackage.zrz
    public final void a(zrn zrnVar) {
        if (this.c.size() < this.g) {
            this.c.add(zrnVar);
            return;
        }
        enrr enrrVar = (enrr) a.g();
        enrrVar.W(1, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataPreloaderImpl", "add", 127, "MessageUiDataPreloaderImpl.kt")).q("MessageUiDataPreloader: not preloading message as the buffer is at capacity.");
    }
}
