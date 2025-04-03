package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhlc implements dfto {
    final /* synthetic */ byte[] a;

    public dhlc(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dfto
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        edah edahVar = (edah) obj;
        try {
            byte[] bArr = this.a;
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            eczr eczrVar = (eczr) eyfy.parseFrom(eczr.a, bArr, eyfc.a);
            Iterator it = edahVar.b.a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((edag) it.next()).a(eczrVar.b) && !z) {
                    edahVar.a.a();
                    z = true;
                }
            }
        } catch (eygu unused) {
        }
    }

    @Override // defpackage.dfto
    public final void b() {
    }
}
