package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eemm extends eemq {
    public eemm() {
    }

    public eeku b() {
        String p = this.a.p(':');
        this.a.q(1);
        eejb eejbVar = this.a;
        StringBuilder sb = new StringBuilder();
        while (eejbVar.g < eejbVar.f.length() && eejbVar.f.charAt(eejbVar.g) != '\n') {
            sb.append(eejbVar.f.charAt(eejbVar.g));
            eejbVar.g++;
        }
        if (eejbVar.g < eejbVar.f.length() && eejbVar.f.charAt(eejbVar.g) == '\n') {
            sb.append('\n');
            eejbVar.g++;
        }
        return new eeks(p, sb.toString().trim());
    }

    protected final void d(int i) {
        this.a.a(i);
        this.a.h();
        this.a.a(58);
        this.a.h();
    }

    public final void e(String str) {
        if (this.a != null) {
            throw f("header already set");
        }
        this.a = new eemn("command_keywordLexer", str);
    }

    protected eemm(String str) {
        this.a = new eemn("command_keywordLexer", str);
    }
}
