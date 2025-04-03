package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhiu {
    public final fhid a;
    public final fhhy b;
    public final fhgv c;
    public final int d;
    public final int e;
    public final int f;
    private final List g;
    private final int h;
    private int i;

    public fhiu(fhid fhidVar, List list, int i, fhhy fhhyVar, fhgv fhgvVar, int i2, int i3, int i4) {
        this.a = fhidVar;
        this.g = list;
        this.h = i;
        this.b = fhhyVar;
        this.c = fhgvVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static /* synthetic */ fhiu c(fhiu fhiuVar, int i, fhhy fhhyVar, fhgv fhgvVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fhiuVar.h;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            fhhyVar = fhiuVar.b;
        }
        fhhy fhhyVar2 = fhhyVar;
        if ((i2 & 4) != 0) {
            fhgvVar = fhiuVar.c;
        }
        fhgv fhgvVar2 = fhgvVar;
        int i4 = fhiuVar.d;
        int i5 = fhiuVar.e;
        int i6 = fhiuVar.f;
        fhgvVar2.getClass();
        return new fhiu(fhiuVar.a, fhiuVar.g, i3, fhhyVar2, fhgvVar2, i4, i5, i6);
    }

    public final fhfl a() {
        fhhy fhhyVar = this.b;
        if (fhhyVar != null) {
            return fhhyVar.e;
        }
        return null;
    }

    public final fhhb b(fhgv fhgvVar) {
        fhgvVar.getClass();
        if (this.h >= this.g.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        fhhy fhhyVar = this.b;
        if (fhhyVar != null) {
            if (!fhhyVar.b.b(fhgvVar.a)) {
                throw new IllegalStateException("network interceptor " + this.g.get(this.h - 1) + " must retain the same host and port");
            }
            if (this.i != 1) {
                throw new IllegalStateException("network interceptor " + this.g.get(this.h - 1) + " must call proceed() exactly once");
            }
        }
        fhiu c = c(this, this.h + 1, null, fhgvVar, 58);
        fhgl fhglVar = (fhgl) this.g.get(this.h);
        fhhb a = fhglVar.a(c);
        if (this.b != null && this.h + 1 < this.g.size() && c.i != 1) {
            throw new IllegalStateException(a.i(fhglVar, "network interceptor ", " must call proceed() exactly once"));
        }
        if (a.g != null) {
            return a;
        }
        throw new IllegalStateException(a.i(fhglVar, "interceptor ", " returned a response with no body"));
    }
}
