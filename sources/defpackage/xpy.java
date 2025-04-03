package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xpy implements ybu, ffke {
    private final /* synthetic */ ffix a;

    public xpy(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ybu
    public final /* synthetic */ void a() {
        this.a.invoke();
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ybu) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
