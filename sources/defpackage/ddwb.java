package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddwb implements aema {
    public final ffbr a;
    public String b;
    public String c;
    public String d;
    public String e;
    private final aejv f;

    public ddwb(aejv aejvVar, ffbr ffbrVar) {
        ffbrVar.getClass();
        this.f = aejvVar;
        this.a = ffbrVar;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        aelyVar.getClass();
        String N = aelyVar.N();
        if (N == null) {
            N = "";
        }
        this.b = N;
        String O = aelyVar.O();
        if (O == null) {
            O = "";
        }
        this.c = O;
        String P = aelyVar.P();
        if (P == null) {
            P = "";
        }
        this.d = P;
        String J = aelyVar.J();
        this.e = J != null ? J : "";
        this.f.b(aelyVar, z);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        ddwa ddwaVar = new ddwa(this);
        aejv aejvVar = this.f;
        aejvVar.a = ddwaVar;
        aejvVar.c(view);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        aelyVar.getClass();
        aelyVar2.getClass();
        return (!this.f.d(aelyVar, aelyVar2) && ffkj.e(aelyVar2.P(), aelyVar.P()) && ffkj.e(aelyVar2.O(), aelyVar.O()) && ffkj.e(aelyVar2.J(), aelyVar.J())) ? false : true;
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        this.f.e(aelxVar, aekiVar);
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
