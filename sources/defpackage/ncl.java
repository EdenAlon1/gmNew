package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncl {
    public final String a;

    private ncl(String str) {
        this.a = str;
    }

    public static ncl a(luv luvVar) {
        String str;
        luvVar.L(2);
        int j = luvVar.j();
        int i = j >> 1;
        int i2 = j & 1;
        int j2 = luvVar.j() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = j2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new ncl(sb.toString());
    }
}
