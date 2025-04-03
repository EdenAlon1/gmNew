package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsm extends apuf {
    public alxz a;
    public apyd b;
    public alyu c;
    public String d;
    public appu e;
    public enhk f;
    public aqdr g;
    public apxv h;
    public int i;
    private boolean j;
    private engw k;
    private engw l;
    private engw m;
    private byte n;

    @Override // defpackage.apuf
    public final apug a() {
        if (this.n == 1 && this.i != 0 && this.k != null && this.f != null && this.l != null && this.m != null) {
            return new apsn(this.j, this.a, this.b, this.c, this.d, this.i, this.k, this.e, this.g, this.f, this.l, this.m, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.n == 0) {
            sb.append(" starred");
        }
        if (this.i == 0) {
            sb.append(" contentCategory");
        }
        if (this.k == null) {
            sb.append(" annotations");
        }
        if (this.f == null) {
            sb.append(" voiceTranscriptions");
        }
        if (this.l == null) {
            sb.append(" readByRecipients");
        }
        if (this.m == null) {
            sb.append(" failedToDecryptRecipients");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.apuf
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null annotations");
        }
        this.k = engwVar;
    }

    @Override // defpackage.apuf
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null failedToDecryptRecipients");
        }
        this.m = engwVar;
    }

    @Override // defpackage.apuf
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null readByRecipients");
        }
        this.l = engwVar;
    }

    @Override // defpackage.apuf
    public final void e(boolean z) {
        this.j = z;
        this.n = (byte) 1;
    }
}
