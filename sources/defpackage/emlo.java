package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emlo {
    public abstract excx a(int i, emhv emhvVar);

    public final excx b(int i, emhv emhvVar) {
        int i2 = i - 1;
        if (i2 == 1) {
            return a(1, emhvVar);
        }
        if (i2 == 2) {
            return a(2, emhvVar);
        }
        throw new emlq("PredictorFactory: unrecognized predictor type.");
    }
}
