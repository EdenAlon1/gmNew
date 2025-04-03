package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmh extends ecmx {
    public final ecda a;
    public final boolean b;
    private final String c;

    public ecmh(String str, ecda ecdaVar, boolean z) {
        this.c = str;
        this.a = ecdaVar;
        this.b = z;
    }

    @Override // defpackage.ecmx
    public final ecda a() {
        return this.a;
    }

    @Override // defpackage.ecmx
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ecmx
    public final boolean c() {
        return this.b;
    }

    public final String toString() {
        return "MeasurementKey{rawStringEventName=" + this.c + ", noPiiEventName=" + String.valueOf(this.a) + ", isActivity=" + this.b + "}";
    }
}
