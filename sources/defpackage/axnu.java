package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axnu implements erqj {
    private final String c;
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent");
    public static final axnu a = new axnu("Unexpected error in fire&forget future");

    public axnu(String str) {
        this.c = str;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) b.j()).g(th)).h("com/google/android/apps/messaging/shared/concurrent/CrashOnUnexpectedExceptionFutureCallback$EmptyLoggingCallbackNoParent", "onFailure", 205, "CrashOnUnexpectedExceptionFutureCallback.java")).q(this.c);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
