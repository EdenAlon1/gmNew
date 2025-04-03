package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoj extends dwrt {
    public emxc a;
    public enhk b;
    private String c;
    private long d;
    private String e;
    private engw f;
    private emxc g;
    private byte h;

    public dwoj() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.g = emuxVar;
    }

    @Override // defpackage.dwrt
    public final dwru a() {
        String str;
        String str2;
        engw engwVar;
        enhk enhkVar;
        if (this.h == 1 && (str = this.c) != null && (str2 = this.e) != null && (engwVar = this.f) != null && (enhkVar = this.b) != null) {
            return new dwok(str, this.d, str2, this.a, engwVar, enhkVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" groupName");
        }
        if (this.h == 0) {
            sb.append(" buildId");
        }
        if (this.e == null) {
            sb.append(" variantId");
        }
        if (this.f == null) {
            sb.append(" updatedDataFileList");
        }
        if (this.b == null) {
            sb.append(" inlineFileMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrt
    public final void b(emxc emxcVar) {
        if (emxcVar == null) {
            throw new NullPointerException("Null accountOptional");
        }
        this.g = emxcVar;
    }

    @Override // defpackage.dwrt
    public final void c(long j) {
        this.d = j;
        this.h = (byte) 1;
    }

    @Override // defpackage.dwrt
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.c = str;
    }

    @Override // defpackage.dwrt
    public final void e(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null updatedDataFileList");
        }
        this.f = engwVar;
    }

    @Override // defpackage.dwrt
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str;
    }
}
