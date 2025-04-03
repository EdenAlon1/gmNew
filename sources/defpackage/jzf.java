package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzf extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzf(String str, String str2, Object[] objArr) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = objArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            String str = this.a;
            String str2 = this.b;
            Object[] objArr = this.c;
            jyx.a(str, str2, hfdVar, Arrays.copyOf(objArr, objArr.length));
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
