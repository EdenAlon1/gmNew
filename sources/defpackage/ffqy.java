package defpackage;

/* loaded from: classes6.dex */
public final class ffqy {
    public static final Object a(ffhd ffhdVar, ffjm ffjmVar, ffgu ffguVar) {
        return ffra.a(ffhdVar, ffjmVar, ffguVar);
    }

    public static final ffss b(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        return ffra.b(ffskVar, ffhdVar, ffsmVar, ffjmVar);
    }

    public static /* synthetic */ ffss c(ffsk ffskVar, ffsm ffsmVar, ffjm ffjmVar, int i) {
        ffhe ffheVar = (i & 1) != 0 ? ffhe.a : null;
        if ((i & 2) != 0) {
            ffsmVar = ffsm.a;
        }
        return ffra.b(ffskVar, ffheVar, ffsmVar, ffjmVar);
    }

    public static /* synthetic */ ffud d(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar, int i) {
        if ((i & 1) != 0) {
            ffhdVar = ffhe.a;
        }
        if ((i & 2) != 0) {
            ffsmVar = ffsm.a;
        }
        return ffra.c(ffskVar, ffhdVar, ffsmVar, ffjmVar);
    }
}
