package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdaw extends cdbi {
    private enhk a;
    private enhk b;
    private enhk c;

    @Override // defpackage.cdbi
    public final cdbj a() {
        enhk enhkVar;
        enhk enhkVar2;
        enhk enhkVar3 = this.a;
        if (enhkVar3 != null && (enhkVar = this.b) != null && (enhkVar2 = this.c) != null) {
            return new cdax(enhkVar3, enhkVar, enhkVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" failedParticipants");
        }
        if (this.b == null) {
            sb.append(" failedConversations");
        }
        if (this.c == null) {
            sb.append(" failedMessages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cdbi
    public final void b(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null failedConversations");
        }
        this.b = enhkVar;
    }

    @Override // defpackage.cdbi
    public final void c(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null failedMessages");
        }
        this.c = enhkVar;
    }

    @Override // defpackage.cdbi
    public final void d(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null failedParticipants");
        }
        this.a = enhkVar;
    }
}
