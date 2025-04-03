package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvt extends ffkk implements ffji {
    public static final jvt a = new jvt();

    public jvt() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jpm jpmVar = null;
        jlm jlmVar = (ffkj.e(obj2, false) || obj2 == null) ? null : (jlm) jom.a.a(obj2);
        jlmVar.getClass();
        Object obj3 = list.get(1);
        long j = jpm.a;
        hrh hrhVar = jom.p;
        if (!ffkj.e(obj3, false) && obj3 != null) {
            jpmVar = (jpm) hrhVar.a(obj3);
        }
        jpmVar.getClass();
        return new jvu(jlmVar, jpmVar.b);
    }
}
