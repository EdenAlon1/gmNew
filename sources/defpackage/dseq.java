package defpackage;

import com.google.android.libraries.compose.tenor.rest.MediaResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dseq {
    public static final dsci b(MediaResult mediaResult) {
        return new dsci(mediaResult.getId(), mediaResult.title(), mediaResult.getUrl(), c(mediaResult.getMedia(), true), drej.a);
    }

    public static final List c(List list, boolean z) {
        list.getClass();
        Map map = (Map) ffdx.K(list);
        List list2 = null;
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (ffpc.n((String) entry.getKey(), "_transparent")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (true == linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                List d = d(linkedHashMap);
                if (true != d.isEmpty()) {
                    list2 = d;
                }
            }
        }
        return list2 == null ? d(map) : list2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r2.equals("tinywebp_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f3, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.b, defpackage.drla.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r2.equals("nanowebp_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.a, defpackage.drla.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r2.equals("nanowebp") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r2.equals("nanogif") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.a, defpackage.drkk.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r2.equals("tinygif_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.b, defpackage.drkk.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r2.equals("gif_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.d, defpackage.drkk.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r2.equals("webp") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.d, defpackage.drla.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r2.equals("gif") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r2.equals("mediumgif_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.c, defpackage.drkk.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r2.equals("mediumwebp_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        r2 = new defpackage.ffcf(defpackage.drme.c, defpackage.drla.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r2.equals("tinygif") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r2.equals("nanogif_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        if (r2.equals("mediumwebp") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        if (r2.equals("webp_transparent") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        if (r2.equals("tinywebp") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        if (r2.equals("mediumgif") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List d(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dseq.d(java.util.Map):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffss r5, defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dsep
            if (r0 == 0) goto L13
            r0 = r7
            dsep r0 = (defpackage.dsep) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsep r0 = new dsep
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 == r1) goto L6b
        L3e:
            com.google.android.libraries.compose.tenor.rest.MediaResultsResponse r7 = (com.google.android.libraries.compose.tenor.rest.MediaResultsResponse) r7
            java.util.List r5 = r7.getResults()
            if (r5 == 0) goto L68
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ffdx.n(r5, r0)
            r7.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            java.lang.Object r0 = r6.invoke(r0)
            r7.add(r0)
            goto L55
        L67:
            return r7
        L68:
            ffel r5 = defpackage.ffel.a
            return r5
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dseq.a(ffss, ffji, ffgu):java.lang.Object");
    }
}
