package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qng extends Exception {
    public qng() {
        super("Invalid quoted-printable encoding");
    }

    public qng(Throwable th) {
        super("Invalid quoted-printable encoding", th);
    }
}
