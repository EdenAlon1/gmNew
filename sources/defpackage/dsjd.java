package defpackage;

import android.text.InputFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjd extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsjd(dsjf dsjfVar) {
        super(null);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        this.a.setFilters((num == null || num.intValue() == Integer.MAX_VALUE) ? new InputFilter[0] : new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())});
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
