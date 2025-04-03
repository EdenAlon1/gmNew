package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjc {
    public static final etjc a = new etjc("ASSUME_AES_GCM");
    public static final etjc b = new etjc("ASSUME_XCHACHA20POLY1305");
    public static final etjc c = new etjc("ASSUME_CHACHA20POLY1305");
    public static final etjc d = new etjc("ASSUME_AES_CTR_HMAC");
    public static final etjc e = new etjc("ASSUME_AES_EAX");
    public static final etjc f = new etjc("ASSUME_AES_GCM_SIV");
    public final String g;

    private etjc(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
