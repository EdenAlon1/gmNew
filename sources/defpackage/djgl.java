package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgl extends djgv {
    public int a;
    public String b;
    public byte c;
    private Optional d = Optional.empty();
    private final Optional e = Optional.empty();
    private Optional f = Optional.empty();

    @Override // defpackage.djgv
    public final djgw a() {
        String str;
        if (this.c == 1 && (str = this.b) != null) {
            return new djgm(this.d, this.a, str, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" responseCode");
        }
        if (this.b == null) {
            sb.append(" reason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.djgv
    public final void b(dkjw dkjwVar) {
        this.f = Optional.of(dkjwVar);
    }

    @Override // defpackage.djgv
    public final void c(dkkj dkkjVar) {
        this.d = Optional.of(dkkjVar);
    }
}
