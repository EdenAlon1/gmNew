package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvv extends abwb {
    public Bundle a;
    private boolean b;
    private boolean c;
    private double d;
    private engw e;
    private byte f;

    @Override // defpackage.abwb
    public final abwc a() {
        engw engwVar;
        Bundle bundle;
        if (this.f == 15 && (engwVar = this.e) != null && (bundle = this.a) != null) {
            return new abvw(this.b, this.c, this.d, engwVar, bundle);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" includePersonalMessages");
        }
        if ((this.f & 2) == 0) {
            sb.append(" includeMessagesFromContacts");
        }
        if ((this.f & 4) == 0) {
            sb.append(" includeSentMessages");
        }
        if ((this.f & 8) == 0) {
            sb.append(" normalizedEditDistanceThreshold");
        }
        if (this.e == null) {
            sb.append(" redactors");
        }
        if (this.a == null) {
            sb.append(" intentExtras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.abwb
    public final void b() {
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.abwb
    public final void c(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.abwb
    public final void d(boolean z) {
        this.c = z;
        this.f = (byte) (this.f | 4);
    }

    @Override // defpackage.abwb
    public final void e(double d) {
        this.d = d;
        this.f = (byte) (this.f | 8);
    }

    @Override // defpackage.abwb
    public final void f(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null redactors");
        }
        this.e = engwVar;
    }
}
