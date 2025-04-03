package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jww extends ffkk implements ffjo {
    final /* synthetic */ jwx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jww(jwx jwxVar) {
        super(4);
        this.a = jwxVar;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((jss) obj3).a;
        int i2 = ((jst) obj4).a;
        hkx a = this.a.b.a((jsf) obj, (jsy) obj2, i, i2);
        if (a instanceof jtt) {
            Object a2 = a.a();
            a2.getClass();
            return (Typeface) a2;
        }
        jxm jxmVar = new jxm(a, this.a.f);
        this.a.f = jxmVar;
        Object obj5 = jxmVar.a;
        obj5.getClass();
        return (Typeface) obj5;
    }
}
