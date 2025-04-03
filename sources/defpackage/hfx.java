package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfx extends ffkk implements ffjm {
    final /* synthetic */ hil[] a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfx(hil[] hilVarArr, ffjm ffjmVar, int i) {
        super(2);
        this.a = hilVarArr;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hil[] hilVarArr = this.a;
        hil[] hilVarArr2 = (hil[]) Arrays.copyOf(hilVarArr, hilVarArr.length);
        int a = hip.a(this.c | 1);
        hfz.b(hilVarArr2, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
