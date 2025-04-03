package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class echk {
    public abstract engw a();

    public abstract boolean b();

    public final engw c() {
        if (b()) {
            return a();
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }
}
