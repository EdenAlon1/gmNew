package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cism extends citj {
    public ciwt b;
    public ciwm c;
    private boolean f;
    private byte g;
    public Optional a = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();

    @Override // defpackage.citj
    public final citk a() {
        ciwt ciwtVar;
        ciwm ciwmVar;
        if (this.g == 1 && (ciwtVar = this.b) != null && (ciwmVar = this.c) != null) {
            return new cisn(this.a, ciwtVar, ciwmVar, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" notificationStyleInfo");
        }
        if (this.c == null) {
            sb.append(" clickInteractionInfo");
        }
        if (this.g == 0) {
            sb.append(" shouldAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.citj
    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) 1;
    }
}
