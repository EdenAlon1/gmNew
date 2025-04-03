package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbg {
    public final Integer a;

    public dsbg(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsbg) && ffkj.e(this.a, ((dsbg) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ShortcutsScreenArguments(autoLaunchShortcut=" + this.a + ")";
    }

    public dsbg() {
        this(null);
    }
}
