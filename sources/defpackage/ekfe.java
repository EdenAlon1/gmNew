package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfe implements ffji {
    final /* synthetic */ ffjo a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ ekfg d;
    final /* synthetic */ eulq e;

    public ekfe(ffjo ffjoVar, String str, int i, ekfg ekfgVar, eulq eulqVar) {
        this.a = ffjoVar;
        this.b = str;
        this.c = i;
        this.d = ekfgVar;
        this.e = eulqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String[] strArr;
        eyee eyeeVar;
        byte[] bArr = (byte[]) obj;
        Integer valueOf = Integer.valueOf(this.c);
        Set set = this.d.e;
        eulq eulqVar = this.e;
        if (eulqVar != null) {
            eygr eygrVar = eulqVar.i;
            eygrVar.getClass();
            strArr = (String[]) ffdx.X(fffi.g(set, eygrVar)).toArray(new String[0]);
        } else {
            strArr = (String[]) set.toArray(new String[0]);
        }
        if (bArr == null) {
            eulq eulqVar2 = this.e;
            bArr = (eulqVar2 == null || (eyeeVar = eulqVar2.j) == null) ? null : eyeeVar.I();
        }
        return this.a.a(this.b, valueOf, strArr, bArr);
    }
}
