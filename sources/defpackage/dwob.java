package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwob extends dwny {
    public emxc a;
    private dwpj b;
    private emxc c;

    public dwob() {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.a = emuxVar;
    }

    @Override // defpackage.dwny
    public final dwnz a() {
        dwpj dwpjVar = this.b;
        if (dwpjVar != null) {
            return new dwoc(dwpjVar, this.c, this.a);
        }
        throw new IllegalStateException("Missing required properties: dataFileGroup");
    }

    @Override // defpackage.dwny
    public final void b(emxc emxcVar) {
        if (emxcVar == null) {
            throw new NullPointerException("Null accountOptional");
        }
        this.c = emxcVar;
    }

    @Override // defpackage.dwny
    public final void c(dwpj dwpjVar) {
        if (dwpjVar == null) {
            throw new NullPointerException("Null dataFileGroup");
        }
        this.b = dwpjVar;
    }
}
