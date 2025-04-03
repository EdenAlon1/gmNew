package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chbs implements kfd {
    final /* synthetic */ chbu a;

    public chbs(chbu chbuVar) {
        this.a = chbuVar;
    }

    @Override // defpackage.kfd
    public final Object a(kfb kfbVar) {
        ensk h = chbu.a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider$1", "attachCompleter", 479, "PhoneRegistrationProvider.java")).q("otpCompleter is set");
        synchronized (this.a.n) {
            this.a.o = kfbVar;
        }
        return "OTP Verification";
    }
}
