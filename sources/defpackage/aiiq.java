package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiiq implements aiig, aihw {
    public final int a;
    public final ffgu b;
    private final aihu c;
    private final String d = "RequestedWithResultState";

    public aiiq(int i, aihu aihuVar, ffgu ffguVar) {
        this.a = i;
        this.c = aihuVar;
        this.b = ffguVar;
    }

    @Override // defpackage.aihr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aihr
    public final /* synthetic */ aihv b() {
        return this.c;
    }

    @Override // defpackage.aiig
    public final String c() {
        return this.d;
    }

    @Override // defpackage.aiig
    public final void d(aihr aihrVar) {
        aihrVar.getClass();
        if (!(aihrVar instanceof aiie)) {
            throw new aiif(aihrVar, this.d, this.c, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiiq)) {
            return false;
        }
        aiiq aiiqVar = (aiiq) obj;
        return this.a == aiiqVar.a && ffkj.e(this.c, aiiqVar.c) && ffkj.e(this.b, aiiqVar.b);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RequestedWithResultState(requestId=" + this.a + ", target=" + this.c + ", continuation=" + this.b + ")";
    }
}
