package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirc extends disa {
    public final int a = 2;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof disa)) {
            return false;
        }
        disa disaVar = (disa) obj;
        disaVar.a();
        disaVar.b();
        return true;
    }

    public final int hashCode() {
        return -718379952;
    }

    public final String toString() {
        return a.a(Integer.toString(1), "GbaAppTypeInfo{telephonyCode=5, appType=", "}");
    }

    @Override // defpackage.disa
    public final void a() {
    }

    @Override // defpackage.disa
    public final void b() {
    }
}
