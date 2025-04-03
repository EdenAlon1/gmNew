package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiie implements aiig {
    private final int a;
    private final aiht b = aiht.a;
    private final String c = "IdleState";

    public aiie(int i) {
        this.a = i;
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
        if (!(aihrVar instanceof aihx) && !(aihrVar instanceof aihz)) {
            throw new aiif(aihrVar, this.c, this.b, this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aiie) && this.a == ((aiie) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "IdleState(requestId=" + this.a + ")";
    }
}
