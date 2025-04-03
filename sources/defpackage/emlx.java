package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emlx extends emmq {
    private enhk a;
    private enhk b;

    @Override // defpackage.emmq
    public final emmr a() {
        enhk enhkVar;
        enhk enhkVar2 = this.a;
        if (enhkVar2 != null && (enhkVar = this.b) != null) {
            return new emly(enhkVar2, enhkVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" emotionToStickerNameMap");
        }
        if (this.b == null) {
            sb.append(" stickerNameToStickerMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.emmq
    public final void b(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null emotionToStickerNameMap");
        }
        this.a = enhkVar;
    }

    @Override // defpackage.emmq
    public final void c(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null stickerNameToStickerMap");
        }
        this.b = enhkVar;
    }
}
