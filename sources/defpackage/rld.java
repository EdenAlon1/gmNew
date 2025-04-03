package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rld {
    public static final rld a = new rld(rlc.None, 0);
    public static final rld b = new rld(rlc.XMidYMid, 1);
    public final rlc c;
    public final int d;

    public rld(rlc rlcVar, int i) {
        this.c = rlcVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rld rldVar = (rld) obj;
        return this.c == rldVar.c && this.d == rldVar.d;
    }
}
