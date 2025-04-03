package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeng implements djaw {
    final /* synthetic */ List a;
    private eenh b;

    public eeng(List list) {
        this.a = list;
    }

    @Override // defpackage.djaw
    public final void a() {
        this.b = new eenh();
    }

    @Override // defpackage.djaw
    public final void b(byte[] bArr) {
        eenh eenhVar = this.b;
        if (eenhVar != null) {
            eenhVar.a = bArr;
        }
    }

    @Override // defpackage.djaw
    public final void c() {
        eenh eenhVar = this.b;
        if (eenhVar != null) {
            this.a.add(eenhVar);
        }
        this.b = null;
    }

    @Override // defpackage.djaw
    public final void d(djax djaxVar) {
        eenh eenhVar = this.b;
        if (eenhVar == null) {
            throw new IllegalStateException("Part is null");
        }
        if (djaxVar.a.equalsIgnoreCase(fhpi.a)) {
            eenhVar.b = djaxVar.b;
            return;
        }
        if (djaxVar.a.equalsIgnoreCase("Content-ID")) {
            eenhVar.d = djaxVar.b.substring(1, r4.length() - 1);
        } else if (djaxVar.a.equalsIgnoreCase(fhpi.c)) {
            eenhVar.c = djaxVar.b;
        }
    }
}
