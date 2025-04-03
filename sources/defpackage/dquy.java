package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dquy extends dqur {
    public static final /* synthetic */ ffmx[] n;
    public final Activity o;
    public final SparseIntArray p;
    public int q;
    public final ffls r;
    private final ffsk s;

    static {
        ffko ffkoVar = new ffko(dquy.class, "recentItems", "getRecentItems()Ljava/util/List;", 0);
        int i = fflc.a;
        n = new ffmx[]{ffkoVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquy(Activity activity, ffsk ffskVar, dqoy dqoyVar, dqkk dqkkVar, ffsk ffskVar2, dqxh dqxhVar) {
        super(dqoyVar, dqkkVar, ffskVar2, dqxhVar);
        activity.getClass();
        ffskVar.getClass();
        dqoyVar.getClass();
        dqkkVar.getClass();
        ffskVar2.getClass();
        dqxhVar.getClass();
        this.o = activity;
        this.s = ffskVar;
        this.p = new SparseIntArray();
        this.r = new dqux(ffel.a, this);
    }

    private final boolean S(int i) {
        return i < P();
    }

    @Override // defpackage.dqur
    public final dquu I(int i) {
        return S(i) ? (dquu) R().get(i) : super.I(i - P());
    }

    @Override // defpackage.dqur
    public final void M(Context context, int i) {
        super.M(context, i);
        int i2 = this.h;
        this.q = i2 + i2;
    }

    public final int O(int i) {
        if (i == 0) {
            return 0;
        }
        return this.p.get(i) + P();
    }

    public final int P() {
        return ffmk.g(R().size(), this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dquv
            if (r0 == 0) goto L13
            r0 = r7
            dquv r0 = (defpackage.dquv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dquv r0 = new dquv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dquy r6 = r0.e
            dquy r0 = r0.d
            defpackage.ffci.b(r7)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            ffsk r7 = r5.s
            ffhd r7 = r7.hT()
            dquw r2 = new dquw
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L5b
            r6 = r5
            r0 = r6
        L50:
            java.util.List r7 = (java.util.List) r7
            r6.L(r7)
            r0.p()
            ffcu r6 = defpackage.ffcu.a
            return r6
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dquy.Q(java.util.List, ffgu):java.lang.Object");
    }

    public final List R() {
        return (List) this.r.c(n[0]);
    }

    @Override // defpackage.dqur, defpackage.vk
    public final int a() {
        return P() + super.a();
    }

    @Override // defpackage.dqur
    public final dqro m(int i) {
        return S(i) ? dqrm.a : dqrk.a;
    }
}
