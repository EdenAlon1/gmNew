package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgx {
    public static final cfup a = cfvl.m(cfvl.b, "tachyon_phone_host_and_port", "instantmessaging-pa-us.googleapis.com:443");
    public final String b;

    public chgx(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chgx) && ffkj.e(this.b, ((chgx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ChannelConfiguration(url=" + this.b + ")";
    }
}
