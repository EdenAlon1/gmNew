package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiia implements aiig {
    public final int a;
    private final aihs b;
    private final String c = "DispatchedState";

    public aiia(int i, aihs aihsVar) {
        this.a = i;
        this.b = aihsVar;
    }

    @Override // defpackage.aihr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aihr
    public final /* synthetic */ aihv b() {
        return this.b;
    }

    @Override // defpackage.aiig
    public final String c() {
        return this.c;
    }

    @Override // defpackage.aiig
    public final void d(aihr aihrVar) {
        aihrVar.getClass();
        if (!(aihrVar instanceof aiin) || ((aiin) aihrVar).a != this.a) {
            throw new aiif(aihrVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiia)) {
            return false;
        }
        aiia aiiaVar = (aiia) obj;
        return this.a == aiiaVar.a && ffkj.e(this.b, aiiaVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DispatchedState(requestId=" + this.a + ", target=" + this.b + ")";
    }
}
