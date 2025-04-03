package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdi extends dvdo {
    public String a;
    public exwa b;
    public String c;
    private evts d;
    private long e;
    private enhk f;
    private byte g;

    @Override // defpackage.dvdo
    public final dvdp a() {
        if (this.f == null) {
            this.f = enoz.a;
        }
        if (this.g == 1 && this.d != null) {
            return new dvdj(this.a, this.d, this.e, this.f, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" promotion");
        }
        if (this.g == 0) {
            sb.append(" triggeringEventTimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dvdo
    public final void b(Map map) {
        this.f = enhk.j(map);
    }

    @Override // defpackage.dvdo
    public final void c(evts evtsVar) {
        if (evtsVar == null) {
            throw new NullPointerException("Null promotion");
        }
        this.d = evtsVar;
    }

    @Override // defpackage.dvdo
    public final void d(long j) {
        this.e = j;
        this.g = (byte) 1;
    }
}
