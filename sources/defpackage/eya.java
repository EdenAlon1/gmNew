package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eya extends ffkk implements ffjm {
    final /* synthetic */ eyh a;
    final /* synthetic */ Object[] b;
    final /* synthetic */ ffji c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eya(eyh eyhVar, Object[] objArr, ffji ffjiVar, int i) {
        super(2);
        this.a = eyhVar;
        this.b = objArr;
        this.c = ffjiVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        int i = this.d;
        this.a.c(copyOf, this.c, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
