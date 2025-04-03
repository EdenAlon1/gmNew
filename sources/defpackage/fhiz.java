package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhiz {
    public final fhgt a;
    public final int b;
    public final String c;

    public fhiz(fhgt fhgtVar, int i, String str) {
        fhgtVar.getClass();
        str.getClass();
        this.a = fhgtVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == fhgt.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
