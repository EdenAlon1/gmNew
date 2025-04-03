package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsm {
    public static final ffsm a;
    public static final ffsm b;
    public static final ffsm c;
    public static final ffsm d;
    private static final /* synthetic */ ffsm[] e;

    static {
        ffsm ffsmVar = new ffsm("DEFAULT", 0);
        a = ffsmVar;
        ffsm ffsmVar2 = new ffsm("LAZY", 1);
        b = ffsmVar2;
        ffsm ffsmVar3 = new ffsm("ATOMIC", 2);
        c = ffsmVar3;
        ffsm ffsmVar4 = new ffsm("UNDISPATCHED", 3);
        d = ffsmVar4;
        ffsm[] ffsmVarArr = {ffsmVar, ffsmVar2, ffsmVar3, ffsmVar4};
        e = ffsmVarArr;
        ffhw.a(ffsmVarArr);
    }

    private ffsm(String str, int i) {
    }

    public static ffsm[] values() {
        return (ffsm[]) e.clone();
    }

    public final void a(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        Object a2;
        int ordinal = ordinal();
        if (ordinal == 0) {
            fgia.b(ffjmVar, obj, ffguVar);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                ffjmVar.getClass();
                ffhi.c(ffhi.b(ffjmVar, obj, ffguVar)).w(ffcu.a);
                return;
            }
            if (ordinal != 3) {
                throw new ffcd();
            }
            try {
                ffhd u = ffguVar.u();
                Object b2 = fghv.b(u, null);
                try {
                    if (ffjmVar instanceof ffhp) {
                        fflf.e(ffjmVar, 2);
                        a2 = ffjmVar.a(obj, ffguVar);
                    } else {
                        a2 = ffhi.a(ffjmVar, obj, ffguVar);
                    }
                    if (a2 != ffhh.a) {
                        ffguVar.w(a2);
                    }
                } finally {
                    fghv.c(u, b2);
                }
            } catch (Throwable th) {
                ffguVar.w(ffci.a(th));
            }
        }
    }

    public final boolean b() {
        return this == b;
    }
}
