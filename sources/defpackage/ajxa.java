package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajxa implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ akcg b;

    public ajxa(UUID uuid, akcg akcgVar) {
        this.a = uuid;
        this.b = akcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bxkz a = bxle.a();
        a.z("RestoreWorkflowSettingsService#addAttachmentFileMetadata");
        a.c(new ajwz(this.a));
        bxjb bxjbVar = (bxjb) ((bxkf) a.b().o()).cS();
        if (bxjbVar == null) {
            throw new ajww(this.a);
        }
        UUID uuid = this.a;
        akcg akcgVar = this.b;
        if (!ajyr.x(bxjbVar)) {
            throw new IllegalStateException(a.i(uuid, "restore execution [", "] already is not active"));
        }
        String[] strArr = bxmu.a;
        bxlp bxlpVar = new bxlp();
        bxlpVar.f(bxjbVar.k());
        bxlpVar.c(akcgVar);
        bxlpVar.d(bxmw.b);
        bxlpVar.e(bxmv.a);
        bxlpVar.b();
    }
}
