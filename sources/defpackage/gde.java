package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gde implements jwn {
    public final int a;
    public final int b;
    public final int c;
    private final haw e;
    private final gdd f = new gdd(this);

    public gde(haw hawVar) {
        this.e = hawVar;
        this.a = ffpc.P(hawVar.a, hawVar.b, 0, 6);
        this.b = ffpc.R(hawVar.a, hawVar.b, 0, 6);
        this.c = hawVar.c.length();
    }

    @Override // defpackage.jwn
    public final jwk a(jlm jlmVar) {
        String str;
        int length = jlmVar.b.length();
        int i = this.c;
        int i2 = 0;
        if (length > i) {
            String str2 = jlmVar.b;
            ffmj q = ffmk.q(0, i);
            str2.getClass();
            q.getClass();
            str = str2.substring(q.d().intValue(), q.c().intValue() + 1);
            str.getClass();
        } else {
            str = jlmVar.b;
        }
        String str3 = "";
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i3 + 1;
            str3 = str3 + str.charAt(i2);
            if (i4 == this.a || i3 + 2 == this.b) {
                str3 = str3 + this.e.b;
            }
            i2++;
            i3 = i4;
        }
        return new jwk(new jlm(str3, null, 6), this.f);
    }
}
