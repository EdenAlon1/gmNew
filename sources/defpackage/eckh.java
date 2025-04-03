package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eckh {
    public abstract ecki a();

    public abstract eckh b(int i);

    public final eckh c(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final ecki d() {
        ecki a = a();
        float f = ((eckg) a).a;
        boolean z = false;
        if (f > 0.0f && f <= 100.0f) {
            z = true;
        }
        emxf.b(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return a;
    }
}
