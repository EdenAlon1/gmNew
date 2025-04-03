package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbb extends dkbm {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public int c;
    private ezez d;
    private String e;
    private String f;
    private String g;
    private eyyu h;
    private eyzd i;

    @Override // defpackage.dkbm
    public final dkbn a() {
        int i;
        String str;
        String str2;
        String str3;
        eyyu eyyuVar = this.h;
        if (eyyuVar != null) {
            this.i = (eyzd) eyyuVar.build();
        } else if (this.i == null) {
            this.i = (eyzd) ((eyyu) eyzd.a.createBuilder()).build();
        }
        ezez ezezVar = this.d;
        if (ezezVar != null && (i = this.c) != 0 && (str = this.e) != null && (str2 = this.f) != null && (str3 = this.g) != null) {
            return new dkbc(ezezVar, i, str, str2, str3, this.a, this.i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" requestState");
        }
        if (this.c == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.e == null) {
            sb.append(" requestId");
        }
        if (this.f == null) {
            sb.append(" provisioningSessionId");
        }
        if (this.g == null) {
            sb.append(" constructedServerUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dkbm
    public final eyyu b() {
        if (this.h == null) {
            this.h = (eyyu) eyzd.a.createBuilder();
        }
        return this.h;
    }

    @Override // defpackage.dkbm
    public final ezez c() {
        ezez ezezVar = this.d;
        if (ezezVar != null) {
            return ezezVar;
        }
        throw new IllegalStateException("Property \"requestState\" has not been set");
    }

    @Override // defpackage.dkbm
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.dkbm
    public final String e() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"provisioningSessionId\" has not been set");
    }

    @Override // defpackage.dkbm
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null constructedServerUrl");
        }
        this.g = str;
    }

    @Override // defpackage.dkbm
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null provisioningSessionId");
        }
        this.f = str;
    }

    @Override // defpackage.dkbm
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.e = str;
    }

    @Override // defpackage.dkbm
    public final void i(ezez ezezVar) {
        if (ezezVar == null) {
            throw new NullPointerException("Null requestState");
        }
        this.d = ezezVar;
    }
}
