package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqo {
    public final int a;
    public int b = -1;
    private final oqn c;

    public oqo(int i, oqn oqnVar) {
        this.a = i;
        this.c = oqnVar;
    }

    public final void a(int i, int i2, boolean z) {
        boolean z2;
        ksw.a(i2 >= i);
        while (true) {
            opq opqVar = ((opp) this.c).a;
            if (i > i2) {
                opqVar.e();
                return;
            }
            String b = ((aeby) opqVar.b).b(i);
            if (b != null) {
                if (!z) {
                    opqVar.a.b.remove(b);
                    z2 = false;
                } else if (!opqVar.a.a.contains(b)) {
                    opqVar.a.b.add(b);
                    z2 = true;
                }
                opqVar.d(b, z2);
            }
            i++;
        }
    }

    public final String toString() {
        return "Range{begin=" + this.a + ", end=" + this.b + "}";
    }
}
