package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmb extends ffkk implements ffix {
    final /* synthetic */ jmc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmb(jmc jmcVar) {
        super(0);
        this.a = jmcVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        List list = this.a.d;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float b = ((jmh) obj2).a.b();
            int e = ffdx.e(list);
            if (e > 0) {
                int i = 1;
                while (true) {
                    Object obj3 = list.get(i);
                    float b2 = ((jmh) obj3).a.b();
                    int compare = Float.compare(b, b2);
                    if (compare < 0) {
                        b = b2;
                    }
                    if (compare < 0) {
                        obj2 = obj3;
                    }
                    if (i == e) {
                        break;
                    }
                    i++;
                }
            }
            obj = obj2;
        }
        jmh jmhVar = (jmh) obj;
        return Float.valueOf(jmhVar != null ? jmhVar.a.b() : 0.0f);
    }
}
