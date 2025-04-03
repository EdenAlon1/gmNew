package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awnt extends awri {
    private awxk a;
    private int b;
    private byte c;

    @Override // defpackage.awri
    public final awrj a() {
        awxk awxkVar;
        if (this.c == 1 && (awxkVar = this.a) != null) {
            return new awnu(awxkVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" incomingChatMessageRequest");
        }
        if (this.c == 0) {
            sb.append(" contentPartIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.awri
    public final void b(int i) {
        this.b = i;
        this.c = (byte) 1;
    }

    @Override // defpackage.awri
    public final void c(awxk awxkVar) {
        if (awxkVar == null) {
            throw new NullPointerException("Null incomingChatMessageRequest");
        }
        this.a = awxkVar;
    }
}
