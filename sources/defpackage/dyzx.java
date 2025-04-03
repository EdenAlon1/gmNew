package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzx extends dzau {
    public emxc a;
    public emxc b;
    public emxc c;
    public emxc d;
    public emxc e;
    private String f;
    private emxc g;
    private emxc h;
    private String i;
    private enhk j;
    private engw k;
    private engw l;

    public dyzx() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.g = emuxVar;
        this.h = emuxVar;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    @Override // defpackage.dzau
    public final dzav a() {
        String str;
        enhk enhkVar;
        engw engwVar;
        engw engwVar2;
        String str2 = this.f;
        if (str2 != null && (str = this.i) != null && (enhkVar = this.j) != null && (engwVar = this.k) != null && (engwVar2 = this.l) != null) {
            return new dyzy(str2, this.a, this.g, this.h, str, this.b, enhkVar, engwVar, engwVar2, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" name");
        }
        if (this.i == null) {
            sb.append(" contentType");
        }
        if (this.j == null) {
            sb.append(" metadata");
        }
        if (this.k == null) {
            sb.append(" menuItems");
        }
        if (this.l == null) {
            sb.append(" toolbarButtons");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzau
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.dzau
    public final void c(String str) {
        this.g = emxc.j(str);
    }

    @Override // defpackage.dzau
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.k = engwVar;
    }

    @Override // defpackage.dzau
    public final void e(Map map) {
        this.j = enhk.j(map);
    }

    @Override // defpackage.dzau
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f = str;
    }

    @Override // defpackage.dzau
    public final void g(byte[] bArr) {
        this.h = emxc.j(bArr);
    }

    @Override // defpackage.dzau
    public final void h(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null toolbarButtons");
        }
        this.l = engwVar;
    }
}
