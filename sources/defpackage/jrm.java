package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrm implements jtd {
    private final Context a;

    public jrm(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.jtd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jsd r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jrl
            if (r0 == 0) goto L13
            r0 = r7
            jrl r0 = (defpackage.jrl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jrl r0 = new jrl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            jrm r0 = r0.e
            defpackage.ffci.b(r7)
            goto L7e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.ffci.b(r7)
            return r7
        L3a:
            defpackage.ffci.b(r7)
            boolean r7 = r6 instanceof defpackage.jrk
            if (r7 == 0) goto L51
            jrk r6 = (defpackage.jrk) r6
            jrj r7 = r6.a
            android.content.Context r2 = r5.a
            r0.d = r4
            java.lang.Object r6 = r7.b(r2, r6, r0)
            if (r6 != r1) goto L50
            goto L7c
        L50:
            return r6
        L51:
            boolean r7 = r6 instanceof defpackage.jtl
            if (r7 == 0) goto L8b
            r7 = r6
            jtl r7 = (defpackage.jtl) r7
            android.content.Context r2 = r5.a
            r0.e = r5
            r0.a = r6
            r0.d = r3
            ffrh r3 = new ffrh
            ffgu r0 = defpackage.ffhi.c(r0)
            r3.<init>(r0, r4)
            r3.B()
            int r0 = r7.a
            jrn r4 = new jrn
            r4.<init>(r3, r7)
            defpackage.kpp.d(r2, r0, r4)
            java.lang.Object r7 = r3.m()
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r0 = r5
        L7e:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            jtl r6 = (defpackage.jtl) r6
            jsw r6 = r6.b
            android.content.Context r0 = r0.a
            android.graphics.Typeface r6 = defpackage.jtk.a(r7, r6, r0)
            return r6
        L8b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Unknown font type: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrm.a(jsd, ffgu):java.lang.Object");
    }

    @Override // defpackage.jtd
    public final /* bridge */ /* synthetic */ Object b(jsd jsdVar) {
        Object a;
        Typeface typeface;
        if (jsdVar instanceof jrk) {
            jrk jrkVar = (jrk) jsdVar;
            return jrkVar.a.a(this.a, jrkVar);
        }
        if (!(jsdVar instanceof jtl)) {
            return null;
        }
        int a2 = jsdVar.a();
        if (jsr.b(a2, 0)) {
            typeface = jro.a((jtl) jsdVar, this.a);
        } else {
            if (!jsr.b(a2, 1)) {
                if (jsr.b(a2, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                String a3 = jsr.a(jsdVar.a());
                Objects.toString(a3);
                throw new IllegalArgumentException("Unknown loading type ".concat(a3));
            }
            try {
                a = jro.a((jtl) jsdVar, this.a);
            } catch (Throwable th) {
                a = ffci.a(th);
            }
            typeface = (Typeface) (true != (a instanceof ffcg) ? a : null);
        }
        return jtk.a(typeface, ((jtl) jsdVar).b, this.a);
    }
}
