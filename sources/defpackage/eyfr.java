package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyfr extends eydn {
    private final eyfy a;

    public eyfr(eyfy eyfyVar) {
        this.a = eyfyVar;
    }

    @Override // defpackage.eydn
    public final /* bridge */ /* synthetic */ eyhs e(byte[] bArr, int i, int i2, eyfc eyfcVar) {
        eyfy parsePartialFrom;
        parsePartialFrom = eyfy.parsePartialFrom(this.a, bArr, i, i2, eyfcVar);
        return parsePartialFrom;
    }

    @Override // defpackage.eyhz
    public final /* bridge */ /* synthetic */ Object n(eyel eyelVar, eyfc eyfcVar) {
        return eyfy.parsePartialFrom(this.a, eyelVar, eyfcVar);
    }
}
