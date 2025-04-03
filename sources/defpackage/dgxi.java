package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgxi extends dgxl {
    public final long a = -30;
    public final long b = 3;
    public final long c = 30;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dgxl)) {
            return false;
        }
        dgxl dgxlVar = (dgxl) obj;
        dgxlVar.b();
        dgxlVar.c();
        dgxlVar.a();
        dgxlVar.d();
        return true;
    }

    public final int hashCode() {
        return ((((((int) (-4294967267L)) ^ 1000003) * 1000003) ^ 3) * (-721379959)) ^ 30;
    }

    public final String toString() {
        return "TimestampBounds{decisionValidFromDays=-30, decisionValidToDays=3, expirationValidFromDays=0, expirationValidToDays=30}";
    }

    @Override // defpackage.dgxl
    public final void a() {
    }

    @Override // defpackage.dgxl
    public final void b() {
    }

    @Override // defpackage.dgxl
    public final void c() {
    }

    @Override // defpackage.dgxl
    public final void d() {
    }
}
