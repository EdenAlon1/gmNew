package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfld extends dfkt {
    public static final List m = new CopyOnWriteArrayList();
    public final List n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dfld(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            dfmi r4 = defpackage.dfmi.a
            int r0 = defpackage.dfmz.b
            dfms r0 = new dfms
            r0.<init>()
            dfmz r6 = new dfmz
            r6.<init>(r11, r0)
            dfng r7 = new dfng
            r7.<init>(r11)
            dfkz r8 = new dfkz
            r8.<init>()
            r9 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfld.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static dfla g(Context context, String str) {
        dfla dflaVar = new dfla(context, str);
        dflaVar.a(dfmi.b);
        return dflaVar;
    }

    public static dfla h(Context context, String str) {
        dfla dflaVar = new dfla(context, str);
        dflaVar.a(dfmi.c);
        return dflaVar;
    }

    public static dfld k(Context context, String str) {
        return g(context, str).c();
    }

    public static dfld l(Context context, String str) {
        return h(context, str).c();
    }

    public static void m(dflb dflbVar) {
        m.add(0, dflbVar);
    }

    @Deprecated
    public final dflc i(eyhs eyhsVar) {
        dfwv.n(eyhsVar);
        return new dflc(this, eyhsVar);
    }

    public final dflc j(eyhs eyhsVar, dfmh dfmhVar) {
        dfwv.n(eyhsVar);
        dflc dflcVar = new dflc(this, eyhsVar);
        dflcVar.q = dfmhVar;
        return dflcVar;
    }

    public dfld(Context context, String str, String str2, dfmi dfmiVar, faxs faxsVar, dfle dfleVar, dfme dfmeVar, emyl emylVar, dflg dflgVar) {
        super(context, str, str2, dfmiVar, faxsVar, dfleVar, dfmeVar, emylVar, dflgVar);
        this.n = new CopyOnWriteArrayList();
    }
}
