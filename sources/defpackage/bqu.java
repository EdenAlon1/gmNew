package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqu extends bus {
    public Range a;
    public Range b;
    private bro c;
    private Integer d;

    public bqu() {
    }

    @Override // defpackage.bus
    public final but a() {
        bro broVar = this.c;
        Range range = this.a;
        String str = broVar == null ? " qualitySelector" : "";
        if (range == null) {
            str = str.concat(" frameRate");
        }
        if (this.b == null) {
            str = str.concat(" bitrate");
        }
        if (this.d == null) {
            str = str.concat(" aspectRatio");
        }
        if (str.isEmpty()) {
            return new bqv(this.c, this.a, this.b, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.bus
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.bus
    public final void c(bro broVar) {
        if (broVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        this.c = broVar;
    }

    public bqu(but butVar) {
        bqv bqvVar = (bqv) butVar;
        this.c = bqvVar.a;
        this.a = bqvVar.b;
        this.b = bqvVar.c;
        this.d = Integer.valueOf(bqvVar.d);
    }
}
