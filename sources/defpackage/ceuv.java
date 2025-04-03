package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceuv extends Exception {
    public ceuv() {
        super("queue is null");
    }

    public ceuv(IllegalArgumentException illegalArgumentException) {
        super("no handler", illegalArgumentException);
    }
}
