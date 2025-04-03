package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzq extends aqzs {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private arac g;
    private byte h;

    @Override // defpackage.aqzs
    public final aqzt a() {
        arac aracVar;
        if (this.h == 63 && (aracVar = this.g) != null) {
            return new aqzr(this.a, this.b, this.c, this.d, this.e, this.f, aracVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" currentMessageCount");
        }
        if ((this.h & 2) == 0) {
            sb.append(" codePointsUsed");
        }
        if ((this.h & 4) == 0) {
            sb.append(" codePointsRemaining");
        }
        if ((this.h & 8) == 0) {
            sb.append(" maxMessageCount");
        }
        if ((this.h & 16) == 0) {
            sb.append(" lengthRequiresMms");
        }
        if ((this.h & 32) == 0) {
            sb.append(" maxSubjectLength");
        }
        if (this.g == null) {
            sb.append(" requiredProtocol");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aqzs
    public final void b(int i) {
        this.c = i;
        this.h = (byte) (this.h | 4);
    }

    @Override // defpackage.aqzs
    public final void c(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.aqzs
    public final void d(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.aqzs
    public final void e(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 16);
    }

    @Override // defpackage.aqzs
    public final void f(int i) {
        this.d = i;
        this.h = (byte) (this.h | 8);
    }

    @Override // defpackage.aqzs
    public final void g(int i) {
        this.f = i;
        this.h = (byte) (this.h | 32);
    }

    @Override // defpackage.aqzs
    public final void h(arac aracVar) {
        if (aracVar == null) {
            throw new NullPointerException("Null requiredProtocol");
        }
        this.g = aracVar;
    }
}
