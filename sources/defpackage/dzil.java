package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzil extends dzpc {
    private String a;
    private String b;
    private dzpf c;
    private emxc d;

    public dzil() {
        this.d = emux.a;
    }

    @Override // defpackage.dzpc
    public final dzpg a() {
        String str;
        dzpf dzpfVar;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null && (dzpfVar = this.c) != null) {
            return new dzmu(str2, str, dzpfVar, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" tachyonAppName");
        }
        if (this.c == null) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpc
    public final void b(String str) {
        this.d = emxc.i(str);
    }

    @Override // defpackage.dzpc
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    @Override // defpackage.dzpc
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.b = str;
    }

    @Override // defpackage.dzpc
    public final void e(dzpf dzpfVar) {
        if (dzpfVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = dzpfVar;
    }

    public dzil(dzpg dzpgVar) {
        this.d = emux.a;
        this.a = dzpgVar.d();
        this.b = dzpgVar.e();
        this.c = dzpgVar.b();
        this.d = dzpgVar.c();
    }
}
