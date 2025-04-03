package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbd extends dkbp {
    public int a;
    private ezez b;
    private String c;
    private String d;
    private eyze e;
    private eyzf f;

    @Override // defpackage.dkbp
    public final dkbq a() {
        int i;
        String str;
        String str2;
        eyze eyzeVar = this.e;
        if (eyzeVar != null) {
            this.f = (eyzf) eyzeVar.build();
        } else if (this.f == null) {
            this.f = (eyzf) ((eyze) eyzf.a.createBuilder()).build();
        }
        ezez ezezVar = this.b;
        if (ezezVar != null && (i = this.a) != 0 && (str = this.c) != null && (str2 = this.d) != null) {
            return new dkbe(ezezVar, i, str, str2, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" requestState");
        }
        if (this.a == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.c == null) {
            sb.append(" requestId");
        }
        if (this.d == null) {
            sb.append(" provisioningSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dkbp
    public final eyze b() {
        if (this.e == null) {
            this.e = (eyze) eyzf.a.createBuilder();
        }
        return this.e;
    }

    @Override // defpackage.dkbp
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null provisioningSessionId");
        }
        this.d = str;
    }

    @Override // defpackage.dkbp
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.c = str;
    }

    @Override // defpackage.dkbp
    public final void e(ezez ezezVar) {
        if (ezezVar == null) {
            throw new NullPointerException("Null requestState");
        }
        this.b = ezezVar;
    }
}
