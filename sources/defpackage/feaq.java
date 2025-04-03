package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feaq {
    public static final fdxc a = new fdxc("internal:health-checking-config");
    public static final feae b = new feae("internal:health-check-consumer-listener", null);
    public static final feae c = new feae("internal:disable-subchannel-reconnect", Boolean.FALSE);
    public static final fdxc d = new fdxc("internal:has-health-check-producer-listener");
    public static final fdxc e = new fdxc("io.grpc.IS_PETIOLE_POLICY");
    private int f;

    public Status a(feam feamVar) {
        throw null;
    }

    public abstract void b(Status status);

    public void c(feam feamVar) {
        int i = this.f;
        this.f = i + 1;
        if (i == 0) {
            a(feamVar);
        }
        this.f = 0;
    }

    public abstract void e();

    public void d() {
    }
}
