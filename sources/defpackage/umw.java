package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umw implements uno {
    public final Activity a;
    public final alcb b;
    public final dbzh c;
    public final dbzj d;
    public final Context e;
    public final ffix f;
    public final dbzl g;
    public final ffsk h;
    private final ffhd i;
    private final ffhd j;
    private final Supplier k;
    private final ddzq l;

    public umw(Activity activity, alcb alcbVar, ffhd ffhdVar, dbzh dbzhVar, dbzj dbzjVar, Context context, ffix ffixVar, ffhd ffhdVar2, Supplier supplier, ddzq ddzqVar, dbzl dbzlVar, ffsk ffskVar) {
        this.a = activity;
        this.b = alcbVar;
        this.i = ffhdVar;
        this.c = dbzhVar;
        this.d = dbzjVar;
        this.e = context;
        this.f = ffixVar;
        this.j = ffhdVar2;
        this.k = supplier;
        this.l = ddzqVar;
        this.g = dbzlVar;
        this.h = ffskVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (defpackage.ffra.a(r9, r4, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.umr
            if (r0 == 0) goto L13
            r0 = r9
            umr r0 = (defpackage.umr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            umr r0 = new umr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.ffci.b(r9)
            goto La5
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.a
            umw r2 = r0.e
            defpackage.ffci.b(r9)
            goto L79
        L3f:
            umw r8 = r0.e
            defpackage.ffci.b(r9)
            r2 = r8
            goto L5f
        L46:
            defpackage.ffci.b(r9)
            ffhd r9 = r7.i
            ffhd r9 = defpackage.ekxi.a(r9)
            umo r2 = new umo
            r2.<init>(r6, r7, r8)
            r0.e = r7
            r0.d = r5
            java.lang.Object r9 = defpackage.ffra.a(r9, r2, r0)
            if (r9 == r1) goto La8
            r2 = r7
        L5f:
            r8 = r9
            dbyf r8 = (defpackage.dbyf) r8
            ffhd r9 = r2.j
            ffhd r9 = defpackage.ekxi.a(r9)
            ump r5 = new ump
            r5.<init>(r6, r2, r8)
            r0.e = r2
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.ffra.a(r9, r5, r0)
            if (r9 == r1) goto La8
        L79:
            java.lang.String r9 = (java.lang.String) r9
            ffix r4 = r2.f
            java.lang.Object r4 = r4.invoke()
            dqls r4 = (defpackage.dqls) r4
            dqmn r4 = r4.a
            r9.getClass()
            r4.c(r9)
            ffhd r9 = r2.i
            ffhd r9 = defpackage.ekxi.a(r9)
            umq r4 = new umq
            dbyf r8 = (defpackage.dbyf) r8
            r4.<init>(r6, r2, r8)
            r0.e = r6
            r0.a = r6
            r0.d = r3
            java.lang.Object r8 = defpackage.ffra.a(r9, r4, r0)
            if (r8 != r1) goto La5
            goto La8
        La5:
            ffcu r8 = defpackage.ffcu.a
            return r8
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umw.a(android.net.Uri, ffgu):java.lang.Object");
    }

    public final Object b(Uri uri, ffgu ffguVar) {
        Object obj;
        ffhg ffhgVar = new ffhg(ffhi.c(ffguVar));
        obj = this.k.get();
        obj.getClass();
        this.l.c(uri, new umu(this, ffhgVar));
        return ffhgVar.a();
    }

    @Override // defpackage.uno
    public final /* bridge */ /* synthetic */ Object c(Object obj, ffgu ffguVar) {
        Uri uri = (Uri) obj;
        ffhg ffhgVar = new ffhg(ffhi.c(ffguVar));
        if (uri == null || axol.k(this.h, null, new umv(ffhgVar, this, uri, null), 3) == null) {
            ffhgVar.w(new Integer(0));
        }
        return ffhgVar.a();
    }
}
