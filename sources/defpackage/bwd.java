package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwd extends bvd {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;

    @Override // defpackage.bvd
    public final bve a() {
        Integer num = this.a;
        Integer num2 = this.b;
        String str = num == null ? " audioSource" : "";
        if (num2 == null) {
            str = str.concat(" sampleRate");
        }
        if (this.c == null) {
            str = str.concat(" channelCount");
        }
        if (this.d == null) {
            str = str.concat(" audioFormat");
        }
        if (str.isEmpty()) {
            return new bwe(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.bvd
    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.bvd
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.bvd
    public final void e(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.bvd
    public final void f(int i) {
        this.b = Integer.valueOf(i);
    }
}
