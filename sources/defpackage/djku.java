package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djku extends djkw {
    public String b;
    private eyss d;
    private eejk e;
    private int f;
    private String g;
    private enip h;
    private byte i;
    public Optional a = Optional.empty();
    public Optional c = Optional.empty();

    @Override // defpackage.djkw
    public final djkx a() {
        String str;
        eyss eyssVar;
        eejk eejkVar;
        String str2;
        enip enipVar;
        if (this.i == 1 && (str = this.b) != null && (eyssVar = this.d) != null && (eejkVar = this.e) != null && (str2 = this.g) != null && (enipVar = this.h) != null) {
            return new djkv(this.a, str, eyssVar, eejkVar, this.f, str2, this.c, enipVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" username");
        }
        if (this.d == null) {
            sb.append(" localIpAddress");
        }
        if (this.e == null) {
            sb.append(" proxyProtocol");
        }
        if (this.i == 0) {
            sb.append(" listeningPort");
        }
        if (this.g == null) {
            sb.append(" instance");
        }
        if (this.h == null) {
            sb.append(" registeredFeatureTags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.djkw
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null instance");
        }
        this.g = str;
    }

    @Override // defpackage.djkw
    public final void c(int i) {
        this.f = i;
        this.i = (byte) 1;
    }

    @Override // defpackage.djkw
    public final void d(eyss eyssVar) {
        if (eyssVar == null) {
            throw new NullPointerException("Null localIpAddress");
        }
        this.d = eyssVar;
    }

    @Override // defpackage.djkw
    public final void e(eejk eejkVar) {
        if (eejkVar == null) {
            throw new NullPointerException("Null proxyProtocol");
        }
        this.e = eejkVar;
    }

    @Override // defpackage.djkw
    public final void f(enip enipVar) {
        if (enipVar == null) {
            throw new NullPointerException("Null registeredFeatureTags");
        }
        this.h = enipVar;
    }
}
