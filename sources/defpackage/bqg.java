package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqg extends bqd {
    public Range a;
    public Integer b;
    public Integer c;
    public Range d;
    private Integer e;

    @Override // defpackage.bqd
    public final bqe a() {
        Range range = this.a;
        Integer num = this.b;
        String str = range == null ? " bitrate" : "";
        if (num == null) {
            str = str.concat(" sourceFormat");
        }
        if (this.c == null) {
            str = str.concat(" source");
        }
        if (this.d == null) {
            str = str.concat(" sampleRate");
        }
        if (this.e == null) {
            str = str.concat(" channelCount");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        Range range2 = this.a;
        this.b.intValue();
        this.c.intValue();
        return new bqh(range2, this.d, this.e.intValue());
    }

    @Override // defpackage.bqd
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }
}
