package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijg implements ctuj {
    final /* synthetic */ aijh a;
    final /* synthetic */ aijf b;

    public aijg(aijh aijhVar, aijf aijfVar) {
        this.a = aijhVar;
        this.b = aijfVar;
    }

    @Override // defpackage.ctuj
    public final void c() {
        aler alerVar = this.b.b;
        if (alerVar != null) {
            alfa.a(alerVar, fagh.PERMISSION_DENIED, 1);
        }
    }

    @Override // defpackage.ctuj
    public final void d() {
        akvg akvgVar = (akvg) this.a.b.b();
        Context context = this.a.a;
        aijf aijfVar = this.b;
        akvgVar.Q(context, aijfVar.a, null, aijfVar.b);
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
