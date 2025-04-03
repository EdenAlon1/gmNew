package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnt {
    public static final cjnr a(cjnj cjnjVar, Throwable th) {
        cjnjVar.getClass();
        eqww eqwwVar = th instanceof cowg ? eqww.CHAT_API_SERIALIZATION_ERROR : eqww.CHAT_API_GENERIC_TRANSPORT_ERROR;
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxhVar.getClass();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqxjVar.getClass();
        eqxt.d(2, eqxjVar);
        eqxt.b(eqwwVar, eqxjVar);
        eqwp.b(eqxt.a(eqxjVar), eqxhVar);
        return new cjnr(cjnj.a(cjnjVar, null, null, null, new ckdq(false, eqwp.a(eqxhVar), null), 16383), th);
    }
}
