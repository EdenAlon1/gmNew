package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jym {
    public static jyr a(jyr jyrVar, jyr jyrVar2) {
        boolean z = jyrVar2 instanceof jxw;
        if (!z || !(jyrVar instanceof jxw)) {
            return (!z || (jyrVar instanceof jxw)) ? (z || !(jyrVar instanceof jxw)) ? jyrVar2.e(new jyq(jyrVar)) : jyrVar : jyrVar2;
        }
        ide ideVar = ((jxw) jyrVar2).a;
        float a = jyrVar2.a();
        jyp jypVar = new jyp(jyrVar);
        if (Float.isNaN(a)) {
            a = ((Number) jypVar.invoke()).floatValue();
        }
        return new jxw(ideVar, a);
    }

    public static jyr b(jyr jyrVar, ffix ffixVar) {
        return !ffkj.e(jyrVar, jyo.a) ? jyrVar : (jyr) ffixVar.invoke();
    }
}
