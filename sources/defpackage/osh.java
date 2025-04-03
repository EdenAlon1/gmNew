package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osh extends ffhv implements ffjm {
    final /* synthetic */ String[] a;
    final /* synthetic */ osi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osh(String[] strArr, osi osiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = strArr;
        this.b = osiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((osh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = this.a;
        fffi.d(Arrays.copyOf(strArr, strArr.length));
        fgcl fgclVar = this.b.b;
        throw null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new osh(this.a, this.b, ffguVar);
    }
}
