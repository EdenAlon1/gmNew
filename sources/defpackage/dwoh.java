package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoh extends dwrr {
    public boolean a;
    public byte b;
    private boolean c;
    private final emxc d;
    private final emxc e;
    private final emxc f;
    private final emxc g;

    public dwoh() {
        emux emuxVar = emux.a;
        this.d = emuxVar;
        this.e = emuxVar;
        this.f = emuxVar;
        this.g = emuxVar;
    }

    @Override // defpackage.dwrr
    public final dwrs a() {
        if (this.b == 15) {
            return new dwoi(this.c, this.d, this.e, this.f, this.g, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" includeAllGroups");
        }
        if ((this.b & 2) == 0) {
            sb.append(" groupWithNoAccountOnly");
        }
        if ((this.b & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.b & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrr
    public final void b(boolean z) {
        this.c = z;
        this.b = (byte) (this.b | 1);
    }
}
