package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eydn implements eyhz {
    private static final eyfc a;

    static {
        eyfc eyfcVar = eyfc.a;
        eyib eyibVar = eyib.a;
        a = eyfc.a;
    }

    private static final void o(eyhs eyhsVar) {
        if (eyhsVar != null && !eyhsVar.isInitialized()) {
            throw ((eydl) eyhsVar).newUninitializedMessageException().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eyhs, java.lang.Object] */
    @Override // defpackage.eyhz
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhs i(eyee eyeeVar, eyfc eyfcVar) {
        eyel l = eyeeVar.l();
        ?? n = n(l, eyfcVar);
        l.z(0);
        o(n);
        return n;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eyhs, java.lang.Object] */
    @Override // defpackage.eyhz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyhs k(InputStream inputStream, eyfc eyfcVar) {
        eyel K = eyel.K(inputStream);
        ?? n = n(K, eyfcVar);
        K.z(0);
        o(n);
        return n;
    }

    @Override // defpackage.eyhz
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eyhs l(byte[] bArr, eyfc eyfcVar) {
        return m(bArr, 0, bArr.length, eyfcVar);
    }

    @Override // defpackage.eyhz
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eyhs m(byte[] bArr, int i, int i2, eyfc eyfcVar) {
        eyhs e = e(bArr, i, i2, eyfcVar);
        o(e);
        return e;
    }

    public eyhs e(byte[] bArr, int i, int i2, eyfc eyfcVar) {
        throw null;
    }

    @Override // defpackage.eyhz
    public final /* bridge */ /* synthetic */ Object f(eyee eyeeVar) {
        return i(eyeeVar, a);
    }

    @Override // defpackage.eyhz
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream) {
        return k(inputStream, a);
    }

    @Override // defpackage.eyhz
    public final /* bridge */ /* synthetic */ Object h(byte[] bArr) {
        return l(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eyhs, java.lang.Object] */
    @Override // defpackage.eyhz
    public final /* bridge */ /* synthetic */ Object j(eyel eyelVar, eyfc eyfcVar) {
        ?? n = n(eyelVar, eyfcVar);
        o(n);
        return n;
    }
}
