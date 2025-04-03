package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quw implements qud {
    private final Uri a;
    private final quy b;
    private InputStream c;

    public quw(Uri uri, quy quyVar) {
        this.a = uri;
        this.b = quyVar;
    }

    public static quw c(Context context, Uri uri, qux quxVar) {
        return new quw(uri, new quy(qpt.b(context).c.a().b(), quxVar, qpt.b(context).d, context.getContentResolver()));
    }

    @Override // defpackage.qud
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.qud
    public final void e() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x003d, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r4.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00c8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:201), block:B:72:0x00c8 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080 A[Catch: FileNotFoundException -> 0x00cf, TRY_LEAVE, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:62:0x001b, B:11:0x0040, B:16:0x0080, B:21:0x00bb, B:22:0x00c1, B:32:0x00b7, B:47:0x0048, B:49:0x0053, B:51:0x005d, B:53:0x0061, B:56:0x0069, B:57:0x007c, B:9:0x0023, B:74:0x00cb, B:75:0x00ce, B:18:0x0084, B:38:0x009d, B:40:0x00a3), top: B:2:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb A[Catch: FileNotFoundException -> 0x00cf, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:62:0x001b, B:11:0x0040, B:16:0x0080, B:21:0x00bb, B:22:0x00c1, B:32:0x00b7, B:47:0x0048, B:49:0x0053, B:51:0x005d, B:53:0x0061, B:56:0x0069, B:57:0x007c, B:9:0x0023, B:74:0x00cb, B:75:0x00ce, B:18:0x0084, B:38:0x009d, B:40:0x00a3), top: B:2:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb A[Catch: FileNotFoundException -> 0x00cf, TryCatch #3 {FileNotFoundException -> 0x00cf, blocks: (B:3:0x0003, B:62:0x001b, B:11:0x0040, B:16:0x0080, B:21:0x00bb, B:22:0x00c1, B:32:0x00b7, B:47:0x0048, B:49:0x0053, B:51:0x005d, B:53:0x0061, B:56:0x0069, B:57:0x007c, B:9:0x0023, B:74:0x00cb, B:75:0x00ce, B:18:0x0084, B:38:0x009d, B:40:0x00a3), top: B:2:0x0003, inners: #5, #9 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [quc] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.NullPointerException, java.lang.Throwable] */
    @Override // defpackage.qud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.qqe r10, defpackage.quc r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quw.g(qqe, quc):void");
    }

    @Override // defpackage.qud
    public final void d() {
    }
}
