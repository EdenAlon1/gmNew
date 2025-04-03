package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgrx implements dfto {
    final /* synthetic */ byte[] a;

    public dgrx(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dgqs dgqsVar = (dgqs) obj;
        try {
            dgqsVar.a(DesugarCollections.unmodifiableMap(((dgql) eyfy.parseFrom(dgql.a, this.a, eyfc.a())).b));
        } catch (eygu e) {
            throw new IllegalStateException("Failed parsing account alerts proto", e);
        }
    }

    @Override // defpackage.dfto
    public final void b() {
    }
}
