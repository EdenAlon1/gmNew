package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzc implements dkzo {
    private final Context a;
    private final Optional b;
    private final Map c;
    private final akib d;

    public dkzc(Context context, Optional optional, akib akibVar, akic akicVar) {
        context.getClass();
        akibVar.getClass();
        akicVar.getClass();
        this.a = context;
        this.b = optional;
        this.d = akibVar;
        this.c = new LinkedHashMap();
    }

    private final synchronized dkzm c(dlgb dlgbVar) {
        Object obj;
        Map map = this.c;
        obj = map.get(dlgbVar);
        if (obj == null) {
            akib akibVar = this.d;
            akic akicVar = (akic) akibVar.a.a.kQ.b();
            dlhj dlhjVar = (dlhj) akibVar.a.a.kT.b();
            akis akisVar = akibVar.a.a;
            dlff dD = akisVar.dD();
            Context context = (Context) akisVar.q.b();
            context.getClass();
            dkze dkzeVar = new dkze(fdot.a.get().a(context));
            akis akisVar2 = akibVar.a.a;
            ffsd gD = akisVar2.gD();
            dlib dlibVar = (dlib) akisVar2.kN.b();
            dlpw dlpwVar = (dlpw) akibVar.a.a.l.b();
            akis akisVar3 = akibVar.a.a;
            dlas dB = akisVar3.dB();
            dlas dB2 = akisVar3.dB();
            boolean z = akisVar3.dB().h;
            obj = new dkzm(dlgbVar, akicVar, dlhjVar, dD, dkzeVar, gD, dlibVar, dlpwVar, dB.f, dB2.g, z);
            map.put(dlgbVar, obj);
        }
        return (dkzm) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dkzo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dkzb
            if (r0 == 0) goto L13
            r0 = r7
            dkzb r0 = (defpackage.dkzb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkzb r0 = new dkzb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dkzm r6 = r0.d
            defpackage.ffci.b(r7)
            return r6
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ffci.b(r7)
            r6.getClass()
            j$.util.Optional r7 = r5.b
            java.lang.Object r7 = defpackage.fflm.b(r7)
            ffbr r7 = (defpackage.ffbr) r7
            r2 = 0
            if (r7 == 0) goto L55
            java.lang.Object r7 = r7.b()
            dlgb r7 = (defpackage.dlgb) r7
            if (r7 == 0) goto L55
            java.lang.String r4 = r7.a
            int r4 = r4.length()
            if (r4 > 0) goto L53
            r7 = r2
        L53:
            if (r7 != 0) goto L64
        L55:
            android.content.Context r7 = r5.a
            dlgb r4 = new dlgb
            java.lang.String r7 = r7.getPackageName()
            r7.getClass()
            r4.<init>(r7, r6)
            r7 = r4
        L64:
            dkzm r6 = r5.c(r7)
            r0.d = r6
            r0.c = r3
            dkzk r7 = new dkzk
            r7.<init>(r6, r2)
            java.lang.Object r7 = defpackage.ffsl.a(r7, r0)
            ffhh r0 = defpackage.ffhh.a
            if (r7 == r0) goto L7b
            ffcu r7 = defpackage.ffcu.a
        L7b:
            if (r7 == r1) goto L7e
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkzc.a(java.lang.String, ffgu):java.lang.Object");
    }

    @Override // defpackage.dkzo
    public final /* synthetic */ ListenableFuture b() {
        ListenableFuture b;
        b = fgfz.b(ffsl.b(fftc.b), ffhe.a, ffsm.a, new dkzn(this, null));
        return b;
    }
}
