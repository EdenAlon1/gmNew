package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nzh {
    public static final /* synthetic */ int l = 0;
    public final String c;
    public nzl d;
    public String e;
    public CharSequence f;
    public final List g;
    public final cpo h;
    public final Map i;
    public int j;
    public String k;

    static {
        new LinkedHashMap();
    }

    public nzh(oaj oajVar) {
        Map map = oal.a;
        this.c = oak.b(oajVar.getClass());
        this.g = new ArrayList();
        this.h = new cpo(null);
        this.i = new LinkedHashMap();
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, oat.e);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(2);
        if (string == null) {
            f(0);
        } else {
            if (ffpc.J(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(string);
            List a = nxf.a(this.i, new nzg(new nyy(concat, null, null)));
            if (!a.isEmpty()) {
                throw new IllegalArgumentException("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + a);
            }
            ffca.a(new nzf(concat));
            f(concat.hashCode());
        }
        this.k = string;
        if (obtainAttributes.hasValue(1)) {
            f(obtainAttributes.getResourceId(1, 0));
            this.e = nzb.a(context, this.j);
        }
        this.f = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public boolean b() {
        return true;
    }

    public final Bundle c(Bundle bundle) {
        if (bundle == null && this.i.isEmpty()) {
            return null;
        }
        Bundle a = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
        for (Map.Entry entry : this.i.entrySet()) {
            ((nxe) entry.getValue()).a((String) entry.getKey(), a);
        }
        if (bundle != null) {
            a.putAll(bundle);
            for (Map.Entry entry2 : this.i.entrySet()) {
                String str = (String) entry2.getKey();
                nxe nxeVar = (nxe) entry2.getValue();
                str.getClass();
                if (nxeVar.b || !a.containsKey(str) || !a.containsKey(str) || a.get(str) != null) {
                    try {
                        nxeVar.a.b(a, str);
                    } catch (IllegalStateException unused) {
                    }
                }
                throw new IllegalArgumentException("Wrong argument type for '" + str + "' in argument savedState. " + nxeVar.a.e() + " expected.");
            }
        }
        return a;
    }

    public final nxd d(int i) {
        nxd nxdVar = this.h.c() == 0 ? null : (nxd) cpp.a(this.h, i);
        if (nxdVar != null) {
            return nxdVar;
        }
        nzl nzlVar = this.d;
        if (nzlVar == null) {
            return null;
        }
        return nzlVar.d(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d5, code lost:
    
        if (defpackage.nxf.a(r4, new defpackage.nyt(r6)).isEmpty() == false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.nzc e(defpackage.nyz r18) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzh.e(nyz):nzc");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb9
            boolean r2 = r9 instanceof defpackage.nzh
            if (r2 != 0) goto Ld
            goto Lb9
        Ld:
            java.util.List r2 = r8.g
            nzh r9 = (defpackage.nzh) r9
            java.util.List r3 = r9.g
            cpo r4 = r8.h
            cpo r5 = r9.h
            boolean r2 = defpackage.ffkj.e(r2, r3)
            int r3 = r4.c()
            int r4 = r5.c()
            if (r3 != r4) goto L59
            cpo r3 = r8.h
            cpq r4 = new cpq
            r4.<init>(r3)
            ffnl r3 = defpackage.ffno.b(r4)
            java.util.Iterator r3 = r3.a()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            cpo r5 = r8.h
            java.lang.Object r5 = defpackage.cpp.a(r5, r4)
            cpo r6 = r9.h
            java.lang.Object r4 = defpackage.cpp.a(r6, r4)
            boolean r4 = defpackage.ffkj.e(r5, r4)
            if (r4 != 0) goto L34
            goto L59
        L57:
            r3 = r0
            goto L5a
        L59:
            r3 = r1
        L5a:
            java.util.Map r4 = r8.i
            int r4 = r4.size()
            java.util.Map r5 = r9.i
            int r5 = r5.size()
            if (r4 != r5) goto La1
            java.util.Map r4 = r8.i
            ffnl r4 = defpackage.ffew.q(r4)
            java.util.Iterator r4 = r4.a()
        L72:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.i
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La1
            java.util.Map r6 = r9.i
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.ffkj.e(r6, r5)
            if (r5 != 0) goto L72
            goto La1
        L9f:
            r4 = r0
            goto La2
        La1:
            r4 = r1
        La2:
            int r5 = r8.j
            int r6 = r9.j
            if (r5 != r6) goto Lb9
            java.lang.String r5 = r8.k
            java.lang.String r9 = r9.k
            boolean r9 = defpackage.ffkj.e(r5, r9)
            if (r9 == 0) goto Lb9
            if (r2 == 0) goto Lb9
            if (r3 == 0) goto Lb9
            if (r4 == 0) goto Lb9
            return r0
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzh.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        this.j = i;
        this.e = null;
    }

    public int hashCode() {
        int i = this.j * 31;
        String str = this.k;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        for (nyy nyyVar : this.g) {
            int i2 = hashCode * 31;
            String str2 = nyyVar.c;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = nyyVar.d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = nyyVar.e;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        cpr cprVar = new cpr(this.h);
        while (cprVar.hasNext()) {
            nxd nxdVar = (nxd) cprVar.next();
            int i3 = ((hashCode * 31) + nxdVar.a) * 31;
            nzr nzrVar = nxdVar.b;
            hashCode = i3 + (nzrVar != null ? nzrVar.hashCode() : 0);
            Bundle bundle = nxdVar.c;
            if (bundle != null) {
                hashCode = (hashCode * 31) + ows.a(bundle);
            }
        }
        for (String str5 : this.i.keySet()) {
            int hashCode4 = ((hashCode * 31) + str5.hashCode()) * 31;
            Object obj = this.i.get(str5);
            hashCode = hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.j));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.k;
        if (str2 != null && !ffpc.J(str2)) {
            sb.append(" route=");
            sb.append(this.k);
        }
        if (this.f != null) {
            sb.append(" label=");
            sb.append(this.f);
        }
        return sb.toString();
    }
}
