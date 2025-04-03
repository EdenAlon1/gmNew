package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class psi extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public psi(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        psi psiVar = new psi((ffgu) obj4);
        psiVar.b = (Throwable) obj2;
        psiVar.c = longValue;
        return psiVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            ppt.c();
            Log.e(psk.a, "Cannot check for unfinished work", (Throwable) obj2);
            long min = Math.min(j * 30000, psk.b);
            this.a = 1;
            if (ffsw.c(min, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return true;
    }
}
