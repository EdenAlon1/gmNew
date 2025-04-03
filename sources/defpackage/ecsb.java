package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecsb {
    public abstract ecsc a();

    public abstract ecsb b(int i);

    public final ecsb c(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final ecsc d() {
        ecsc a = a();
        float f = ((ecrt) a).a;
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        emxf.m(z, "Probability shall be between 0 and 1.");
        return a;
    }
}
