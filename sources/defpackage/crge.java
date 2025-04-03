package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crge implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        crgf crgfVar = (crgf) obj;
        crgf crgfVar2 = (crgf) obj2;
        crgfVar.getClass();
        crgfVar2.getClass();
        Integer num = (Integer) crgo.a.e();
        return (num != null && num.intValue() == -1) ? new crgb().compare(crgfVar, crgfVar2) : new crgd(new crgc(num)).compare(crgfVar, crgfVar2);
    }
}
