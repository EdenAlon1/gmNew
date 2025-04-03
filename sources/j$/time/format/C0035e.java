package j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0035e implements InterfaceC0036f {
    private final InterfaceC0036f[] a;
    private final boolean b;

    C0035e(ArrayList arrayList, boolean z) {
        this((InterfaceC0036f[]) arrayList.toArray(new InterfaceC0036f[arrayList.size()]), z);
    }

    public final C0035e a() {
        return !this.b ? this : new C0035e(this.a, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        r9.setLength(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        return true;
     */
    @Override // j$.time.format.InterfaceC0036f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(j$.time.format.y r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            boolean r1 = r7.b
            if (r1 == 0) goto Lb
            r8.g()
        Lb:
            j$.time.format.f[] r2 = r7.a     // Catch: java.lang.Throwable -> L23
            int r3 = r2.length     // Catch: java.lang.Throwable -> L23
            r4 = 0
        Lf:
            r5 = 1
            if (r4 >= r3) goto L28
            r6 = r2[r4]     // Catch: java.lang.Throwable -> L23
            boolean r6 = r6.o(r8, r9)     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L25
            r9.setLength(r0)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L2d
            r8.a()
            return r5
        L23:
            r9 = move-exception
            goto L2e
        L25:
            int r4 = r4 + 1
            goto Lf
        L28:
            if (r1 == 0) goto L2d
            r8.a()
        L2d:
            return r5
        L2e:
            if (r1 == 0) goto L33
            r8.a()
        L33:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C0035e.o(j$.time.format.y, java.lang.StringBuilder):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0036f[] interfaceC0036fArr = this.a;
        if (interfaceC0036fArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (InterfaceC0036f interfaceC0036f : interfaceC0036fArr) {
                sb.append(interfaceC0036f);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    @Override // j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC0036f[] interfaceC0036fArr = this.a;
        if (!z) {
            for (InterfaceC0036f interfaceC0036f : interfaceC0036fArr) {
                i = interfaceC0036f.u(wVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
            }
            return i;
        }
        wVar.r();
        int i2 = i;
        for (InterfaceC0036f interfaceC0036f2 : interfaceC0036fArr) {
            i2 = interfaceC0036f2.u(wVar, charSequence, i2);
            if (i2 < 0) {
                wVar.f(false);
                return i;
            }
        }
        wVar.f(true);
        return i2;
    }

    C0035e(InterfaceC0036f[] interfaceC0036fArr, boolean z) {
        this.a = interfaceC0036fArr;
        this.b = z;
    }
}
