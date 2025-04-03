package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznl extends dzqg {
    public dzpg a;
    public dzqk b;
    public dzqp c;
    public enhk d;
    public int e;
    private String f;
    private dzpt g;
    private long h;
    private emxc i;
    private dzqm j;
    private emxc k;
    private enhk l;
    private int m;
    private int n;
    private int o;
    private eyee p;
    private emxc q;
    private engw r;
    private byte s;

    public dznl() {
        emux emuxVar = emux.a;
        this.i = emuxVar;
        this.k = emuxVar;
        this.q = emuxVar;
    }

    @Override // defpackage.dzqg
    public final dzqs a() {
        String str;
        int i;
        dzpg dzpgVar;
        dzpt dzptVar;
        dzqk dzqkVar;
        dzqm dzqmVar;
        enhk enhkVar;
        dzqp dzqpVar;
        eyee eyeeVar;
        engw engwVar;
        enhk enhkVar2;
        if (this.s == 15 && (str = this.f) != null && (i = this.e) != 0 && (dzpgVar = this.a) != null && (dzptVar = this.g) != null && (dzqkVar = this.b) != null && (dzqmVar = this.j) != null && (enhkVar = this.l) != null && (dzqpVar = this.c) != null && (eyeeVar = this.p) != null && (engwVar = this.r) != null && (enhkVar2 = this.d) != null) {
            return new dznm(str, i, dzpgVar, dzptVar, this.h, this.i, dzqkVar, dzqmVar, this.k, enhkVar, this.m, dzqpVar, this.n, this.o, eyeeVar, this.q, engwVar, enhkVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" messageId");
        }
        if (this.e == 0) {
            sb.append(" messageType");
        }
        if (this.a == null) {
            sb.append(" sender");
        }
        if (this.g == null) {
            sb.append(" conversationId");
        }
        if ((this.s & 1) == 0) {
            sb.append(" serverTimestampUs");
        }
        if (this.b == null) {
            sb.append(" messageContent");
        }
        if (this.j == null) {
            sb.append(" messageStatus");
        }
        if (this.l == null) {
            sb.append(" metadata");
        }
        if ((this.s & 2) == 0) {
            sb.append(" capability");
        }
        if (this.c == null) {
            sb.append(" renderingDetails");
        }
        if ((this.s & 4) == 0) {
            sb.append(" intendedRenderingType");
        }
        if ((this.s & 8) == 0) {
            sb.append(" filterableFlags");
        }
        if (this.p == null) {
            sb.append(" conversationContext");
        }
        if (this.r == null) {
            sb.append(" activeDecorationIds");
        }
        if (this.d == null) {
            sb.append(" possibleDecorations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzqg
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null activeDecorationIds");
        }
        this.r = engwVar;
    }

    @Override // defpackage.dzqg
    public final void c(int i) {
        this.m = i;
        this.s = (byte) (this.s | 2);
    }

    @Override // defpackage.dzqg
    public final void d(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.p = eyeeVar;
    }

    @Override // defpackage.dzqg
    public final void e(dzpt dzptVar) {
        if (dzptVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.g = dzptVar;
    }

    @Override // defpackage.dzqg
    public final void f(String str) {
        this.i = emxc.j(str);
    }

    @Override // defpackage.dzqg
    public final void g(int i) {
        this.o = i;
        this.s = (byte) (this.s | 8);
    }

    @Override // defpackage.dzqg
    public final void h(int i) {
        this.n = i;
        this.s = (byte) (this.s | 4);
    }

    @Override // defpackage.dzqg
    public final void i(dzqk dzqkVar) {
        this.b = dzqkVar;
    }

    @Override // defpackage.dzqg
    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.f = str;
    }

    @Override // defpackage.dzqg
    public final void k(dzqm dzqmVar) {
        if (dzqmVar == null) {
            throw new NullPointerException("Null messageStatus");
        }
        this.j = dzqmVar;
    }

    @Override // defpackage.dzqg
    public final void l(Map map) {
        this.l = enhk.j(map);
    }

    @Override // defpackage.dzqg
    public final void m(dzqp dzqpVar) {
        this.c = dzqpVar;
    }

    @Override // defpackage.dzqg
    public final void n(long j) {
        this.h = j;
        this.s = (byte) (this.s | 1);
    }

    @Override // defpackage.dzqg
    public final void o(String str) {
        this.k = emxc.j(str);
    }

    public dznl(dzqs dzqsVar) {
        emux emuxVar = emux.a;
        this.i = emuxVar;
        this.k = emuxVar;
        this.q = emuxVar;
        dznm dznmVar = (dznm) dzqsVar;
        this.f = dznmVar.a;
        this.e = dznmVar.r;
        this.a = dznmVar.b;
        this.g = dznmVar.c;
        this.h = dznmVar.d;
        this.i = dznmVar.e;
        this.b = dznmVar.f;
        this.j = dznmVar.g;
        this.k = dznmVar.h;
        this.l = dznmVar.i;
        this.m = dznmVar.j;
        this.c = dznmVar.k;
        this.n = dznmVar.l;
        this.o = dznmVar.m;
        this.p = dznmVar.n;
        this.q = dznmVar.o;
        this.r = dznmVar.p;
        this.d = dznmVar.q;
        this.s = (byte) 15;
    }
}
