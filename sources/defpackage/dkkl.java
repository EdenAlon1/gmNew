package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkl implements djaw {
    final /* synthetic */ ArrayList a;
    private dkjt b;
    private String c;

    public dkkl(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.djaw
    public final void a() {
        this.b = new dkjt(dkjs.UNKNOWN);
    }

    @Override // defpackage.djaw
    public final void b(byte[] bArr) {
        dkjt dkjtVar = this.b;
        dkjtVar.getClass();
        String str = this.c;
        str.getClass();
        dkjtVar.d(str, bArr);
    }

    @Override // defpackage.djaw
    public final void c() {
        dkjt dkjtVar = this.b;
        dkjtVar.getClass();
        this.a.add(dkjtVar);
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.djaw
    public final void d(djax djaxVar) {
        if (emuz.e(djaxVar.a, fhpi.a)) {
            this.c = djaxVar.b;
        }
    }
}
