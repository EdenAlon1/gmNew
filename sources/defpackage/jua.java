package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jua implements jrj {
    public static final jua a = new jua();

    private jua() {
    }

    @Override // defpackage.jrj
    public final Typeface a(Context context, jrk jrkVar) {
        Objects.toString(jrkVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(String.valueOf(jrkVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    @Override // defpackage.jrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r13, defpackage.jrk r14, defpackage.ffgu r15) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.jtx
            if (r0 == 0) goto La3
            r0 = r14
            jtx r0 = (defpackage.jtx) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "name="
            r1.<init>(r2)
            java.lang.String r2 = r0.c
            r1.append(r2)
            java.lang.String r2 = "&weight="
            r1.append(r2)
            jsy r2 = r0.e
            int r2 = r2.i
            r1.append(r2)
            java.lang.String r2 = "&italic="
            r1.append(r2)
            int r2 = r0.f
            r2 = 0
            r3 = 1
            boolean r4 = defpackage.jss.b(r2, r3)
            r1.append(r4)
            java.lang.String r4 = "&besteffort=true"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            krj r4 = new krj
            jtv r5 = r0.d
            r4.<init>(r1)
            int r1 = r0.f
            jsy r0 = r0.e
            jsy r1 = defpackage.jsy.h
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L4d
            r0 = r3
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r1 = defpackage.jss.b(r2, r3)
            if (r1 == 0) goto L59
            if (r0 == 0) goto L58
            r0 = 3
            goto L5c
        L58:
            r0 = r2
        L59:
            if (r1 == 0) goto L5e
            r0 = 2
        L5c:
            r7 = r0
            goto L63
        L5e:
            if (r0 == 0) goto L62
            r7 = r3
            goto L63
        L62:
            r7 = r2
        L63:
            ffrh r0 = new ffrh
            ffgu r15 = defpackage.ffhi.c(r15)
            r0.<init>(r15, r3)
            r0.B()
            jtz r11 = new jtz
            r11.<init>(r0, r14)
            android.os.Looper r14 = android.os.Looper.myLooper()
            if (r14 != 0) goto L7e
            android.os.Looper r14 = android.os.Looper.getMainLooper()
        L7e:
            int r15 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r15 < r1) goto L8a
            android.os.Handler r14 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m(r14)
            r10 = r14
            goto L90
        L8a:
            android.os.Handler r15 = new android.os.Handler
            r15.<init>(r14)
            r10 = r15
        L90:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r2] = r4
            java.util.List r6 = defpackage.krr.a(r14)
            r8 = 0
            r9 = 0
            r5 = r13
            defpackage.krv.a(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r0.m()
            return r13
        La3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "Only GoogleFontImpl supported (actual "
            r13.<init>(r15)
            r13.append(r14)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jua.b(android.content.Context, jrk, ffgu):java.lang.Object");
    }
}
