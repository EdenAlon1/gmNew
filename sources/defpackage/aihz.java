package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihz implements aiig {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState");
    public final Object b;
    public ffgu c;
    private final int d;
    private final aihu e;
    private final ffsk f;
    private final String g = "CompletedWithResultState";

    public aihz(Object obj, int i, aihu aihuVar, ffsk ffskVar) {
        this.b = obj;
        this.d = i;
        this.e = aihuVar;
        this.f = ffskVar;
    }

    @Override // defpackage.aihr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aihr
    public final /* synthetic */ aihv b() {
        return this.e;
    }

    @Override // defpackage.aiig
    public final String c() {
        return this.g;
    }

    @Override // defpackage.aiig
    public final void d(aihr aihrVar) {
        aihrVar.getClass();
        if (!(aihrVar instanceof aiid) || ((aiid) aihrVar).a != this.d) {
            throw new aiif(aihrVar, this.g, this.e, this.d);
        }
        axol.k(this.f, null, new aihy(this, aihrVar, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aihz)) {
            return false;
        }
        aihz aihzVar = (aihz) obj;
        return ffkj.e(this.b, aihzVar.b) && this.d == aihzVar.d && ffkj.e(this.e, aihzVar.e) && ffkj.e(this.f, aihzVar.f);
    }

    public final int hashCode() {
        return (((((ffch.a(this.b) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "CompletedWithResultState(result=" + ffch.b(this.b) + ", requestId=" + this.d + ", target=" + this.e + ", coroutineScope=" + this.f + ")";
    }
}
