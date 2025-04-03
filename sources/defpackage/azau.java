package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class azau implements azaj {
    public static azau c() {
        return new azar().c();
    }

    @Override // defpackage.azaj
    public final String a(String str) {
        return (String) b().get(str);
    }

    public abstract enhk b();

    public final boolean d(String str) {
        return b().containsKey(str);
    }

    public final boolean e() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") || d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final boolean f() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean g() {
        return d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }
}
