package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npg {
    public final lso b;
    public boolean d;
    public boolean e;
    public int g;
    public final List a = new ArrayList();
    public final npv h = new npv();
    public lsp c = lsp.a;
    public ByteBuffer f = lsr.a;

    public npg(engw engwVar) {
        this.b = new lso(engwVar);
    }

    public static boolean d(lsp lspVar) {
        return (lspVar.d == -1 || lspVar.b == -1 || lspVar.c == -1) ? false : true;
    }

    public final lsp a() {
        return this.b.a;
    }

    public final npi b(nql nqlVar, lqc lqcVar) {
        lti.a(lqcVar.G != -1);
        try {
            npi npiVar = new npi(this.c, nqlVar, lqcVar);
            if (Objects.equals(this.c, lsp.a)) {
                lsp lspVar = npiVar.a;
                this.c = lspVar;
                this.b.a(lspVar);
                this.b.c();
            }
            this.a.add(new npf(npiVar));
            int i = lyt.a;
            return npiVar;
        } catch (lsq e) {
            throw nrd.a(e, "Error while registering input " + this.a.size());
        }
    }

    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((npf) this.a.get(i)).a.d.f();
        }
        this.a.clear();
        npv npvVar = this.h;
        npvVar.a.clear();
        npvVar.b = 0;
        npvVar.c = lsp.a;
        npvVar.d = -1;
        npvVar.e = new npt[0];
        npvVar.f = -9223372036854775807L;
        npvVar.g = -1L;
        npvVar.h = 0L;
        npvVar.i = Long.MAX_VALUE;
        npvVar.j = 0L;
        this.b.f();
        this.g = 0;
        this.f = lsr.a;
        this.c = lsp.a;
    }

    public final boolean e() {
        return !this.f.hasRemaining() && this.g >= this.a.size() && this.h.e();
    }
}
