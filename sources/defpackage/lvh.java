package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvh implements lra {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public lvh(String str, byte[] bArr, int i, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (i2 == 23) {
                if (bArr.length == 4) {
                    i2 = 23;
                    lti.a(r4);
                } else {
                    i2 = 23;
                }
            }
            r4 = false;
            lti.a(r4);
        } else if (c == 1 || c == 2) {
            if (i2 == 78) {
                if (bArr.length == 8) {
                    i2 = 78;
                    lti.a(r4);
                } else {
                    i2 = 78;
                }
            }
            r4 = false;
            lti.a(r4);
        } else if (c == 3) {
            lti.a(i2 == 0);
        } else if (c == 4) {
            if (i2 == 75) {
                if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    i2 = 75;
                    lti.a(r4);
                } else {
                    i2 = 75;
                }
            }
            r4 = false;
            lti.a(r4);
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final List d() {
        lti.d(this.a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b = this.b[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(this.b[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lvh lvhVar = (lvh) obj;
            if (this.a.equals(lvhVar.a) && Arrays.equals(this.b, lvhVar.b) && this.c == lvhVar.c && this.d == lvhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[LOOP:0: B:18:0x0088->B:20:0x008b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L50
            r2 = 23
            if (r0 == r2) goto L41
            r2 = 67
            if (r0 == r2) goto L36
            r2 = 75
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 == r2) goto L19
            goto L7d
        L19:
            byte[] r0 = r5.b
            luv r1 = new luv
            r1.<init>(r0)
            long r0 = r1.s()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lac
        L2a:
            byte[] r0 = r5.b
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lac
        L36:
            byte[] r0 = r5.b
            int r0 = defpackage.ermn.c(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lac
        L41:
            byte[] r0 = r5.b
            int r0 = defpackage.ermn.c(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lac
        L50:
            byte[] r0 = r5.b
            java.lang.String r0 = defpackage.lvf.H(r0)
            goto Lac
        L57:
            java.lang.String r0 = r5.a
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7d
            java.util.List r0 = r5.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            r2 = 44
            emww r2 = defpackage.emww.d(r2)
            r2.i(r1, r0)
            java.lang.String r0 = r1.toString()
            goto Lac
        L7d:
            byte[] r0 = r5.b
            int r2 = defpackage.lvf.a
            int r2 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r2
            r3.<init>(r2)
        L88:
            int r2 = r0.length
            if (r1 >= r2) goto La8
            r2 = r0[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r4 = 16
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            r2 = r0[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            int r1 = r1 + 1
            goto L88
        La8:
            java.lang.String r0 = r3.toString()
        Lac:
            java.lang.String r1 = r5.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh.toString():java.lang.String");
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
