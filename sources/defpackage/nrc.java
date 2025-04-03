package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrc {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public nrc(String str, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodecInfo{type=");
        sb.append((true != this.b ? "Audio" : "Video").concat(true != this.c ? "Encoder" : "Decoder"));
        sb.append(", configurationFormat=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
