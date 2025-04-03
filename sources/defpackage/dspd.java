package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspd implements dspl, dspj, dspc {
    private final long a;
    private final hkx b;

    public dspd(long j, hkx hkxVar) {
        this.a = j;
        this.b = hkxVar;
    }

    @Override // defpackage.dspc
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dspj
    public final dspn b() {
        return (dspn) this.b.a();
    }

    @Override // defpackage.dspl
    public final /* synthetic */ hvi c(hvi hviVar, hfd hfdVar) {
        throw null;
    }

    @Override // defpackage.dspj
    public final /* synthetic */ hvi d(hvi hviVar, hfd hfdVar) {
        throw null;
    }
}
