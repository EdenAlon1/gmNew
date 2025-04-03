package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvp extends ewwz {
    public engw a;
    public String b;
    private boolean c;
    private byte d;

    @Override // defpackage.ewwz
    public final ewxd a() {
        engw engwVar;
        if (this.d == 1 && (engwVar = this.a) != null) {
            return new ewvq(engwVar, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationActions");
        }
        if (this.d == 0) {
            sb.append(" sensitive");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ewwz
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
