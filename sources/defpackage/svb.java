package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svb implements ffjm {
    final /* synthetic */ svh a;

    public svb(svh svhVar) {
        this.a = svhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            svh svhVar = this.a;
            fffs fffsVar = new fffs((byte[]) null);
            ffbr ffbrVar = svhVar.a;
            hik hikVar = dnae.a;
            Object b = ffbrVar.b();
            b.getClass();
            fffsVar.add(hikVar.c(b));
            hil[] hilVarArr = (hil[]) ffdx.a(fffsVar).toArray(new hil[0]);
            hfz.b((hil[]) Arrays.copyOf(hilVarArr, hilVarArr.length), hpx.d(221768952, new sva(this.a), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
