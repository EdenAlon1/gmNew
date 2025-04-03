package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qhe extends ffhv implements ffjm {
    final /* synthetic */ qci a;
    final /* synthetic */ Context b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhe(qci qciVar, Context context, String str, String str2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = qciVar;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qhe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: Exception -> 0x0071, TryCatch #1 {Exception -> 0x0071, blocks: (B:9:0x0040, B:15:0x0063, B:18:0x006e, B:21:0x006a), top: B:8:0x0040 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            defpackage.ffci.b(r6)
            qci r6 = r5.a
            java.util.Map r6 = r6.d
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r6.next()
            qho r0 = (defpackage.qho) r0
            android.content.Context r1 = r5.b
            r0.getClass()
            java.lang.String r2 = r5.c
            java.lang.String r3 = r5.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.a
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Exception -> L74
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch: java.lang.Exception -> L74
            r1.getClass()     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = r0.c     // Catch: java.lang.Exception -> L71
            r2.getClass()     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "Italic"
            boolean r3 = defpackage.ffpc.M(r2, r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r4 = "Bold"
            boolean r2 = defpackage.ffpc.M(r2, r4)     // Catch: java.lang.Exception -> L71
            r4 = 0
            if (r3 == 0) goto L5c
            if (r2 == 0) goto L5b
            r4 = 3
            goto L63
        L5b:
            r2 = r4
        L5c:
            if (r3 == 0) goto L60
            r4 = 2
            goto L63
        L60:
            if (r2 == 0) goto L63
            r4 = 1
        L63:
            int r2 = r1.getStyle()     // Catch: java.lang.Exception -> L71
            if (r2 != r4) goto L6a
            goto L6e
        L6a:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r4)     // Catch: java.lang.Exception -> L71
        L6e:
            r0.d = r1     // Catch: java.lang.Exception -> L71
            goto Lf
        L71:
            int r0 = defpackage.qlp.a
            goto Lf
        L74:
            int r0 = defpackage.qlp.a
            goto Lf
        L77:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qhe(this.a, this.b, this.c, this.d, ffguVar);
    }
}
