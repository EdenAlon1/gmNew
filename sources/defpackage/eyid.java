package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyid implements eyhp {
    public final eyhs a;
    public final String b;
    public final Object[] c;
    private final int d;

    public eyid(eyhs eyhsVar, String str, Object[] objArr) {
        this.a = eyhsVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // defpackage.eyhp
    public final eyhs a() {
        return this.a;
    }

    @Override // defpackage.eyhp
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.eyhp
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
