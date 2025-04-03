package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mee {
    private mxt a;
    private int b = 50000;
    private int c = 50000;
    private int d = 1000;
    private int e = 2000;
    private boolean f;

    public final meg a() {
        lti.c(!this.f);
        this.f = true;
        if (this.a == null) {
            this.a = new mxt();
        }
        return new meg(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(int i, int i2, int i3, int i4) {
        lti.c(!this.f);
        meg.b(i3, 0, "bufferForPlaybackMs", "0");
        meg.b(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        meg.b(i, i3, "minBufferMs", "bufferForPlaybackMs");
        meg.b(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        meg.b(i2, i, "maxBufferMs", "minBufferMs");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
