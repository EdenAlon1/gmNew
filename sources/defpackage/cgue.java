package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cgue {
    public static cgue c(String str, ewgz ewgzVar) {
        emxf.f(!str.isEmpty(), "Invalid simId: %s", str);
        return new cgua(str, ewgzVar);
    }

    public abstract ewgz a();

    public abstract String b();

    public final String d() {
        return b() + "." + a().name();
    }
}
