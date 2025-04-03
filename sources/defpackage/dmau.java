package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmau implements dmba {
    public final String a;
    public final dmci b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public dmau() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmau)) {
            return false;
        }
        dmau dmauVar = (dmau) obj;
        int i = dmauVar.c;
        return ffkj.e(this.a, dmauVar.a) && ffkj.e(this.b, dmauVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CalendarEvent(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ dmau(String str, dmci dmciVar, int i) {
        dmciVar = (i & 4) != 0 ? new dmci(null) : dmciVar;
        str = (i & 2) != 0 ? null : str;
        dmciVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = dmciVar;
    }
}
