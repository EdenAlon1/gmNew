package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtui {
    public static final dtui a = new dtui(null);
    public static final dtui b = new dtui("$EXEMPT_FOR_TEST$");
    public static final dtui c = new dtui("$EXEMPT_INTERNAL$");
    private final String d;
    private final dtui e;
    private final String f;

    public dtui(dtui dtuiVar, String str) {
        this.d = "";
        this.e = dtuiVar;
        this.f = str;
    }

    public final ecgi a() {
        dtui dtuiVar = this.e;
        return dtuiVar != null ? dtuiVar.a() : new ecgk(this.d);
    }

    public final Object b(dtuh dtuhVar) {
        return dtuhVar.a(this.d);
    }

    public final boolean c() {
        String str = this.d;
        if (str != null && str.length() != 0) {
            return false;
        }
        dtui dtuiVar = this.e;
        return dtuiVar == null || dtuiVar.c();
    }

    public final String toString() {
        dtui dtuiVar = this.e;
        return String.valueOf(dtuiVar != null ? dtuiVar.toString() : this.d).concat(emxe.b(this.f));
    }

    public dtui(String str, String str2) {
        this.d = str;
        this.e = null;
        this.f = str2;
    }

    public dtui(String str) {
        this(str, (String) null);
    }
}
