package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaya {
    public eavl a;
    private emxc b;

    public eaya() {
        this.b = emux.a;
    }

    public final eaxz a() {
        eavl eavlVar = this.a;
        if (eavlVar != null) {
            return new eaxz(this.b, eavlVar);
        }
        throw new IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public final void b(eaye eayeVar) {
        this.b = emxc.j(eayeVar);
    }

    public eaya(eaxz eaxzVar) {
        this.b = emux.a;
        this.b = eaxzVar.a;
        this.a = eaxzVar.b;
    }
}
