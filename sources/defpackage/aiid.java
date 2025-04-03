package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiid implements aiig {
    public final int a;
    public ffgu b;
    private final aihu c;
    private final String d = "DispatchedWithResultState";

    public aiid(int i, aihu aihuVar) {
        this.a = i;
        this.c = aihuVar;
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
        if (aihrVar instanceof aiiq) {
            aiiq aiiqVar = (aiiq) aihrVar;
            if (aiiqVar.a == this.a) {
                this.b = aiiqVar.b;
                return;
            }
        }
        throw new aiif(aihrVar, this.d, this.c, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiid)) {
            return false;
        }
        aiid aiidVar = (aiid) obj;
        return this.a == aiidVar.a && ffkj.e(this.c, aiidVar.c);
    }

    public final int hashCode() {
        return (this.a * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DispatchedWithResultState(requestId=" + this.a + ", target=" + this.c + ")";
    }
}
