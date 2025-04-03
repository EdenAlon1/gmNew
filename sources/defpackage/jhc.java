package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhc extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ContentResolver c;
    final /* synthetic */ Uri d;
    final /* synthetic */ jhd e;
    final /* synthetic */ ffwm f;
    final /* synthetic */ Context g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhc(ContentResolver contentResolver, Uri uri, jhd jhdVar, ffwm ffwmVar, Context context, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = contentResolver;
        this.d = uri;
        this.e = jhdVar;
        this.f = ffwmVar;
        this.g = context;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhc) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r3.fQ(r4, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006a -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            ffxy r3 = (defpackage.ffxy) r3
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L35
        L13:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.h
            ffxy r3 = (defpackage.ffxy) r3
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L77
            goto L41
        L1d:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.h
            r3 = r7
            ffxy r3 = (defpackage.ffxy) r3
            android.content.ContentResolver r7 = r6.c
            android.net.Uri r1 = r6.d
            r4 = 0
            jhd r5 = r6.e
            r7.registerContentObserver(r1, r4, r5)
            ffwm r7 = r6.f     // Catch: java.lang.Throwable -> L77
            ffwo r1 = r7.r()     // Catch: java.lang.Throwable -> L77
        L35:
            r6.h = r3     // Catch: java.lang.Throwable -> L77
            r6.a = r1     // Catch: java.lang.Throwable -> L77
            r6.b = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L77
            if (r7 == r0) goto L79
        L41:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L77
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L6d
            r1.b()     // Catch: java.lang.Throwable -> L77
            android.content.Context r7 = r6.g     // Catch: java.lang.Throwable -> L77
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r7 = android.provider.Settings.Global.getFloat(r7, r4, r5)     // Catch: java.lang.Throwable -> L77
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> L77
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L77
            r6.h = r3     // Catch: java.lang.Throwable -> L77
            r6.a = r1     // Catch: java.lang.Throwable -> L77
            r7 = 2
            r6.b = r7     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r3.fQ(r4, r6)     // Catch: java.lang.Throwable -> L77
            if (r7 != r0) goto L35
            goto L79
        L6d:
            android.content.ContentResolver r7 = r6.c
            jhd r0 = r6.e
            r7.unregisterContentObserver(r0)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L77:
            r7 = move-exception
            goto L7a
        L79:
            return r0
        L7a:
            android.content.ContentResolver r0 = r6.c
            jhd r1 = r6.e
            r0.unregisterContentObserver(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        jhc jhcVar = new jhc(this.c, this.d, this.e, this.f, this.g, ffguVar);
        jhcVar.h = obj;
        return jhcVar;
    }
}
