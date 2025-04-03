package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwod extends dwqo {
    public emxc a;
    public boolean b;
    public byte c;
    public int d;
    private String e;
    private final emxc f;
    private final emxc g;
    private final emxc h;
    private final emxc i;
    private emxc j;
    private final emxc k;

    public dwod() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.f = emuxVar;
        this.g = emuxVar;
        this.h = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
    }

    @Override // defpackage.dwqo
    public final dwqp a() {
        String str;
        int i;
        if (this.c == 15 && (str = this.e) != null && (i = this.d) != 0) {
            return new dwoe(str, this.a, this.f, this.g, this.h, this.i, this.j, this.k, i, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" groupName");
        }
        if ((this.c & 1) == 0) {
            sb.append(" groupSizeBytes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" groupSizeBytesLong");
        }
        if (this.d == 0) {
            sb.append(" showNotifications");
        }
        if ((this.c & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.c & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqo
    public final void b(emxc emxcVar) {
        if (emxcVar == null) {
            throw new NullPointerException("Null downloadConditionsOptional");
        }
        this.j = emxcVar;
    }

    @Override // defpackage.dwqo
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        this.e = str;
    }
}
