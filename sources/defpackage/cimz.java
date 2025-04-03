package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cimz extends ciqb {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private ephv d;

    @Override // defpackage.ciqb
    public final ciqc a() {
        ephv ephvVar = this.d;
        if (ephvVar != null) {
            return new cina(ephvVar, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: issueType");
    }

    @Override // defpackage.ciqb
    public final void b(ephv ephvVar) {
        if (ephvVar == null) {
            throw new NullPointerException("Null issueType");
        }
        this.d = ephvVar;
    }
}
