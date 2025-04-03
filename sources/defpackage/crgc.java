package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgc implements Comparator {
    final /* synthetic */ Integer a;

    public crgc(Integer num) {
        this.a = num;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = ((crgf) obj2).f.e;
        Integer num = this.a;
        Boolean valueOf = Boolean.valueOf(num != null && i == num.intValue());
        int i2 = ((crgf) obj).f.e;
        Integer num2 = this.a;
        return ffgh.a(valueOf, Boolean.valueOf(num2 != null && i2 == num2.intValue()));
    }
}
