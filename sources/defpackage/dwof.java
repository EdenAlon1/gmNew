package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwof extends dwrp {
    public boolean a;
    public byte b;
    private String c;
    private final emxc d;
    private final emxc e;

    public dwof() {
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    @Override // defpackage.dwrp
    public final dwrq a() {
        String str;
        if (this.b == 3 && (str = this.c) != null) {
            return new dwog(str, this.d, this.e, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" groupName");
        }
        if ((this.b & 1) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.b & 2) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrp
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.c = str;
    }
}
