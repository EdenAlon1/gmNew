package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhh extends ffkk implements ffjm {
    final /* synthetic */ jhk a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhh(jhk jhkVar, ffjm ffjmVar) {
        super(2);
        this.a = jhkVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            AndroidCompositionLocals_androidKt.a(this.a.a, this.b, hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
