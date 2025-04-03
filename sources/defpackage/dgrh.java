package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgrh implements dfto {
    final /* synthetic */ byte[] a;

    public dgrh(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dgqr dgqrVar = (dgqr) obj;
        try {
            dgqrVar.a(DesugarCollections.unmodifiableMap(((dgqg) eyfy.parseFrom(dgqg.a, this.a, eyfc.a())).b));
        } catch (eygu e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    @Override // defpackage.dfto
    public final void b() {
    }
}
