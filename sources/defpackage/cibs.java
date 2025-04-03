package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibs extends ciff {
    public final ervi a;
    public final fcek b;
    public final bzge c;
    public final errl d;
    public final eyee e;
    public final fbzt f;
    private final eyee g;

    public cibs(ervi erviVar, fcek fcekVar, bzge bzgeVar, errl errlVar, eyee eyeeVar, eyee eyeeVar2, fbzt fbztVar) {
        if (erviVar == null) {
            throw new NullPointerException("Null dittoChannelRequest");
        }
        this.a = erviVar;
        if (fcekVar == null) {
            throw new NullPointerException("Null browserId");
        }
        this.b = fcekVar;
        this.c = bzgeVar;
        if (errlVar == null) {
            throw new NullPointerException("Null executor");
        }
        this.d = errlVar;
        if (eyeeVar == null) {
            throw new NullPointerException("Null requestBytes");
        }
        this.e = eyeeVar;
        if (eyeeVar2 == null) {
            throw new NullPointerException("Null clientRegistrationId");
        }
        this.g = eyeeVar2;
        if (fbztVar == null) {
            throw new NullPointerException("Null inboxMessage");
        }
        this.f = fbztVar;
    }

    @Override // defpackage.ciff
    public final bzge a() {
        return this.c;
    }

    @Override // defpackage.ciff
    public final errl b() {
        return this.d;
    }

    @Override // defpackage.ciff
    public final ervi c() {
        return this.a;
    }

    @Override // defpackage.ciff
    public final eyee d() {
        return this.g;
    }

    @Override // defpackage.ciff
    public final eyee e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciff) {
            ciff ciffVar = (ciff) obj;
            if (this.a.equals(ciffVar.c()) && this.b.equals(ciffVar.g()) && this.c.equals(ciffVar.a()) && this.d.equals(ciffVar.b()) && this.e.equals(ciffVar.e()) && this.g.equals(ciffVar.d()) && this.f.equals(ciffVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ciff
    public final fbzt f() {
        return this.f;
    }

    @Override // defpackage.ciff
    @Deprecated
    public final fcek g() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        fbzt fbztVar = this.f;
        eyee eyeeVar = this.g;
        eyee eyeeVar2 = this.e;
        errl errlVar = this.d;
        bzge bzgeVar = this.c;
        fcek fcekVar = this.b;
        return "Parameters{dittoChannelRequest=" + this.a.toString() + ", browserId=" + fcekVar.toString() + ", dittoIdContainer=" + bzgeVar.toString() + ", executor=" + errlVar.toString() + ", requestBytes=" + eyeeVar2.toString() + ", clientRegistrationId=" + eyeeVar.toString() + ", inboxMessage=" + fbztVar.toString() + "}";
    }
}
