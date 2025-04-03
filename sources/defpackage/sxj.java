package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxj extends sxn {
    public String a;
    private engw e;
    private int f;
    private byte g;
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();
    public Optional b = Optional.empty();

    @Override // defpackage.sxn
    public final sxo a() {
        String str;
        engw engwVar;
        if (this.g == 1 && (str = this.a) != null && (engwVar = this.e) != null) {
            return new sxk(str, this.c, this.d, this.b, engwVar, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" displayDestination");
        }
        if (this.e == null) {
            sb.append(" snackbarInteractions");
        }
        if (this.g == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.sxn
    public final void b(int i) {
        this.f = i;
        this.g = (byte) 1;
    }

    @Override // defpackage.sxn
    public final void c(boolean z) {
        this.c = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.sxn
    public final void d(boolean z) {
        this.d = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.sxn
    public final void e(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null snackbarInteractions");
        }
        this.e = engwVar;
    }
}
