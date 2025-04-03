package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class euvd {
    static {
        i().a();
    }

    public static euvc i() {
        euuy euuyVar = new euuy();
        euuyVar.d(0L);
        euuyVar.c(1);
        euuyVar.b(0L);
        return euuyVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract euvc c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final boolean j() {
        return h() == 5;
    }

    public final boolean k() {
        return h() == 2 || h() == 1;
    }

    public final boolean l() {
        return h() == 4;
    }

    public final boolean m() {
        return h() == 3;
    }

    public final euvd n() {
        euvc c = c();
        ((euuy) c).d = "BAD CONFIG";
        c.c(5);
        return c.a();
    }
}
