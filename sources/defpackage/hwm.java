package defpackage;

import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hwm extends ffkk implements ffjo {
    final /* synthetic */ ViewStructure a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwm(ViewStructure viewStructure) {
        super(4);
        this.a = viewStructure;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.a.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return ffcu.a;
    }
}
