package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvaj {
    public static final a a;

    /* compiled from: PG */
    final class a extends duxx {
    }

    static {
        a aVar = new a();
        a = aVar;
        duyb.c("UserUnlocked", aVar);
    }

    public static boolean a() {
        dvai dvaiVar = dvai.a;
        if (dvaiVar.b || dvaiVar.c) {
            return dvaiVar.b;
        }
        if (!dvak.a && !dumf.b) {
            throw new IllegalStateException("This method should be called after startMonitor!");
        }
        dvaiVar.b = true;
        duyb.d(a);
        return true;
    }
}
