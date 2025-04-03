package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajuz implements ffjm {
    final /* synthetic */ ajva a;
    final /* synthetic */ ajso b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffix d;
    final /* synthetic */ Boolean e;

    public ajuz(ajva ajvaVar, ajso ajsoVar, boolean z, ffix ffixVar, Boolean bool) {
        this.a = ajvaVar;
        this.b = ajsoVar;
        this.c = z;
        this.d = ffixVar;
        this.e = bool;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ajva ajvaVar = this.a;
            fffs fffsVar = new fffs((byte[]) null);
            hik hikVar = dnae.a;
            Object b = ajvaVar.c.b();
            b.getClass();
            fffsVar.add(hikVar.c(b));
            hil[] hilVarArr = (hil[]) ffdx.a(fffsVar).toArray(new hil[0]);
            hfz.b((hil[]) Arrays.copyOf(hilVarArr, hilVarArr.length), hpx.d(227116579, new ajuy(this.a, this.b, this.c, this.d, this.e), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
