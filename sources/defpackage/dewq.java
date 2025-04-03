package defpackage;

import com.google.android.gms.appdatasearch.SearchResults;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewq {
    final /* synthetic */ SearchResults a;
    private final dewr b;
    private final int c;

    public dewq(SearchResults searchResults, int i, dewr dewrVar) {
        this.a = searchResults;
        this.b = dewrVar;
        this.c = i;
    }

    public final String a() {
        String[] strArr;
        SearchResults searchResults = this.a;
        int[] iArr = searchResults.h;
        String str = (iArr == null || (strArr = searchResults.i) == null) ? null : strArr[iArr[this.c]];
        if (str == null) {
            return null;
        }
        return str.substring(str.indexOf(45) + 1);
    }

    public final String b() {
        byte[] bArr;
        dewr dewrVar = this.b;
        if (dewrVar.b == null) {
            SearchResults searchResults = this.a;
            int[] iArr = searchResults.b;
            if (iArr == null || (bArr = searchResults.c) == null) {
                return null;
            }
            dewrVar.b = new dewp(iArr, bArr);
        }
        dewp dewpVar = dewrVar.b;
        dewpVar.a(this.c);
        try {
            return new String(dewpVar.d, dewpVar.b, dewpVar.c[dewpVar.a], "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer c() {
        /*
            r7 = this;
            com.google.android.gms.appdatasearch.SearchResults r0 = r7.a
            int[] r0 = r0.h
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r2 = r1
            goto L5f
        L9:
            dewr r2 = r7.b
            java.util.Map[] r2 = r2.c
            java.lang.String r3 = "thing_proto"
            if (r2 == 0) goto L25
            int r4 = r7.c
            r0 = r0[r4]
            r0 = r2[r0]
            if (r0 != 0) goto L1e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L1e:
            java.lang.Object r2 = r0.get(r3)
            dewp r2 = (defpackage.dewp) r2
            goto L27
        L25:
            r0 = r1
            r2 = r0
        L27:
            if (r2 != 0) goto L5f
            com.google.android.gms.appdatasearch.SearchResults r4 = r7.a
            android.os.Bundle[] r5 = r4.e
            if (r5 == 0) goto L5f
            android.os.Bundle[] r6 = r4.f
            if (r6 == 0) goto L5f
            int[] r2 = r4.h
            int r4 = r7.c
            r2 = r2[r4]
            r2 = r5[r2]
            int[] r2 = r2.getIntArray(r3)
            com.google.android.gms.appdatasearch.SearchResults r4 = r7.a
            int r5 = r7.c
            android.os.Bundle[] r6 = r4.f
            int[] r4 = r4.h
            r4 = r4[r5]
            r4 = r6[r4]
            byte[] r4 = r4.getByteArray(r3)
            if (r2 == 0) goto L7
            if (r4 != 0) goto L54
            goto L7
        L54:
            dewp r5 = new dewp
            r5.<init>(r2, r4)
            if (r0 == 0) goto L5e
            r0.put(r3, r5)
        L5e:
            r2 = r5
        L5f:
            if (r2 != 0) goto L62
            return r1
        L62:
            int r0 = r7.c
            r2.a(r0)
            int[] r0 = r2.c
            int r1 = r2.b
            int r3 = r2.a
            r0 = r0[r3]
            byte[] r2 = r2.d
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2, r1, r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dewq.c():java.nio.ByteBuffer");
    }
}
