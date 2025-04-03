package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_LocationInformation;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eien extends eigg {
    private String c;
    private double f;
    private double g;
    private byte j;
    private Optional b = Optional.empty();
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    public Optional a = Optional.empty();
    private Optional h = Optional.empty();
    private Optional i = Optional.empty();

    @Override // defpackage.eigg
    public final LocationInformation a() {
        String str;
        if (this.j == 3 && (str = this.c) != null) {
            return new AutoValue_LocationInformation(this.b, str, this.d, this.e, this.a, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if ((this.j & 1) == 0) {
            sb.append(" longitude");
        }
        if ((this.j & 2) == 0) {
            sb.append(" latitude");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eigg
    public final void b(String str) {
        this.i = Optional.of(str);
    }

    @Override // defpackage.eigg
    public final void c(Instant instant) {
        this.d = Optional.of(instant);
    }

    @Override // defpackage.eigg
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
    }

    @Override // defpackage.eigg
    public final void e(String str) {
        this.e = Optional.of(str);
    }

    @Override // defpackage.eigg
    public final void f(double d) {
        this.g = d;
        this.j = (byte) (this.j | 2);
    }

    @Override // defpackage.eigg
    public final void g(double d) {
        this.f = d;
        this.j = (byte) (this.j | 1);
    }

    @Override // defpackage.eigg
    public final void h(double d) {
        this.h = Optional.of(Double.valueOf(d));
    }

    @Override // defpackage.eigg
    public final void i(Instant instant) {
        this.b = Optional.of(instant);
    }
}
