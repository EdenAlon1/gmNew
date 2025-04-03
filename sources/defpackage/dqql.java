package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqql {
    public final int a;
    private final ffbz b = ffca.a(new ffix() { // from class: dqqk
        @Override // defpackage.ffix
        public final Object invoke() {
            char[] chars = Character.toChars(dqql.this.a);
            chars.getClass();
            return new String(chars);
        }
    });

    public dqql(int i) {
        this.a = i;
    }

    public final String a() {
        return (String) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqql) && this.a == ((dqql) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Modifier(raw=" + this.a + ")";
    }
}
