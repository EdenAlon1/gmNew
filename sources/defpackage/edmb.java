package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edmb extends edqj {
    public edpb a;
    private boolean b;
    private byte c;

    @Override // defpackage.edqj
    public final edqk a() {
        edpb edpbVar;
        if (this.c == 1 && (edpbVar = this.a) != null) {
            return new edoj(edpbVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" date");
        }
        if (this.c == 0) {
            sb.append(" exceptional");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edqj
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
