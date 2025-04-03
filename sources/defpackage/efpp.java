package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efpp {
    public final String a;
    public final boolean[] b;

    public efpp(String str, boolean[] zArr) {
        this.a = str;
        this.b = zArr;
    }

    public final boolean a() {
        for (boolean z : this.b) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
