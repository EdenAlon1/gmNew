package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rkt extends roa {
    public rkt(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public final String a() {
        int i;
        int i2;
        int i3;
        if (o()) {
            i3 = this.b;
            i2 = i3;
        } else {
            int i4 = this.b;
            int charAt = this.a.charAt(i4);
            if (charAt == 45) {
                charAt = e();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i4;
            } else {
                int e = e();
                while (true) {
                    if ((e < 65 || e > 90) && ((e < 97 || e > 122) && !((e >= 48 && e <= 57) || e == 45 || e == 95))) {
                        break;
                    }
                    e = e();
                }
                i = this.b;
            }
            this.b = i4;
            int i5 = i;
            i2 = i4;
            i3 = i5;
        }
        if (i3 == i2) {
            return null;
        }
        String substring = this.a.substring(i2, i3);
        this.b = i3;
        return substring;
    }
}
