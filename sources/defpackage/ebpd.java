package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebpd {
    public abstract eawd a();

    public abstract ebpe b();

    public final ebpe c() {
        boolean z = true;
        if (a() == null && d() == null) {
            z = false;
        }
        emxf.m(z, "Either setAvatarRetriever or setAvatarImageLoader have to be called.");
        return b();
    }

    public abstract ebtd d();
}
